package com.hospital.management.repository;

import com.hospital.management.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointRepo extends JpaRepository<Appointment,Long> {
    void deleteById(Long id);
}
