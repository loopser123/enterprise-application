package org.enterprise.persistence.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Entity
@Table(name="projects")
@Data
public class ProjectJpaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long project_id; 
	
	private String name; 
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="client_id",nullable=true)
	private ClientJpaEntity client; 
	
	@ManyToMany
	@JoinTable( name="projects_by_teams",
			    joinColumns = {@JoinColumn(name="project_id")},
				inverseJoinColumns = {@JoinColumn(name="team_id")}
	)
	private Set<TeamJpaEntity> teams = new HashSet<TeamJpaEntity>(); 
}
