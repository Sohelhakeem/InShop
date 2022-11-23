package admin_scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Admin_BaseClass;

public class Dashboard extends Admin_BaseClass {

	@Test
	public void tc1_dashboard() throws IOException, InterruptedException {

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
	public void tc2_Filter_daily() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement daily = driver.findElement(By.xpath("//label[normalize-space()='daily']"));
		daily.click();
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		String exp_Title = "Dashboard";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Dashboard']" ));
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}	
	@Test
	public void tc3_Filter_weekly() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement weekly = driver.findElement(By.xpath("//label[normalize-space()='weekly']"));
		weekly.click();
		Thread.sleep(1000);
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		String exp_Title = "Dashboard";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Dashboard']" ));
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}	
	@Test
	public void tc4_Filter_monthly() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement monthly = driver.findElement(By.xpath("//label[normalize-space()='monthly']"));
		monthly.click();
		Thread.sleep(1000);
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		String exp_Title = "Dashboard";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Dashboard']" ));
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}	
	@Test
	public void tc5_Filter_yearly() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement yearly = driver.findElement(By.xpath("//label[normalize-space()='yearly']"));
		yearly.click();
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		String exp_Title = "Dashboard";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Dashboard']" ));
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}	
	@Test
	public void tc6_Filter_custom() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement custom = driver.findElement(By.xpath("(//label[normalize-space()='custom'])[1]"));
		custom.click();
		Thread.sleep(2000);
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		String exp_Title = "Dashboard";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Dashboard']" ));
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}	
	@Test
	public void tc7_Filter_Cancel() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement Cancel = driver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
		Cancel.click();
		
		String exp_Title = "Dashboard";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Dashboard']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}	

}
