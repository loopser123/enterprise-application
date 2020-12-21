package org.enterprise.domain;

import lombok.Data;


@Data
public class Project {
	
	private ProjectId projectId; 
	private String name; 
	private Team team; 
	private Client client; 
	
	public void setClient(Client client) {
		client.getProjects().add(this); 
	}
	
	public static class ProjectId { 
		Long id; 
	}
}
