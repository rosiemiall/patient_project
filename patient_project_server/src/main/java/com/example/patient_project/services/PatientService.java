package com.example.patient_project.services;

import com.example.patient_project.models.Patient;
import com.example.patient_project.models.PatientDTO;
import com.example.patient_project.models.Room;
import com.example.patient_project.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }

    // create new patient
    public void createPatient(PatientDTO patientDTO){
        Patient newPatient = new Patient(patientDTO.getName(),
                patientDTO.getAdmissionDate(), null, null);
        patientRepository.save(newPatient);
    }
}
