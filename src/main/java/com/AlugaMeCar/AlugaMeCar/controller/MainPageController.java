package com.AlugaMeCar.AlugaMeCar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainPageController {
    @GetMapping
    public String home(){
        System.out.println("#### \n\n\n\n\n SARVE \n\n\n\n\n ####");
        return "index";
    }
    @PostMapping("/caminho")
    public void puxar(){

    }

}
