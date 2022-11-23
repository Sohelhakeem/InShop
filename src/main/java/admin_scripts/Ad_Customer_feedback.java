package admin_scripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Admin_BaseClass;

public class Ad_Customer_feedback extends Admin_BaseClass{
	@Test
	public void tc1_Customer_feedback() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement feedback = driver.findElement(By.xpath("//a[@href='/feedback']"));
		feedback.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		
		String exp_Title = "Customer Feedback";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Customer Feedback']" ));
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
	}	
	@Test
	public void tc2_Cust_feedback_Filter() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement feedback = driver.findElement(By.xpath("//a[@href='/feedback']"));
		feedback.click();
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		String exp_Title = "Filter";
		WebElement Title = driver.findElement(By.xpath("(//h2[normalize-space()='Filter'])[1]" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
	}	
	@Test
	public void tc3_Filter_one_star() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement feedback = driver.findElement(By.xpath("//a[@href='/feedback']"));
		feedback.click();
		
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement one_star = driver.findElement(By.xpath("//label[normalize-space()='one star']"));
		one_star.click();
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);

		String exp_Title = "Customer Feedback";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Customer Feedback']" ));
		js.executeScript("window.scrollBy(0,-1850)", "");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}	
	@Test
	public void tc4_Filter_two_star() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement feedback = driver.findElement(By.xpath("//a[@href='/feedback']"));
		feedback.click();
		
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement two_star = driver.findElement(By.xpath("//label[normalize-space()='two star']"));
		two_star.click();
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);

		String exp_Title = "Customer Feedback";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Customer Feedback']" ));
		js.executeScript("window.scrollBy(0,-1850)", "");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
		
	}	
	@Test
	public void tc5_Filter_three_star() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement feedback = driver.findElement(By.xpath("//a[@href='/feedback']"));
		feedback.click();
		
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement three_star = driver.findElement(By.xpath("//label[normalize-space()='three star']"));
		three_star.click();
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);

		String exp_Title = "Customer Feedback";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Customer Feedback']" ));
		js.executeScript("window.scrollBy(0,-1850)", "");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
		
	}	
	@Test
	public void tc6_Filter_four_star() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement feedback = driver.findElement(By.xpath("//a[@href='/feedback']"));
		feedback.click();
		
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement four_star = driver.findElement(By.xpath("//label[normalize-space()='four star']"));
		four_star.click();
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);

		String exp_Title = "Customer Feedback";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Customer Feedback']" ));
		js.executeScript("window.scrollBy(0,-1850)", "");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
			
	}	
	@Test
	public void tc7_Filter_all() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement feedback = driver.findElement(By.xpath("//a[@href='/feedback']"));
		feedback.click();
		
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement all = driver.findElement(By.xpath("//label[normalize-space()='All']"));
		all.click();
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);

		String exp_Title = "Customer Feedback";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Customer Feedback']" ));
		js.executeScript("window.scrollBy(0,-1850)", "");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
		
	}	
	@Test
	public void tc8_Filter_five_star() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement feedback = driver.findElement(By.xpath("//a[@href='/feedback']"));
		feedback.click();
		
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement five_star = driver.findElement(By.xpath("//label[normalize-space()='five star']"));
		five_star.click();
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);

		String exp_Title = "Customer Feedback";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Customer Feedback']" ));
		js.executeScript("window.scrollBy(0,-1850)", "");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
		
	}
	
	@Test
	public void tc9_Filter_cancel() throws IOException, InterruptedException {
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
		WebElement feedback = driver.findElement(By.xpath("//a[@href='/feedback']"));
		feedback.click();
		
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement five_star = driver.findElement(By.xpath("//label[normalize-space()='five star']"));
		five_star.click();
		
		WebElement Cancel = driver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
		Cancel.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);

		String exp_Title = "Customer Feedback";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Customer Feedback']" ));
		js.executeScript("window.scrollBy(0,-1850)", "");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}	
	//for finding records.
		@Test
		public void tc10_Filter_CustomDate_CurrentDate() throws IOException, InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
			Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
			
			WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
			Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
			
			WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
			LOGIN.click();
			Thread.sleep(2000);
			
			WebElement feedback = driver.findElement(By.xpath("//a[@href='/feedback']"));
			feedback.click();
			
			WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
			Filter.click();
			Thread.sleep(1000);
			
			WebElement Custom_date = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']"));
			Custom_date.click();
			
			String month = "July"	;
			String year= "2021";
			String date= "8";
			
			while(true) {
				String mon = driver.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']")).getText();
				
				String yr = driver.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]")).getText();
				
				
				if(mon.equalsIgnoreCase(month)&&yr.equals(year))
						break;
				else {
					driver.findElement(By.xpath( "//button[@title='Previous month']")).click();
				}
			}
			
			List<WebElement> alldates = driver.findElements(By.xpath("//div[contains(@class,'PrivatePickersSlideTransition-root css-dhopo2')]//div"));
			
			for(WebElement ele:alldates) {
				String dt = ele.getText();
				if(dt.equals(date)) {
					ele.click();
					break;
				}
				
					}
			
			WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
			Apply.click();
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(1000);
			String exp_Title = "Customer Feedback";
			WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Customer Feedback']" ));
			js.executeScript("window.scrollBy(0,-1850)", "");
			Thread.sleep(1000);
			String actual_Title = Title.getText();
			Assert.assertEquals(exp_Title, actual_Title);
			
			
		}	
	
	@Test
	public void tc11_Custom_ToDate() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement feedback = driver.findElement(By.xpath("//a[@href='/feedback']"));
		feedback.click();
		
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		
		WebElement Custom_date = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']"));
		Custom_date.click();
		
		String month = "July"	;
		String year= "2021";
		String date= "8";
		
		while(true) {
			String mon = driver.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']")).getText();
			
			String yr = driver.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]")).getText();
			
			
			if(mon.equalsIgnoreCase(month)&&yr.equals(year))
					break;
			else {
				driver.findElement(By.xpath( "//button[@title='Previous month']")).click();
			}
		}
		
		List<WebElement> alldates = driver.findElements(By.xpath("//div[contains(@class,'PrivatePickersSlideTransition-root css-dhopo2')]//div"));
		
		for(WebElement ele:alldates) {
			String dt = ele.getText();
			if(dt.equals(date)) {
				ele.click();
				break;
			}
			
				}
		
driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[2]")).click();		
Thread.sleep(1000);
String months = "August"	;
String years= "2022";
String dates= "8";

while(true) {
	String mons = driver.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']")).getText();
	
	String yrs = driver.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]")).getText();
	
	
	if(mons.equalsIgnoreCase(months)&&yrs.equals(years))
			break;
	else {
		driver.findElement(By.xpath( "//button[contains(@title,'Previous month')]")).click();
	}
}

List<WebElement> alldatess = driver.findElements(By.xpath("//div[@class='PrivatePickersSlideTransition-root css-dhopo2']//div"));

for(WebElement ele:alldatess) {
	String dts = ele.getText();
	if(dts.equals(dates)) {
		ele.click();
		break;
	}
	
		}

		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		String exp_Title = "Customer Feedback";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Customer Feedback']" ));
		js.executeScript("window.scrollBy(0,-1850)", "");
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
		
	}	

}
