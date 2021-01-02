package org.enterprise.persistence.repositories;

import org.enterprise.persistence.entities.ClientJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientJpaRepository extends JpaRepository<ClientJpaEntity,Long> {

}
