package com.Laureate.Registration.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	
	WebDriver driver;
    By RegFirstname = By.xpath(".//*[@id='First_Name']");
    
    By RegLastname = By.id("Last_Name");
    By countryNamesearch = By.xpath("//input[@type='text']");
    By countryName = By.linkText("United Kingdom");
    By EmailAddress = By.id("Email_Address_email");
    By ConfirmEmailAddress = By.id("Confirm_Email_email");
    By Password = By.id("Password_password");
    By ConfirmPassword = By.id("Confirm_Password_password");
    By Agreement = By.id("agreement");
    By CreateAccount = By.xpath("//span[@id='j_id0:j_id1']/ng-include/div/div[2]/div/div[4]/div/div/div/div/form/ul/li/div/div/button");
     
    public void ApplicantRegistration()
    {
//    	driver.findElement(RegFirstname).sendKeys("Surya");
    	
    	EnterText("RegFirstname","Surya");
    	EnterText("RegLastname","Ramesh");
    	EnterText("countryName","United Kingdom");
    	EnterText("EmailAddress","Ramesh@France.com");
    	EnterText("ConfirmEmailAddress","Ramesh@France.com");
    	EnterText("Password","Test1234!");
    	EnterText("ConfirmPassword","Test1234!");
    	driver.findElement(Agreement).click();
    	driver.findElement(CreateAccount).click();
    	
    }
	
    public void EnterText(String AppInfo, String text){
    	driver.findElement(By.xpath(AppInfo)).click();
    	driver.findElement(By.xpath(AppInfo)).clear();
    	driver.findElement(By.xpath(AppInfo)).sendKeys(text);
    	
    }
}
