package cucumber.cucumber1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class tagFile 
{
	@Given("^User is testing for the login functionality$")
	public void user_is_testing_for_the_login_functionality() throws Throwable 
	{
	    System.out.println("Login !!");
	}
	
	@Then("^User able to login successfully$")
	public void user_able_to_login_successfully() throws Throwable
	{
		System.out.println("login successful !!");
	}
	
	@Given("^User is testing the search functionality$")
	public void user_is_testing_the_search_functionality() throws Throwable 
	{
		System.out.println("Search for a product");
	}
	
	@Then("^search works successfully$")
	public void search_works_successfully() throws Throwable
	{
		System.out.println("search is successful !!");
	}
	
	@Then("^\"([^\"]*)\" is tester on Testme App$")
	public void is_tester_on_Testme_App(String arg1) throws Throwable
	{
		System.out.println("Tester is "+arg1);
	}

}
