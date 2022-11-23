package admin_scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Admin_BaseClass;

public class Ad_Manage_WaitingRoom extends Admin_BaseClass {
	@Test(priority = 1)
	public void tc1_Manage_WaitingRoom() throws IOException, InterruptedException {
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Manage_WaitingRoom = driver.findElement(By.xpath("//small[normalize-space()='Manage Waiting Room']"));
		Manage_WaitingRoom.click();
		
		String exp_Title = "Upload Files";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Upload Files']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
	}
	@Test(priority = 2)
	public void tc2_Add_Youtube_URLs_TF() throws IOException, InterruptedException {
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Manage_WaitingRoom = driver.findElement(By.xpath("//small[normalize-space()='Manage Waiting Room']"));
		Manage_WaitingRoom.click();
		
		WebElement Add_Youtube_URLs_TF = driver.findElement(By.xpath("//input[@placeholder='Enter Youtube Url']"));
		Add_Youtube_URLs_TF.sendKeys("https://www.youtube.com/watch?v=5FUdrBq-WFo");
		
		WebElement Upload = driver.findElement(By.xpath("//button[normalize-space()='Upload']"));
		Upload.isDisplayed();

		String exp_Title = "Upload Files";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Upload Files']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
	}
	@Test(priority = 3)
	public void tc3_Youtube_URLs_Upload() throws IOException, InterruptedException {
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Manage_WaitingRoom = driver.findElement(By.xpath("//small[normalize-space()='Manage Waiting Room']"));
		Manage_WaitingRoom.click();
		
		String exp_Title = "Upload Files";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Upload Files']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
		WebElement Add_Youtube_URLs_TF = driver.findElement(By.xpath("//input[@placeholder='Enter Youtube Url']"));
		Add_Youtube_URLs_TF.sendKeys("https://www.youtube.com/watch?v=5FUdrBq-WFo");
		
		WebElement Upload = driver.findElement(By.xpath("//button[normalize-space()='Upload']"));
		Upload.click();
		
		String exp_Title1 = "Uploaded Files List";
		WebElement Title1 = driver.findElement(By.xpath("//span[@class='titleHeading headingLG mrgnBtmSM']" ));
		String actual_Title1 = Title1.getText();
		Assert.assertEquals(exp_Title1, actual_Title1);
	}
	@Test(priority = 4)
	public void tc4_Waiting_Room_Uploads() throws IOException, InterruptedException {
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Waiting_Room_Uploads = driver.findElement(By.xpath("//small[normalize-space()='Waiting Room Uploads']"));
		Waiting_Room_Uploads.click();
		
		String exp_Title1 = "Uploaded Files List";
		WebElement Title1 = driver.findElement(By.xpath("//span[@class='titleHeading headingLG mrgnBtmSM']" ));
		String actual_Title1 = Title1.getText();
		Assert.assertEquals(exp_Title1, actual_Title1);
	}
	@Test(priority = 5)
	public void tc5_Uploads_Edit() throws IOException, InterruptedException {
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Waiting_Room_Uploads = driver.findElement(By.xpath("//small[normalize-space()='Waiting Room Uploads']"));
		Waiting_Room_Uploads.click();
		
		WebElement Edit = driver.findElement(By.xpath("//div[@class='flexMinWidthCol alignCntr justifyCntr iconBoxMD']//button[@aria-label='delete']"));
		Edit.click();
		
		WebElement CANCEL = driver.findElement(By.xpath("//button[normalize-space()='CANCEL']"));
		CANCEL.click();
		Edit.click();
		WebElement ADD = driver.findElement(By.xpath("//button[normalize-space()='ADD']"));
		ADD.click();
		
		String exp_Title1 = "Uploaded Files List";
		WebElement Title1 = driver.findElement(By.xpath("//span[@class='titleHeading headingLG mrgnBtmSM']" ));
		String actual_Title1 = Title1.getText();
		Assert.assertEquals(exp_Title1, actual_Title1);
	}
	@Test(priority = 6)
	public void tc6_Uploads_Delete() throws IOException, InterruptedException {
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Waiting_Room_Uploads = driver.findElement(By.xpath("//small[normalize-space()='Waiting Room Uploads']"));
		Waiting_Room_Uploads.click();
		
		WebElement Delete = driver.findElement(By.xpath("//div[contains(@class,'flexCol respdngHSM')]//div[1]//div[1]//div[2]//div[1]//div[1]//button[1]"));
		Delete.click();
		
		WebElement Cancel = driver.findElement(By.xpath("//button[normalize-space()='CANCEL']"));
		Cancel.click();
		Delete.click();
		
		WebElement DELETE = driver.findElement(By.xpath("//button[normalize-space()='DELETE']"));
		DELETE.click();
		
		String exp_Title1 = "Uploaded Files List";
		WebElement Title1 = driver.findElement(By.xpath("//span[@class='titleHeading headingLG mrgnBtmSM']" ));
		String actual_Title1 = Title1.getText();
		Assert.assertEquals(exp_Title1, actual_Title1);
	}
	@Test(priority = 7)
	public void tc7_Complete_uploadAndDelete() throws IOException, InterruptedException {
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Manage_WaitingRoom = driver.findElement(By.xpath("//small[normalize-space()='Manage Waiting Room']"));
		Manage_WaitingRoom.click();
		
		String exp_Title = "Upload Files";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Upload Files']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
		WebElement Add_Youtube_URLs_TF = driver.findElement(By.xpath("//input[@placeholder='Enter Youtube Url']"));
		Add_Youtube_URLs_TF.sendKeys("https://www.youtube.com/watch?v=5FUdrBq-WFo");
		
		WebElement Upload = driver.findElement(By.xpath("//button[normalize-space()='Upload']"));
		Upload.click();
		
		WebElement Edit = driver.findElement(By.xpath("//div[@class='flexMinWidthCol alignCntr justifyCntr iconBoxMD']//button[@aria-label='delete']"));
		Edit.click();
		
		WebElement CANCEL = driver.findElement(By.xpath("//button[normalize-space()='CANCEL']"));
		CANCEL.click();
		Edit.click();
		WebElement ADD = driver.findElement(By.xpath("//button[normalize-space()='ADD']"));
		ADD.click();
		Thread.sleep(2000);
		WebElement Delete = driver.findElement(By.xpath("//div[contains(@class,'flexCol respdngHSM')]//div[1]//div[1]//div[2]//div[1]//div[1]//button[1]"));
		Delete.click();
		Thread.sleep(2000);
		WebElement Cancel = driver.findElement(By.xpath("//button[normalize-space()='CANCEL']"));
		Cancel.click();
		Delete.click();
		
		WebElement DELETE = driver.findElement(By.xpath("//button[normalize-space()='DELETE']"));
		DELETE.click();
		
		
		String exp_Title1 = "Uploaded Files List";
		WebElement Title1 = driver.findElement(By.xpath("//span[@class='titleHeading headingLG mrgnBtmSM']" ));
		String actual_Title1 = Title1.getText();
		Assert.assertEquals(exp_Title1, actual_Title1);
	}
	@Test(priority = 8)
	public void tc8_Add_Files() throws IOException, InterruptedException, AWTException {
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		WebElement Manage_WaitingRoom = driver.findElement(By.xpath("//small[normalize-space()='Manage Waiting Room']"));
		Manage_WaitingRoom.click();
		
		WebElement Add_Files = driver.findElement(By.xpath("//span[@role='button']"));
		//Click action on upload file.
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Add_Files);

		Thread.sleep(3000);
		// creating object of Robot class
	    Robot rb = new Robot();
	 
	    // copying File path to Clipboard
	    StringSelection str = new StringSelection("C:\\Users\\Sohel\\Pictures\\profile\\Nature.jpg");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 
	     // press Contol+V for pasting
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	 
	    // release Contol+V for pasting
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	 
	    // for pressing and releasing Enter
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	    
		String exp_Title = "Upload Files";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Upload Files']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
	}
	
	@Test(priority = 9)
	public void tc9_Add_Files_Upload() throws IOException, InterruptedException, AWTException {
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Manage_WaitingRoom = driver.findElement(By.xpath("//small[normalize-space()='Manage Waiting Room']"));
		Manage_WaitingRoom.click();
		
		WebElement Add_Files = driver.findElement(By.xpath("//span[@role='button']"));
		//Click action on upload file.
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Add_Files);

		Thread.sleep(3000);
		// creating object of Robot class
	    Robot rb = new Robot();
	 
	    // copying File path to Clipboard
	    StringSelection str = new StringSelection("C:\\Users\\Sohel\\Pictures\\profile\\Nature.jpg");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 
	     // press Contol+V for pasting
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	 
	    // release Contol+V for pasting
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	 
	    // for pressing and releasing Enter
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);
	    WebElement Save_Upload = driver.findElement(By.xpath("//button[normalize-space()='Save & Upload']"));
	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    Thread.sleep(1000);
	    Save_Upload.click();
	    
	    String exp_Title1 = "Uploaded Files List";
		WebElement Title1 = driver.findElement(By.xpath("//span[@class='titleHeading headingLG mrgnBtmSM']" ));
		String actual_Title1 = Title1.getText();
		Assert.assertEquals(exp_Title1, actual_Title1);
		
		}
	@Test(priority = 10)
	public void tc10_Add_Files_Uploads() throws IOException, InterruptedException {
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Waiting_Room_Uploads = driver.findElement(By.xpath("//small[normalize-space()='Waiting Room Uploads']"));
		Waiting_Room_Uploads.click();
		
		String exp_Title1 = "Uploaded Files List";
		WebElement Title1 = driver.findElement(By.xpath("//span[@class='titleHeading headingLG mrgnBtmSM']" ));
		String actual_Title1 = Title1.getText();
		Assert.assertEquals(exp_Title1, actual_Title1);
	}
	@Test(priority = 11)
	public void tc11_Add_FilesUploads_Edit() throws IOException, InterruptedException {
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Waiting_Room_Uploads = driver.findElement(By.xpath("//small[normalize-space()='Waiting Room Uploads']"));
		Waiting_Room_Uploads.click();
		
		WebElement Edit = driver.findElement(By.xpath("//div[@class='flexMinWidthCol alignCntr justifyCntr iconBoxMD']//button[@aria-label='delete']"));
		Edit.click();
		
		WebElement CANCEL = driver.findElement(By.xpath("//button[normalize-space()='CANCEL']"));
		CANCEL.click();
		Edit.click();
		WebElement ADD = driver.findElement(By.xpath("//button[normalize-space()='ADD']"));
		ADD.click();
		
		String exp_Title1 = "Uploaded Files List";
		WebElement Title1 = driver.findElement(By.xpath("//span[@class='titleHeading headingLG mrgnBtmSM']" ));
		String actual_Title1 = Title1.getText();
		Assert.assertEquals(exp_Title1, actual_Title1);
	}
	@Test(priority = 12)
	public void tc12_Uploads_Delete() throws IOException, InterruptedException {
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		
		WebElement Waiting_Room_Uploads = driver.findElement(By.xpath("//small[normalize-space()='Waiting Room Uploads']"));
		Waiting_Room_Uploads.click();
		
		WebElement Delete = driver.findElement(By.xpath("//div[@class='flexMinWidthCol alignCntr justifyCntr iconBoxMD brdrRSM']//button[@aria-label='delete']"));
		Delete.click();
		
		WebElement Cancel = driver.findElement(By.xpath("//button[normalize-space()='CANCEL']"));
		Cancel.click();
		Delete.click();
		
		WebElement DELETE = driver.findElement(By.xpath("//button[normalize-space()='DELETE']"));
		DELETE.click();
		
		String exp_Title1 = "Uploaded Files List";
		WebElement Title1 = driver.findElement(By.xpath("//span[@class='titleHeading headingLG mrgnBtmSM']" ));
		String actual_Title1 = Title1.getText();
		Assert.assertEquals(exp_Title1, actual_Title1);
	}
}
