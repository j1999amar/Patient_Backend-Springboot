package com.example.patient.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
public class PatientModel {
    @Id
    @GeneratedValue
    private int id;
    private String  patientName;
    private String doctor;
    private String hospital;
    private String contact;

    public PatientModel() {
    }

    public PatientModel(int id, String patientName, String doctor, String hospital, String contact) {
        this.id = id;
        this.patientName = patientName;
        this.doctor = doctor;
        this.hospital = hospital;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
