package cucumber.cucumber1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class bgDef
{

	int a,b,s,p;
	
	@Given("^User must enter input values$")
	public void user_must_enter_input_values() throws Throwable
	{
	    System.out.println("User enters input");
	    a=10;
	    b=20;
	}

	@Then("^assign the values to variable a & b$")
	public void assign_the_values_to_variable_a_b() throws Throwable 
	{
		System.out.println(a+" "+b);
	}

	@When("^add two input$")
	public void add_two_input() throws Throwable
	{
	    s=a+b;
	}

	@Then("^display the sum$")
	public void display_the_sum() throws Throwable 
	{
		System.out.println("Sum is "+s);
	}

	@When("^multiply two numbers$")
	public void multiply_two_numbers() throws Throwable 
	{
	    p=a*b;
	}

	@Then("^display the product$")
	public void display_the_product() throws Throwable
	{
		System.out.println("Product is "+p);
	}
	
}
