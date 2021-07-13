package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Student;

public interface StudentDAO extends CrudRepository<Student, Integer> {

}
