package com.lazzo.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/vehicles")
public class VehiclesController {

    @GetMapping
    @RequestMapping("/getView")
    public ModelAndView getVehiclesView(HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView("vehicle");

        return modelAndView;
    }

    @RequestMapping("/list")
    public String listPeople(Model model){

        model.addAttribute("people", "personList");
        model.addAttribute("view", "vehicle");

        return "dashboard";
    }

    @PostMapping
    @RequestMapping("/getViewVehicles")
    public String registerUserAccount() {

        return "redirect:/login?success";
    }


}
