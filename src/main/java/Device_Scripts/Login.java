package Device_Scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Device_BaseClass;

public class Login extends Device_BaseClass {
	@Test
	public void tc1_invalid_user() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("//input[@id='outlined-basic-email']"));
		Enter_email_address.sendKeys("sohel@peoplelinkvc.00");
		
		WebElement Enter_Pass = driver.findElement(By.xpath("//input[@id='outlined-basic-password']"));
		Enter_Pass.sendKeys("Inshop@123");
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='login']"));
		LOGIN.click();
		
		
		String exp_Error = "Incorrect username or password.";
		WebElement error = driver.findElement(By.xpath("//span[@class='textDanger textCntr pdngSM']" ));
		String actual_error = error.getText();
		Assert.assertEquals(exp_Error, actual_error);
		
	}
	@Test
	public void tc2_valid_user() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("//input[@id='outlined-basic-email']"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("//input[@id='outlined-basic-password']"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='login']"));
		LOGIN.click();
		Thread.sleep(1000);
		String exp_Title = "Dashboard";
		WebElement Title = driver.findElement(By.xpath("//span[normalize-space()='Dashboard']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	
	@Test
	public void tc3_invalid_pass() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("//input[@id='outlined-basic-email']"));
		Enter_email_address.sendKeys("vamshi2366@gmail.com");
		
		WebElement Enter_Pass = driver.findElement(By.xpath("//input[@id='outlined-basic-password']"));
		Enter_Pass.sendKeys("Inshop@1233");
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='login']"));
		LOGIN.click();
		
		String exp_Error = "Incorrect username or password.";
		WebElement error = driver.findElement(By.xpath("//span[@class='textDanger textCntr pdngSM']" ));
		String actual_error = error.getText();
		Assert.assertEquals(exp_Error, actual_error);
		
	}
	@Test
	public void tc4_invalid_email() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("//input[@id='outlined-basic-email']"));
		Enter_email_address.sendKeys("kprasad@peoplelink.co");
		
		WebElement Enter_Pass = driver.findElement(By.xpath("//input[@id='outlined-basic-password']"));
		Enter_Pass.sendKeys("Inshop@123");
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='login']"));
		LOGIN.click();
		
		String exp_Error = "Incorrect username or password.";
		WebElement error = driver.findElement(By.xpath("//span[@class='textDanger textCntr pdngSM']" ));
		String actual_error = error.getText();
		Assert.assertEquals(exp_Error, actual_error);
		
	}

}
