package Customer_scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Customer_BaseClass;

public class Cust_Analytics extends Customer_BaseClass {
	@Test
	public void tc1_Analyticsd() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
	
		WebElement Analytics = driver.findElement(By.xpath("//a[@href='/analytics']"));
		Analytics.click();
		
		String exp_Title = "Analytics";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Analytics']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc2_Scheduled_calls() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
	
		WebElement Analytics = driver.findElement(By.xpath("//a[@href='/analytics']"));
		Analytics.click();
		WebElement View_all = driver.findElement(By.xpath("//div[@class='flexCol']//div[1]//div[1]//div[1]//div[2]//button[1]"));
		View_all.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		js.executeScript("window.scrollBy(0, 350)","");
		Thread.sleep(1000);
		
		String exp_Title = "My Meetings";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='My Meetings']" ));
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc3_Instant_calls() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
	
		WebElement Analytics = driver.findElement(By.xpath("//a[@href='/analytics']"));
		Analytics.click();
		WebElement View_all = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/button[1]"));
		View_all.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		js.executeScript("window.scrollBy(0, 350)","");
		Thread.sleep(1000);
		
		String exp_Title = "My Meetings";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='My Meetings']" ));
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc4_Filter() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
	
		WebElement Analytics = driver.findElement(By.xpath("//a[@href='/analytics']"));
		Analytics.click();
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		js.executeScript("window.scrollBy(0, 350)","");
		Thread.sleep(1000);
		
		String exp_Title = "Filter";
		WebElement Title = driver.findElement(By.xpath("(//h2[normalize-space()='Filter'])[1]" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc5_Filter_Daily() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
	
		WebElement Analytics = driver.findElement(By.xpath("//a[@href='/analytics']"));
		Analytics.click();
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement Daily = driver.findElement(By.xpath("//label[normalize-space()='Daily']"));
		Daily.click();
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		js.executeScript("window.scrollBy(0, 350)","");
		Thread.sleep(1000);
		
		String exp_Title = "Analytics";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Analytics']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc6_Filter_Weekly() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
	
		WebElement Analytics = driver.findElement(By.xpath("//a[@href='/analytics']"));
		Analytics.click();
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement Weekly = driver.findElement(By.xpath("//label[normalize-space()='Weekly']"));
		Weekly.click();
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		js.executeScript("window.scrollBy(0, 350)","");
		Thread.sleep(1000);
		
		String exp_Title = "Analytics";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Analytics']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc7_Filter_Monthly() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
	
		WebElement Analytics = driver.findElement(By.xpath("//a[@href='/analytics']"));
		Analytics.click();
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement Monthly = driver.findElement(By.xpath("//label[normalize-space()='Monthly']"));
		Monthly.click();
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		js.executeScript("window.scrollBy(0, 350)","");
		Thread.sleep(1000);
		
		String exp_Title = "Analytics";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Analytics']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc8_Filter_Yearly() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
	
		WebElement Analytics = driver.findElement(By.xpath("//a[@href='/analytics']"));
		Analytics.click();
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement Yearly = driver.findElement(By.xpath("//label[normalize-space()='Yearly']"));
		Yearly.click();
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		js.executeScript("window.scrollBy(0, 350)","");
		Thread.sleep(1000);
		
		String exp_Title = "Analytics";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Analytics']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc9_Filter_Cancel() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
	
		WebElement Analytics = driver.findElement(By.xpath("//a[@href='/analytics']"));
		Analytics.click();
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement Yearly = driver.findElement(By.xpath("//label[normalize-space()='Yearly']"));
		Yearly.click();
		
		WebElement Cancel = driver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
		Cancel.click();
		
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		js.executeScript("window.scrollBy(0, 350)","");
		Thread.sleep(1000);
		
		String exp_Title = "Analytics";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Analytics']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc10_Filter_custom() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
	
		WebElement Analytics = driver.findElement(By.xpath("//a[@href='/analytics']"));
		Analytics.click();
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement custom = driver.findElement(By.xpath("//label[normalize-space()='custom']"));
		custom.click();
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		js.executeScript("window.scrollBy(0, 350)","");
		Thread.sleep(1000);
		
		String exp_Title = "Analytics";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Analytics']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
}
