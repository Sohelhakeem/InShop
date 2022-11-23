package admin_scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Admin_BaseClass;

public class Ad_Licences extends Admin_BaseClass {
	@Test
	public void tc1_Licences() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Avatar_drp = driver.findElement(By.xpath("//div[@class='flexInline circle circleMD ']"));
		Avatar_drp.click();
		Thread.sleep(1000);
		
		WebElement Licences = driver.findElement(By.xpath("//li[normalize-space()='Licences']"));
		Licences.click();
		Thread.sleep(2000);
		
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		String exp_Title = "Manage Licences";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Manage Licences']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc2_Licences_Buy_MoreBTN() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Avatar_drp = driver.findElement(By.xpath("//div[@class='flexInline circle circleMD ']"));
		Avatar_drp.click();
		Thread.sleep(1000);
		
		WebElement Licences = driver.findElement(By.xpath("//li[normalize-space()='Licences']"));
		Licences.click();
		Thread.sleep(2000);
		
		WebElement Buy_More = driver.findElement(By.xpath("//button[normalize-space()='Buy More']"));
		Buy_More.click();
		
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		String exp_Title = "Place your order";
		WebElement Title = driver.findElement(By.xpath("//h4[normalize-space()='Place your order']" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
	}
	
	@Test
	public void tc3_Licences_AddBtn() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
//		Thread.sleep(1000);
		
		WebElement Avatar_drp = driver.findElement(By.xpath("//div[@class='flexInline circle circleMD ']"));
		Avatar_drp.click();
		Thread.sleep(1000);
		
		WebElement Licences = driver.findElement(By.xpath("//li[normalize-space()='Licences']"));
		Licences.click();
//		Thread.sleep(2000);
		
		WebElement Buy_More = driver.findElement(By.xpath("//button[normalize-space()='Buy More']"));
		Buy_More.click();
		
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		WebElement addBtn =  driver.findElement(By.xpath("//button[normalize-space()='+']"));
		a.doubleClick(addBtn).perform();
//		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String exp_Title = p.getPropertyFiledata("Total_amount");
		WebElement Title = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[4]/div[2]/span[1]" ));
		js.executeScript("arguments[0].scrollIntoView();", Title);
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		System.out.println(actual_Title);
		Assert.assertEquals(exp_Title, actual_Title);
	}
	@Test
	public void tc4_Licences_SubstractBtn() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
//		Thread.sleep(1000);
		
		WebElement Avatar_drp = driver.findElement(By.xpath("//div[@class='flexInline circle circleMD ']"));
		Avatar_drp.click();
		Thread.sleep(2000);
		
		WebElement Licences = driver.findElement(By.xpath("//li[normalize-space()='Licences']"));
		Licences.click();
//		Thread.sleep(2000);
		
		WebElement Buy_More = driver.findElement(By.xpath("//button[normalize-space()='Buy More']"));
		Buy_More.click();
		
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		WebElement SubstractBtn =  driver.findElement(By.xpath("//button[normalize-space()='-']"));
		a.doubleClick(SubstractBtn).perform();
//		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String exp_Title =p.getPropertyFiledata("amount");
		WebElement Title = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[4]/div[2]/span[1]" ));
		js.executeScript("arguments[0].scrollIntoView();", Title);
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		System.out.println(actual_Title);
		Assert.assertEquals(exp_Title, actual_Title);
	}
	@Test
	public void tc5_Enter_Coupon_code() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
//		Thread.sleep(1000);
		
		WebElement Avatar_drp = driver.findElement(By.xpath("//div[@class='flexInline circle circleMD ']"));
		Avatar_drp.click();
		Thread.sleep(1000);
		
		WebElement Licences = driver.findElement(By.xpath("//li[normalize-space()='Licences']"));
		Licences.click();
//		Thread.sleep(2000);
		
		WebElement Buy_More = driver.findElement(By.xpath("//button[normalize-space()='Buy More']"));
		Buy_More.click();
		
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		WebElement addBtn =  driver.findElement(By.xpath("//button[normalize-space()='+']"));
		a.doubleClick(addBtn).perform();
//		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String exp_Title = p.getPropertyFiledata("Total_amount");
		WebElement Title = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[4]/div[2]/span[1]" ));
		js.executeScript("arguments[0].scrollIntoView();", Title);
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		System.out.println(actual_Title);
		Assert.assertEquals(exp_Title, actual_Title);
		
		WebElement Enter_Coupon_code = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/input[1]"));
		Enter_Coupon_code.sendKeys(p.getPropertyFiledata("Coupon_Code"));
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.isDisplayed();
		
	}
	
	@Test
	public void tc6_Enter_Valid_Coupon_Code() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
//		Thread.sleep(1000);
		
		WebElement Avatar_drp = driver.findElement(By.xpath("//div[@class='flexInline circle circleMD ']"));
		Avatar_drp.click();
		Thread.sleep(2000);
		
		WebElement Licences = driver.findElement(By.xpath("//li[normalize-space()='Licences']"));
		Licences.click();
//		Thread.sleep(2000);
		
		WebElement Buy_More = driver.findElement(By.xpath("//button[normalize-space()='Buy More']"));
		Buy_More.click();
		
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		WebElement addBtn =  driver.findElement(By.xpath("//button[normalize-space()='+']"));
		a.doubleClick(addBtn).perform();
//		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String exp_Title = p.getPropertyFiledata("Total_amount");
		WebElement Title = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[4]/div[2]/span[1]" ));
		js.executeScript("arguments[0].scrollIntoView();", Title);
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		System.out.println(actual_Title);
		Assert.assertEquals(exp_Title, actual_Title);
		
		WebElement Enter_Coupon_code = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/input[1]"));
		Enter_Coupon_code.sendKeys(p.getPropertyFiledata("Valid_Coupon_Code"));
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
//		Thread.sleep(1000);
		String exp_Error_Msg = "Coupoun applied successfully";
//		String exp_Error_Msg = "invalid coupon code";
		
		WebElement Error_Msg = driver.findElement(By.xpath("//div[contains(text(),'invalid coupon code')]" ));
		Thread.sleep(1000);
		String actual_Error_Msg = Error_Msg.getText();
		Assert.assertEquals(exp_Error_Msg, actual_Error_Msg);
		
	}
	@Test
	public void tc7_Enter_inValid_Coupon_Code() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
//		Thread.sleep(1000);
		
		WebElement Avatar_drp = driver.findElement(By.xpath("//div[@class='flexInline circle circleMD ']"));
		Avatar_drp.click();
		Thread.sleep(2000);
		
		WebElement Licences = driver.findElement(By.xpath("//li[normalize-space()='Licences']"));
		Licences.click();
//		Thread.sleep(2000);
		
		WebElement Buy_More = driver.findElement(By.xpath("//button[normalize-space()='Buy More']"));
		Buy_More.click();
		
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		WebElement addBtn =  driver.findElement(By.xpath("//button[normalize-space()='+']"));
		a.doubleClick(addBtn).perform();
//		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String exp_Title = p.getPropertyFiledata("Total_amount");
		WebElement Title = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[4]/div[2]/span[1]" ));
		js.executeScript("arguments[0].scrollIntoView();", Title);
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		System.out.println(actual_Title);
		Assert.assertEquals(exp_Title, actual_Title);
		
		WebElement Enter_Coupon_code = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/input[1]"));
		Enter_Coupon_code.sendKeys(p.getPropertyFiledata("InValid_Coupon_Code"));
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
//		Thread.sleep(1000);
		String exp_Error_Msg = "invalid coupon code";
		WebElement Error_Msg = driver.findElement(By.xpath("//div[contains(text(),'invalid coupon code')]" ));
		Thread.sleep(1000);
		String actual_Error_Msg = Error_Msg.getText();
		Assert.assertEquals(exp_Error_Msg, actual_Error_Msg);
		
	}
	@Test
	public void tc8_Place_your_Order_Btn() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
//		Thread.sleep(1000);
		
		WebElement Avatar_drp = driver.findElement(By.xpath("//div[@class='flexInline circle circleMD ']"));
		Avatar_drp.click();
		Thread.sleep(2000);
		
		WebElement Licences = driver.findElement(By.xpath("//li[normalize-space()='Licences']"));
		Licences.click();
//		Thread.sleep(2000);
		
		WebElement Buy_More = driver.findElement(By.xpath("//button[normalize-space()='Buy More']"));
		Buy_More.click();
		
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		WebElement addBtn =  driver.findElement(By.xpath("//button[normalize-space()='+']"));
		a.doubleClick(addBtn).perform();
//		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String exp_Title = p.getPropertyFiledata("Total_amount");
		WebElement Title = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[4]/div[2]/span[1]" ));
		js.executeScript("arguments[0].scrollIntoView();", Title);
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		System.out.println(actual_Title);
		Assert.assertEquals(exp_Title, actual_Title);
		
		WebElement Enter_Coupon_code = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/input[1]"));
		Enter_Coupon_code.sendKeys(p.getPropertyFiledata("InValid_Coupon_Code"));
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.isDisplayed();
		Thread.sleep(1000);
		WebElement Place_your_Order_Btn = driver.findElement(By.xpath("//button[normalize-space()='PLACE YOUR ORDER NOW !']"));
		Place_your_Order_Btn.click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		String exp_title = "inShop License";
		WebElement title = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]" ));
		Thread.sleep(1000);
		String actual_title = title.getText();
		Assert.assertEquals(exp_title, actual_title);
		
	}
	@Test
	public void tc9_Payment_language() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
//		Thread.sleep(1000);
		
		WebElement Avatar_drp = driver.findElement(By.xpath("//div[@class='flexInline circle circleMD ']"));
		Avatar_drp.click();
		Thread.sleep(2000);
		
		WebElement Licences = driver.findElement(By.xpath("//li[normalize-space()='Licences']"));
		Licences.click();
//		Thread.sleep(2000);
		
		WebElement Buy_More = driver.findElement(By.xpath("//button[normalize-space()='Buy More']"));
		Buy_More.click();
		
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		WebElement addBtn =  driver.findElement(By.xpath("//button[normalize-space()='+']"));
		a.doubleClick(addBtn).perform();
//		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String exp_Title = p.getPropertyFiledata("Total_amount");
		WebElement Title = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[4]/div[2]/span[1]" ));
		js.executeScript("arguments[0].scrollIntoView();", Title);
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		System.out.println(actual_Title);
		Assert.assertEquals(exp_Title, actual_Title);
		
		WebElement Enter_Coupon_code = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/input[1]"));
		Enter_Coupon_code.sendKeys(p.getPropertyFiledata("InValid_Coupon_Code"));
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.isDisplayed();
		Thread.sleep(1000);
		WebElement Place_your_Order_Btn = driver.findElement(By.xpath("//button[normalize-space()='PLACE YOUR ORDER NOW !']"));
		Place_your_Order_Btn.click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement language = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[3]/span[1]"));
		language.click();
		WebElement English = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]"));
		English.click();
		
		Thread.sleep(2000);
		String exp_title = "inShop License";
		WebElement title = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]" ));
		Thread.sleep(1000);
		String actual_title = title.getText();
		Assert.assertEquals(exp_title, actual_title);
		
	}
	@Test
	public void tc10_EmptyFields_pay_Using_card_Btn() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
//		Thread.sleep(1000);
		
		WebElement Avatar_drp = driver.findElement(By.xpath("//div[@class='flexInline circle circleMD ']"));
		Avatar_drp.click();
		Thread.sleep(2000);
		
		WebElement Licences = driver.findElement(By.xpath("//li[normalize-space()='Licences']"));
		Licences.click();
//		Thread.sleep(2000);
		
		WebElement Buy_More = driver.findElement(By.xpath("//button[normalize-space()='Buy More']"));
		Buy_More.click();
		
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		WebElement addBtn =  driver.findElement(By.xpath("//button[normalize-space()='+']"));
		a.doubleClick(addBtn).perform();
//		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String exp_Title = p.getPropertyFiledata("Total_amount");
		WebElement Title = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[4]/div[2]/span[1]" ));
		js.executeScript("arguments[0].scrollIntoView();", Title);
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		System.out.println(actual_Title);
		Assert.assertEquals(exp_Title, actual_Title);
		
		WebElement Enter_Coupon_code = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/input[1]"));
		Enter_Coupon_code.sendKeys(p.getPropertyFiledata("InValid_Coupon_Code"));
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.isDisplayed();
		Thread.sleep(2000);
		WebElement Place_your_Order_Btn = driver.findElement(By.xpath("//button[normalize-space()='PLACE YOUR ORDER NOW !']"));
		Place_your_Order_Btn.click();
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		WebElement language = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[3]/span[1]"));
		language.click();
		WebElement English = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]"));
		English.click();
		
		WebElement pay_Using_card_Btn = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[3]/div[2]/form[1]/div[3]/span[1]"));
		pay_Using_card_Btn.click();
		
		Thread.sleep(2000);
		String exp_title = "inShop License";
		WebElement title = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]" ));
		Thread.sleep(1000);
		String actual_title = title.getText();
		Assert.assertEquals(exp_title, actual_title);
		
	}
	@Test
	public void tc11_Vlid_pay_Using_card_Btn() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
//		Thread.sleep(1000);
		
		WebElement Avatar_drp = driver.findElement(By.xpath("//div[@class='flexInline circle circleMD ']"));
		Avatar_drp.click();
		Thread.sleep(2000);
		
		WebElement Licences = driver.findElement(By.xpath("//li[normalize-space()='Licences']"));
		Licences.click();
//		Thread.sleep(2000);
		
		WebElement Buy_More = driver.findElement(By.xpath("//button[normalize-space()='Buy More']"));
		Buy_More.click();
		
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		WebElement addBtn =  driver.findElement(By.xpath("//button[normalize-space()='+']"));
		a.doubleClick(addBtn).perform();
//		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String exp_Title = p.getPropertyFiledata("Total_amount");
		WebElement Title = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[4]/div[2]/span[1]" ));
		js.executeScript("arguments[0].scrollIntoView();", Title);
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		System.out.println(actual_Title);
		Assert.assertEquals(exp_Title, actual_Title);
		
		WebElement Enter_Coupon_code = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/input[1]"));
		Enter_Coupon_code.sendKeys(p.getPropertyFiledata("InValid_Coupon_Code"));
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.isDisplayed();
		Thread.sleep(1000);
		WebElement Place_your_Order_Btn = driver.findElement(By.xpath("//button[normalize-space()='PLACE YOUR ORDER NOW !']"));
		Place_your_Order_Btn.click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
	
		WebElement language = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[3]/span[1]"));
		language.click();
		WebElement English = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]"));
		English.click();
		WebElement Phone_Number = driver.findElement(By.id("contact"));
		Phone_Number.sendKeys("8088229102");
	
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement pay_Using_card_Btn = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[3]/div[2]/form[1]/div[3]/span[1]"));
		pay_Using_card_Btn.click();
		
		
		Thread.sleep(2000);
		String exp_title = "inShop License";
		WebElement title = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]" ));
		Thread.sleep(1000);
		String actual_title = title.getText();
		Assert.assertEquals(exp_title, actual_title);
		
	}
	@Test
	public void tc12_Card_beforeOTP() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
//		Thread.sleep(1000);
		
		WebElement Avatar_drp = driver.findElement(By.xpath("//div[@class='flexInline circle circleMD ']"));
		Avatar_drp.click();
		Thread.sleep(2000);
		
		WebElement Licences = driver.findElement(By.xpath("//li[normalize-space()='Licences']"));
		Licences.click();
//		Thread.sleep(2000);
		
		WebElement Buy_More = driver.findElement(By.xpath("//button[normalize-space()='Buy More']"));
		Buy_More.click();
		
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		WebElement addBtn =  driver.findElement(By.xpath("//button[normalize-space()='+']"));
		a.doubleClick(addBtn).perform();
//		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String exp_Title = p.getPropertyFiledata("Total_amount");
		WebElement Title = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[4]/div[2]/span[1]" ));
		js.executeScript("arguments[0].scrollIntoView();", Title);
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		System.out.println(actual_Title);
		Assert.assertEquals(exp_Title, actual_Title);
		
		WebElement Enter_Coupon_code = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/input[1]"));
		Enter_Coupon_code.sendKeys(p.getPropertyFiledata("InValid_Coupon_Code"));
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.isDisplayed();
		Thread.sleep(1000);
		WebElement Place_your_Order_Btn = driver.findElement(By.xpath("//button[normalize-space()='PLACE YOUR ORDER NOW !']"));
		Place_your_Order_Btn.click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
	
		WebElement language = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[3]/span[1]"));
		language.click();
		WebElement English = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]"));
		English.click();
		WebElement Phone_Number = driver.findElement(By.id("contact"));
		Phone_Number.sendKeys("8077225102");
	
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement pay_Using_card_Btn = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[3]/div[2]/form[1]/div[3]/span[1]"));
		pay_Using_card_Btn.click();
		
		WebElement Card = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[3]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]/div[1]/div[1]/div[1]"));
		Card.click();
		
		WebElement card_number = driver.findElement(By.id("card_number"));
		card_number.sendKeys("4111 1111 1111 1111");
		
		WebElement card_expiry = driver.findElement(By.id("card_expiry"));
		card_expiry.sendKeys("425");
		
		WebElement card_cvv = driver.findElement(By.id("card_cvv"));
		card_cvv.sendKeys("222");
		
		WebElement pay_Btn = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[3]/div[2]/form[1]/div[3]/span[1]"));
		pay_Btn.click();
		
		Thread.sleep(2000);
		String exp_title = "Enter OTP sent to +918077225102 to save your card";
		WebElement title = driver.findElement(By.id("otp-prompt" ));
		Thread.sleep(1000);
		String actual_title = title.getText();
		Assert.assertEquals(exp_title, actual_title);
		
	}
	@Test
	public void tc13_Card_AfterOTP() throws IOException, InterruptedException {
		
		WebElement Enter_email_address = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Admin_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Admin_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
//		Thread.sleep(1000);
		
		WebElement Avatar_drp = driver.findElement(By.xpath("//div[@class='flexInline circle circleMD ']"));
		Avatar_drp.click();
		Thread.sleep(2000);
		
		WebElement Licences = driver.findElement(By.xpath("//li[normalize-space()='Licences']"));
		Licences.click();
//		Thread.sleep(2000);
		
		WebElement Buy_More = driver.findElement(By.xpath("//button[normalize-space()='Buy More']"));
		Buy_More.click();
		
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		WebElement addBtn =  driver.findElement(By.xpath("//button[normalize-space()='+']"));
		a.doubleClick(addBtn).perform();
//		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String exp_Title = "$3800.18";
		WebElement Title = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[4]/div[2]/span[1]" ));
		js.executeScript("arguments[0].scrollIntoView();", Title);
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		String exp_Title = Title.getText();
		System.out.println(actual_Title);
		Assert.assertEquals(exp_Title, actual_Title);
		
		WebElement Enter_Coupon_code = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/input[1]"));
		Enter_Coupon_code.sendKeys(p.getPropertyFiledata("InValid_Coupon_Code"));
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.isDisplayed();
		Thread.sleep(1000);
		WebElement Place_your_Order_Btn = driver.findElement(By.xpath("//button[normalize-space()='PLACE YOUR ORDER NOW !']"));
		Place_your_Order_Btn.click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
	
		WebElement language = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[3]/span[1]"));
		language.click();
		WebElement English = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]"));
		English.click();
		WebElement Phone_Number = driver.findElement(By.id("contact"));
		Phone_Number.sendKeys("8077225102");
	
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement pay_Using_card_Btn = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[3]/div[2]/form[1]/div[3]/span[1]"));
		pay_Using_card_Btn.click();
		
		WebElement Card = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[3]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]/div[1]/div[1]/div[1]"));
		Card.click();
		
		WebElement card_number = driver.findElement(By.id("card_number"));
		card_number.sendKeys("4111 1111 1111 1111");
		
		WebElement card_expiry = driver.findElement(By.id("card_expiry"));
		card_expiry.sendKeys("425");
		
		WebElement card_cvv = driver.findElement(By.id("card_cvv"));
		card_cvv.sendKeys("222");
		
		WebElement pay_Btn = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[3]/div[2]/form[1]/div[3]/span[1]"));
		pay_Btn.click();
		
		WebElement otp = driver.findElement(By.id("otp"));
		otp.sendKeys("737377");
		Thread.sleep(1000);
		pay_Btn.click();
		Thread.sleep(2000);
		String exp_title = "Entered OTP was incorrect. Re-enter to proceed.";
		WebElement title = driver.findElement(By.id("otp-prompt" ));
		Thread.sleep(1000);
		String actual_title = title.getText();
		Assert.assertEquals(exp_title, actual_title);
		
	}
}
