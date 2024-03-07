package com.hospital.management.controller.DoctorController;

import com.hospital.management.model.Appointment;
import com.hospital.management.repository.AppointRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/appointments")
public class AppointmentController {
    @Autowired
    AppointRepo appointRepo;
    @PostMapping("/add")
    Appointment appointment(@RequestBody Appointment appointment){
        return appointRepo.save(appointment);
    }
    @GetMapping("/")
    List<Appointment> getAllAppointments(){
        return appointRepo.findAll();
    }
    @DeleteMapping("/delete/{id}")
    void deleteUser(@PathVariable Long id){
        appointRepo.deleteById(id);
    }
}
