package com.example.patient_project.services;

import com.example.patient_project.models.Patient;
import com.example.patient_project.models.PatientDTO;
import com.example.patient_project.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    // create new patient
    public void createPatient(PatientDTO patientDTO){
        Patient newPatient = new Patient(patientDTO.getName(),
                patientDTO.getAdmissionDate(), null);
        patientRepository.save(newPatient);
    }
}
