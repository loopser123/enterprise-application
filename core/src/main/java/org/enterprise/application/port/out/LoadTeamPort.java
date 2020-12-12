package org.enterprise.application.port.out;

import java.util.Set;

import org.enterprise.domain.Team;
import org.enterprise.domain.Team.TeamId;

public interface LoadTeamPort {
	
	public Team getTeam(TeamId team_id); 
	public Set<Team> getTeams(); 
	public void save(Team t);  

}
