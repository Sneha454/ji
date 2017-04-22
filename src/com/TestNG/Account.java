package com.TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Account extends RepoterLog  {
	@Test
	public void secondTest1()
	{
		driver.findElement(By.xpath(".//*[@id='nav-link-accountList']")).click();
	
		driver.findElement(By.className("nav-action-inner")).click();
		
		
	}

	

}
