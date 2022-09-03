package com.control.hospital.controller.doctor;

import com.control.hospital.service.IDoctorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/doctors")
public class DoctorController {
    private final IDoctorService service;
}
