package com.control.hospital.exceptions.surgerycenter;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SurgeryCenterExistException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String message;
}