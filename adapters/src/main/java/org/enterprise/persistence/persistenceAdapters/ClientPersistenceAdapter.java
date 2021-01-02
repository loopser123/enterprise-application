package org.enterprise.persistence.persistenceAdapters;

import org.enterprise.domain.Client;
import org.enterprise.persistence.entities.ClientJpaEntity;
import org.enterprise.persistence.repositories.ClientJpaRepository;
import org.springframework.stereotype.Component;

@Component
public class ClientPersistenceAdapter {
	
	private final ClientJpaRepository clientRepository; 
	
	public ClientPersistenceAdapter(ClientJpaRepository clientRepository) {
		this.clientRepository = clientRepository; 
	}
	
	public Client clientJpaToClient(ClientJpaEntity clientJpa) {
		
		Client client = new Client(
				clientJpa.getId(),
				clientJpa.getClientName(),
				clientJpa.getContact(),
				clientJpa.getResponsable()
				); 
		return client; 
	}

}
