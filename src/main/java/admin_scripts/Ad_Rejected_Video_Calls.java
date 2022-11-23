package admin_scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Admin_BaseClass;

public class Ad_Rejected_Video_Calls extends Admin_BaseClass{
	
	@Test
	public void tc1_Rejected_Video_Call_History() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		WebElement View_All = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/button[1]"));
		View_All.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		
		String exp_Title = "Rejected Video Calls";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Rejected Video Calls']" ));
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}	
	@Test
	public void tc2_Rejected_Video_Todays_Call() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		WebElement View_All = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/button[1]"));
		View_All.click();
		
		WebElement Todays_Call = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary css-1ifzoew']"));
		Todays_Call.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);

		String exp_Title = "Rejected Video Calls";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Rejected Video Calls']" ));
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}	
	@Test
	public void tc3_Filter_scheduled() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		WebElement View_All = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/button[1]"));
		View_All.click();
		
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement schedule = driver.findElement(By.xpath("//label[normalize-space()='schedule Calls']"));
		schedule.click();
		Thread.sleep(1000);
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);

		String exp_Title = "Rejected Video Calls";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Rejected Video Calls']" ));
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}	
	@Test
	public void tc4_Filter_incoming() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		WebElement View_All = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/button[1]"));
		View_All.click();
		Thread.sleep(1000);
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement incoming = driver.findElement(By.xpath("//label[normalize-space()='incoming Calls']"));
		incoming.click();
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);

		String exp_Title = "Rejected Video Calls";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Rejected Video Calls']" ));
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
		
	}	
	@Test
	public void tc5_Filter_male() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		WebElement View_All = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/button[1]"));
		View_All.click();
		
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement male = driver.findElement(By.xpath("//label[normalize-space()='male']"));
		male.click();
		Thread.sleep(1000);
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);

		String exp_Title = "Rejected Video Calls";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Rejected Video Calls']" ));
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);    
		
		
	}	
	@Test
	public void tc6_Filter_female() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		WebElement View_All = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/button[1]"));
		View_All.click();
		
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement female = driver.findElement(By.xpath("//label[normalize-space()='female']"));
		female.click();
		Thread.sleep(1000);
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);

		String exp_Title = "Rejected Video Calls";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Rejected Video Calls']" ));
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}	
	@Test
	public void tc7_Filter_All() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		WebElement View_All = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/button[1]"));
		View_All.click();
		
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement All = driver.findElement(By.xpath("//label[normalize-space()='All']"));
		All.click();
		Thread.sleep(1000);
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);

		String exp_Title = "Rejected Video Calls";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Rejected Video Calls']" ));
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
		
	}	
	@Test
	public void tc8_Filter_Cancel() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		WebElement View_All = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/button[1]"));
		View_All.click();
		
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement All = driver.findElement(By.xpath("//label[normalize-space()='All']"));
		All.click();
		Thread.sleep(1000);
		WebElement Cancel = driver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
		Cancel.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);

		String exp_Title = "Rejected Video Calls";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Rejected Video Calls']" ));
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}	

}
