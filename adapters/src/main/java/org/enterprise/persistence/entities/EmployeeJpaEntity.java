package org.enterprise.persistence.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Component
@Entity
@Table(name="employers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@DiscriminatorColumn(name="employeeType")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class EmployeeJpaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column
	private String name; 
	
	@Column 
	private String last_name; 
	
	@Column 
	private String adress; 
	
	@Column 
	private double salary; 
	
}
