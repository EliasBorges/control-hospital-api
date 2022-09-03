package com.control.hospital.controller.medicine;

import com.control.hospital.service.IMedicineService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/medicines")
public class MedicineController {
    private IMedicineService service;
}
