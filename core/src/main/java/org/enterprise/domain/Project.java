package org.enterprise.domain;

import lombok.Data;


@Data
public class Project {
	
	private String name; 
	private String customer; 
	private Double budget; 
	private Team team; 
	private boolean atClientSite; 
	
}
