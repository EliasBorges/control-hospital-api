package com.control.hospital.exceptions.medicine;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MedicineNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String message;
}
