package admin_scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Admin_BaseClass;

public class Ad_Create_an_account extends Admin_BaseClass {
	@Test
	public void tc1_Invalid_FirstName() throws IOException, InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		WebElement CREATE_ACCOUNT = driver.findElement(By.xpath("//button[normalize-space()='CREATE AN ACCOUNT']"));
		CREATE_ACCOUNT.click();
		
		WebElement Enter_Name = driver.findElement(By.xpath("//input[@id='outlined-size-small signUpName']"));
		Enter_Name.sendKeys("sohel&*");
		
		WebElement Enter_email_address = driver.findElement(By.xpath("//input[@id='outlined-size-small signUpEmail']"));
		Enter_email_address.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement Phone = driver.findElement(By.xpath("//input[@id='signUpPhone']"));
		Phone.sendKeys("8088229102");
		
		WebElement Enter_Pass = driver.findElement(By.xpath("//input[@id='outlined-adornment-password signUpPass']"));
		Enter_Pass.sendKeys("Inshop@123");
		
		WebElement Confirm_Pass = driver.findElement(By.xpath("//input[@id='outlined-adornment-password signUpConfPass']"));
		Confirm_Pass.sendKeys("Inshop@123");
		WebElement CREATE = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/button[1]"));
		js.executeScript("arguments[0].scrollIntoView();", CREATE);
		Thread.sleep(1000);
		CREATE.click();
		
		
		String exp_Error = "Please enter a valid name!";
		WebElement error = driver.findElement(By.xpath("//span[@class='errorMsg textCntr pdngSM']" ));
		js.executeScript("arguments[0].scrollIntoView();", error);
		Thread.sleep(1000);
		String actual_error = error.getText();
		Assert.assertEquals(exp_Error, actual_error);
		
	}
	@Test
	public void tc2_Already_existed_mail() throws IOException, InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		WebElement CREATE_ACCOUNT = driver.findElement(By.xpath("//button[normalize-space()='CREATE AN ACCOUNT']"));
		CREATE_ACCOUNT.click();
		
		WebElement Enter_Name = driver.findElement(By.xpath("//input[@id='outlined-size-small signUpName']"));
		Enter_Name.sendKeys("sohel");
		
		WebElement Enter_email_address = driver.findElement(By.xpath("//input[@id='outlined-size-small signUpEmail']"));
		Enter_email_address.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement Phone = driver.findElement(By.xpath("//input[@id='signUpPhone']"));
		Phone.sendKeys("8088229102");
		
		WebElement Enter_Pass = driver.findElement(By.xpath("//input[@id='outlined-adornment-password signUpPass']"));
		Enter_Pass.sendKeys("Inshop@123");
		
		WebElement Confirm_Pass = driver.findElement(By.xpath("//input[@id='outlined-adornment-password signUpConfPass']"));
		Confirm_Pass.sendKeys("Inshop@123");
		WebElement CREATE = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/button[1]"));
		js.executeScript("arguments[0].scrollIntoView();", CREATE);
		Thread.sleep(1000);
		CREATE.click();
		Thread.sleep(1000);
		
		String exp_Error = "An account with the given email already exists.";
		WebElement error = driver.findElement(By.xpath("//span[@class='errorMsg textCntr pdngSM']" ));
		js.executeScript("arguments[0].scrollIntoView();", error);
		Thread.sleep(1000);
		String actual_error = error.getText();
		Assert.assertEquals(exp_Error, actual_error);
		
	}
	@Test
	public void tc3_Invalid_Phone() throws IOException, InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		WebElement CREATE_ACCOUNT = driver.findElement(By.xpath("//button[normalize-space()='CREATE AN ACCOUNT']"));
		CREATE_ACCOUNT.click();
		
		WebElement Enter_Name = driver.findElement(By.xpath("//input[@id='outlined-size-small signUpName']"));
		Enter_Name.sendKeys("sohel");
		
		WebElement Enter_email_address = driver.findElement(By.xpath("//input[@id='outlined-size-small signUpEmail']"));
		Enter_email_address.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement Phone = driver.findElement(By.xpath("//input[@id='signUpPhone']"));
		Phone.sendKeys("80882291022");
		
		WebElement Enter_Pass = driver.findElement(By.xpath("//input[@id='outlined-adornment-password signUpPass']"));
		Enter_Pass.sendKeys("Inshop@123");
		
		WebElement Confirm_Pass = driver.findElement(By.xpath("//input[@id='outlined-adornment-password signUpConfPass']"));
		Confirm_Pass.sendKeys("Inshop@123");
		WebElement CREATE = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/button[1]"));
		js.executeScript("arguments[0].scrollIntoView();", CREATE);
		Thread.sleep(1000);
		CREATE.click();
		
		
		String exp_Error = "Please enter a valid phone number!";
		WebElement error = driver.findElement(By.xpath("//span[@class='errorMsg textCntr pdngSM']" ));
		js.executeScript("arguments[0].scrollIntoView();", error);
		Thread.sleep(1000);
		String actual_error = error.getText();
		Assert.assertEquals(exp_Error, actual_error);
		
	}
	@Test
	public void tc4_Invalid_Pass() throws IOException, InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		WebElement CREATE_ACCOUNT = driver.findElement(By.xpath("//button[normalize-space()='CREATE AN ACCOUNT']"));
		CREATE_ACCOUNT.click();
		
		WebElement Enter_Name = driver.findElement(By.xpath("//input[@id='outlined-size-small signUpName']"));
		Enter_Name.sendKeys("sohel");
		
		WebElement Enter_email_address = driver.findElement(By.xpath("//input[@id='outlined-size-small signUpEmail']"));
		Enter_email_address.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement Phone = driver.findElement(By.xpath("//input[@id='signUpPhone']"));
		Phone.sendKeys("8088229102");
		
		WebElement Enter_Pass = driver.findElement(By.xpath("//input[@id='outlined-adornment-password signUpPass']"));
		Enter_Pass.sendKeys("6363363663");
		
		WebElement Confirm_Pass = driver.findElement(By.xpath("//input[@id='outlined-adornment-password signUpConfPass']"));
		Confirm_Pass.sendKeys("6363363663");
		WebElement CREATE = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/button[1]"));
		js.executeScript("arguments[0].scrollIntoView();", CREATE);
		Thread.sleep(1000);
		CREATE.click();
		
		
		String exp_Error = "The password must be 8 characters in length, and must contains at least one capital letter, one numeric character and one special character";
		WebElement error = driver.findElement(By.xpath("//span[@class='errorMsg textCntr pdngSM']" ));
		js.executeScript("arguments[0].scrollIntoView();", error);
		Thread.sleep(1000);
		String actual_error = error.getText();
		Assert.assertEquals(exp_Error, actual_error);
		
	}
	@Test
	public void tc5_Invalid_CON_Pass() throws IOException, InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		WebElement CREATE_ACCOUNT = driver.findElement(By.xpath("//button[normalize-space()='CREATE AN ACCOUNT']"));
		CREATE_ACCOUNT.click();
		
		WebElement Enter_Name = driver.findElement(By.xpath("//input[@id='outlined-size-small signUpName']"));
		Enter_Name.sendKeys("sohel");
		
		WebElement Enter_email_address = driver.findElement(By.xpath("//input[@id='outlined-size-small signUpEmail']"));
		Enter_email_address.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement Phone = driver.findElement(By.xpath("//input[@id='signUpPhone']"));
		Phone.sendKeys("8088229102");
		
		WebElement Enter_Pass = driver.findElement(By.xpath("//input[@id='outlined-adornment-password signUpPass']"));
		Enter_Pass.sendKeys("Inshop@123");
		
		WebElement Confirm_Pass = driver.findElement(By.xpath("//input[@id='outlined-adornment-password signUpConfPass']"));
		Confirm_Pass.sendKeys("Inshop@122");
		WebElement CREATE = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/button[1]"));
		js.executeScript("arguments[0].scrollIntoView();", CREATE);
		Thread.sleep(1000);
		CREATE.click();
		
		
		String exp_Error = "Password and confirm password does not match!";
		WebElement error = driver.findElement(By.xpath("//span[@class='errorMsg textCntr pdngSM']" ));
		js.executeScript("arguments[0].scrollIntoView();", error);
		Thread.sleep(1000);
		String actual_error = error.getText();
		Assert.assertEquals(exp_Error, actual_error);
		
	}
	@Test
	public void tc6_Invalid_Mailid() throws IOException, InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		WebElement CREATE_ACCOUNT = driver.findElement(By.xpath("//button[normalize-space()='CREATE AN ACCOUNT']"));
		CREATE_ACCOUNT.click();
		
		WebElement Enter_Name = driver.findElement(By.xpath("//input[@id='outlined-size-small signUpName']"));
		Enter_Name.sendKeys("sohel");
		
		WebElement Enter_email_address = driver.findElement(By.xpath("//input[@id='outlined-size-small signUpEmail']"));
		Enter_email_address.sendKeys("sohel@peoplelinkvc.00");
		
		WebElement Phone = driver.findElement(By.xpath("//input[@id='signUpPhone']"));
		Phone.sendKeys("8088229102");
		
		WebElement Enter_Pass = driver.findElement(By.xpath("//input[@id='outlined-adornment-password signUpPass']"));
		Enter_Pass.sendKeys("Inshop@123");
		
		WebElement Confirm_Pass = driver.findElement(By.xpath("//input[@id='outlined-adornment-password signUpConfPass']"));
		Confirm_Pass.sendKeys("Inshop@123");
		WebElement CREATE = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/button[1]"));
		js.executeScript("arguments[0].scrollIntoView();", CREATE);
		Thread.sleep(1000);
		CREATE.click();
		
		
		String exp_Error = "Username should be either an email or a phone number.";
		WebElement error = driver.findElement(By.xpath("//span[@class='errorMsg textCntr pdngSM']" ));
		js.executeScript("arguments[0].scrollIntoView();", error);
		Thread.sleep(1000);
		String actual_error = error.getText();
		Assert.assertEquals(exp_Error, actual_error);
		
	}
}
