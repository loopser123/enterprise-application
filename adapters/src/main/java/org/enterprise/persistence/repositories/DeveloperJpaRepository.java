package org.enterprise.persistence.repositories;

import org.enterprise.persistence.entities.DeveloperJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DeveloperJpaRepository extends JpaRepository<DeveloperJpaEntity, Long> {

}
