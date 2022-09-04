package com.control.hospital.exceptions.attendance;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AttendanceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String message;
}
