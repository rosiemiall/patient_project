package com.example.patient_project.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "room")
    private List<Bed> beds;

    @Column
    private int numberOfBeds;

    @Column
    private int numberOfOccupiedBeds;

    public Room(int numberOfBeds, int numberOfOccupiedBeds) {
        this.numberOfBeds = numberOfBeds;
        this.numberOfOccupiedBeds = numberOfOccupiedBeds; //function to check booleans and calculate
        this.beds = new ArrayList<>();
    }

    public Room() {
    }

    public void addBed(Bed bed){
        numberOfBeds += 1;
        this.beds.add(bed);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Bed> getBeds() {
        return beds;
    }

    public void setBeds(List<Bed> beds) {
        this.beds = beds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfOccupiedBeds() {
        return numberOfOccupiedBeds;
    }

    public void setNumberOfOccupiedBeds(int numberOfOccupiedBeds) {
        this.numberOfOccupiedBeds = numberOfOccupiedBeds;
    }

}
