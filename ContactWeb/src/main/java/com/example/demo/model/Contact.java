package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Contact {
	@Id
	private int id;
	private String name;
	private int number;
	public String toString() {
		return id+": "+ name+" is "+number;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
