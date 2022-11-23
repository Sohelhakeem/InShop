package Customer_scripts;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Customer_Instantcall_BaseClass;

public class Cust_test extends Customer_Instantcall_BaseClass  {
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
}
