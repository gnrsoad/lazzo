package com.lazzo.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employees")
public class EmployeesController {

    @GetMapping
    @RequestMapping("/getView")
    public ModelAndView getVehiclesView(HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView("vehicle");

        return modelAndView;
    }

}
