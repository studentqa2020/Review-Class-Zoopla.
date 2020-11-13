package com.testexecution;

import org.openqa.selenium.WebDriver;

import com.page.object.model.ZooplaLogin;

public class Smoketest {
	static WebDriver driver;
	
public static void main(String[] args) throws Throwable {
		
		driver =ZooplaLogin.getLogin();
		driver.quit();
	}
	
	
	
	
	
	

}
