package com.control.hospital.controller.bed;

import com.control.hospital.service.IBedService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/beds")
public class BedController {
    private IBedService service;
}
