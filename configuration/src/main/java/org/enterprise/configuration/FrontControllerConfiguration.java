package org.enterprise.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class FrontControllerConfiguration {
	
	

	@Bean 
	public String getString() {
		return new String("Hello String"); 
	}
}
