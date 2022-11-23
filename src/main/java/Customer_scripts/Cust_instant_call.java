package Customer_scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Customer_Instantcall_BaseClass;

public class Cust_instant_call extends Customer_Instantcall_BaseClass {
	@Test
	public void tc1_Valid_data_Clear() throws IOException, InterruptedException {
		Thread.sleep(3000);
		WebElement vendorId = driver.findElement(By.xpath("//input[@id='outlined-basic-vendorId']"));
		vendorId.sendKeys(p.getPropertyFiledata("Vender_Id"));
		Thread.sleep(1000);
		
		WebElement name = driver.findElement(By.xpath("//input[@id='outlined-basic-name']"));
		name.sendKeys("sohel");
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='outlined-basic-email']"));
		Email.sendKeys("sohel@peoplelink.com");
		
		WebElement Phone = driver.findElement(By.xpath("//input[@id='signUpPhone']"));
		Phone.sendKeys("8088229102");
		//clear Button
		driver.findElement(By.xpath("//button[normalize-space()='Clear']")).click();
		Thread.sleep(2000);
		String exp_Title = "Start Video Shopping";
		WebElement Title = driver.findElement(By.xpath("//h2[normalize-space()='Start Video Shopping']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
		
	}
	
	@Test
	public void tc2_Valid_data_join() throws IOException, InterruptedException {
		WebElement vendorId = driver.findElement(By.xpath("//input[@id='outlined-basic-vendorId']"));
		vendorId.sendKeys(p.getPropertyFiledata("Vender_Id"));
		
		WebElement name = driver.findElement(By.xpath("//input[@id='outlined-basic-name']"));
		name.sendKeys("sohel");
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='outlined-basic-email']"));
		Email.sendKeys("sohel@peoplelink.com");
		
		WebElement Phone = driver.findElement(By.xpath("//input[@id='signUpPhone']"));
		Phone.sendKeys("8088229102");
		//join_Shopping Button
		WebElement join_Shopping = driver.findElement(By.xpath("//button[normalize-space()='JOIN SHOPPING']"));
		join_Shopping.click();
//		Thread.sleep(2000);
//		WebElement Reject_Call = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/*[name()='svg'][1]"));
//		Reject_Call.click();
		Thread.sleep(5000);
		
		String actual_title = driver.getTitle();
		System.out.println(actual_title);
		
		String exp_Title = "Inshop - Customer App";
//		WebElement Title = driver.findElement(By.xpath("//h2[normalize-space()='Start Video Shopping']" ));
		Thread.sleep(1000);
//		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_title);
		
	}
	@Test
	public void tc3_inValid_data_join() throws IOException, InterruptedException {
		WebElement vendorId = driver.findElement(By.xpath("//input[@id='outlined-basic-vendorId']"));
		vendorId.sendKeys("Diamond1234");
		
		WebElement name = driver.findElement(By.xpath("//input[@id='outlined-basic-name']"));
		name.sendKeys("sohel");
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='outlined-basic-email']"));
		Email.sendKeys("sohel@peoplelink.com");
		
		WebElement Phone = driver.findElement(By.xpath("//input[@id='signUpPhone']"));
		Phone.sendKeys("8088229102");
		//join_Shopping Button
		WebElement join_Shopping = driver.findElement(By.xpath("//button[normalize-space()='JOIN SHOPPING']"));
		join_Shopping.click();
		Thread.sleep(2000);
		String exp_Error = "invalid vendor id";
		WebElement Error = driver.findElement(By.xpath("//div[contains(text(),'invalid vendor id')]" ));
		Thread.sleep(1000);
		String actual_Error = Error.getText();
		Assert.assertEquals(exp_Error, actual_Error);
		
	}
}
