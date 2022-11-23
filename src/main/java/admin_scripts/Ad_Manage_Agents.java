package admin_scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Admin_BaseClass;

public class Ad_Manage_Agents extends Admin_BaseClass {
	@Test
	public void tc1_Manage_Agents() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Manage_Agents = driver.findElement(By.xpath("//a[@href='/add-agents']"));
		Manage_Agents.click();
		
		Thread.sleep(1000);
		String exp_Title = "Manage Agents";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Manage Agents']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc2_Add_Agents() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Manage_Agents = driver.findElement(By.xpath("//a[@href='/add-agents']"));
		Manage_Agents.click();
		
		WebElement ADD_AGENT = driver.findElement(By.xpath("//button[normalize-space()='ADD AGENT']"));
		ADD_AGENT.click();
		
		Thread.sleep(1000);
		String exp_Title = "Add New Agent";
		WebElement Title = driver.findElement(By.xpath("//h2[@id='alert-dialog-title']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc3_Add_Agents_search() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Manage_Agents = driver.findElement(By.xpath("//a[@href='/add-agents']"));
		Manage_Agents.click();
		
		WebElement search_tf = driver.findElement(By.xpath("//input[@id='outlined-adornment-password']"));
		search_tf.sendKeys("sohel");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		String exp_Title = "Manage Agents";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Manage Agents']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc4_Add_Agent_Edit() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Manage_Agents = driver.findElement(By.xpath("//a[@href='/add-agents']"));
		Manage_Agents.click();
		
		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0, document.body.Height)");
		WebElement search_tf = driver.findElement(By.xpath("//input[@id='outlined-adornment-password']"));
		search_tf.sendKeys("sohel");
		Thread.sleep(1000);
		WebElement Edit = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[3]/div[2]/button[1]/*[name()='svg'][1]"));
		Edit.click();
		
		Thread.sleep(1000);
		String exp_Title = "Add New Agent";
		WebElement Title = driver.findElement(By.xpath("//h2[@id='alert-dialog-title']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	
	@Test
	public void tc5_Update_Agent() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Manage_Agents = driver.findElement(By.xpath("//a[@href='/add-agents']"));
		Manage_Agents.click();
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0, document.body.Height)");
		WebElement search_tf = driver.findElement(By.xpath("//input[@id='outlined-adornment-password']"));
		search_tf.sendKeys("sohel");
		
		WebElement Edit = driver.findElement(By.xpath("//div[@class='flexMinWidthCol alignCntr justifyCntr iconBoxMD']//button[@aria-label='delete']"));
		Edit.click();
		
		
		WebElement CANCEL = driver.findElement(By.xpath("//button[normalize-space()='CANCEL']"));
		CANCEL.isDisplayed();
		
		WebElement UPDATE_AGENT = driver.findElement(By.xpath("//button[normalize-space()='UPDATE AGENT']"));
		UPDATE_AGENT.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500)","");
		Thread.sleep(1000);
		String exp_Title = "Manage Agents";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Manage Agents']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc6_Delete_Agent() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Manage_Agents = driver.findElement(By.xpath("//a[@href='/add-agents']"));
		Manage_Agents.click();
		
		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0, document.body.Height)");
		WebElement search_tf = driver.findElement(By.xpath("//input[@id='outlined-adornment-password']"));
		search_tf.sendKeys("sohel");
		
		Thread.sleep(1000);
		WebElement Delete = driver.findElement(By.xpath("//div[@class='flexMinWidthCol alignCntr justifyCntr iconBoxMD brdrRSM']//button[@aria-label='delete']"));
		Delete.click();
		
		WebElement DELETE = driver.findElement(By.xpath("//button[normalize-space()='DELETE']"));
		DELETE.isDisplayed();
		
		WebElement CANCEL = driver.findElement(By.xpath("//button[normalize-space()='CANCEL']"));
		CANCEL.isDisplayed();
		
		Thread.sleep(1000);
		String exp_Title = "Delete Agent";
		WebElement Title = driver.findElement(By.xpath("//h2[@id='alert-dialog-title']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc7_Cancel() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Manage_Agents = driver.findElement(By.xpath("//a[@href='/add-agents']"));
		Manage_Agents.click();
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0, document.body.Height)");
		WebElement search_tf = driver.findElement(By.xpath("//input[@id='outlined-adornment-password']"));
		search_tf.sendKeys("sohel");
		
		WebElement Delete = driver.findElement(By.xpath("//div[@class='flexMinWidthCol alignCntr justifyCntr iconBoxMD brdrRSM']//button[@aria-label='delete']"));
		Delete.click();
		
		WebElement DELETE = driver.findElement(By.xpath("//button[normalize-space()='DELETE']"));
		DELETE.isDisplayed();
		
		WebElement CANCEL = driver.findElement(By.xpath("//button[normalize-space()='CANCEL']"));
		CANCEL.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-500)","");
		Thread.sleep(1000);
		String exp_Title = "Manage Agents";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Manage Agents']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}

}
