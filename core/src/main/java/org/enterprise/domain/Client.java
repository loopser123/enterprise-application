package org.enterprise.domain;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;

@Data
public class Client {
	
	private String clientName; 
	private String contact; 
	private String responsable; 
	Set<Project> projects = new HashSet<Project>(); 
	
	public Client(String clientName,String contact , String responsable ) {
		this.clientName=clientName; 
		this.contact=contact; 
		this.responsable=responsable; 
	}
}
