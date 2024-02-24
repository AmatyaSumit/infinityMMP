package org.iit.healthcare.patientmodule.tests;

import java.util.Random;

import org.iit.healthcare.mmp.util.BaseClass;
import org.iit.healthcare.mmp.util.MMPLib;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


//puhsing to FIrst-branch
public class message extends BaseClass{
	 
	@Test
	public void validateSendMessage()
	{
		MMPLib mmpLib = new MMPLib(driver);
	    mmpLib.launchBrowser(mmpProp.getProperty("patienturl"));
	    mmpLib.loginValidUser(mmpProp.getProperty("patientusername"),mmpProp.getProperty("patientpassword"));
	
	}
	
	public void sendMessage() {
		
		driver.findElement(By.xpath("(//span[normalize-space()='Messages'])[1]")).click();
		driver.findElement(By.id("subject")).sendKeys("Flu");
		driver.findElement(By.id("message")).sendKeys("High Temperature");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert alrt = driver.switchTo().alert();
		//alrt.accept();
		
	}
	
		 
	

}