package com.dimata.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dimata.models.entities.Student;
import com.dimata.models.repos.StudentRepo;
import com.dimata.services.StudentService;


// Anotasi rest itu gunanya buat set class untuk jadi rest api
@RestController
@RequestMapping("api/student")
public class StudentController {
    

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student create(@RequestBody Student student){
        return studentService.create(student);
    }

    @GetMapping
    public Iterable<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student findOne(@PathVariable("id") Long data){
        return studentService.findOne(data);
    }

    @PutMapping
    public Student update(@RequestBody Student student){
        return studentService.create(student);
    }

    @DeleteMapping("/{id}")
    public void update(@PathVariable("id") Long id){
        studentService.removeOne(id);
    }

}
