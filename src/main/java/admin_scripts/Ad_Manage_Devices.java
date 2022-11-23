package admin_scripts;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Admin_BaseClass;

public class Ad_Manage_Devices extends Admin_BaseClass {
	@Test
	public void tc1_Manage_device() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Manage_device = driver.findElement(By.xpath("//a[@href='/manage-devices']"));
		Manage_device.click();
		
		Thread.sleep(1000);
		String exp_Title = "Manage Devices";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Manage Devices']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc2_Add_Device() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Manage_device = driver.findElement(By.xpath("//a[@href='/manage-devices']"));
		Manage_device.click();
		
		WebElement ADD_DEVICE = driver.findElement(By.xpath("//button[normalize-space()='ADD DEVICE']"));
		ADD_DEVICE.click();
		
		Thread.sleep(1000);
		String exp_Title = "Enter Unique ID";
		WebElement Title = driver.findElement(By.xpath("//span[@class='titleHeading headingLG mrgnBtmSM']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc3_invalidCode() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Manage_device = driver.findElement(By.xpath("//a[@href='/manage-devices']"));
		Manage_device.click();
		
		WebElement ADD_DEVICE = driver.findElement(By.xpath("//button[normalize-space()='ADD DEVICE']"));
		ADD_DEVICE.click();
		
		WebElement Character_1 = driver.findElement(By.xpath("//input[@aria-label='Please enter verification code. Character 1']"));
		Character_1.sendKeys("a");
		
		WebElement Character_2 = driver.findElement(By.xpath("//input[@aria-label='Character 2']"));
		Character_2.sendKeys("b");
		
		WebElement Character_3 = driver.findElement(By.xpath("//input[@aria-label='Character 3']"));
		Character_3.sendKeys("Z");
		
		WebElement Character_4 = driver.findElement(By.xpath("//input[@aria-label='Character 4']"));
		Character_4.sendKeys("b");
		
		WebElement ADD_DEVICE_btn = driver.findElement(By.xpath("//button[@class='MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButtonBase-root link css-1m44q5'][normalize-space()='ADD DEVICE']"));
		ADD_DEVICE_btn.click();
		
		Thread.sleep(1000);
		String exp_Title = "Enter the hardware unique ID from the device";
		WebElement Title = driver.findElement(By.xpath("//span[@class='headingLG mrgnBtmMD']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	
	@Test
	public void tc4_invalidCode_Cancel() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Manage_device = driver.findElement(By.xpath("//a[@href='/manage-devices']"));
		Manage_device.click();
		
		WebElement ADD_DEVICE = driver.findElement(By.xpath("//button[normalize-space()='ADD DEVICE']"));
		ADD_DEVICE.click();
		
		WebElement Character_1 = driver.findElement(By.xpath("//input[@aria-label='Please enter verification code. Character 1']"));
		Character_1.sendKeys("a");
		
		WebElement Character_2 = driver.findElement(By.xpath("//input[@aria-label='Character 2']"));
		Character_2.sendKeys("b");
		
		WebElement Character_3 = driver.findElement(By.xpath("//input[@aria-label='Character 3']"));
		Character_3.sendKeys("Z");
		
		WebElement Character_4 = driver.findElement(By.xpath("//input[@aria-label='Character 4']"));
		Character_4.sendKeys("b");
		
		WebElement CancelBtn = driver.findElement(By.xpath("//button[normalize-space()='CANCEL']"));
		CancelBtn.click();
		
		Thread.sleep(1000);
		String exp_Title = "Manage Devices";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Manage Devices']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc5_searchTB_Invalid() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Manage_device = driver.findElement(By.xpath("//a[@href='/manage-devices']"));
		Manage_device.click();
		
		WebElement search_tf = driver.findElement(By.id("outlined-adornment-password"));
		search_tf.sendKeys(p.getPropertyFiledata("manage_device"));
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		String exp_Title = "Manage Devices";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Manage Devices']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc6_searchTB_Invalid() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Manage_device = driver.findElement(By.xpath("//a[@href='/manage-devices']"));
		Manage_device.click();
		
		WebElement search_tf = driver.findElement(By.id("outlined-adornment-password"));
		search_tf.sendKeys("sohail");
		Thread.sleep(1000);
		String exp_Title = "No Device Found";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='No Device Found']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
		WebElement ADD_DEVICE = driver.findElement(By.xpath("//div[@class='flexCol justifyCntr alignCntr']//button[@type='button'][normalize-space()='ADD DEVICE']"));
		ADD_DEVICE.isDisplayed();
		
	}
	@Test
	public void tc7_Scoll_for_Name() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Manage_device = driver.findElement(By.xpath("//a[@href='/manage-devices']"));
		Manage_device.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement search_tf = driver.findElement(By.id("outlined-adornment-password"));
		search_tf.sendKeys(p.getPropertyFiledata("manage_device"));
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		String exp_Title = "Manage Devices";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Manage Devices']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc8_Device() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		WebElement Manage_device = driver.findElement(By.xpath("//a[@href='/manage-devices']"));
		Manage_device.click();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement search_tf = driver.findElement(By.id("outlined-adornment-password"));
		search_tf.sendKeys(p.getPropertyFiledata("manage_device"));
		Thread.sleep(1000);
		WebElement Edit_device_name = driver.findElement(By.xpath("//div[@class='flexAutoRow pdngLMD alignCntr']//button[@type='button']"));
		Thread.sleep(1000);
		Edit_device_name.click();
//		js.executeScript("window.scrollBy(0,500)","");
		
		Thread.sleep(1000);
		String exp_Title = "Change Device Name";
		WebElement Title = driver.findElement(By.xpath("//h2[@id='alert-dialog-title']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc9_ChangeDevice_CANCEL() throws IOException, InterruptedException, AWTException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Manage_device = driver.findElement(By.xpath("//a[@href='/manage-devices']"));
		Manage_device.click();
		WebElement search_tf = driver.findElement(By.id("outlined-adornment-password"));
		search_tf.sendKeys(p.getPropertyFiledata("manage_device"));
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement Edit_device_name = driver.findElement(By.xpath("//div[@class='flexAutoRow pdngLMD alignCntr']//button[@type='button']"));
		Thread.sleep(1000);
		Edit_device_name.click();
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
//		WebElement Enter_name = driver.findElement(By.xpath("//div[@class='MuiOutlinedInput-root MuiInputBase-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall css-1bnxys3']"));
////		Enter_name.click();
////		Thread.sleep(1000);
//		Enter_name.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
////		Robot r = new Robot();
////		r.keyPress(KeyEvent.VK_CONTROL);
////		r.keyPress(KeyEvent.VK_A);
////		r.keyRelease(KeyEvent.VK_A);
////		r.keyRelease(KeyEvent.VK_CONTROL);
////		r.keyPress(KeyEvent.VK_DELETE);
////		r.keyRelease(KeyEvent.VK_DELETE);
////		
//		Enter_name.sendKeys("iPhone");
////		
//		WebElement ADD = driver.findElement(By.xpath("//button[normalize-space()='ADD']"));
//		ADD.click();
		WebElement CANCEL = driver.findElement(By.xpath("//button[normalize-space()='CANCEL']"));
		CANCEL.click();
		
		Thread.sleep(1000);
		String exp_Title = "Manage Devices";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Manage Devices']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc10_Delete_device() throws IOException, InterruptedException, AWTException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Manage_device = driver.findElement(By.xpath("//a[@href='/manage-devices']"));
		Manage_device.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement search_tf = driver.findElement(By.id("outlined-adornment-password"));
		search_tf.sendKeys(p.getPropertyFiledata("manage_device"));
		Thread.sleep(1000);
		
		WebElement Delete_device = driver.findElement(By.xpath("//button[normalize-space()='DELETE']"));
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		Delete_device.click();
		
		
		WebElement Delete = driver.findElement(By.xpath("//button[normalize-space()='Delete']"));
		Delete.isDisplayed();
		
		WebElement Cancel = driver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
		Cancel.isDisplayed();
		
		Thread.sleep(1000);
		String exp_Title = "Delete Device";
		WebElement Title = driver.findElement(By.xpath("//h2[@id='alert-dialog-title']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc11_Change_agent() throws IOException, InterruptedException, AWTException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Manage_device = driver.findElement(By.xpath("//a[@href='/manage-devices']"));
		Manage_device.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement search_tf = driver.findElement(By.id("outlined-adornment-password"));
		search_tf.sendKeys(p.getPropertyFiledata("manage_device"));
		Thread.sleep(1000);
		WebElement Change_Agent = driver.findElement(By.xpath("//button[normalize-space()='Change Agent']"));
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		Change_Agent.click();
		
		WebElement Cancel = driver.findElement(By.xpath("//div[@class='flexAutoRow justifyEnd alignCntr']//button[@type='button']"));
		Cancel.isDisplayed();
		
		WebElement REMOVE = driver.findElement(By.xpath("//button[normalize-space()='REMOVE']"));
		REMOVE.isDisplayed();
		
		Thread.sleep(1000);
		String exp_Title = "Assign Agents";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Assign Agents']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	
}
