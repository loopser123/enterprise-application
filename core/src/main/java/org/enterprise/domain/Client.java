package org.enterprise.domain;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Client {
	
	private ClientId client_id; 
	private String clientName; 
	private String contact; 
	private String responsable; 
	Set<Project> projects = new HashSet<Project>(); 
	
	public Client(Long id , String clientName,String contact , String responsable ) {
		this.client_id = new ClientId(id); 
		this.clientName=clientName; 
		this.contact=contact; 
		this.responsable=responsable; 
	}
	
	@Data
	@AllArgsConstructor
	public static class ClientId {
		private Long id; 
	}
}
