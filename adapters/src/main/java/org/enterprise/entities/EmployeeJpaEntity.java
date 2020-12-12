package org.enterprise.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class EmployeeJpaEntity {
	
	@Id
	private Long id;
	
	@Column
	private String name; 
	
	@Column 
	private String last_name; 
	
}
