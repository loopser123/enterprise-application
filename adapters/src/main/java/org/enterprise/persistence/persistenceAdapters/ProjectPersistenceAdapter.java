package org.enterprise.persistence.persistenceAdapters;

import java.util.List;
import java.util.Set;

import org.enterprise.application.port.out.LoadProjectsPort;
import org.enterprise.domain.Project;
import org.enterprise.persistence.entities.ProjectJpaEntity;
import org.enterprise.persistence.repositories.ProjectRepository;
import org.springframework.stereotype.Component;

@Component
public class ProjectPersistenceAdapter implements LoadProjectsPort{
	
	private final ProjectRepository projetRepository; 
	private final ClientPersistenceAdapter clientAdapter; 
	private final TeamPersistenceAdapter teamAdapter; 
	
	public ProjectPersistenceAdapter(ProjectRepository projectRepository,
									 ClientPersistenceAdapter clientAdapter,
									 TeamPersistenceAdapter teamAdapter) {
		this.projetRepository=projectRepository; 
		this.clientAdapter = clientAdapter; 
		this.teamAdapter = teamAdapter; 
	}

	@Override
	public Set<Project> findAllProjects() {
		Set<Project> projects = null ;
		List<ProjectJpaEntity> projectsJpaEntity = projetRepository.findAll(); 
		for(ProjectJpaEntity projectJpa : projectsJpaEntity) {
			Project project = new Project(
						projectJpa.getProject_id(),
						projectJpa.getName()
					); 
		   project.setClient(clientAdapter.clientJpaToClient(projectJpa.getClient()));
		   project.addAll(teamAdapter.mapTeamsJpaToTeams(projectJpa.getTeams()));
		   projects.add(project); 
		}
		return projects; 
	}

}
