package com.control.hospital.exceptions.user;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PasswordIncorrectException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String message;
}
