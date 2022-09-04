package com.control.hospital.exceptions.attendancesurgerycenter;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AttendanceSurgeryCenterNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String message;
}
