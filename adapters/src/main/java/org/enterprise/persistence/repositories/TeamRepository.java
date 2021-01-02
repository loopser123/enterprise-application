package org.enterprise.persistence.repositories;

import org.enterprise.persistence.entities.TeamJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TeamRepository extends JpaRepository<TeamJpaEntity,Long> {
	
	
}
