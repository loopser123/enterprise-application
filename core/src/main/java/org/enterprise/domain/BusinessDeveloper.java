package org.enterprise.domain;

public class BusinessDeveloper extends Employer {
    private int numberOfSignedContracts; 
    
    public BusinessDeveloper(Long id,String name,String lastname,String adress ,double salary ,int numberOfSignedContracts) {
    	super(id,name,lastname,adress,salary); 
    	this.numberOfSignedContracts=numberOfSignedContracts; 
    }
	@Override
	public int workedDaysPerMonth() {
		// TODO Auto-generated method stub
		return 10; 
	}

	
	
	 
}
