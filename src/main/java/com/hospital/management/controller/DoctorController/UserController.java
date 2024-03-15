package com.hospital.management.controller.DoctorController;

import com.hospital.management.model.User;
import com.hospital.management.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepo userRepo;
    @PostMapping("/add")
    User newUser(@RequestBody User user){
        return userRepo.save(user);
    }
}
