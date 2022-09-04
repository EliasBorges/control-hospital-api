package com.control.hospital.exceptions.bed;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BedNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String message;
}
