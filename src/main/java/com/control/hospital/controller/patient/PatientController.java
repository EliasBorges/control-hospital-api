package com.control.hospital.controller.patient;

import com.control.hospital.service.IPatientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/patients")
public class PatientController {
    private final IPatientService service;
}
