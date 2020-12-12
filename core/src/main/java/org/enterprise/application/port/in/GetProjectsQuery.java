package org.enterprise.application.port.in;

import java.util.Set;

import org.enterprise.domain.Project;

public interface GetProjectsQuery{
	
	Set<Project> getAllProjects(); 

}
