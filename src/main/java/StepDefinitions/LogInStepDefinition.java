package StepDefinitions;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInStepDefinition {
	
	WebDriver driver;
	
	
	@Given("^user is already on login page$")
	public void user_already_on_login_page() {
		
	System.setProperty("webdriver.chrome.driver", "/Users/nibir/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	
    @When("^title of login page is Facebook$")
	public void title_of_login_page_is_Facebook() {
		String title = driver.getTitle();
	    System.out.println(title);
	AssertJUnit.assertEquals("Facebook - Log In or Sign Up",title);
		
	}
	@Then("^User enters username and password$")
	public void user_enters_username_and_password() {
    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("nibirwasif@yahoo.com");
	driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Dadabir2009?");
		
	}
	
	@Then("^User clicks on login button$")
     public void user_clicks_on_login_button() {
	driver.findElement(By.id("loginbutton")).click();
	
	}
	
	
}
	


