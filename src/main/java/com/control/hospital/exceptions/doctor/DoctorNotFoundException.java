package com.control.hospital.exceptions.doctor;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DoctorNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String message;
}
