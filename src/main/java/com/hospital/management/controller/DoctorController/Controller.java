package com.hospital.management.controller.DoctorController;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Controller {
    @GetMapping("/doctor")
    String sayHello(){
        return "Hello Patient";
    }
}
