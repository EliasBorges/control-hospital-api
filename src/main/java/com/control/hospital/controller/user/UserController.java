package com.control.hospital.controller.user;

import com.control.hospital.controller.user.request.UserRequest;
import com.control.hospital.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/users")
public class UserController {
    private final IUserService service;

    @ResponseStatus(CREATED)
    @PostMapping
    public void create(@Valid @RequestBody UserRequest request) {
        service.create(request);
    }
}
