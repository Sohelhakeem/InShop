package Customer_scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Customer_BaseClass;

public class Cust_Start_Schedule_meeting extends Customer_BaseClass {
	@Test
	public void tc1_Start_meeting() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		String exp_Title = "Start Video Shop";
		WebElement Title = driver.findElement(By.xpath("//h2[normalize-space()='Start Video Shop']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc2_Start_meeting_Elements() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement Vendor_Id = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
		Vendor_Id.sendKeys(p.getPropertyFiledata("Vender_Id"));
		
		WebElement Start_shopping = driver.findElement(By.xpath("//button[normalize-space()='START SHOPPING']"));
		Start_shopping.isDisplayed();
		
		WebElement OR = driver.findElement(By.xpath("//span[@class='horzLineTxt']"));
		OR.isDisplayed();
		
		WebElement QR_Code = driver.findElement(By.xpath("//div[@class='ndataCircle circle2XL flexRow alignCntr justifyCntr mrgnBtmMD ']"));
		QR_Code.isDisplayed();
		
		WebElement Scan_QR_Code = driver.findElement(By.xpath("//h4[normalize-space()='Scan QR Code']"));
		Scan_QR_Code.isDisplayed();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement Schedule_meeting_text = driver.findElement(By.xpath("//span[contains(text(),'Schedule a meeting as per your available convenien')]"));
		Thread.sleep(1000);
		Schedule_meeting_text.isDisplayed();
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		
		WebElement  Schedule_Meeting_Btn = driver.findElement(By.xpath("//button[normalize-space()='SCHEDULE MEETING']"));
		Schedule_Meeting_Btn.isDisplayed();
		String exp_Title = "Start Video Shop";
		WebElement Title = driver.findElement(By.xpath("//h2[normalize-space()='Start Video Shop']" ));
		js.executeScript("window.scrollBy(0, -350)");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc3_QR_Code() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement Vendor_Id = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
		Vendor_Id.sendKeys(p.getPropertyFiledata("Vender_Id"));
		
		WebElement Start_shopping = driver.findElement(By.xpath("//button[normalize-space()='START SHOPPING']"));
		Start_shopping.isDisplayed();
		
		WebElement OR = driver.findElement(By.xpath("//span[@class='horzLineTxt']"));
		OR.isDisplayed();
		
		WebElement QR_Code = driver.findElement(By.xpath("//div[@class='ndataCircle circle2XL flexRow alignCntr justifyCntr mrgnBtmMD ']"));
		QR_Code.click();
		Thread.sleep(2000);
		String CurrentUrl = "https://testcustomer.inshop.vc/qrcode";
		String ExpUrl = driver.getCurrentUrl();
		Assert.assertEquals(CurrentUrl, ExpUrl);
		
	}

	@Test
	public void tc4_Schedule_Meeting_Btn() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement Vendor_Id = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
		Vendor_Id.sendKeys(p.getPropertyFiledata("Vender_Id"));
		
		WebElement Start_shopping = driver.findElement(By.xpath("//button[normalize-space()='START SHOPPING']"));
		Start_shopping.isDisplayed();
		
		WebElement OR = driver.findElement(By.xpath("//span[@class='horzLineTxt']"));
		OR.isDisplayed();
		
		WebElement QR_Code = driver.findElement(By.xpath("//div[@class='ndataCircle circle2XL flexRow alignCntr justifyCntr mrgnBtmMD ']"));
		QR_Code.isDisplayed();
		
		WebElement Scan_QR_Code = driver.findElement(By.xpath("//h4[normalize-space()='Scan QR Code']"));
		Scan_QR_Code.isDisplayed();
		
		WebElement  Schedule_Meeting_Btn = driver.findElement(By.xpath("//button[normalize-space()='SCHEDULE MEETING']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", Schedule_Meeting_Btn);
		Thread.sleep(1000);
		Schedule_Meeting_Btn.click();
		Thread.sleep(2000);
		String exp_Title = "Schedule Video Meeting";
		WebElement Title = driver.findElement(By.xpath("//h2[normalize-space()='Schedule Video Meeting']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc5_Schedule_Meeting_Page() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement  Schedule_Meeting_Btn = driver.findElement(By.xpath("//button[normalize-space()='SCHEDULE MEETING']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", Schedule_Meeting_Btn);
		Thread.sleep(1000);
		Schedule_Meeting_Btn.click();
		Thread.sleep(2000);
		WebElement Vendor_Id = driver.findElement(By.xpath("//input[@id='outlined-basic']"));
		Vendor_Id.sendKeys(p.getPropertyFiledata("Vender_Id"));
		WebElement Start_shopping_Btn = driver.findElement(By.xpath("//button[normalize-space()='START SHOPPING']"));
		Start_shopping_Btn.isDisplayed();
		String exp_Title = "Schedule Video Meeting";
		WebElement Title = driver.findElement(By.xpath("//h2[normalize-space()='Schedule Video Meeting']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc6_Invalid_Vendor_Id() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement Vendor_Id = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
		Vendor_Id.sendKeys("Diamond1234");
		Thread.sleep(2000);
		WebElement Start_shopping = driver.findElement(By.xpath("//button[normalize-space()='START SHOPPING']"));
		Start_shopping.click();
		
		Thread.sleep(2000);
		String exp_Error = "Invalid vendor ID";
		WebElement Error = driver.findElement(By.xpath("//div[contains(text(),'Invalid vendor ID')]" ));
		Thread.sleep(1000);
		String actual_Error = Error.getText();
		Assert.assertEquals(exp_Error, actual_Error);
	}
	@Test
	public void tc7_Schedule_Meeting_Page_invalidId() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement  Schedule_Meeting_Btn = driver.findElement(By.xpath("//button[normalize-space()='SCHEDULE MEETING']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", Schedule_Meeting_Btn);
		Thread.sleep(1000);
		Schedule_Meeting_Btn.click();
		Thread.sleep(2000);
		WebElement Vendor_Id = driver.findElement(By.xpath("//input[@id='outlined-basic']"));
		Vendor_Id.sendKeys("Diamond1234");
		WebElement Start_shopping_Btn = driver.findElement(By.xpath("//button[normalize-space()='START SHOPPING']"));
		Start_shopping_Btn.click();
		Thread.sleep(2000);
		String exp_Error = "Invalid vendor ID";
		WebElement Error = driver.findElement(By.xpath("//div[contains(text(),'Invalid vendor ID')]" ));
		Thread.sleep(1000);
		String actual_Error = Error.getText();
		Assert.assertEquals(exp_Error, actual_Error);
		
	}
	
	@Test
	public void tc8_Schedule_valid_id() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement Schedule_Meeting = driver.findElement(By.xpath("//span[normalize-space()='Schedule Meeting']"));
		Schedule_Meeting.click();
		
		WebElement Vendor_Id = driver.findElement(By.xpath("//input[@id='outlined-basic']"));
		Vendor_Id.sendKeys(p.getPropertyFiledata("Vender_Id"));
		Thread.sleep(2000);
		WebElement Start_shopping = driver.findElement(By.xpath("//button[normalize-space()='START SHOPPING']"));
		Start_shopping.click();
		
		Thread.sleep(2000);
		String exp_Title = "Book Meeting";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Book Meeting']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
	}
	@Test
	public void tc9_Start_meeting_Valid () throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement Vendor_Id = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
		Vendor_Id.sendKeys(p.getPropertyFiledata("Vender_Id"));
		Thread.sleep(2000);
		WebElement Start_shopping = driver.findElement(By.xpath("//button[normalize-space()='START SHOPPING']"));
		Start_shopping.click();
		Thread.sleep(2000);
		
		String exp_Title = "Start Video Shop";
		WebElement Title = driver.findElement(By.xpath("//h2[normalize-space()='Start Video Shop']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}

}
