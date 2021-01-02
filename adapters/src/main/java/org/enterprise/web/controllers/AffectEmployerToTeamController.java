package org.enterprise.web.controllers;

import java.util.Set;

import org.enterprise.application.port.in.AffectEmployerToTeamUseCase;
import org.enterprise.application.port.in.AffectEmployerToTeamUseCase.AffectEmployerCommand;
import org.enterprise.domain.Employer;
import org.enterprise.persistence.persistenceAdapters.EmployerPersistenceAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class AffectEmployerToTeamController {
	@Autowired
	private final AffectEmployerToTeamUseCase affectEmployerToTeam; 
	@Autowired
	private final EmployerPersistenceAdapter employerAdapter; 
	
	@PostMapping
	public void  affectEmployerToTeam(@RequestBody Long teamId ,
									  @RequestBody Long employerId ) {
		AffectEmployerCommand command = new AffectEmployerCommand(teamId,employerId); 
		affectEmployerToTeam.affectEmployerToTeamUseCase(command);
	}
	
	@GetMapping("/hello")
	public ResponseEntity<Set<Employer>>  testController() {
		Set<Employer> employers =  employerAdapter.getEmployers();  
		return new ResponseEntity<>(employers,HttpStatus.OK); 
	}
	@GetMapping("/secondHello")
	public String testControllerTwo() {
		return "hello here is the returned string"; 
	}
}
