package com.chinito.carsmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarsController {

@RequestMapping("/")
public ModelAndView home() {
ModelAndView modelView = new ModelAndView("index");

modelView.addObject("message","Hello World from MVC Spring");
return modelView;
}
}