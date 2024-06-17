package com.doctor.doctorWho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String getFirstDoctor() {
        return "William Hartnell";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String getTenDoctor() {
        return "David Tennant";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String getThirteenDoctor() {
        return "Jodie Whittaker";
    }

}
