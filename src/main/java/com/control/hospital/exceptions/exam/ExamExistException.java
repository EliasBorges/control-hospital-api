package com.control.hospital.exceptions.exam;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ExamExistException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String message;
}