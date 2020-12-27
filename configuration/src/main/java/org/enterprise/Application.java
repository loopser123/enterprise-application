package org.enterprise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;


@SpringBootApplication(scanBasePackages = "org.enterprise.*")
@EntityScan(basePackages = {"org.enterprise.persistence.entities"})
public class Application 
{
	
    public static void main( String[] args )
    {
    	 ApplicationContext ctx = SpringApplication.run(Application.class, args);
    	 System.out.println("here is the jpa "+ctx.containsBean("frontControllerConfiguration"));
    	 System.out.println("Another stuff "+ctx.containsBean("employeeJpaEntity")); 
    	 
    }
}	  
  