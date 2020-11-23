package org.enterprise.application.port.out;

import java.util.List;

import org.enterprise.domain.Project;

public interface LoadProjectsPort {
	
	List<Project> findAllProjects(); 

}
