package com.example.patient_project.services;

import com.example.patient_project.models.Bed;
import com.example.patient_project.models.Patient;
import com.example.patient_project.repositories.BedRepository;
import com.example.patient_project.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BedService {
    @Autowired
    BedRepository bedRepository;

    @Autowired
    PatientRepository patientRepository;

    public List<Bed> getAllBeds(){ return bedRepository.findAll();}

    public Optional<Bed> getBedById(Long id){
        return bedRepository.findById(id);
    }

    //add patient to bed (and set patients bed)
    public void addPatientToBed(Long bedId, Long patientId){
        //error handling
        Patient addingPatient = patientRepository.findById(patientId).get();
        Bed bedAddingTo = bedRepository.findById(bedId).get();
        if( !bedAddingTo.isOccupied()) {
            bedAddingTo.addPatient(addingPatient);
            addingPatient.setBed(bedAddingTo);
        } //else return an error statement?
        patientRepository.save(addingPatient);
        bedRepository.save(bedAddingTo);
    }

    // remove patient from bed (and remove bed from patient)
    // if(bedAddingTo.isOccupied())
}
