package com.dimata.services;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

import com.dimata.models.entities.Student;
import com.dimata.models.repos.StudentRepo;



@Service
@Transactional
public class StudentService {

    // isinya bussinese logic

    private StudentRepo studentRepo;

    public Student create(Student student){
        return studentRepo.save(student);
    }

    public Iterable<Student> findAll(){
        return studentRepo.findAll();
    }

    public void removeOne(Long id){
        studentRepo.deleteById(id);
    }

}
