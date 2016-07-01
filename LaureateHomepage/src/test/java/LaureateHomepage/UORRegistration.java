package LaureateHomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class UORRegistration {
	
	WebDriver driver = null;
	@Given("^I navigate to ChromeBrowser$")
	
	public void BrowserLaunch()
	{
		driver = new FirefoxDriver();
	}
	
	@When("^I enter UOR URL$")
	
	public void launchurl()
	{
		driver.navigate().to("https://ukqa-waldenu.cs22.force.com/Roehampton#/");		

	}
	
	@Then("^UOR Home should be displayed$")
	
	public void verifyhomepage()
	
	{
		String UORTitle = driver.findElement(By.xpath("//h1[contains(text(),'Your Homepage @ Roehampton')]")).getText();
		if (UORTitle.contains("Homepage"))
		{
			System.out.println("Successfully UOR page Launched");
		}
			System.out.println("Unable to launcg URL");
	}
	
}
