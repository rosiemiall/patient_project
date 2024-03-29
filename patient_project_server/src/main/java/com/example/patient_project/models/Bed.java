package com.example.patient_project.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "beds")
public class Bed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "room_id")
    @JsonIgnore
    private Room room;

    @OneToOne //(mappedBy = "bed_id")
    @JsonIgnoreProperties({"bed"})
    private Patient patient;

    @Column
    private boolean occupied;

    public Bed(Room room, boolean occupied) {
        this.room = room;
        this.patient = null;
        this.occupied = occupied;
    }

    public Bed() {
    }

    public void addPatient(Patient patient){
        this.patient = patient;
        this.occupied = true;
        this.room.numberOfOccupiedBeds +=1; //move to service?
    }
    public void removePatient(){
        this.patient = null;
        this.occupied = false;
        this.room.numberOfOccupiedBeds -=1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
