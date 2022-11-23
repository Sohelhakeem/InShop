package Customer_scripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Customer_BaseClass;

public class Cust_Schedule_Meeting extends  Customer_BaseClass{
	@Test
	public void tc1_Schedule_Meeting_Btn() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement Schedule_Meeting = driver.findElement(By.xpath("//a[@href='/schedule-meeting']"));
		Schedule_Meeting.click();
		Thread.sleep(1000);
		
		String act_title = "Schedule Video Meeting";
		String exp_Title = driver.findElement(By.xpath("//h2[normalize-space()='Schedule Video Meeting']")).getText();
		Assert.assertEquals(act_title, exp_Title);
		
	}
	@Test
	public void tc2_Start_shopping_Btn() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement Schedule_Meeting = driver.findElement(By.xpath("//a[@href='/schedule-meeting']"));
		Schedule_Meeting.click();
		
		WebElement VendorId_TF= driver.findElement(By.xpath("//input[@id='outlined-basic']"));
		VendorId_TF.sendKeys(p.getPropertyFiledata("Vender_Id"));
		
		WebElement START_SHOPPING= driver.findElement(By.xpath("//button[normalize-space()='START SHOPPING']"));
		START_SHOPPING.isDisplayed();
		
		Thread.sleep(1000);
		
		String act_title = "Schedule Video Meeting";
		String exp_Title = driver.findElement(By.xpath("//h2[normalize-space()='Schedule Video Meeting']")).getText();
		Assert.assertEquals(act_title, exp_Title);
		
	}
	
	@Test
	public void tc3_Valid_Vendor_Join() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement Schedule_Meeting = driver.findElement(By.xpath("//a[@href='/schedule-meeting']"));
		Schedule_Meeting.click();
		
		WebElement VendorId_TF= driver.findElement(By.xpath("//input[@id='outlined-basic']"));
		VendorId_TF.sendKeys(p.getPropertyFiledata("Vender_Id"));
		
		WebElement START_SHOPPING= driver.findElement(By.xpath("//button[normalize-space()='START SHOPPING']"));
		START_SHOPPING.click();
		
		Thread.sleep(1000);
		
		String act_title = "Book Meeting";
		String exp_Title = driver.findElement(By.xpath("//h3[normalize-space()='Book Meeting']")).getText();
		Assert.assertEquals(act_title, exp_Title);
		
	}
	@Test
	public void tc4_inValid_Vendor_Join() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement Schedule_Meeting = driver.findElement(By.xpath("//a[@href='/schedule-meeting']"));
		Schedule_Meeting.click();
		
		WebElement VendorId_TF= driver.findElement(By.xpath("//input[@id='outlined-basic']"));
		VendorId_TF.sendKeys("Diamond12377436623887326");
		
		WebElement START_SHOPPING= driver.findElement(By.xpath("//button[normalize-space()='START SHOPPING']"));
		START_SHOPPING.click();
		
		Thread.sleep(1000);
		
		String act_title = "Invalid vendor ID";
		String exp_Title = driver.findElement(By.xpath("//div[contains(text(),'Invalid vendor ID')]")).getText();
		Assert.assertEquals(act_title, exp_Title);
		
	}
	@Test
	public void tc5_Automate_dateAndyear() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement Schedule_Meeting = driver.findElement(By.xpath("//a[@href='/schedule-meeting']"));
		Schedule_Meeting.click();
		
		WebElement VendorId_TF= driver.findElement(By.xpath("//input[@id='outlined-basic']"));
		VendorId_TF.sendKeys(p.getPropertyFiledata("Vender_Id"));
		
		WebElement START_SHOPPING= driver.findElement(By.xpath("//button[normalize-space()='START SHOPPING']"));
		START_SHOPPING.click();
		
		Select Month_drp = new Select(driver.findElement(By.xpath("//span[@class='rdrMonthPicker']//select")));
		Month_drp.selectByVisibleText(p.getPropertyFiledata("month_drp"));
		
		Select year_drp = new Select(driver.findElement(By.xpath("//span[@class='rdrYearPicker']//select")));
		year_drp.selectByVisibleText(p.getPropertyFiledata("year_drp"));
		
		String date =p.getPropertyFiledata("date");
		List<WebElement> all_dates = driver.findElements(By.xpath("//div[contains(@class,'rdrDays')]//button" ));
		for(WebElement ele:all_dates) {
			String dt = ele.getText();
			if(dt.equals(date)) {
				ele.click();
				break;
				
			}
			
		}
		Thread.sleep(2000);
		String act_title = "Book Meeting";
		String exp_Title = driver.findElement(By.xpath("//h3[normalize-space()='Book Meeting']")).getText();
		Assert.assertEquals(act_title, exp_Title);
		
	}
	@Test
	public void tc6_No_slots_available() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement Schedule_Meeting = driver.findElement(By.xpath("//a[@href='/schedule-meeting']"));
		Schedule_Meeting.click();
		
		WebElement VendorId_TF= driver.findElement(By.xpath("//input[@id='outlined-basic']"));
		VendorId_TF.sendKeys(p.getPropertyFiledata("Vender_Id"));
		
		WebElement START_SHOPPING= driver.findElement(By.xpath("//button[normalize-space()='START SHOPPING']"));
		START_SHOPPING.click();
		
		Select Month_drp = new Select(driver.findElement(By.xpath("//span[@class='rdrMonthPicker']//select")));
		Month_drp.selectByVisibleText("January");
		
		Select year_drp = new Select(driver.findElement(By.xpath("//span[@class='rdrYearPicker']//select")));
		year_drp.selectByVisibleText("2025");
		
		String date ="25";
		List<WebElement> all_dates = driver.findElements(By.xpath("//div[contains(@class,'rdrDays')]//button" ));
		for(WebElement ele:all_dates) {
			String dt = ele.getText();
			if(dt.equals(date)) {
				ele.click();
				break;
				
			}
			
		}
		Thread.sleep(2000);
		String act_title = "No Slots Available";
		String exp_Title = driver.findElement(By.xpath("//h3[normalize-space()='No Slots Available']")).getText();
		Assert.assertEquals(act_title, exp_Title);
		
	}
	
	@Test 
	public void tc7_Avatar_Logout() throws IOException, InterruptedException{
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Avatar_drp = driver.findElement(By.xpath("//div[@class='flexInline circle circleMD']"));
		Avatar_drp.click();
		Thread.sleep(1000);
		
		WebElement Logout = driver.findElement(By.xpath("//li[normalize-space()='Logout']"));
		Logout.click();
		Thread.sleep(2000);
		
		String exp_Title = "Login";
		WebElement Title = driver.findElement(By.xpath("//h2[normalize-space()='Login']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
	}

}

