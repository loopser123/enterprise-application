package org.enterprise.application.port.in;

import org.enterprise.domain.Employer.EmployerId;
import org.enterprise.domain.Team.TeamId;

import lombok.Data;

public interface AffectEmployerToTeamUseCase {
	
	public void affectEmployerToTeamUseCase(AffectEmployerCommand command); 
	
	@Data
	public class AffectEmployerCommand {
		TeamId team_id; 
		EmployerId employer_id; 
		public AffectEmployerCommand(TeamId team_id , EmployerId employer_id) {
			this.team_id = team_id; 
			this.employer_id = employer_id; 
		}
	}
	
	
}
