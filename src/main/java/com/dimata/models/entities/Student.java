package com.dimata.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    // anotasi ID = buat jadi primary key, generated value itu buat jadi auto increment

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    
    // Contoh seting nama tabel, panjang data dan data ini unik atau tidak
    @Column(name="student_address",length = 100,unique = true)
    private String address;
    // COnstructor sama SETER GETTER BAKAL ILANG kalau pake LombokAnnotation

    public Student() {
    }

    public Student(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
}
