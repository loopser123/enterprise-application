package org.enterprise.application.service;

import org.enterprise.application.port.in.AffectEmployerToTeamUseCase;
import org.enterprise.application.port.out.LoadEmployerPort;
import org.enterprise.application.port.out.LoadProjectsPort;
import org.enterprise.application.port.out.LoadTeamPort;
import org.enterprise.domain.Employer;
import org.enterprise.domain.ProjectInventory;
import org.enterprise.domain.Team;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class AffectEmployerToTeamService implements AffectEmployerToTeamUseCase {
	
	private final  LoadEmployerPort employerLoader; 
	private final  LoadTeamPort teamLoader; 
	private final LoadProjectsPort projectLoader; 
	// TODO : add the rule that corresponds to techLeader-and-bizDev-and-designer can be affected to
	// multiple projects
	public void affectEmployerToTeamUseCase(AffectEmployerCommand command) {
				
		Employer employer = employerLoader.getEmployer(command.getEmployer_id());
		Team team = teamLoader.getTeam(command.getTeam_id()); 
		ProjectInventory projectInventory = new ProjectInventory(); 
		projectInventory.addAll(projectLoader.findAllProjects()); 
		if(!projectInventory.isAffectToAProject(employer)) {
			team.getTeaMembers().add(employer); 
		}
		teamLoader.save(team); 
	}

}
