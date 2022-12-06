package com.example.patient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
    @PostMapping(path = "/addPatient",consumes = "application/json",produces = "application/json")
    public String AddPatient(){
        return "Add Patient";
    }
        @GetMapping("/viewPatient")
    public String ViewPatient(){
        return "View Patient";
        }

}
