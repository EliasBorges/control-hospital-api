package com.control.hospital.exceptions.patient;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PatientNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String message;
}
