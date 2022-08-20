package com.control.hospital.service;

import com.control.hospital.controller.user.request.ChangePasswordRequest;
import com.control.hospital.controller.user.request.UserRequest;
import com.control.hospital.entity.User;

public interface IUserService {
    User create(UserRequest request);
    void changePassword(String id, ChangePasswordRequest request);
}
