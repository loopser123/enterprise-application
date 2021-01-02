package org.enterprise.persistence.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Entity
@Table(name="clients")
@Data
public class ClientJpaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	@Column
	private String clientName; 
	@Column
	private String contact; 
	@Column 
	private String responsable; 
	@OneToMany(mappedBy="client")
	Set<ProjectJpaEntity> projects = new HashSet<ProjectJpaEntity>(); 
	
	
	

}
