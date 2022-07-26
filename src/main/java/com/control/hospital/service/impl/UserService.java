package com.control.hospital.service.impl;

import com.control.hospital.controller.user.request.UserRequest;
import com.control.hospital.entity.User;
import com.control.hospital.exceptions.UserExistException;
import com.control.hospital.repository.UserRepository;
import com.control.hospital.service.IUserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static com.control.hospital.config.HospitalMessageConfig.VALIDATION_USERNAME_ALREADY_EXISTS;

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
}
