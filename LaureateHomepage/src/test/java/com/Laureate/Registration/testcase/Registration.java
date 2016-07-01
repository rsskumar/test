package com.Laureate.Registration.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.Laureate.Registration.Pages.RegistrationPage;

public class Registration {
	
	RegistrationPage Reg  = new RegistrationPage();
	
	WebDriver driver = new FirefoxDriver();
@Test
public void RegFirstname()

{
	Reg.ApplicantRegistration();
}
}
