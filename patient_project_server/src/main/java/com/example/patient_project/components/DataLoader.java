package com.example.patient_project.components;

import com.example.patient_project.models.Bed;
import com.example.patient_project.models.Patient;
import com.example.patient_project.models.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.example.patient_project.repositories.BedRepository;
import com.example.patient_project.repositories.PatientRepository;
import com.example.patient_project.repositories.RoomRepository;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BedRepository bedRepository;

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    RoomRepository roomRepository;

    public DataLoader(){
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Room room1 = new Room(0,0);
        roomRepository.save(room1);
        Bed bed1 = new Bed(room1, false);
        Bed bed2 = new Bed(room1, false);
        Bed bed3 = new Bed(room1, false);
        bedRepository.save(bed1);
        bedRepository.save(bed2);
        bedRepository.save(bed3);
        Patient patient1 = new Patient("test","04/01/2024" ,"05/01/2024", bed1);
        Patient patient2 = new Patient("test2","04/01/2024" ,null, bed2);
        patientRepository.save(patient1);
        patientRepository.save(patient2);

        room1.addBed(bed1);
        room1.addBed(bed2);
        room1.addBed(bed3);
        bed1.addPatient(patient1);
        bed2.addPatient(patient2);

        bedRepository.save(bed1);
        bedRepository.save(bed2);
        roomRepository.save(room1);
    }
}
