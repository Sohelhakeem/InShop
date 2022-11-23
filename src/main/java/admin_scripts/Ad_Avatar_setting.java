package admin_scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Admin_BaseClass;

public class Ad_Avatar_setting extends Admin_BaseClass {
	@Test
	public void tc1_Settings() throws IOException, InterruptedException {
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Avatar_drp = driver.findElement(By.xpath("//div[@class='flexInline circle circleMD ']"));
		Avatar_drp.click();
		Thread.sleep(1000);
		WebElement Settings = driver.findElement(By.xpath("//li[normalize-space()='Settings']"));
		Settings.click();
		Thread.sleep(1000);
		String exp_Title = "Settings";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Settings']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc2_EnableBtn() throws IOException, InterruptedException {
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Avatar_drp = driver.findElement(By.xpath("//div[@class='flexInline circle circleMD ']"));
		Avatar_drp.click();
		Thread.sleep(1000);
		WebElement Settings = driver.findElement(By.xpath("//li[normalize-space()='Settings']"));
		Settings.click();
		Thread.sleep(1000);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		Thread.sleep(1000);
		
		
		String exp_Title = "Rate Your Experiance";
		WebElement Title = driver.findElement(By.xpath("//h4[normalize-space()='Rate Your Experiance']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc3_DisableBtn() throws IOException, InterruptedException {
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Avatar_drp = driver.findElement(By.xpath("//div[@class='flexInline circle circleMD ']"));
		Avatar_drp.click();
		Thread.sleep(1000);
		WebElement Settings = driver.findElement(By.xpath("//li[normalize-space()='Settings']"));
		Settings.click();
		Thread.sleep(1000);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		Thread.sleep(1000);
		
		
		String exp_Title = "Settings";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Settings']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}

}
