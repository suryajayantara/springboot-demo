package com.dimata.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dimata.models.entities.Student;
import com.dimata.models.repos.StudentRepo;



@Service
public class StudentService {

    // isinya bussinese logic
    @Autowired
    private StudentRepo studentRepo;

    public Student create(Student student){
        return studentRepo.save(student);
    }

    public Student findOne(Long id){
        return studentRepo.findById(id).get();
    }

    public Iterable<Student> findAll(){
        return studentRepo.findAll();
    }

    public void removeOne(Long id){
        studentRepo.deleteById(id);
    }

}
