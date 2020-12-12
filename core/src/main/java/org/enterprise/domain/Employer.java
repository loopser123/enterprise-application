package org.enterprise.domain;

import lombok.Data;

@Data
public abstract class Employer {
	
	private EmployerId id; 
	private String name; 
	private String lastName; 
	private String adresse; 
	private double salary; 
	
	
	
	public abstract int workedDaysPerMonth(); 
	
	public class EmployerId { 
		Long id; 
	}
}
