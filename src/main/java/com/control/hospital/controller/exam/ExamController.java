package com.control.hospital.controller.exam;

import com.control.hospital.service.IExamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/exams")
public class ExamController {
    private IExamService service;
}
