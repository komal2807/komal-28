package cucumber.cucumber1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import cucumber.cucumber1.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.cucumber1.Pages;

public class LoginTest 
{
	WebDriver driver;

	@Given("^user must be on the login page$")
	public void user_is_on_the_home_page() throws Throwable
	{
		driver=UtilityClass.openBrowser("chrome");
	    driver.get("http://newtours.demoaut.com/");
	}

	@When("^user enters the valid credentials$")
	public void user_enter_the_valid_credentials() throws Throwable
	{
		Pages page = new Pages(driver);
		page.do_login("tutorial", "tutorial");
		
	}

	@Then("^user must be in home page$")
	public void user_must_in_home_page_and_display_success_message() throws Throwable 
	{
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("tripType")));
		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
		System.out.println("Logged in Successfully !!");
		driver.close();
	}
}
