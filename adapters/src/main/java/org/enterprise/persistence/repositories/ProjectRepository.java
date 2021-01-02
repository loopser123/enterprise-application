package org.enterprise.persistence.repositories;

import org.enterprise.persistence.entities.ProjectJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProjectRepository extends JpaRepository<ProjectJpaEntity,Long>{

}
