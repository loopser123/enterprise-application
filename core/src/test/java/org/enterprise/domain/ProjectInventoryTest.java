package org.enterprise.domain;

import org.junit.Assert;
import org.junit.Test;

public class ProjectInventoryTest {
	
		@Test
		public void testIsAffectedToATeamSouldReturnFalse() {
			ProjectInventory inv = new ProjectInventory(); 
			Employer em = new Developer(1L,"name","lastName","32 Narjis 1",23.00,5);  
			Assert.assertFalse("Should return false",inv.isAffectToAProject(em)); 
		}

}
