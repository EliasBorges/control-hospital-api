package com.control.hospital.service.impl;

import com.control.hospital.controller.user.request.ChangePasswordRequest;
import com.control.hospital.controller.user.request.UserRequest;
import com.control.hospital.entity.User;
import com.control.hospital.exceptions.user.PasswordEqualsException;
import com.control.hospital.exceptions.user.PasswordIncorrectException;
import com.control.hospital.exceptions.user.UserExistException;
import com.control.hospital.exceptions.user.UserNotFoundException;
import com.control.hospital.repository.UserRepository;
import com.control.hospital.service.IUserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import static com.control.hospital.config.HospitalMessageConfig.*;

@AllArgsConstructor
@Service
@Slf4j
public class UserService implements IUserService {
    private final UserRepository repository;

    public User create(UserRequest request) {
        if (repository.existsByUsername(request.getUsername())) {
            log.error("[USER] - Not create, username = {} exists", request.getUsername());

            throw new UserExistException(VALIDATION_USERNAME_ALREADY_EXISTS);
        }

        return User.create(request, repository);
    }

    public void changePassword(String id, ChangePasswordRequest request) {
/*        if (jwtTokenUtil.isTokenExpired(token)) {
            log.error("[USER] - token expired");

            throw new TokenExpiredException(TOKEN_EXPIRED);
        }

        if (!jwtTokenUtil.getUsernameFromToken(token).equals(request.getEmail())) {
            log.error("[USER] - username id = {} email invalid", id);

            throw new EmailInvalidException(EMAIL_INVALID);
        }*/

        repository.findById(id)
                .ifPresentOrElse(
                        it -> {
                            if (!new BCryptPasswordEncoder().matches(
                                    request.getCurrentPassword(),
                                    it.getPassword()
                            )) {
                                log.error("[USER] - username id = {} password incorret", id);

                                throw new PasswordIncorrectException(PASSWORD_INCORRECT);
                            }

                            if (new BCryptPasswordEncoder().matches(
                                    request.getNewPassword(),
                                    it.getPassword()
                            )) {
                                log.error("[USER] - username id = {} password equals", id);

                                throw new PasswordEqualsException(PASSWORD_EQUALS);
                            }

                            it.updatePassword(request, repository);
                        },
                        () -> {
                            log.error("[USER] - username id = {} not found", id);

                            throw new UserNotFoundException(USER_NOT_FOUND);
                        }
                );
    }
}
