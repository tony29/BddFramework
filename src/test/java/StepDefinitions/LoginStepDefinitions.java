package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
//import io.cucumber.java.en.Given;
import cucumber.api.java.en.Then;
//import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinitions {
	WebDriver driver;
	
		
	@Given("^User is on Login page$")
	public void user_is_on_Login_page()  {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		 WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    //driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@Then("^user enter username in username textfield$")
	public void user_enter_username_in_username_textfield(){
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
	}

	@Then("^user enter password in Password textfield$")
	public void user_enter_password_in_Password_textfield()  {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@Then("^user clicks on Login button$")
	public void user_clicks_on_Login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^User is on Home Page$")
	public void user_is_on_Home_Page(){
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Assert.assertEquals("OrangeHRM", driver.getTitle());
	}
	}
