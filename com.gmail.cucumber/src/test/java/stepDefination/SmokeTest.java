package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	
	WebDriver driver;
	
	@Given("^Open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		System.out.println("browser opened");
	}

	@When("^enter un valid \"([^\"]*)\"$")
	public void enter_un_valid_username(String username) throws Throwable {
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("next")).click();
		System.out.println("userName entered");
		Thread.sleep(2000);
	}

	@When("^enter pw valid \"([^\"]*)\"$")
	public void enter_pw_valid_password(String password) throws Throwable {
		driver.findElement(By.id("Passwd")).sendKeys(password);
		System.out.println("Password entered");
		
	}

	@Then("^click on loginButton$")
	public void click_on_loginButton() throws Throwable {
		driver.findElement(By.id("signIn")).click();
		System.out.println("clicked on login");
	}

}
