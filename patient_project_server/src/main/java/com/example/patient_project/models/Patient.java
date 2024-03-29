package com.example.patient_project.models;

import jakarta.persistence.*;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String admissionDate; // dd/MM/yyyy  localDate

    @Column
    private String dischargeDate;


    @OneToOne
    @JoinColumn(name = "bed_id")
    private Bed bed;

    public Patient(String name, String admissionDate, String dischargeDate, Bed bed) {
        this.name = name;
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
        this.bed = bed; //should start without one and be set?
    }

    public Patient() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }
}
