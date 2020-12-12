package org.enterprise.application.port.out;

import java.util.Set;

import org.enterprise.domain.Project;

public interface LoadProjectsPort {
	
	Set<Project> findAllProjects(); 

}
