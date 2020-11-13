package com.generic.coding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//*[@class='ui-button-primary ui-cookie-accept-all-medium-large']")
	private WebElement acceptCookies;
	
	@FindBy(xpath="(//*[@class='css-18j99f0 e11d441i1'])[4]")
    private WebElement Login;
	@FindBy(xpath="//*[@id='signin_email']")
	private WebElement email;
	@FindBy(xpath="//*[@id='signin_password']")
	private WebElement password;
	@FindBy(xpath="//*[@id='signin_submit']")
	private WebElement submit;
	

	
	
	public WebElement getAcceptCookies() {
		return acceptCookies;
	}
	public WebElement getLogin() {
		return Login;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	
	
	
	
	
	
	

}
