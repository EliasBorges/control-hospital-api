package com.control.hospital.controller.user;

import com.control.hospital.controller.user.request.ChangePasswordRequest;
import com.control.hospital.controller.user.request.UserRequest;
import com.control.hospital.controller.user.response.UserResponse;
import com.control.hospital.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/users")
public class UserController {
    private final IUserService service;

    @ResponseStatus(CREATED)
    @PostMapping
    public UserResponse create(@Valid @RequestBody UserRequest request) {
        return UserResponse.fromUser(service.create(request));
    }

    @ResponseStatus(OK)
    @PatchMapping("/{id}")
    public void updatePassword(
            @PathVariable String id,
            @Valid @RequestBody ChangePasswordRequest request
    ) {
        service.changePassword(id, request);
    }
}
