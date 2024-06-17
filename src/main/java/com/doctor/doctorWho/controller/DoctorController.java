package com.doctor.doctorWho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    @GetMapping("/doctor/{doctorId}")
    @ResponseBody
    public String getDoctor(@PathVariable int doctorId) {
        switch (doctorId) {
            case 1:
                return "William Hartnell";
            case 10:
                return "David Tennant";
            case 13:
                return "Jodie Whittaker";

            default:
                return "Docteur inconnu";
        }

    }

}
