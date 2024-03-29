package com.example.patient_project.controllers;

import com.example.patient_project.models.Patient;
import com.example.patient_project.models.PatientDTO;
import com.example.patient_project.models.Room;
import com.example.patient_project.services.BedService;
import com.example.patient_project.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "patients")
public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping
    public ResponseEntity<List<Patient>> getAllPatients(){
        return new ResponseEntity<>(patientService.getAllPatients(), HttpStatus.OK);
    }
    @PostMapping("/new-patient")
    public void createPatient(@RequestBody PatientDTO patientDTO){
        patientService.createPatient(patientDTO);
    }

    //get all patients who are admitted ie have no discharge date or are occupying a bed 

}
