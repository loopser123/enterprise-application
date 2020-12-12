package org.enterprise.application.port.out;

import java.util.Set;

import org.enterprise.domain.Employer;
import org.enterprise.domain.Employer.EmployerId;

public interface LoadEmployerPort {
	
	public Set<Employer> getEmployers(); 
	public Employer getEmployer(EmployerId employer_id); 

}
