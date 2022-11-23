package admin_scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Admin_BaseClass;

public class Ad_Login_page extends Admin_BaseClass{
	@Test
	public void tc1_invalid_user() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys("sohel@peoplelinkvc.00");
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
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

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		String exp_Title = "Dashboard";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Dashboard']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	
	@Test
	public void tc3_invalid_pass() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys("sohel@peoplelinkvc.00");
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
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

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys("kprasad@peoplelink.co");
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
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

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys("kprasad@peoplelink.co");
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
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

}
