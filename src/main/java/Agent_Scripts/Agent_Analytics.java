package Agent_Scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Agent_BaseClass;

public class Agent_Analytics extends Agent_BaseClass {
	@Test
	public void tc1_Analytics() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Agent_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Agent_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement Analytics = driver.findElement(By.xpath("//body/div[@id='root']/div[@class='baseBlockCntnr']/div[@class='flexCol']/div[@class='resflexColRow innerMainCntnr']/div[@class='flexCol navBar alignCntr brdrBSM mobNavTransition']/ul[@class='navBarGroup pdngVSM']/li[4]/div[1]"));
		Analytics.click();
		
		String exp_Title = "Analytics";
		WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Analytics']"));
		String act_Title = title.getText();
		Assert.assertEquals(exp_Title, act_Title);
		
	}
	@Test
	public void tc2_Schedule_Video_Calls() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Agent_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Agent_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement Analytics = driver.findElement(By.xpath("//body/div[@id='root']/div[@class='baseBlockCntnr']/div[@class='flexCol']/div[@class='resflexColRow innerMainCntnr']/div[@class='flexCol navBar alignCntr brdrBSM mobNavTransition']/ul[@class='navBarGroup pdngVSM']/li[4]/div[1]"));
		Analytics.click();
		
		WebElement Schedule_Video_calls = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]"));
		Schedule_Video_calls.click();
		Thread.sleep(1000);
		String exp_Title = "schedule";
		WebElement title = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]"));
		String act_Title = title.getText();
		Assert.assertEquals(exp_Title, act_Title);
		
	}
	@Test
	public void tc3_Incoming_Video_calls() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Agent_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Agent_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement Analytics = driver.findElement(By.xpath("//body/div[@id='root']/div[@class='baseBlockCntnr']/div[@class='flexCol']/div[@class='resflexColRow innerMainCntnr']/div[@class='flexCol navBar alignCntr brdrBSM mobNavTransition']/ul[@class='navBarGroup pdngVSM']/li[4]/div[1]"));
		Analytics.click();
		
		WebElement Incoming_Video_calls = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/button[1]"));
		Incoming_Video_calls.click();
		Thread.sleep(1000);
		String exp_Title = "incoming";
		WebElement title = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]"));
		String act_Title = title.getText();
		Assert.assertEquals(exp_Title, act_Title);
		
	}
	@Test
	public void tc4_Rejected_calls() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Agent_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Agent_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement Analytics = driver.findElement(By.xpath("//body/div[@id='root']/div[@class='baseBlockCntnr']/div[@class='flexCol']/div[@class='resflexColRow innerMainCntnr']/div[@class='flexCol navBar alignCntr brdrBSM mobNavTransition']/ul[@class='navBarGroup pdngVSM']/li[4]/div[1]"));
		Analytics.click();
		
		WebElement Rejected_calls = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/button[1]"));
		Rejected_calls.click();
		Thread.sleep(1000);
		
		String exp_Title = "rejected";
		WebElement title = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/span[1]"));
		String act_Title = title.getText();
		Assert.assertEquals(exp_Title, act_Title);
		
	}
	@Test
	public void tc5_Feedbacks() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Agent_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Agent_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement Analytics = driver.findElement(By.xpath("//body/div[@id='root']/div[@class='baseBlockCntnr']/div[@class='flexCol']/div[@class='resflexColRow innerMainCntnr']/div[@class='flexCol navBar alignCntr brdrBSM mobNavTransition']/ul[@class='navBarGroup pdngVSM']/li[4]/div[1]"));
		Analytics.click();
		Thread.sleep(1000);
		WebElement Feedbacks = driver.findElement(By.xpath("//span[normalize-space()='Feedbacks']"));
		Feedbacks.isDisplayed();
		
		String exp_Title = "Analytics";
		WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Analytics']"));
		String act_Title = title.getText();
		Assert.assertEquals(exp_Title, act_Title);
	}
	@Test
	public void tc6_Analytics_Filter() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Agent_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Agent_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement Analytics = driver.findElement(By.xpath("//body/div[@id='root']/div[@class='baseBlockCntnr']/div[@class='flexCol']/div[@class='resflexColRow innerMainCntnr']/div[@class='flexCol navBar alignCntr brdrBSM mobNavTransition']/ul[@class='navBarGroup pdngVSM']/li[4]/div[1]"));
		Analytics.click();
		Thread.sleep(1000);
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		
		String exp_Title = "Filter";
		WebElement Title = driver.findElement(By.xpath("(//h2[normalize-space()='Filter'])[1]" ));
		Thread.sleep(1000);
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		}
	@Test
	public void tc7_Filter_Daily() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Agent_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Agent_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement Analytics = driver.findElement(By.xpath("//body/div[@id='root']/div[@class='baseBlockCntnr']/div[@class='flexCol']/div[@class='resflexColRow innerMainCntnr']/div[@class='flexCol navBar alignCntr brdrBSM mobNavTransition']/ul[@class='navBarGroup pdngVSM']/li[4]/div[1]"));
		Analytics.click();
		Thread.sleep(1000);
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement Daily = driver.findElement(By.xpath("//label[normalize-space()='Daily']"));
		Daily.click();
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0, 350)","");
		Thread.sleep(1000);
		
		String exp_Title = "Analytics";
		WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Analytics']"));
		String act_Title = title.getText();
		Assert.assertEquals(exp_Title, act_Title);
		
	}
	@Test
	public void tc8_Filter_Weekly() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Agent_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Agent_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement Analytics = driver.findElement(By.xpath("//body/div[@id='root']/div[@class='baseBlockCntnr']/div[@class='flexCol']/div[@class='resflexColRow innerMainCntnr']/div[@class='flexCol navBar alignCntr brdrBSM mobNavTransition']/ul[@class='navBarGroup pdngVSM']/li[4]/div[1]"));
		Analytics.click();
		Thread.sleep(1000);
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement Weekly = driver.findElement(By.xpath("//label[normalize-space()='Weekly']"));
		Weekly.click();
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0, 350)","");
		Thread.sleep(1000);
		
		String exp_Title = "Analytics";
		WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Analytics']"));
		String act_Title = title.getText();
		Assert.assertEquals(exp_Title, act_Title);
		
	}
	@Test
	public void tc9_Filter_Monthly() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Agent_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Agent_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement Analytics = driver.findElement(By.xpath("//body/div[@id='root']/div[@class='baseBlockCntnr']/div[@class='flexCol']/div[@class='resflexColRow innerMainCntnr']/div[@class='flexCol navBar alignCntr brdrBSM mobNavTransition']/ul[@class='navBarGroup pdngVSM']/li[4]/div[1]"));
		Analytics.click();
		Thread.sleep(1000);
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement Monthly = driver.findElement(By.xpath("//label[normalize-space()='Monthly']"));
		Monthly.click();
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0, 350)","");
		Thread.sleep(1000);
		String exp_Title = "Analytics";
		WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Analytics']"));
		String act_Title = title.getText();
		Assert.assertEquals(exp_Title, act_Title);
		
	}
	@Test
	public void tc10_Filter_Yearly() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Agent_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Agent_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement Analytics = driver.findElement(By.xpath("//body/div[@id='root']/div[@class='baseBlockCntnr']/div[@class='flexCol']/div[@class='resflexColRow innerMainCntnr']/div[@class='flexCol navBar alignCntr brdrBSM mobNavTransition']/ul[@class='navBarGroup pdngVSM']/li[4]/div[1]"));
		Analytics.click();
		Thread.sleep(1000);
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement Yearly = driver.findElement(By.xpath("//label[normalize-space()='Yearly']"));
		Yearly.click();
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0, 350)","");
		Thread.sleep(1000);
		
		String exp_Title = "Analytics";
		WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Analytics']"));
		String act_Title = title.getText();
		Assert.assertEquals(exp_Title, act_Title);
		
	}
	@Test
	public void tc11_Filter_Cancel() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Agent_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Agent_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement Analytics = driver.findElement(By.xpath("//body/div[@id='root']/div[@class='baseBlockCntnr']/div[@class='flexCol']/div[@class='resflexColRow innerMainCntnr']/div[@class='flexCol navBar alignCntr brdrBSM mobNavTransition']/ul[@class='navBarGroup pdngVSM']/li[4]/div[1]"));
		Analytics.click();
		Thread.sleep(1000);
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement Yearly = driver.findElement(By.xpath("//label[normalize-space()='Yearly']"));
		Yearly.click();
		
		WebElement Cancel = driver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
		Cancel.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0, 350)","");
		Thread.sleep(1000);
		
		String exp_Title = "Analytics";
		WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Analytics']"));
		String act_Title = title.getText();
		Assert.assertEquals(exp_Title, act_Title);
		
	}
	@Test
	public void tc12_Filter_custom() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Agent_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Agent_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(2000);
		
		WebElement Analytics = driver.findElement(By.xpath("//body/div[@id='root']/div[@class='baseBlockCntnr']/div[@class='flexCol']/div[@class='resflexColRow innerMainCntnr']/div[@class='flexCol navBar alignCntr brdrBSM mobNavTransition']/ul[@class='navBarGroup pdngVSM']/li[4]/div[1]"));
		Analytics.click();
		Thread.sleep(1000);
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		WebElement custom = driver.findElement(By.xpath("//label[normalize-space()='Custom']"));
		custom.click();
		
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0, 350)","");
		Thread.sleep(1000);
		
		String exp_Title = "Analytics";
		WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Analytics']"));
		String act_Title = title.getText();
		Assert.assertEquals(exp_Title, act_Title);
		
	}
}
