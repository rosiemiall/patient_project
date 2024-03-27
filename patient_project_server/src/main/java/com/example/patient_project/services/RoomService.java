package com.example.patient_project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.patient_project.repositories.BedRepository;
import com.example.patient_project.repositories.PatientRepository;
import com.example.patient_project.repositories.RoomRepository;

@Service
public class RoomService {
    @Autowired
    BedRepository bedRepository;

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    RoomRepository roomRepository;

    //check occupied beds? and then set this in room model
}
