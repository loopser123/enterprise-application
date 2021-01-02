package org.enterprise.persistence.persistenceAdapters;

import org.enterprise.domain.Developer;
import org.enterprise.persistence.entities.DeveloperJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class DeveloperPersistenceAdapter {

	
	public Developer mapDeveloperJpaToDeveloper(DeveloperJpaEntity developerJpa) {
		
		return new Developer(developerJpa.getId(),
							 developerJpa.getName(),
							 developerJpa.getLast_name(),
							 developerJpa.getAdress(),
							 developerJpa.getSalary(),
							 developerJpa.getVelocity()
				); 		
	}
}
