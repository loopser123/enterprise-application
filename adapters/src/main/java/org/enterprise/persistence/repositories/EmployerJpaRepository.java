package org.enterprise.persistence.repositories;

import org.enterprise.persistence.entities.EmployeeJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerJpaRepository extends JpaRepository<EmployeeJpaEntity,Long> {
	
}
