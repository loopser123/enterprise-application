package org.enterprise.usecase;

import org.enterprise.entity.Project;

public class Prjoectcrudoperations {
		
	private ProjectDataProvider dataProvider; 
	
	
	public Project addProject(Project project) {
		return dataProvider.save(project);
	}
}
