package org.enterprise.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
public class EmployeeJpaEntity {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column
	private String name; 
	
	@Column 
	private String last_name; 
	
}
