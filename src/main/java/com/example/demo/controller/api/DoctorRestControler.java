package com.example.demo.controller.api;

import com.example.demo.model.Doctor;
import com.example.demo.model.Spec;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/doctors")
public class DoctorRestControler<doctor> {
    Doctor doctor = new Doctor("1","GIO",
            Spec.GIGAPEVT, 2, "good Doctor",
            null, null);
    @RequestMapping("/hello")
    String sayHello(){
        return "<h1>Hello<h1>";
    }
    @RequestMapping("/get/one")
    Doctor getOne(){
        return doctor;
    }
}
