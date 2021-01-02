package org.enterprise.persistence.persistenceAdapters;

import org.enterprise.domain.BusinessDeveloper;
import org.enterprise.persistence.entities.BusinessDeveloperJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class BusinessDevelperPersistenceAdapter {
	
	
	public BusinessDeveloper mapBusinessDevJpaToBusinessDev(BusinessDeveloperJpaEntity businessDevJpa) {
		return new BusinessDeveloper(
				businessDevJpa.getId(),
				businessDevJpa.getName(),
				businessDevJpa.getLast_name(),
				businessDevJpa.getAdress(),
				businessDevJpa.getSalary(),
				businessDevJpa.getNumberOfSignedContracts()
				);
	}

}
