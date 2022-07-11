package com.dimata.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// Anotasi rest itu gunanya buat set class untuk jadi rest api
@RestController
@RequestMapping("api/student")
public class StudentController {
    
    @GetMapping
    public String index(){
        return "Hello World,there my First Programe";
    }

}
