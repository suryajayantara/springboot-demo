package com.dimata.models.repos;

import org.springframework.data.repository.CrudRepository;

import com.dimata.models.entities.Student;

public interface StudentRepo extends CrudRepository<Student, Long> {



}
