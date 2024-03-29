package com.example.patient_project.services;

import com.example.patient_project.models.Bed;
import com.example.patient_project.repositories.BedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BedService {
    @Autowired
    BedRepository bedRepository;

    public List<Bed> getAllBeds(){ return bedRepository.findAll();}

    public Optional<Bed> getBedById(Long id){
        return bedRepository.findById(id);
    }
}
