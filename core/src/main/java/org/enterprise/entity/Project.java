package org.enterprise.entity;

import java.util.List;

import lombok.Data;


@Data
public class Project {
	
	private String name; 
	private String customer; 
	private Double budget; 
	List<Employer> employers; 

}
