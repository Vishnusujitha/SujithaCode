package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Contact;

public interface ConatctDAO extends CrudRepository<Contact, Integer> {

}
