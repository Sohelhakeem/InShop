package Customer_scripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Customer_BaseClass;

public class Cust_My_meeting extends Customer_BaseClass {
	@Test
	public void tc1_Analyticsd() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement my_meeting = driver.findElement(By.xpath("//a[@href='/my-meeting']"));
		my_meeting.click();
		Thread.sleep(1000);
		String expected_title = "My Meetings";
		String actual_title = driver.findElement(By.xpath("//h3[normalize-space()='My Meetings']")).getText();
		Assert.assertEquals(expected_title, actual_title);
		
	}
	@Test
	public void tc2_Meeting_History() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement my_meeting = driver.findElement(By.xpath("//a[@href='/my-meeting']"));
		my_meeting.click();
		
		WebElement Meeting_History = driver.findElement(By.xpath("//button[normalize-space()='Meeting History']"));
		Meeting_History.click();
		
		
		Thread.sleep(1000);
		String expected_title = "My Meetings";
		String actual_title = driver.findElement(By.xpath("//h3[normalize-space()='My Meetings']")).getText();
		Assert.assertEquals(expected_title, actual_title);
		
	}
	@Test
	public void tc3_search_tf_Invalid() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement my_meeting = driver.findElement(By.xpath("//a[@href='/my-meeting']"));
		my_meeting.click();
		
		WebElement Meeting_History = driver.findElement(By.xpath("//button[normalize-space()='Meeting History']"));
		Meeting_History.click();
		
		WebElement search_tf = driver.findElement(By.xpath("//input[@id='outlined-adornment-password']"));
		search_tf.sendKeys("sohel");
		
		
		Thread.sleep(2000);
		String expected_title = "No Data Found";
		String actual_title = driver.findElement(By.xpath("//span[@class='subHeadingSM']")).getText();
		Assert.assertEquals(expected_title, actual_title);
		
	}
	@Test
	public void tc4_Up_coming_Meetings() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement my_meeting = driver.findElement(By.xpath("//a[@href='/my-meeting']"));
		my_meeting.click();
		
		WebElement Meeting_History = driver.findElement(By.xpath("//button[normalize-space()='Meeting History']"));
		Meeting_History.click();
		
		WebElement Up_Coming = driver.findElement(By.xpath("//button[normalize-space()='Up Coming']"));
		Up_Coming.click();
		
		Thread.sleep(2000);
		String expected_title = "My Meetings";
		String actual_title = driver.findElement(By.xpath("//h3[normalize-space()='My Meetings']")).getText();
		Assert.assertEquals(expected_title, actual_title);
		
	}
	@Test
	public void tc5_search_tf_valid() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement my_meeting = driver.findElement(By.xpath("//a[@href='/my-meeting']"));
		my_meeting.click();
		
		WebElement Meeting_History = driver.findElement(By.xpath("//button[normalize-space()='Meeting History']"));
		Meeting_History.click();
		
		WebElement search_tf = driver.findElement(By.xpath("//input[@id='outlined-adornment-password']"));
		search_tf.sendKeys("Diamond123");
		
		
		Thread.sleep(2000);
		String expected_title = "Diamond123";
		String actual_title = driver.findElement(By.xpath("(//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-sizeSmall css-1o6fzn1'][normalize-space()='Diamond123'])[1]")).getText();
		Assert.assertEquals(expected_title, actual_title);
		
	}
	@Test
	public void tc6_my_meeting_Filter() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement my_meeting = driver.findElement(By.xpath("//a[@href='/my-meeting']"));
		my_meeting.click();
		
		WebElement Meeting_History = driver.findElement(By.xpath("//button[normalize-space()='Meeting History']"));
		Meeting_History.click();
		
		WebElement my_meeting_Filter= driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		my_meeting_Filter.click();
		
		Thread.sleep(2000);
		String expected_title = "Filter";
		String actual_title = driver.findElement(By.xpath("(//h2[normalize-space()='Filter'])[1]")).getText();
		Assert.assertEquals(expected_title, actual_title);
		
	}
	@Test
	public void tc7_Scheduled() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement my_meeting = driver.findElement(By.xpath("//a[@href='/my-meeting']"));
		my_meeting.click();
		
		WebElement Meeting_History = driver.findElement(By.xpath("//button[normalize-space()='Meeting History']"));
		Meeting_History.click();
		
		WebElement my_meeting_Filter= driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		my_meeting_Filter.click();
		Thread.sleep(1000);
		WebElement Scheduled= driver.findElement(By.xpath("//label[normalize-space()='Scheduled']"));
		Scheduled.click();
		
		WebElement Apply= driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		
		Thread.sleep(2000);
		String expected_title = "schedule";
		String actual_title = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]")).getText();
		Assert.assertEquals(expected_title, actual_title);
		
	}
	@Test
	public void tc8_Outgoing() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement my_meeting = driver.findElement(By.xpath("//a[@href='/my-meeting']"));
		my_meeting.click();
		
		WebElement Meeting_History = driver.findElement(By.xpath("//button[normalize-space()='Meeting History']"));
		Meeting_History.click();
		
		WebElement my_meeting_Filter= driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		my_meeting_Filter.click();
		Thread.sleep(1000);
		WebElement Outgoing= driver.findElement(By.xpath("//label[normalize-space()='Outgoing']"));
		Outgoing.click();
		
		WebElement Apply= driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		
		Thread.sleep(2000);
		String expected_title = "Outgoing";
		String actual_title = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]")).getText();
		Assert.assertEquals(expected_title, actual_title);
		
	} 
	@Test
	public void tc9_All() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement my_meeting = driver.findElement(By.xpath("//a[@href='/my-meeting']"));
		my_meeting.click();
		
		WebElement Meeting_History = driver.findElement(By.xpath("//button[normalize-space()='Meeting History']"));
		Meeting_History.click();
		
		WebElement my_meeting_Filter= driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		my_meeting_Filter.click();
		Thread.sleep(1000);
		WebElement Apply= driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		Thread.sleep(2000);
		String expected_title = "My Meetings";
		String actual_title = driver.findElement(By.xpath("//h3[normalize-space()='My Meetings']")).getText();
		Assert.assertEquals(expected_title, actual_title);
		
	} 
	@Test
	public void tc10_Cancel() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement my_meeting = driver.findElement(By.xpath("//a[@href='/my-meeting']"));
		my_meeting.click();
		Thread.sleep(2000);
		WebElement Meeting_History = driver.findElement(By.xpath("//button[normalize-space()='Meeting History']"));
		Meeting_History.click();
		Thread.sleep(2000);
		WebElement my_meeting_Filter= driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		my_meeting_Filter.click();
		Thread.sleep(1000);
		WebElement Cancel= driver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
		Cancel.click();
		Thread.sleep(2000);
		String expected_title = "My Meetings";
		String actual_title = driver.findElement(By.xpath("//h3[normalize-space()='My Meetings']")).getText();
		Assert.assertEquals(expected_title, actual_title);
		
	} 
	@Test
	public void tc11_Custom_date() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement my_meeting = driver.findElement(By.xpath("//a[@href='/my-meeting']"));
		my_meeting.click();
		Thread.sleep(2000);
		WebElement Meeting_History = driver.findElement(By.xpath("//button[normalize-space()='Meeting History']"));
		Meeting_History.click();
		Thread.sleep(2000);
		WebElement my_meeting_Filter= driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		my_meeting_Filter.click();
		Thread.sleep(1000);
		
		//Calendar
		//From Date
		WebElement From_date= driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']"));
		From_date.click();
		
		String month = "August";
		String year = "2022";
		String date = "1";
		
		while(true) {
			String mon = driver.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']")).getText();
			String yr = driver.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]")).getText();
			if(mon.equalsIgnoreCase(month)&&yr.equals(year)) {
				break;
			}
				else {
					driver.findElement(By.xpath("//button[contains(@title,'Previous month')]")).click();
				}
			}
		List <WebElement>  alldates = driver.findElements(By.xpath("//div[@role='grid']//div"));		
		for(WebElement ele:alldates) {
			String dt = ele.getText();
			if(dt.equals(date)) {
				ele.click();
				break;
			}
		}
		
		//To Date
		WebElement to_date = driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[2]"));
		to_date.click();
		Thread.sleep(1000);
		String month2 = "September";
		String year2 = "2022";
		String date2 = "10";
		while(true) {
			String mon2 = driver.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']")).getText();
			String yr2 = driver.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]")).getText();
			if(mon2.equalsIgnoreCase(month2)&&yr2.equals(year2)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//button[contains(@title,'Previous month')]")).click();
			}
		}
		
		List <WebElement> alldates2 = driver.findElements(By.xpath("//div[@role='grid']//div"));
		for(WebElement ele:alldates2) {
			String dt2 = ele.getText();
			if(dt2.equals(date2)) {
				ele.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		WebElement Apply= driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		Thread.sleep(2000);
		String expected_title = "My Meetings";
		String actual_title = driver.findElement(By.xpath("//h3[normalize-space()='My Meetings']")).getText();
		Assert.assertEquals(expected_title, actual_title);
		
	} 
	@Test
	public void tc12_From_date() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement my_meeting = driver.findElement(By.xpath("//a[@href='/my-meeting']"));
		my_meeting.click();
		Thread.sleep(2000);
		WebElement Meeting_History = driver.findElement(By.xpath("//button[normalize-space()='Meeting History']"));
		Meeting_History.click();
		Thread.sleep(2000);
		WebElement my_meeting_Filter= driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		my_meeting_Filter.click();
		Thread.sleep(1000);
		
		//Calendar
		//From Date
		WebElement From_date= driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']"));
		From_date.click();
		
		String month = "August";
		String year = "2022";
		String date = "1";
		
		while(true) {
			String mon = driver.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']")).getText();
			String yr = driver.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]")).getText();
			if(mon.equalsIgnoreCase(month)&&yr.equals(year)) {
				break;
			}
				else {
					driver.findElement(By.xpath("//button[contains(@title,'Previous month')]")).click();
				}
			}
		List <WebElement>  alldates = driver.findElements(By.xpath("//div[@role='grid']//div"));		
		for(WebElement ele:alldates) {
			String dt = ele.getText();
			if(dt.equals(date)) {
				ele.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		WebElement Apply= driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		Thread.sleep(2000);
		String expected_title = "My Meetings";
		String actual_title = driver.findElement(By.xpath("//h3[normalize-space()='My Meetings']")).getText();
		Assert.assertEquals(expected_title, actual_title);
		
	} 
	@Test
	public void tc13_to_date() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Customer_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Customer_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement my_meeting = driver.findElement(By.xpath("//a[@href='/my-meeting']"));
		my_meeting.click();
		Thread.sleep(2000);
		WebElement Meeting_History = driver.findElement(By.xpath("//button[normalize-space()='Meeting History']"));
		Meeting_History.click();
		Thread.sleep(2000);
		WebElement my_meeting_Filter= driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		my_meeting_Filter.click();
		Thread.sleep(1000);
		
		//Calendar
		//To Date
		WebElement to_date = driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[2]"));
		to_date.click();
		Thread.sleep(1000);
		String month2 = "September";
		String year2 = "2022";
		String date2 = "10";
		while(true) {
			String mon2 = driver.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']")).getText();
			String yr2 = driver.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]")).getText();
			if(mon2.equalsIgnoreCase(month2)&&yr2.equals(year2)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//button[contains(@title,'Previous month')]")).click();
			}
		}
		
		List <WebElement> alldates2 = driver.findElements(By.xpath("//div[@role='grid']//div"));
		for(WebElement ele:alldates2) {
			String dt2 = ele.getText();
			if(dt2.equals(date2)) {
				ele.click();
				break;
			}
		}
		
		Thread.sleep(1000);
		WebElement Apply= driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		Thread.sleep(2000);
		String expected_title = "From date Should be less than To date";
		String actual_title = driver.findElement(By.xpath("//div[contains(text(),'From date Should be less than To date')]")).getText();
		Assert.assertEquals(expected_title, actual_title);
		
	} 
}
