package Customer_scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Customer_BaseClass;


public class Cust_Avatar_Profile extends Customer_BaseClass {
	@Test 
	public void tc1_Avatar_My_Profile() throws IOException, InterruptedException{
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
		
		WebElement My_Profile = driver.findElement(By.xpath("//li[contains(text(),'My Profile')]"));
		My_Profile.click();
		Thread.sleep(2000);
		
		String exp_Title = "My Profile";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='My Profile']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test 
	public void tc2_My_Profile_FirstName() throws IOException, InterruptedException{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
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
		
		WebElement My_Profile = driver.findElement(By.xpath("//li[contains(text(),'My Profile')]"));
		My_Profile.click();
		Thread.sleep(2000);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		firstName.sendKeys("Badhri");
		
		WebElement SAVE = driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
		js.executeScript("arguments[0].scrollIntoView();", SAVE);
		Thread.sleep(1000);
		SAVE.click();
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(1000);	
		String exp_Title = "My Profile";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='My Profile']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
	
}
	@Test 
	public void tc3_My_Profile_LastName() throws IOException, InterruptedException{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
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
		
		WebElement My_Profile = driver.findElement(By.xpath("//li[contains(text(),'My Profile')]"));
		My_Profile.click();
		Thread.sleep(2000);
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		lastName.sendKeys("Nath");
		
		
		WebElement SAVE = driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
		js.executeScript("arguments[0].scrollIntoView();", SAVE);
		Thread.sleep(1000);
		SAVE.click();
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(1000);
		String exp_Title = "My Profile";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='My Profile']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
}
	@Test 
	public void tc4_My_Profile_Gender() throws IOException, InterruptedException{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
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
		
		WebElement My_Profile = driver.findElement(By.xpath("//li[contains(text(),'My Profile')]"));
		My_Profile.click();
		Thread.sleep(2000);
		
		Thread.sleep(1000);
		
		WebElement  Male_drp = (driver.findElement(By.xpath("//div[@id='gender']")));
		Male_drp.click();
	
		WebElement  Male = (driver.findElement(By.xpath("//li[normalize-space()='Male']")));
		Male.click();
		
		WebElement SAVE = driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
		js.executeScript("arguments[0].scrollIntoView();", SAVE);
		Thread.sleep(1000);
		SAVE.click();
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(1000);
		String exp_Title = "My Profile";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='My Profile']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
}
	@Test 
	public void tc5_My_Profile_Phone() throws IOException, InterruptedException{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
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
		
		WebElement My_Profile = driver.findElement(By.xpath("//li[contains(text(),'My Profile')]"));
		My_Profile.click();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		
		WebElement Phone = driver.findElement(By.xpath("//input[@id='PhoneNum']"));
		Phone.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		Phone.sendKeys("919705815775");
		
		WebElement SAVE = driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
		js.executeScript("arguments[0].scrollIntoView();", SAVE);
		Thread.sleep(1000);
		SAVE.click();
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(1000);
		String exp_Title = "My Profile";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='My Profile']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
}
	@Test 
	public void tc6_My_Profile_Country() throws IOException, InterruptedException{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
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
		
		WebElement My_Profile = driver.findElement(By.xpath("//li[contains(text(),'My Profile')]"));
		My_Profile.click();
		Thread.sleep(2000);
		
		Thread.sleep(1000);
		
		WebElement  country_drp = (driver.findElement(By.xpath("//div[@id='country']")));
		country_drp.click();
		Thread.sleep(1000);
		WebElement  India = (driver.findElement(By.xpath("//li[normalize-space()='India']")));
		js.executeScript("arguments[0].scrollIntoView();", India);
		Thread.sleep(1000);
		India.click();
		Thread.sleep(1000);
		WebElement  state_drp = (driver.findElement(By.xpath("//div[@id='state']")));
		state_drp.click();
		js.executeScript("arguments[0].scrollIntoView();", state_drp);
		Thread.sleep(1000);
		WebElement  Telangana = (driver.findElement(By.xpath("//li[normalize-space()='Telangana']")));
		Telangana.click();
		js.executeScript("arguments[0].scrollIntoView();", Telangana);
		Thread.sleep(1000);
		
		WebElement  city_drp = (driver.findElement(By.xpath("//div[@id='city']")));
		js.executeScript("arguments[0].scrollIntoView();", city_drp);
		Thread.sleep(1000);
		city_drp.click();
		Thread.sleep(1000);
		WebElement  Hyderabad = (driver.findElement(By.xpath("//li[normalize-space()='Hyderabad']")));
		js.executeScript("arguments[0].scrollIntoView();", Hyderabad);
		Thread.sleep(1000);
		Hyderabad.click();
		
		WebElement SAVE = driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
		js.executeScript("arguments[0].scrollIntoView();", SAVE);
		Thread.sleep(1000);
		SAVE.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(1000);
		String exp_Title = "My Profile";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='My Profile']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
}
	@Test 
	public void tc7_Complete_My_Profile() throws IOException, InterruptedException{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
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
		
		WebElement My_Profile = driver.findElement(By.xpath("//li[contains(text(),'My Profile')]"));
		My_Profile.click();
		Thread.sleep(2000);
		
		Thread.sleep(1000);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		firstName.sendKeys("Badhri");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		lastName.sendKeys("Nath");
		
		WebElement  Male_drp = (driver.findElement(By.xpath("//div[@id='gender']")));
		Male_drp.click();
	
		WebElement  Male = (driver.findElement(By.xpath("//li[normalize-space()='Male']")));
		Male.click();
		
		WebElement Phone = driver.findElement(By.xpath("//input[@id='PhoneNum']"));
		Phone.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		Phone.sendKeys("919705815775");
		
		WebElement  country_drp = (driver.findElement(By.xpath("//div[@id='country']")));
		country_drp.click();
		Thread.sleep(1000);
		WebElement  India = (driver.findElement(By.xpath("//li[normalize-space()='India']")));
		js.executeScript("arguments[0].scrollIntoView();", India);
		Thread.sleep(1000);
		India.click();
		
		WebElement  state_drp = (driver.findElement(By.xpath("//div[@id='state']")));
		state_drp.click();
		Thread.sleep(1000);
		WebElement  Telangana = (driver.findElement(By.xpath("//li[normalize-space()='Telangana']")));
		Telangana.click();
		js.executeScript("arguments[0].scrollIntoView();", Telangana);
		Thread.sleep(1000);
		
		WebElement  city_drp = (driver.findElement(By.xpath("//div[@id='city']")));
		js.executeScript("arguments[0].scrollIntoView();", city_drp);
		Thread.sleep(1000);
		city_drp.click();
		Thread.sleep(1000);
		WebElement  Hyderabad = (driver.findElement(By.xpath("//li[normalize-space()='Hyderabad']")));
		js.executeScript("arguments[0].scrollIntoView();", Hyderabad);
		Thread.sleep(1000);
		Hyderabad.click();
		
		WebElement SAVE = driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
		js.executeScript("arguments[0].scrollIntoView();", SAVE);
		Thread.sleep(1000);
		SAVE.click();
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(1000);
		String exp_Title = "My Profile";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='My Profile']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
}
	@Test 
	public void tc8_Upload_Avatar() throws IOException, InterruptedException, AWTException{
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
		
		WebElement My_Profile = driver.findElement(By.xpath("//li[contains(text(),'My Profile')]"));
		My_Profile.click();
		Thread.sleep(2000);
		
		WebElement Upload_Avatar= driver.findElement(By.xpath("//span[normalize-space()='UPLOAD AVATAR']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",Upload_Avatar);
		
		Thread.sleep(1000);
		Robot r = new Robot();
		StringSelection str = new StringSelection("C:\\Users\\Sohel\\Pictures\\profile\\window view.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		String exp_Title = "My Profile";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='My Profile']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test 
	public void tc9_Delete_Avatar() throws IOException, InterruptedException, AWTException{
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
		
		WebElement My_Profile = driver.findElement(By.xpath("//li[contains(text(),'My Profile')]"));
		My_Profile.click();
		
		Thread.sleep(3000);
		
		WebElement Delete_Avatar= driver.findElement(By.xpath("//div[@class='flexInline PrflDeleteCntr justifyCntr alignCntr pointer']"));
		Delete_Avatar.click();
		
		WebElement Cancel= driver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
		Cancel.isDisplayed();
		Thread.sleep(1000);
		WebElement Delete= driver.findElement(By.xpath("//button[normalize-space()='Delete']"));
		Delete.click();
		Thread.sleep(2000);
		
		String exp_Title = "My Profile";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='My Profile']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test 
	public void tc10_Upload_Avatar() throws IOException, InterruptedException, AWTException{
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
		
		WebElement My_Profile = driver.findElement(By.xpath("//li[contains(text(),'My Profile')]"));
		My_Profile.click();
		Thread.sleep(2000);
		
		WebElement Upload_Avatar= driver.findElement(By.xpath("//span[normalize-space()='UPLOAD AVATAR']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",Upload_Avatar);
		
		Thread.sleep(1000);
		Robot r = new Robot();
		StringSelection str = new StringSelection("C:\\Users\\Sohel\\Pictures\\profile\\Nature.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		String exp_Title = "My Profile";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='My Profile']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
}
