package stepDifinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

import pageObjects.LoginPage;


public class Steps {
	
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user")+"//Drivers/chromedriver.exe");
		driver =new ChromeDriver();
		
		lp=new LoginPage(driver); //Creating obj for loginpage & using ref lp we will access all the methods of login page or page object
		
	}
	
	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
		driver.get(url);   //open the  browser
		
	}
	
	@When("User enter Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String email, String password) {
		lp.setUserName(email);
		lp.setPassword(password);
	}
	
	@When ("Click on login")
	public void click_on_log_in() {
		lp.clickLogin();	
	}
	
	@Then ("page title should be {string}")
	public void page_title_should_be(String title) {
		
		if (driver.getPageSource().contains("Login was unsuccessful.")) {  //if we got unsuccessful msg then driver will close,verifying negative way
			driver.close();
			Assert.assertTrue(false);
		}
			else {
				Assert.assertEquals(title, driver.getTitle()); 
			}
		}
	
	
	@When ("User click on Log out link")
	public void click_on_log_out_link() throws InterruptedException {
		
		lp.clickLogout();
		Thread.sleep(3000);
		
	}
	
	@Then("Close browser")
	public void close_browser() {
		
		driver.close();
		
	}
	
	

}
