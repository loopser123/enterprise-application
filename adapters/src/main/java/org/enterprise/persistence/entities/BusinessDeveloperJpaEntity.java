package org.enterprise.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class BusinessDeveloperJpaEntity extends EmployeeJpaEntity{
	 @Column 
	 private int numberOfSignedContracts; 
}
