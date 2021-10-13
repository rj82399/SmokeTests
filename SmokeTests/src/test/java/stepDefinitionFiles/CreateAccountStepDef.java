package stepDefinitionFiles;


import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;



public class CreateAccountStepDef {
	static WebDriver driver = null;
	
	@Given("^the user is on the home page of HR Block$")
	public void the_user_is_on_the_home_page_of_HR_Block() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.hrblock.com/");
	}

	@When("^the user clicks on the Sign in button$")
	public void the_user_clicks_on_the_Sign_in_button() throws Throwable {
		driver.findElement(By.xpath("//a/span[contains(text(),'Sign in')]")).click();

	}

	@Then("^the Sign in panel open on the right side block$")
	public void the_Sign_in_panel_open_on_the_right_side_block() throws Throwable {
		String blockText=driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/p")).getText();
		assertEquals("Sign in", blockText);
	}

	@When("^the user clicks on the Create Account button$")
	public void the_user_clicks_on_the_Create_Account_button() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/span[contains(text(),'Create Account')]")).click();

	}

	@Then("^the Create an account page open successfully$")
	public void the_Create_an_account_page_open_successfully() throws Throwable {
		String pageTitle=driver.findElement(By.xpath("//*[@id=\"createaccountone\"]/hrb-text[1]")).getText();
		assertEquals("Create an account.", pageTitle);

	}

	@When("^the user enters the email address$")
	public void the_user_enters_the_email_address() throws Throwable {
		driver.findElement(By.xpath("//label[contains(text(),'Email')]//following::input[1]")).sendKeys("rj82399@gmail.com");
	}

	@When("^the user enters the phone number$")
	public void the_user_enters_the_phone_number() throws Throwable {
		driver.findElement(By.xpath("//label[contains(text(),'Email')]//following::input[2]")).sendKeys("9124565841");
	}

	@When("^the use enters a user name$")
	public void the_use_enters_a_user_name() throws Throwable {
		driver.findElement(By.xpath("//label[contains(text(),'Email')]//following::input[4]")).sendKeys("rj82399");
	}

	@When("^the user click on the Next button$")
	public void the_user_click_on_the_Next_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"showhideNew\"]/button/span/span/hrb-text")).click();
		Thread.sleep(2000);
	}

	@Then("^the user is navigated to the Create a Password page$")
	public void the_user_is_navigated_to_the_Create_a_Password_page() throws Throwable {
		String pwdPageTitle=driver.findElement(By.xpath("//*[@id=\"createaccounttwo\"]/hrb-text[1]")).getText();
		assertEquals("Create a password.", pwdPageTitle);
	}

	@When("^the user enters a password$")
	public void the_user_enters_a_password() throws Throwable {
		driver.findElement(By.xpath("//label[contains(text(),'Password')]//following::input[1]")).sendKeys("Test123$$");
	}

	@When("^the user enters the confirm password$")
	public void the_user_enters_the_confirm_password() throws Throwable {
		driver.findElement(By.xpath("//label[contains(text(),'Password')]//following::input[2]")).sendKeys("Test123$$");
	}

	@When("^the user selects the agree check box$")
	public void the_user_selects_the_agree_check_box() throws Throwable {
		driver.findElement(By.xpath("//*[@id='createaccounttwo']/hrb-checkbox[2]/label/span[1]/span")).click();
	}

	@When("^the user clicks on Create Account button$")
	public void the_user_clicks_on_Create_Account_button() throws Throwable {
		//I purposely did not develop this to avoid creating account 
	}

	@Then("^the account is created successfully$")
	public void the_account_is_created_successfully() throws Throwable {
		//I purposely did not develop this to avoid creating account 
	}	
	

}
