package org.enterprise;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public abstract class GenericValidator<T> {
	
	private Validator validator; 
	
	
	public GenericValidator() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory(); 
		Validator validator = factory.getValidator(); 
	}
	
	protected void selfValidator() {
		// Set<Constraint>
	}
	
	
	
	
	

}
