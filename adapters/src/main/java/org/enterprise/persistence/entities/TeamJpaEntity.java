package org.enterprise.persistence.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity(name="teams")
@Data
public class TeamJpaEntity {
	@Id
	@GeneratedValue
	@Column
	private Long team_id; 
	@Column
	private String team_name;  
	@ManyToMany
	@JoinTable(name="employers_by_teams",
			   joinColumns = {@JoinColumn(name="team_id")},
			   inverseJoinColumns = {@JoinColumn(name="employer_id")})
	private Set<EmployeeJpaEntity> teaMembers = new HashSet<EmployeeJpaEntity>(); 
	
}
