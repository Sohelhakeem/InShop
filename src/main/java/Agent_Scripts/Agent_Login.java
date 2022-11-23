package Agent_Scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Agent_BaseClass;

public class Agent_Login extends Agent_BaseClass {
	@Test
	public void tc1_invalid_user() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys("sohel@peoplelinkvc.00");
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys("Inshop@123");
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		
		String exp_Error = "Incorrect username or password.";
		WebElement error = driver.findElement(By.xpath("//span[@class='errorMsg textCntr pdngSM']" ));
		String actual_error = error.getText();
		Assert.assertEquals(exp_Error, actual_error);
		
	}
	@Test
	public void tc2_valid_user() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Agent_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Agent_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		String exp_Title = "Today's Video Calls";
		WebElement Title = driver.findElement(By.xpath("//h1[@class='mainHdngTxt ellipsisTxt']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	
	@Test
	public void tc3_invalid_pass() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys("sohel@peoplelinkvc.00");
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys("sdjkskdi@1122");
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		String exp_Error = "Incorrect password!";
		WebElement error = driver.findElement(By.xpath("//span[@class='errorMsg textCntr pdngSM']" ));
		String actual_error = error.getText();
		Assert.assertEquals(exp_Error, actual_error);
		
	}
	@Test
	public void tc4_invalid_email() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys("kprasad@peoplelink.co");
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys("Inshop@123");
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		String exp_Error = "Incorrect username or password.";
		WebElement error = driver.findElement(By.xpath("//span[@class='errorMsg textCntr pdngSM']" ));
		String actual_error = error.getText();
		Assert.assertEquals(exp_Error, actual_error);
		
	}
	@Test
	public void tc5_password_visibility() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys("kprasad@peoplelink.co");
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys("Inshop@123");
		WebElement toggle_password_visibility = driver.findElement(By.xpath("//button[@aria-label='toggle password visibility']"));
		toggle_password_visibility.click();
		Thread.sleep(1000);
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		String exp_Error = "Incorrect Credentials";
		WebElement error = driver.findElement(By.xpath("//h4[normalize-space()='Incorrect Credentials']" ));
		String actual_error = error.getText();
		Assert.assertEquals(exp_Error, actual_error);
		
	}
	@Test
	public void tc6_LoginPage_Elements() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Agent_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Agent_pass"));
		
		WebElement Login = driver.findElement(By.xpath("//h2[normalize-space()='Login']"));
		Login.isDisplayed();
		
		WebElement RECOVERY_PASSWORD = driver.findElement(By.xpath("//button[normalize-space()='RECOVERY PASSWORD?']"));
		RECOVERY_PASSWORD.isDisplayed();
		
		WebElement Language_Change = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk']"));
		Language_Change.isDisplayed();
		
		WebElement Inshop_Logo = driver.findElement(By.xpath("//img[@alt='inshop-logo']"));
		Inshop_Logo.isDisplayed();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement TermsAndCondition = driver.findElement(By.xpath("//small[normalize-space()='Terms & Conditions']"));
		js.executeScript("arguments[0].scrollIntoView();", TermsAndCondition);
		TermsAndCondition.isDisplayed();
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		Thread.sleep(1000);
		String exp_Title = "Today's Video Calls";
		WebElement Title = driver.findElement(By.xpath("//h1[@class='mainHdngTxt ellipsisTxt']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc7_RECOVERY_PASSWORD() throws IOException, InterruptedException {

		WebElement RECOVERY_PASSWORD = driver.findElement(By.xpath("//button[normalize-space()='RECOVERY PASSWORD?']"));
		RECOVERY_PASSWORD.click();
		
		Thread.sleep(1000);
		String exp_Title = "Forgot Password";
		WebElement Title = driver.findElement(By.xpath("//h2[normalize-space()='Forgot Password']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	
	@Test
	public void tc8_Forgot_Password() throws IOException, InterruptedException {
		
		WebElement RECOVERY_PASSWORD = driver.findElement(By.xpath("//button[normalize-space()='RECOVERY PASSWORD?']"));
		RECOVERY_PASSWORD.click();
		
		Thread.sleep(1000);
		String exp_Title = "Forgot Password";
		WebElement Title = driver.findElement(By.xpath("//h2[normalize-space()='Forgot Password']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
		Thread.sleep(1000);
		String exp_Text = "Enter your register email address, we'll send a OTP to your registered email";
		WebElement Text = driver.findElement(By.xpath("//span[@class='textCntr mrgnBXLG']" ));
		String actual_Text = Text.getText();
		Assert.assertEquals(exp_Text, actual_Text);
		
		driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]")).sendKeys("sohel@peoplelinvc.com");
		
		driver.findElement(By.xpath("//button[normalize-space()='SEND']")).click();
		
	}
	@Test
	public void tc9_Forgot_Password_Elements() throws IOException, InterruptedException {
		
		WebElement RECOVERY_PASSWORD = driver.findElement(By.xpath("//button[normalize-space()='RECOVERY PASSWORD?']"));
		RECOVERY_PASSWORD.click();
		
//		Thread.sleep(1000);
		String exp_Title = "Forgot Password";
		WebElement Title = driver.findElement(By.xpath("//h2[normalize-space()='Forgot Password']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
//		Thread.sleep(1000);
		String exp_Text = "Enter your register email address, we'll send a OTP to your registered email";
		WebElement Text = driver.findElement(By.xpath("//span[@class='textCntr mrgnBXLG']" ));
		String actual_Text = Text.getText();
		Assert.assertEquals(exp_Text, actual_Text);
		
		driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]")).sendKeys(p.getPropertyFiledata("Agent_email"));
		
		Thread.sleep(1000);
		String exp_Text1 = "LOGIN";
		WebElement Text1 = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']" ));
		String actual_Text1 = Text1.getText();
		Assert.assertEquals(exp_Text1, actual_Text1);
		
		driver.findElement(By.xpath("//button[normalize-space()='SEND']")).isDisplayed();
		
	}
	@Test
	public void tc10_Password_Reset() throws IOException, InterruptedException {
		
		WebElement RECOVERY_PASSWORD = driver.findElement(By.xpath("//button[normalize-space()='RECOVERY PASSWORD?']"));
		RECOVERY_PASSWORD.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]")).sendKeys("sohel@peoplelinvc.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='SEND']")).click();
		
		Thread.sleep(1000);
		String exp_Text1 = "Password Reset";
		WebElement Text1 = driver.findElement(By.xpath("//h2[normalize-space()='Password Reset']" ));
		String actual_Text1 = Text1.getText();
		Assert.assertEquals(exp_Text1, actual_Text1);
		
		
	}
	@Test
	public void tc11_Password_Reset_texts() throws IOException, InterruptedException {
		
		WebElement RECOVERY_PASSWORD = driver.findElement(By.xpath("//button[normalize-space()='RECOVERY PASSWORD?']"));
		RECOVERY_PASSWORD.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]")).sendKeys("sohel@peoplelinvc.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='SEND']")).click();
		
		Thread.sleep(1000);
		String exp_Text = "Password Reset";
		WebElement Text = driver.findElement(By.xpath("//h2[normalize-space()='Password Reset']" ));
		String actual_Text = Text.getText();
		Assert.assertEquals(exp_Text, actual_Text);
		Thread.sleep(1000);
		String exp_Text1 = "Enter the OTP Sent to your register email ID";
		WebElement Text1 = driver.findElement(By.xpath("//span[@class='mrgnBLG textCntr']" ));
		String actual_Text1 = Text1.getText();
		Assert.assertEquals(exp_Text1, actual_Text1);
		
		String exp_Text2 = "Enter OTP";
		WebElement Text2 = driver.findElement(By.xpath("//h4[normalize-space()='Enter OTP']" ));
		String actual_Text2 = Text2.getText();
		Assert.assertEquals(exp_Text2, actual_Text2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='outlined-adornment-password signUpPass']")).sendKeys("Inshop@123");
		
		driver.findElement(By.xpath("//input[@id='outlined-adornment-password signUpConfPass']")).sendKeys("Inshop@123");
		
		
		String exp_Text3 = "The password must be 8 characters in length, and must contains at least one capital letter, one numeric character and one special character";
		WebElement Text3 = driver.findElement(By.xpath("//small[contains(text(),'The password must be 8 characters in length, and m')]" ));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", Text3);
		Thread.sleep(1000);
		String actual_Text3 = Text3.getText();
		Assert.assertEquals(exp_Text3, actual_Text3);
		
	}
	
	
	

}
