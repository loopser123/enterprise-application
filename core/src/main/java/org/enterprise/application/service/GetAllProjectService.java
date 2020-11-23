package org.enterprise.application.service;

import java.util.List;

import org.enterprise.application.port.in.GetAllProjectsQuery;
import org.enterprise.application.port.out.LoadProjectsPort;
import org.enterprise.domain.Project;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GetAllProjectService implements GetAllProjectsQuery {
	
	private final LoadProjectsPort loadProjectsPort; 
	
	public List<Project> getAllProjects() {
		return loadProjectsPort.findAllProjects(); 
	}

}
