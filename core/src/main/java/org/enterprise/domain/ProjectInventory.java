package org.enterprise.domain;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import lombok.Data;
@Data
public class ProjectInventory {

	Set<Project> projects = new HashSet<Project>(); 
	
	public boolean add(Project project) {
		return projects.add(project);
	}

	public boolean addAll(Collection<? extends Project> pjx) {
		return projects.addAll(pjx);
	}
	
	public boolean isAffectToAProject(Employer employer) {
		return false; 
	}
	
}
