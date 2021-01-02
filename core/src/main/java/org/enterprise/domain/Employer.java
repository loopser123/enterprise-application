package org.enterprise.domain;

public abstract class Employer {
	
	private EmployerId id; 
	private String name; 
	private String lastName; 
	private String adresse; 
	private double salary; 
	
	public Employer(Long id , String name , String lastname , String adresse,double salary) {
		this.id = new EmployerId(id); 
		this.name = name; 
		this.lastName=lastname; 
		this.adresse=adresse; 
		this.salary=salary; 
	}
	
	public abstract int workedDaysPerMonth(); 
	
	public static class EmployerId { 
		Long id; 
		public EmployerId(Long id) {
			this.id = id; 
		}
		public Long getId() {
			return this.id; 
		}
	}
}
