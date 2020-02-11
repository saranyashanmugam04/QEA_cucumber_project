package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Login {
	WebDriver driver;
	@Given("user navigates to demowebshop on Chrome browser")
	public void user_navigates_to_demowebshop_on_Chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saranya.a.shanmugam\\Downloads\\chromedriver_win32 (11)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
	}

	@When("user clicks on Login link")
	public void user_clicks_on_Login_link() {
		driver.findElement(By.linkText("Log in")).click();
	  
	}

	@Then("verify user naviagted to login page succesfully")
	public void verify_user_naviagted_to_login_page_succesfully() {
	  String title=driver.getTitle();
	  Assert.assertTrue(title.contains("Demo Web Shop. Login"));
	}

	@Then("user enter email id")
	public void user_enter_email_id() {
		driver.findElement(By.id("Email")).sendKeys("saranya@gmail.com");
	   
	}

	@Then("user enter password")
	public void user_enter_password() {
		driver.findElement(By.name("Password")).sendKeys("Loading@1");
	 
	}

	@Then("clicks on Submit button")
	public void clicks_on_Submit_button() {
	   driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("validates login success")
	public void validates_login_success() {
	  String hometitle=driver.getTitle();
	  Assert.assertTrue(hometitle.contains("Demo Web Shop"));
	  driver.close();
	}

}