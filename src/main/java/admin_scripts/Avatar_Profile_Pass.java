package admin_scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Admin_BaseClass;

public class Avatar_Profile_Pass extends Admin_BaseClass {
	@Test 
	public void tc1_Avatar_Profile_Password() throws IOException, InterruptedException{
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Avatar_drp = driver.findElement(By.xpath("//div[@class='flexInline circle circleMD ']"));
		Avatar_drp.click();
		Thread.sleep(2000);
		
		WebElement My_Profile = driver.findElement(By.xpath("//li[normalize-space()='My Profile']"));
		My_Profile.click();
		Thread.sleep(2000);
		
		WebElement Password = driver.findElement(By.xpath("//button[normalize-space()='Password']"));
		Password.click();
		Thread.sleep(1000);

		String exp_Title = "Change Password";
		WebElement Title = driver.findElement(By.xpath("//span[@class='subHeadingSM']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
	}
	@Test 
	public void tc2_All_same_Password() throws IOException, InterruptedException{
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Avatar_drp = driver.findElement(By.xpath("//div[@class='flexInline circle circleMD ']"));
		Avatar_drp.click();
		Thread.sleep(2000);
		
		WebElement My_Profile = driver.findElement(By.xpath("//li[normalize-space()='My Profile']"));
		My_Profile.click();
		Thread.sleep(2000);
		
		WebElement Password = driver.findElement(By.xpath("//button[normalize-space()='Password']"));
		Password.click();
		Thread.sleep(1000);
		
		WebElement currentPassTf = driver.findElement(By.xpath("//input[@id='outlined-adornment-password outlined-basic1']"));
		currentPassTf.sendKeys("Inshop@123");
		
		WebElement newPassTf = driver.findElement(By.xpath("//input[@id='outlined-adornment-password outlined-basic2']"));
		newPassTf.sendKeys("Inshop@123");
		
		WebElement ReType_newPassTf = driver.findElement(By.xpath("//input[@id='outlined-adornment-password outlined-basic3']"));
		ReType_newPassTf.sendKeys("Inshop@123");
		
		WebElement ChangePassword_Btn = driver.findElement(By.xpath("//button[normalize-space()='Change Password']"));
		ChangePassword_Btn.click();
		
		String exp_Title = "Current Password and New Password should not be same";
				//Your password needs to: • Include both lower and upper case characters. • Include at least 1 number and symbol. • Be at least 8 characters long.
//				String exp_Title = "Your password needs to: • Include both lower and upper case characters. • Include at least 1 number and symbol. • Be at least 8 characters long.";
				WebElement Title = driver.findElement(By.xpath("//span[@class='textDanger textCntr pdngSM']" ));
				Thread.sleep(1000);
				String actual_Title = Title.getText();
				Assert.assertEquals(exp_Title, actual_Title);
	}
	@Test 
	public void tc3_Wrong_confirm_Password() throws IOException, InterruptedException{
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Avatar_drp = driver.findElement(By.xpath("//div[@class='flexInline circle circleMD ']"));
		Avatar_drp.click();
		Thread.sleep(2000);
		
		WebElement My_Profile = driver.findElement(By.xpath("//li[normalize-space()='My Profile']"));
		My_Profile.click();
		Thread.sleep(2000);
		
		WebElement Password = driver.findElement(By.xpath("//button[normalize-space()='Password']"));
		Password.click();
		Thread.sleep(1000);
		
		WebElement currentPassTf = driver.findElement(By.xpath("//input[@id='outlined-adornment-password outlined-basic1']"));
		currentPassTf.sendKeys("Inshop@123");
		
		WebElement newPassTf = driver.findElement(By.xpath("//input[@id='outlined-adornment-password outlined-basic2']"));
		newPassTf.sendKeys("Belgaum@123");
		
		WebElement ReType_newPassTf = driver.findElement(By.xpath("//input[@id='outlined-adornment-password outlined-basic3']"));
		ReType_newPassTf.sendKeys("Hyderabad@123");
		
		WebElement ChangePassword_Btn = driver.findElement(By.xpath("//button[normalize-space()='Change Password']"));
		ChangePassword_Btn.click();
		
		String exp_Title = "New Password and Confirm Password should be same.";
				//Your password needs to: • Include both lower and upper case characters. • Include at least 1 number and symbol. • Be at least 8 characters long.
//				String exp_Title = "Your password needs to: • Include both lower and upper case characters. • Include at least 1 number and symbol. • Be at least 8 characters long.";
				WebElement Title = driver.findElement(By.xpath("//span[@class='textDanger textCntr pdngSM']" ));
				Thread.sleep(1000);
				String actual_Title = Title.getText();
				Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test 
	public void tc4_Wrong_current_Password() throws IOException, InterruptedException{
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Avatar_drp = driver.findElement(By.xpath("//div[@class='flexInline circle circleMD ']"));
		Avatar_drp.click();
		Thread.sleep(2000);
		
		WebElement My_Profile = driver.findElement(By.xpath("//li[normalize-space()='My Profile']"));
		My_Profile.click();
		Thread.sleep(2000);
		
		WebElement Password = driver.findElement(By.xpath("//button[normalize-space()='Password']"));
		Password.click();
		Thread.sleep(1000);
		
		WebElement currentPassTf = driver.findElement(By.xpath("//input[@id='outlined-adornment-password outlined-basic1']"));
		currentPassTf.sendKeys("Belgaum@123");
		
		WebElement newPassTf = driver.findElement(By.xpath("//input[@id='outlined-adornment-password outlined-basic2']"));
		newPassTf.sendKeys("Hyderabad@123");
		
		WebElement ReType_newPassTf = driver.findElement(By.xpath("//input[@id='outlined-adornment-password outlined-basic3']"));
		ReType_newPassTf.sendKeys("Hyderabad@123");
		
		WebElement ChangePassword_Btn = driver.findElement(By.xpath("//button[normalize-space()='Change Password']"));
		ChangePassword_Btn.click();
		
		String exp_Title = "Incorrect username or password.";
				//Your password needs to: • Include both lower and upper case characters. • Include at least 1 number and symbol. • Be at least 8 characters long.
//				String exp_Title = "Your password needs to: • Include both lower and upper case characters. • Include at least 1 number and symbol. • Be at least 8 characters long.";
				WebElement Title = driver.findElement(By.xpath("//span[@class='textDanger textCntr pdngSM']" ));
				Thread.sleep(1000);
				String actual_Title = Title.getText();
				Assert.assertEquals(exp_Title, actual_Title);
		
	}
	

}
