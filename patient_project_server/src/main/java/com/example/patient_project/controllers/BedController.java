package com.example.patient_project.controllers;

import com.example.patient_project.models.Bed;
import com.example.patient_project.models.PatientDTO;
import com.example.patient_project.models.Room;
import com.example.patient_project.services.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "beds")
public class BedController {
    @Autowired
    BedService bedService;

    @GetMapping
    public ResponseEntity<List<Bed>> getAllBeds(){
        return new ResponseEntity<>(bedService.getAllBeds(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Bed> getBedById(@PathVariable Long id) {
        Optional<Bed> bedByID = bedService.getBedById(id);
        return new ResponseEntity<>(
                bedByID.orElse(null),
                bedByID.isEmpty() ? HttpStatus.NOT_FOUND : HttpStatus.OK
        );
    }

    // get beds depending on whether they're occupied

    // ERROR handling
    // add patient to a bed (only if bed empty, check occupied= false)
    // needs patient DTO? as request body
    // need to set a bed for the patient also

    // remove patient (only if bed occupied)
    @PostMapping("/{bedId}/add-patient/{patientId}")
    public void addPatientToBed(@PathVariable Long bedId, @PathVariable Long patientId){
        //error handling
        bedService.addPatientToBed(bedId, patientId);
    }
 }
