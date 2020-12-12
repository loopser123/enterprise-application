package org.enterprise.application.port.in;

public interface SaveProjectUseCase {
	
	
	void saveProject(SaveProjectCommand command); 
	
	public class SaveProjectCommand {
		
		private String name; 
		private String customer; 
		private double budget;
		private boolean atClientSite;
		
		public SaveProjectCommand(String name , String customer ,double bugdet , boolean atClientSite) {
			this.name = name; 
			this.customer=customer; 
			this.budget = budget; 
			this.atClientSite=atClientSite; 
		}
		
	}

}
