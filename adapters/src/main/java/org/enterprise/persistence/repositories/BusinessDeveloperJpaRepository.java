package org.enterprise.persistence.repositories;

import org.enterprise.persistence.entities.BusinessDeveloperJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BusinessDeveloperJpaRepository extends JpaRepository<BusinessDeveloperJpaEntity, Long> {

}
