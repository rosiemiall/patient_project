package com.example.patient_project.models;

public class PatientDTO {

    private String name;

    private String admissionDate;




    public PatientDTO() {
    }

    public PatientDTO(String name, String admissionDate) {
        this.name = name;
        this.admissionDate = admissionDate;
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
}
