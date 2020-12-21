package org.enterprise.persistence.entities;

import java.util.HashSet;
import java.util.Set;

public class ClientJpaEntity {
	
	// @Id
	private Long id; 
	// @Column
	private String clientName; 
	// @Column
	private String contact; 
	// @Column 
	private String responsable; 
	// @OneToMany
	Set<ProjectJpaEntity> projects = new HashSet<ProjectJpaEntity>(); 
	
	
	

}
