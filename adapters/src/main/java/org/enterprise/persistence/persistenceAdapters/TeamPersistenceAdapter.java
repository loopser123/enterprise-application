package org.enterprise.persistence.persistenceAdapters;

import java.util.Optional;
import java.util.Set;

import org.enterprise.application.port.out.LoadTeamPort;
import org.enterprise.domain.Team;
import org.enterprise.domain.Team.TeamId;
import org.enterprise.persistence.entities.TeamJpaEntity;
import org.enterprise.persistence.repositories.TeamRepository;
import org.springframework.stereotype.Component;


@Component
public class TeamPersistenceAdapter implements LoadTeamPort {
	
	private final TeamRepository teamRepository; 
	private final EmployerPersistenceAdapter employerAdapter; 
	
	public TeamPersistenceAdapter(TeamRepository teamRepository,EmployerPersistenceAdapter employerAdapter) { 
		this.teamRepository= teamRepository; 
		this.employerAdapter = employerAdapter; 
	}

	@Override
	public Team getTeam(TeamId team_id) {
		Optional<TeamJpaEntity> teamJpaEntity = teamRepository.findById(team_id.getId()); 
		if(teamJpaEntity!=null) {
			
		}
		
		return null;
	}

	@Override
	public Set<Team> getTeams() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Team t) {
		// TODO Auto-generated method stub
	}
	
	public Team mapTeamJpaToTeam(TeamJpaEntity teamJpa) {
		Team team ; 
		team =  new Team(
					teamJpa.getTeam_id(),
					teamJpa.getTeam_name()
				);
		team.addAll(employerAdapter.employersJpaToEmployers(teamJpa.getTeaMembers())); 
		return team; 
	}
	public Set<Team> mapTeamsJpaToTeams(Set<TeamJpaEntity> teamsJpa ){
		Set<Team> teams = null; 
		for(TeamJpaEntity teamJpa : teamsJpa) {
			teams.add(mapTeamJpaToTeam(teamJpa)); 
		}
		return teams; 
	}

}
