package cucumber.cucumber1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition
{
    String str;
	
	@Given("^type hello world$")
	public void type_hello_world() throws Throwable 
	{
	    str="Hello World";
	}

	@When("^execute the code$")
	public void execute_the_code() throws Throwable
	{
	    System.out.println(str);
	}

	@Then("^hello world must be displayed in the console$")
	public void hello_world_must_be_displayed_in_the_console() throws Throwable
	{
		System.out.println("displayed successfully !!");
	}
}
