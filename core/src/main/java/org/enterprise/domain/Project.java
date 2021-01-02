package org.enterprise.domain;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
public class Project {
	
	private ProjectId projectId; 
	private String name; 
	private Set<Team> teams = new HashSet<Team>(); 
	private Client client; 
	
	public void setClient(Client client) {
		client.getProjects().add(this); 
	}
	public Project(Long project_id , String name) {
		this.projectId = new ProjectId(project_id); 
		this.name = name; 
	}
	
	public int size() {
		return teams.size();
	}
	public boolean add(Team e) {
		return teams.add(e);
	}
	public boolean addAll(Collection<? extends Team> c) {
		return teams.addAll(c);
	}
	public void clear() {
		teams.clear();
	}

	@AllArgsConstructor
	public static class ProjectId { 
		Long id; 
	}
}
