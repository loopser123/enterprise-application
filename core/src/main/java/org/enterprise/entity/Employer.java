package org.enterprise.entity;

import lombok.Data;

@Data
public class Employer {
	private String name; 
	private String lastName; 
	private String adresse; 
	private double salary; 
	
	
	public double relaxSalary() {
		return this.salary * 1.1; 
	}
}
