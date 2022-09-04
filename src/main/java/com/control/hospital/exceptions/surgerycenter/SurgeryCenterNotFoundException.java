package com.control.hospital.exceptions.surgerycenter;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SurgeryCenterNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String message;
}
