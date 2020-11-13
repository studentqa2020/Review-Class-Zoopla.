package com.page.object.model;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.coding.MasterPageFactory;
import com.util.Baseconfig;

public class ZooplaLogin {
	
	public static WebDriver getLogin() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(Baseconfig.getConfigValue("URL"));
		
		MasterPageFactory pf = new MasterPageFactory(driver);
		pf.getAcceptCookies().click();
		
		pf.getLogin().click();
		
		pf.getEmail().sendKeys(Baseconfig.getConfigValue("email"));
		pf.getPassword().sendKeys(Baseconfig.getConfigValue("password"));
		pf.getSubmit().click();
		
		return driver;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
