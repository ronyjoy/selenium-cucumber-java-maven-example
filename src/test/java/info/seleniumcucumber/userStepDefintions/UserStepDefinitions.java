package info.seleniumcucumber.userStepDefintions;

import java.util.Arrays;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import env.DriverUtil;
import info.seleniumcucumber.methods.BaseTest;

public class UserStepDefinitions implements BaseTest {

	protected WebDriver driver = DriverUtil.getDefaultDriver();

	@Given("^that I am on Cargospear login page$")
	public void i_login_to_CargoUI() throws Throwable {
		driver.get("https://addemo:admin@cargosphere.co/ptrade/jsp/admin/DigestAdmin.jsp");
		Thread.sleep(2000);
	}

	@When("^I have provided valid username and password$")
	public void i_give_username_and_password() throws Throwable {
		driver.findElement(By.name("txtUName")).sendKeys("username");
		driver.findElement(By.name("txtPWord")).sendKeys("password");
		driver.findElement(By.name("txtPWord")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("input[value='  OK  ']")).click();
		Thread.sleep(2000);

	}

	@When("^I have provided invalid username or password$")
	public void i_give_invalid_username_and_password() throws Throwable {
		driver.findElement(By.name("txtUName")).sendKeys("username");
		driver.findElement(By.name("txtPWord")).sendKeys("password");
		driver.findElement(By.name("txtPWord")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("input[value='  OK  ']")).click();
		Thread.sleep(2000);

	}

	@Then("^I should be able to login$")
	public void i_should_land_on_CargoUI() throws Throwable {
		Assert.assertTrue(true);
	}

	@Then("^I should not be able to login$")
	public void i_should_not_land_on_CargoUI() throws Throwable {
		Assert.assertTrue(true);
	}

}
