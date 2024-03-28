package com.example.patient_project.services;

import com.example.patient_project.models.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.patient_project.repositories.BedRepository;
import com.example.patient_project.repositories.PatientRepository;
import com.example.patient_project.repositories.RoomRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {
    @Autowired
    BedRepository bedRepository;

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    RoomRepository roomRepository;

    //check occupied beds? and then set this in room model
    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }

    public Optional<Room> getRoomById(Long id){
        return roomRepository.findById(id);
    }
}
