package org.enterprise;

import java.util.ArrayList;
import java.util.List;

import org.enterprise.entity.Project;
import org.enterprise.usecase.ProjectDataProvider;

public class Projectstorage implements ProjectDataProvider{
	
	List<Project> inMemoryDb = new ArrayList<Project>(); 
	
	public Project save(Project project) {
		inMemoryDb.add(project); 
		return project; 
	}

}
