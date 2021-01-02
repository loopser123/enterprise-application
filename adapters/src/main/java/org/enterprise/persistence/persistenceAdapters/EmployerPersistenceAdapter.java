package org.enterprise.persistence.persistenceAdapters;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.enterprise.application.port.out.LoadEmployerPort;
import org.enterprise.domain.BusinessDeveloper;
import org.enterprise.domain.Developer;
import org.enterprise.domain.Employer;
import org.enterprise.domain.Employer.EmployerId;
import org.enterprise.persistence.entities.BusinessDeveloperJpaEntity;
import org.enterprise.persistence.entities.DeveloperJpaEntity;
import org.enterprise.persistence.entities.EmployeeJpaEntity;
import org.enterprise.persistence.repositories.EmployerJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class EmployerPersistenceAdapter implements LoadEmployerPort {

	private final EmployerJpaRepository employerJpaRepository;
	private final DeveloperPersistenceAdapter developerAdapter; 
	private final BusinessDevelperPersistenceAdapter businessAdapter; 

	@Autowired
	public EmployerPersistenceAdapter(EmployerJpaRepository employerJpaRepository,
			DeveloperPersistenceAdapter developerAdapter, 
			BusinessDevelperPersistenceAdapter businessAdapter) {
		this.employerJpaRepository = employerJpaRepository;
		this.developerAdapter=developerAdapter; 
		this.businessAdapter=businessAdapter; 
	}

	@Override
	public Set<Employer> getEmployers() {
		Set<Employer> employers = new HashSet<Employer>();
		BusinessDeveloper businnesDeveloper = null;
		Developer developer = null;
		List<EmployeeJpaEntity> abstractEmployers = employerJpaRepository.findAll();

		for (EmployeeJpaEntity absEmp : abstractEmployers) {
			if (absEmp instanceof BusinessDeveloperJpaEntity) {
				businnesDeveloper = new BusinessDeveloper(absEmp.getId(), absEmp.getName(), absEmp.getLast_name(),
						absEmp.getAdress(), absEmp.getSalary(),
						((org.enterprise.persistence.entities.BusinessDeveloperJpaEntity) absEmp)
								.getNumberOfSignedContracts());
				employers.add(businnesDeveloper);
			}
			if (absEmp instanceof DeveloperJpaEntity) {
				developer = new Developer(absEmp.getId(), absEmp.getName(), absEmp.getLast_name(), absEmp.getAdress(),
						absEmp.getSalary(), ((DeveloperJpaEntity) absEmp).getVelocity());
				employers.add(developer);
			}
		}
		return employers;
	}

	@Override
	public Employer getEmployer(EmployerId employer_id) {
		Optional<EmployeeJpaEntity> absEmployee = employerJpaRepository.findById(employer_id.getId());
		if (absEmployee.get() instanceof BusinessDeveloperJpaEntity) {
			return new BusinessDeveloper(absEmployee.get().getId(), absEmployee.get().getName(),
					absEmployee.get().getLast_name(), absEmployee.get().getAdress(), absEmployee.get().getSalary(),
					((org.enterprise.persistence.entities.BusinessDeveloperJpaEntity) absEmployee.get())
							.getNumberOfSignedContracts());
		}
		return new Developer(absEmployee.get().getId(), absEmployee.get().getName(), absEmployee.get().getLast_name(),
				absEmployee.get().getAdress(), absEmployee.get().getSalary(),
				((DeveloperJpaEntity) absEmployee.get()).getVelocity());
	}
	
	
	public Employer employerJpaToEmployer(EmployeeJpaEntity employerJpa) {
		if(employerJpa instanceof BusinessDeveloperJpaEntity) {
			return businessAdapter.mapBusinessDevJpaToBusinessDev((BusinessDeveloperJpaEntity)employerJpa); 
		}
		return developerAdapter.mapDeveloperJpaToDeveloper((DeveloperJpaEntity)employerJpa); 
	}
	
	public Set<Employer> employersJpaToEmployers(Set<EmployeeJpaEntity> employersJpa){
		Set<Employer> employers = null; 
		for(EmployeeJpaEntity e : employersJpa) {
			employers.add(employerJpaToEmployer(e)); 
		}
		return employers; 
	}
	
}
