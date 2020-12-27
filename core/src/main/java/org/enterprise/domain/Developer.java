package org.enterprise.domain;

public class Developer extends Employer {
	
	private int velocity;
	
	public Developer(Long id, String name, String lastname, String adresse, double salary,int velocity) {
		super(id, name, lastname, adresse, salary);
		this.velocity=velocity; 
		
	}
	
	public int workedDaysPerMonth() {
		return 25; 
	} 
	
	
}
