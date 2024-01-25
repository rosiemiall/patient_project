package com.example.patient_project.repositories;

import com.example.patient_project.models.Bed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BedRepository extends JpaRepository<Bed, Long> {
}
