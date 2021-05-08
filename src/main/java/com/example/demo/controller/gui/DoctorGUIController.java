package com.example.demo.controller.gui;

import com.example.demo.model.Doctor;
import com.example.demo.model.Spec;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gui/doctors")
public class DoctorGUIController {
    Doctor doctor = new Doctor("1","GIO",
            Spec.GIGAPEVT, 2, "good Doctor",
            null, null);

    @RequestMapping("/getOne")
    String getOne(Model model){
        model.addAttribute("doctor",doctor);
        return "doctors";
    }
}
