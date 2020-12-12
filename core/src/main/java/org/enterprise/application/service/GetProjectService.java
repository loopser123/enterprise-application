package org.enterprise.application.service;

import java.util.Set;

import org.enterprise.application.port.in.GetProjectsQuery;
import org.enterprise.application.port.out.LoadProjectsPort;
import org.enterprise.domain.Project;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GetProjectService implements GetProjectsQuery {
	
	private final LoadProjectsPort loadProjectsPort; 
	
	public Set<Project> getAllProjects() {
		return loadProjectsPort.findAllProjects(); 
	}

}
