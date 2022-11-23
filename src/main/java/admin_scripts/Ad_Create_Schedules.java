package admin_scripts;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Admin_BaseClass;

public class Ad_Create_Schedules extends Admin_BaseClass {
	@Test
	public void tc1_Create_Schedule() throws AWTException, InterruptedException, IOException {
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement Schedule_meeting = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[10]/a[1]/div[1]/small[1]"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", Schedule_meeting);
		Thread.sleep(1000);
		Schedule_meeting.click();
		Thread.sleep(1000);
		
		String exp_Title = "Create Schedules";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Create Schedules']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	
	@Test
	public void tc2_Create() throws AWTException, InterruptedException, IOException {
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement Schedule_meeting = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[10]/a[1]/div[1]/small[1]"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", Schedule_meeting);
		Thread.sleep(1000);
		Schedule_meeting.click();
	
		
		WebElement Create = driver.findElement(By.xpath("//button[normalize-space()='Create']"));
		Create.click();
		Thread.sleep(1000);
		
		String exp_Title = "Create Schedules";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Create Schedules']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc3_Calendars() throws AWTException, InterruptedException, IOException {
		WebElement Enter_email_address = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));

		WebElement Enter_Pass = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));

		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Schedule_meeting = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[10]/a[1]/div[1]/small[1]"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", Schedule_meeting);
		Thread.sleep(1000);
		Schedule_meeting.click();

		WebElement Create = driver.findElement(By.xpath("//button[normalize-space()='Create']"));
		Create.click();
		Thread.sleep(1000);

		WebElement Custom_date = driver.findElement(By.xpath(
				"//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']"));
		Custom_date.click();

		String month = "December";
		String year = "2022";
		String date = "21";

		while (true) {
			String mon = driver
					.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']"))
					.getText();

			String yr = driver
					.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]"))
					.getText();

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else {
				driver.findElement(By.xpath("//button[@title='Next month']")).click();
			}
		}

		List<WebElement> alldates = driver
				.findElements(By.xpath("//div[@class='PrivatePickersSlideTransition-root css-dhopo2']//div"));

		for (WebElement ele : alldates) {
			String dt = ele.getText();
			if (dt.equals(date)) {
				ele.click();
				break;
			}

		}

		WebElement To_date = driver.findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[2]"));
		To_date.click();
		Thread.sleep(1000);

		String month2 = "February";
		String year2 = "2023";
		String date2 = "18";

		while (true) {
			String mon2 = driver
					.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']"))
					.getText();

			String yr2 = driver
					.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]"))
					.getText();

			if (mon2.equalsIgnoreCase(month2) && yr2.equals(year2))
				break;
			else {
				driver.findElement(By.xpath("//button[@title='Next month']")).click();
			}
		}

		List<WebElement> alldates2 = driver.findElements(By.xpath("//div[@role='grid']//div"));

		for (WebElement ele : alldates2) {
			String dt = ele.getText();
			if (dt.equals(date2)) {
				ele.click();
				break;
			}

		}

		Thread.sleep(1000);
		String exp_Title = "Create Schedules";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Create Schedules']"));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);

	}
	@Test
	public void tc4_Chexk_Box() throws AWTException, InterruptedException, IOException {
		WebElement Enter_email_address = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));

		WebElement Enter_Pass = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));

		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Schedule_meeting = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[10]/a[1]/div[1]/small[1]"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", Schedule_meeting);
		Thread.sleep(1000);
		Schedule_meeting.click();

		WebElement Create = driver.findElement(By.xpath("//button[normalize-space()='Create']"));
		Create.click();
		Thread.sleep(1000);

		WebElement Custom_date = driver.findElement(By.xpath(
				"//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']"));
		Custom_date.click();

		String month = "December";
		String year = "2022";
		String date = "21";

		while (true) {
			String mon = driver
					.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']"))
					.getText();

			String yr = driver
					.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]"))
					.getText();

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else {
				driver.findElement(By.xpath("//button[@title='Next month']")).click();
			}
		}

		List<WebElement> alldates = driver
				.findElements(By.xpath("//div[@class='PrivatePickersSlideTransition-root css-dhopo2']//div"));

		for (WebElement ele : alldates) {
			String dt = ele.getText();
			if (dt.equals(date)) {
				ele.click();
				break;
			}

		}

		WebElement To_date = driver.findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[2]"));
		To_date.click();
		Thread.sleep(1000);

		String month2 = "February";
		String year2 = "2023";
		String date2 = "18";

		while (true) {
			String mon2 = driver
					.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']"))
					.getText();

			String yr2 = driver
					.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]"))
					.getText();

			if (mon2.equalsIgnoreCase(month2) && yr2.equals(year2))
				break;
			else {
				driver.findElement(By.xpath("//button[@title='Next month']")).click();
			}
		}

		List<WebElement> alldates2 = driver.findElements(By.xpath("//div[@role='grid']//div"));

		for (WebElement ele : alldates2) {
			String dt = ele.getText();
			if (dt.equals(date2)) {
				ele.click();
				break;
			}

		}

		WebElement CheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		CheckBox.click();
		Thread.sleep(1000);
		CheckBox.click();
		Thread.sleep(1000);
		String exp_Title = "Create Schedules";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Create Schedules']"));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);

	}
	@Test
	public void tc5_Holidays() throws AWTException, InterruptedException, IOException {
		WebElement Enter_email_address = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));

		WebElement Enter_Pass = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));

		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Schedule_meeting = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[10]/a[1]/div[1]/small[1]"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", Schedule_meeting);
		Thread.sleep(1000);
		Schedule_meeting.click();

		WebElement Create = driver.findElement(By.xpath("//button[normalize-space()='Create']"));
		Create.click();
		Thread.sleep(1000);

		WebElement Custom_date = driver.findElement(By.xpath(
				"//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']"));
		Custom_date.click();

		String month = "December";
		String year = "2022";
		String date = "21";

		while (true) {
			String mon = driver
					.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']"))
					.getText();

			String yr = driver
					.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]"))
					.getText();

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else {
				driver.findElement(By.xpath("//button[@title='Next month']")).click();
			}
		}

		List<WebElement> alldates = driver
				.findElements(By.xpath("//div[@class='PrivatePickersSlideTransition-root css-dhopo2']//div"));

		for (WebElement ele : alldates) {
			String dt = ele.getText();
			if (dt.equals(date)) {
				ele.click();
				break;
			}

		}

		WebElement To_date = driver.findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[2]"));
		To_date.click();
		Thread.sleep(1000);

		String month2 = "February";
		String year2 = "2023";
		String date2 = "18";

		while (true) {
			String mon2 = driver
					.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']"))
					.getText();

			String yr2 = driver
					.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]"))
					.getText();

			if (mon2.equalsIgnoreCase(month2) && yr2.equals(year2))
				break;
			else {
				driver.findElement(By.xpath("//button[@title='Next month']")).click();
			}
		}

		List<WebElement> alldates2 = driver.findElements(By.xpath("//div[@role='grid']//div"));

		for (WebElement ele : alldates2) {
			String dt = ele.getText();
			if (dt.equals(date2)) {
				ele.click();
				break;
			}

		}

		WebElement CheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		CheckBox.click();
		Thread.sleep(1000);

		WebElement Holiday_date = driver.findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[3]"));
		Holiday_date.click();
		Thread.sleep(1000);

		String month3 = "January";
		String year3 = "2023";
		String date3 = "14";

		while (true) {
			String mon3 = driver
					.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']"))
					.getText();

			String yr3 = driver
					.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]"))
					.getText();

			if (mon3.equalsIgnoreCase(month3) && yr3.equals(year3))
				break;
			else {
				driver.findElement(By.xpath("//button[@title='Next month']")).click();
			}
		}

		List<WebElement> alldates3 = driver.findElements(By.xpath("//div[@role='grid']//div"));

		for (WebElement ele : alldates3) {
			String dt = ele.getText();
			if (dt.equals(date3)) {
				ele.click();
				break;
			}

		}

		Thread.sleep(1000);
		String exp_Title = "Create Schedules";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Create Schedules']"));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);

	}

	@Test
	public void tc6_Timings() throws AWTException, InterruptedException, IOException {
		WebElement Enter_email_address = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));

		WebElement Enter_Pass = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));

		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Schedule_meeting = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[10]/a[1]/div[1]/small[1]"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", Schedule_meeting);
		Thread.sleep(1000);
		Schedule_meeting.click();

		WebElement Create = driver.findElement(By.xpath("//button[normalize-space()='Create']"));
		Create.click();
		Thread.sleep(1000);

		WebElement Custom_date = driver.findElement(By.xpath(
				"//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']"));
		Custom_date.click();

		String month = "December";
		String year = "2022";
		String date = "21";

		while (true) {
			String mon = driver
					.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']"))
					.getText();

			String yr = driver
					.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]"))
					.getText();

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else {
				driver.findElement(By.xpath("//button[@title='Next month']")).click();
			}
		}

		List<WebElement> alldates = driver
				.findElements(By.xpath("//div[@class='PrivatePickersSlideTransition-root css-dhopo2']//div"));

		for (WebElement ele : alldates) {
			String dt = ele.getText();
			if (dt.equals(date)) {
				ele.click();
				break;
			}

		}

		WebElement To_date = driver.findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[2]"));
		To_date.click();
		Thread.sleep(1000);

		String month2 = "February";
		String year2 = "2023";
		String date2 = "18";

		while (true) {
			String mon2 = driver
					.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']"))
					.getText();

			String yr2 = driver
					.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]"))
					.getText();

			if (mon2.equalsIgnoreCase(month2) && yr2.equals(year2))
				break;
			else {
				driver.findElement(By.xpath("//button[@title='Next month']")).click();
			}
		}

		List<WebElement> alldates2 = driver.findElements(By.xpath("//div[@role='grid']//div"));

		for (WebElement ele : alldates2) {
			String dt = ele.getText();
			if (dt.equals(date2)) {
				ele.click();
				break;
			}

		}

		WebElement CheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		CheckBox.click();
		Thread.sleep(1000);

		WebElement Holiday_date = driver.findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[3]"));
		Holiday_date.click();
		Thread.sleep(1000);

		String month3 = "January";
		String year3 = "2023";
		String date3 = "14";

		while (true) {
			String mon3 = driver
					.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']"))
					.getText();

			String yr3 = driver
					.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]"))
					.getText();

			if (mon3.equalsIgnoreCase(month3) && yr3.equals(year3))
				break;
			else {
				driver.findElement(By.xpath("//button[@title='Next month']")).click();
			}
		}

		List<WebElement> alldates3 = driver.findElements(By.xpath("//div[@role='grid']//div"));

		for (WebElement ele : alldates3) {
			String dt = ele.getText();
			if (dt.equals(date3)) {
				ele.click();
				break;
			}

		}

		
		/*
		 * WebElement Open_Clock = driver.findElement(By.
		 * xpath("//body/div[@id='root']/div[@class='baseBlockCntnr']/div[@class='flexCol']/div[@class='resflexColRow innerMainCntnr']/div[@class='flexCol respdngHSM']/div[@class='flexCol respdngVHMD']/div[@class='flexCol respdngMD modeWhite pdngBMD']/div[@class='resColRow alignCntr justifyCntr mrgnBtmLG']/div[1]/div[1]/div[1]/div[1]/div[1]/button[1] "
		 * )); Thread.sleep(1000); js.executeScript("arguments[0].scrollIntoView();",
		 * Open_Clock); Thread.sleep(1000); Open_Clock.click(); Thread.sleep(2000);
		 * String Open_Time = "11";
		 * 
		 * List <WebElement> all_time = driver.findElements(By.
		 * xpath("//div[@aria-label='Select hours. Selected time is 12:58 PM']//span"));
		 * for(WebElement ele:all_time) { String tm = ele.getText();
		 * if(tm.equals(Open_Time)) { ele.click(); break; } }
		 * 
		 * WebElement next_Btn =
		 * driver.findElement(By.xpath("//button[@title='open next view']"));
		 * next_Btn.click(); String close_Time = "25";
		 * 
		 * List <WebElement> all_timee = driver.findElements(By.
		 * xpath("//div[@aria-label='Select minutes. Selected time is 12:00 PM']//span")
		 * ); for(WebElement ele:all_timee) { String tmm = ele.getText();
		 * if(tmm.equals(close_Time)) { ele.click(); break; } }
		 
		  
		  
		  WebElement clock_Clock = driver.findElement(By.
		  xpath("//button[@aria-label='Choose time, selected time is 12:58 PM']"));
		  clock_Clock.click(); Thread.sleep(1000);
		 */

		// Thread.sleep(3000);
		Thread.sleep(1000);
		String exp_Title = "Create Schedules";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Create Schedules']"));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);

	}
	@Test
	public void tc7_radio_Buttons() throws AWTException, InterruptedException, IOException {
		WebElement Enter_email_address = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));

		WebElement Enter_Pass = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));

		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Schedule_meeting = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[10]/a[1]/div[1]/small[1]"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", Schedule_meeting);
		Thread.sleep(1000);
		Schedule_meeting.click();

		WebElement Create = driver.findElement(By.xpath("//button[normalize-space()='Create']"));
		Create.click();
		Thread.sleep(1000);

		WebElement Custom_date = driver.findElement(By.xpath(
				"//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']"));
		Custom_date.click();

		String month = "December";
		String year = "2022";
		String date = "21";

		while (true) {
			String mon = driver
					.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']"))
					.getText();

			String yr = driver
					.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]"))
					.getText();

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else {
				driver.findElement(By.xpath("//button[@title='Next month']")).click();
			}
		}

		List<WebElement> alldates = driver
				.findElements(By.xpath("//div[@class='PrivatePickersSlideTransition-root css-dhopo2']//div"));

		for (WebElement ele : alldates) {
			String dt = ele.getText();
			if (dt.equals(date)) {
				ele.click();
				break;
			}

		}

		WebElement To_date = driver.findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[2]"));
		To_date.click();
		Thread.sleep(1000);

		String month2 = "February";
		String year2 = "2023";
		String date2 = "18";

		while (true) {
			String mon2 = driver
					.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']"))
					.getText();

			String yr2 = driver
					.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]"))
					.getText();

			if (mon2.equalsIgnoreCase(month2) && yr2.equals(year2))
				break;
			else {
				driver.findElement(By.xpath("//button[@title='Next month']")).click();
			}
		}

		List<WebElement> alldates2 = driver.findElements(By.xpath("//div[@role='grid']//div"));

		for (WebElement ele : alldates2) {
			String dt = ele.getText();
			if (dt.equals(date2)) {
				ele.click();
				break;
			}

		}

		WebElement CheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		CheckBox.click();
		Thread.sleep(1000);

		WebElement Holiday_date = driver.findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[3]"));
		Holiday_date.click();
		Thread.sleep(1000);

		String month3 = "January";
		String year3 = "2023";
		String date3 = "14";

		while (true) {
			String mon3 = driver
					.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']"))
					.getText();

			String yr3 = driver
					.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]"))
					.getText();

			if (mon3.equalsIgnoreCase(month3) && yr3.equals(year3))
				break;
			else {
				driver.findElement(By.xpath("//button[@title='Next month']")).click();
			}
		}

		List<WebElement> alldates3 = driver.findElements(By.xpath("//div[@role='grid']//div"));

		for (WebElement ele : alldates3) {
			String dt = ele.getText();
			if (dt.equals(date3)) {
				ele.click();
				break;
			}

		}
		Thread.sleep(3000);
		//Radio Buttons.
		WebElement One_hour = driver.findElement(By.xpath("//input[@value='60']"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();",One_hour); 
		Thread.sleep(1000);
		One_hour.click();
		Thread.sleep(1000);
		
		WebElement One_hour_30 = driver.findElement(By.xpath("//input[@value='60']"));
		One_hour_30.click();
		Thread.sleep(1000);
		
		WebElement Two_hour= driver.findElement(By.xpath("//input[@value='120']"));
		Two_hour.click();
		Thread.sleep(1000);
		
		WebElement halfn_hour = driver.findElement(By.xpath("//input[@value='30']"));
		halfn_hour.click();
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		String exp_Title = "Create Schedules";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Create Schedules']"));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);

	}
	@Test
	public void tc8_create_Schedule() throws AWTException, InterruptedException, IOException {
		WebElement Enter_email_address = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));

		WebElement Enter_Pass = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));

		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Schedule_meeting = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[10]/a[1]/div[1]/small[1]"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", Schedule_meeting);
		Thread.sleep(1000);
		Schedule_meeting.click();

		WebElement Create = driver.findElement(By.xpath("//button[normalize-space()='Create']"));
		Create.click();
		Thread.sleep(1000);

		WebElement Custom_date = driver.findElement(By.xpath(
				"//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']"));
		Custom_date.click();

		String month = "December";
		String year = "2022";
		String date = "21";

		while (true) {
			String mon = driver
					.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']"))
					.getText();

			String yr = driver
					.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]"))
					.getText();

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else {
				driver.findElement(By.xpath("//button[@title='Next month']")).click();
			}
		}

		List<WebElement> alldates = driver
				.findElements(By.xpath("//div[@class='PrivatePickersSlideTransition-root css-dhopo2']//div"));

		for (WebElement ele : alldates) {
			String dt = ele.getText();
			if (dt.equals(date)) {
				ele.click();
				break;
			}

		}

		WebElement To_date = driver.findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[2]"));
		To_date.click();
		Thread.sleep(1000);

		String month2 = "February";
		String year2 = "2023";
		String date2 = "18";

		while (true) {
			String mon2 = driver
					.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']"))
					.getText();

			String yr2 = driver
					.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]"))
					.getText();

			if (mon2.equalsIgnoreCase(month2) && yr2.equals(year2))
				break;
			else {
				driver.findElement(By.xpath("//button[@title='Next month']")).click();
			}
		}

		List<WebElement> alldates2 = driver.findElements(By.xpath("//div[@role='grid']//div"));

		for (WebElement ele : alldates2) {
			String dt = ele.getText();
			if (dt.equals(date2)) {
				ele.click();
				break;
			}

		}

		WebElement CheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		CheckBox.click();
		Thread.sleep(1000);

		WebElement Holiday_date = driver.findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[3]"));
		Holiday_date.click();
		Thread.sleep(1000);

		String month3 = "January";
		String year3 = "2024";
		String date3 = "14";

		while (true) {
			String mon3 = driver
					.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']"))
					.getText();

			String yr3 = driver
					.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]"))
					.getText();

			if (mon3.equalsIgnoreCase(month3) && yr3.equals(year3))
				break;
			else {
				driver.findElement(By.xpath("//button[@title='Next month']")).click();
			}
		}

		List<WebElement> alldates3 = driver.findElements(By.xpath("//div[@role='grid']//div"));

		for (WebElement ele : alldates3) {
			String dt = ele.getText();
			if (dt.equals(date3)) {
				ele.click();
				break;
			}

		}
		Thread.sleep(3000);
		//Radio Buttons.
		WebElement One_hour = driver.findElement(By.xpath("//input[@value='60']"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();",One_hour); 
		Thread.sleep(1000);
		One_hour.click();
		Thread.sleep(1000);
		WebElement halfn_hour = driver.findElement(By.xpath("//input[@value='30']"));
		halfn_hour.click();
		Thread.sleep(2000);
		
//		WebElement CREATE = driver.findElement(By.xpath("//button[normalize-space()='CREATE']"));
//		CREATE.click();
//		Thread.sleep(1000);
//		
//		Thread.sleep(1000);
//		String exp_Title = "Schedule Created between 21/12/2022 and 18/2/2023";
//		WebElement Title = driver.findElement(By.xpath("//div[@class='MuiAccordionSummary-content Mui-expanded MuiAccordionSummary-contentGutters css-17o5nyn']//span[@class='subHeadingSM']"));
//		String actual_Title = Title.getText();
//		Assert.assertEquals(exp_Title, actual_Title);

	}
	@Test
	public void tc9_Delete_Schedule() throws AWTException, InterruptedException, IOException {
		WebElement Enter_email_address = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Schedule_meeting = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[10]/a[1]/div[1]/small[1]"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", Schedule_meeting);
		Thread.sleep(1000);
		Schedule_meeting.click();
		
//		WebElement Delete_Schedule = driver.findElement(By.xpath("//button[normalize-space()='Delete Schedule']"));
//		Thread.sleep(1000);
//		js.executeScript("arguments[0].scrollIntoView();",Delete_Schedule); 
//		Thread.sleep(1000);
//		Delete_Schedule.click();
//		WebElement CANCEL = driver.findElement(By.xpath("//button[normalize-space()='CANCEL']"));
//		CANCEL.isDisplayed();
//		Thread.sleep(1000);
//		WebElement DELETE = driver.findElement(By.xpath("//button[@class='MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-disableElevation MuiButtonBase-root link css-191um2i'][normalize-space()='DELETE']"));
//		DELETE.click();
//		
//		Thread.sleep(2000);
//		String exp_Title = "Create Schedules";
//		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Create Schedules']"));
//		String actual_Title = Title.getText();
//		Assert.assertEquals(exp_Title, actual_Title);
	}

	@Test
	public void tc10_Create_and_delete() throws AWTException, InterruptedException, IOException {
		WebElement Enter_email_address = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));

		WebElement Enter_Pass = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));

		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Schedule_meeting = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[10]/a[1]/div[1]/small[1]"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", Schedule_meeting);
		Thread.sleep(1000);
		Schedule_meeting.click();

		WebElement Create = driver.findElement(By.xpath("//button[normalize-space()='Create']"));
		Create.click();
		Thread.sleep(1000);

		WebElement Custom_date = driver.findElement(By.xpath(
				"//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']"));
		Custom_date.click();

		String month = "December";
		String year = "2022";
		String date = "21";

		while (true) {
			String mon = driver
					.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']"))
					.getText();

			String yr = driver
					.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]"))
					.getText();

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else {
				driver.findElement(By.xpath("//button[@title='Next month']")).click();
			}
		}

		List<WebElement> alldates = driver
				.findElements(By.xpath("//div[@class='PrivatePickersSlideTransition-root css-dhopo2']//div"));

		for (WebElement ele : alldates) {
			String dt = ele.getText();
			if (dt.equals(date)) {
				ele.click();
				break;
			}

		}

		WebElement To_date = driver.findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[2]"));
		To_date.click();
		Thread.sleep(1000);

		String month2 = "February";
		String year2 = "2023";
		String date2 = "18";

		while (true) {
			String mon2 = driver
					.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']"))
					.getText();

			String yr2 = driver
					.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]"))
					.getText();

			if (mon2.equalsIgnoreCase(month2) && yr2.equals(year2))
				break;
			else {
				driver.findElement(By.xpath("//button[@title='Next month']")).click();
			}
		}

		List<WebElement> alldates2 = driver.findElements(By.xpath("//div[@role='grid']//div"));

		for (WebElement ele : alldates2) {
			String dt = ele.getText();
			if (dt.equals(date2)) {
				ele.click();
				break;
			}

		}

		WebElement CheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		CheckBox.click();
		Thread.sleep(1000);

		WebElement Holiday_date = driver.findElement(By.xpath(
				"(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[3]"));
		Holiday_date.click();
		Thread.sleep(1000);

		String month3 = "January";
		String year3 = "2023";
		String date3 = "14";

		while (true) {
			String mon3 = driver
					.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']"))
					.getText();

			String yr3 = driver
					.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]"))
					.getText();

			if (mon3.equalsIgnoreCase(month3) && yr3.equals(year3))
				break;
			else {
				driver.findElement(By.xpath("//button[@title='Next month']")).click();
			}
		}

		List<WebElement> alldates3 = driver.findElements(By.xpath("//div[@role='grid']//div"));

		for (WebElement ele : alldates3) {
			String dt = ele.getText();
			if (dt.equals(date3)) {
				ele.click();
				break;
			}

		}
		Thread.sleep(3000);
		//Radio Buttons.
		WebElement One_hour = driver.findElement(By.xpath("//input[@value='60']"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();",One_hour); 
		Thread.sleep(1000);
		One_hour.click();
		Thread.sleep(1000);
		WebElement halfn_hour = driver.findElement(By.xpath("//input[@value='30']"));
		halfn_hour.click();
		Thread.sleep(2000);
		
//		WebElement CREATE = driver.findElement(By.xpath("//button[normalize-space()='Create']"));
//		CREATE.click();
//		Thread.sleep(1000);
//		
//		WebElement Delete_Schedule = driver.findElement(By.xpath("//button[normalize-space()='Delete Schedule']"));
//		Thread.sleep(1000);
//		js.executeScript("arguments[0].scrollIntoView();",Delete_Schedule); 
//		Thread.sleep(1000);
//		Delete_Schedule.click();
//		WebElement CANCEL = driver.findElement(By.xpath("//button[normalize-space()='CANCEL']"));
//		CANCEL.isDisplayed();
//		
//		WebElement DELETE = driver.findElement(By.xpath("//button[@class='MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-disableElevation MuiButtonBase-root link css-191um2i'][normalize-space()='DELETE']"));
//		DELETE.click();
//
//		Thread.sleep(6000);
//		String exp_Title = "Create Schedules";
//		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Create Schedules']"));
//		String actual_Title = Title.getText();
//		Assert.assertEquals(exp_Title, actual_Title);

	}

}
