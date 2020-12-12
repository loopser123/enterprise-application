package org.enterprise.domain;

import org.junit.Assert;
import org.junit.Test;

public class ProjectInventoryTest {
	
		@Test
		public void testIsAffectedToATeamSouldReturnFalse() {
			ProjectInventory inv = new ProjectInventory(); 
			Employer em = new Developer(); 
			Assert.assertFalse("Should return false",inv.isAffectToAProject(em)); 
		}

}
