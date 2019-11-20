package cucumber.cucumber1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pages 
{
	WebDriver driver;
	
	public Pages(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void do_login(String uid, String pass) 
	{
		driver.findElement(By.name("userName")).sendKeys(uid);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
	}
}
