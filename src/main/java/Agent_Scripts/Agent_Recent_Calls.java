package Agent_Scripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Agent_BaseClass;

public class Agent_Recent_Calls extends Agent_BaseClass {
	@Test
	public void tc1_Recent_Calls_BTN() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Agent_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Agent_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Recent_Calls_BTN = driver.findElement(By.xpath("//li[2]//div[1]//div[1]//div[2]"));
		Recent_Calls_BTN.click();
		
		String exp_Title = "Recent calls";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Recent calls']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		String exp_Title1 = "Below are the list of max 20 recent calls";
		WebElement Title1 = driver.findElement(By.xpath("//span[@class='pdngTSM alignCntr mrgnBSM ellipsisTxt']" ));
		String actual_Title1 = Title1.getText();
		Assert.assertEquals(exp_Title1, actual_Title1);
		
	}
	@Test
	public void tc2_Search_TextField() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Agent_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Agent_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Recent_Calls_BTN = driver.findElement(By.xpath("//li[2]//div[1]//div[1]//div[2]"));
		Recent_Calls_BTN.click();
		Thread.sleep(1000);
		WebElement Search_TextField = driver.findElement(By.xpath("//input[@id='outlined-adornment-password']"));
		Search_TextField.sendKeys("Badhri");
		
		Thread.sleep(1000);
		String exp_Title = "Badhri";
		WebElement Title = driver.findElement(By.xpath("//body/div[@id='root']/div[@class='baseBlockCntnr']/div[@class='flexCol']/div[@class='resflexColRow innerMainCntnr']/div[@class='flexCol respdngHSM']/div[@class='flexCol respdngHSM']/ul[@class='flexCol mrgnTSM dataListGroup ']/li[1]/div[2]/span[1]" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc3_Filter_ALL() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Agent_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Agent_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Recent_Calls_BTN = driver.findElement(By.xpath("//li[2]//div[1]//div[1]//div[2]"));
		Recent_Calls_BTN.click();
		Thread.sleep(1000);
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		
		WebElement All = driver.findElement(By.xpath("//label[normalize-space()='All']"));
		All.click();
		Thread.sleep(1000);

		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		Thread.sleep(1000);
		String exp_Title = "Recent calls";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Recent calls']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc4_Filter_completed() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Agent_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Agent_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Recent_Calls_BTN = driver.findElement(By.xpath("//li[2]//div[1]//div[1]//div[2]"));
		Recent_Calls_BTN.click();
		Thread.sleep(1000);
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		
		WebElement completed = driver.findElement(By.xpath("//label[normalize-space()='completed']"));
		completed.click();
		Thread.sleep(1000);

		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		Thread.sleep(1000);
		
		//Validation
		String exp_Title = "Recent calls";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Recent calls']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[@class='baseBlockCntnr']/div[@class='flexCol']/div[@class='resflexColRow innerMainCntnr']/div[@class='flexCol respdngHSM']/div[@class='flexCol respdngHSM']/ul[@class='flexCol mrgnTSM dataListGroup ']/li[1]/div[3]//*[name()='svg']")).isDisplayed();
		
	}
	@Test
	public void tc5_Filter_rejected() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Agent_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Agent_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Recent_Calls_BTN = driver.findElement(By.xpath("//li[2]//div[1]//div[1]//div[2]"));
		Recent_Calls_BTN.click();
		Thread.sleep(1000);
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		
		WebElement rejected = driver.findElement(By.xpath("//label[normalize-space()='rejected']"));
		rejected.click();
		Thread.sleep(1000);

		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		Thread.sleep(1000);
		
		//Validation
		String exp_Title = "Recent calls";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Recent calls']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		//rejected icon displaying.
		driver.findElement(By.xpath("//body/div[@id='root']/div[@class='baseBlockCntnr']/div[@class='flexCol']/div[@class='resflexColRow innerMainCntnr']/div[@class='flexCol respdngHSM']/div[@class='flexCol respdngHSM']/ul[@class='flexCol mrgnTSM dataListGroup ']/li[1]/div[3]//*[name()='svg']")).isDisplayed();
		
	}
	@Test
	public void tc6_Filter_schedule() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Agent_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Agent_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Recent_Calls_BTN = driver.findElement(By.xpath("//li[2]//div[1]//div[1]//div[2]"));
		Recent_Calls_BTN.click();
		Thread.sleep(1000);
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		
		WebElement schedule = driver.findElement(By.xpath("//label[normalize-space()='schedule']"));
		schedule.click();
		Thread.sleep(1000);

		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		Thread.sleep(1000);
		
		//Validation
		String exp_Title = "Recent calls";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Recent calls']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		//Validation2
				String exp_Title2 = "schedule";
				WebElement Title2 = driver.findElement(By.xpath("//body/div[@id='root']/div[@class='baseBlockCntnr']/div[@class='flexCol']/div[@class='resflexColRow innerMainCntnr']/div[@class='flexCol respdngHSM']/div[@class='flexCol respdngHSM']/ul[contains(@class,'flexCol mrgnTSM dataListGroup')]/li[1]/div[2]/div[2]/span[1]" ));
				String actual_Title2 = Title2.getText();
				Assert.assertEquals(exp_Title2, actual_Title2);
	}
	@Test
	public void tc7_Filter_rejected() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Agent_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Agent_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Recent_Calls_BTN = driver.findElement(By.xpath("//li[2]//div[1]//div[1]//div[2]"));
		Recent_Calls_BTN.click();
		Thread.sleep(1000);
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		
		WebElement incoming = driver.findElement(By.xpath("//label[normalize-space()='incoming']"));
		incoming.click();
		Thread.sleep(1000);

		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		Thread.sleep(1000);
		
		//Validation
		String exp_Title = "Recent calls";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Recent calls']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		//Validation2
				String exp_Title2 = "incoming";
				WebElement Title2 = driver.findElement(By.xpath("//body/div[@id='root']/div[@class='baseBlockCntnr']/div[@class='flexCol']/div[@class='resflexColRow innerMainCntnr']/div[@class='flexCol respdngHSM']/div[@class='flexCol respdngHSM']/ul[@class='flexCol mrgnTSM dataListGroup ']/li[1]/div[2]/div[2]/span[1]" ));
				String actual_Title2 = Title2.getText();
				Assert.assertEquals(exp_Title2, actual_Title2);
	}
	@Test
	public void tc8_Filter_Cancel() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Agent_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Agent_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Recent_Calls_BTN = driver.findElement(By.xpath("//li[2]//div[1]//div[1]//div[2]"));
		Recent_Calls_BTN.click();
		Thread.sleep(1000);
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		
		WebElement All = driver.findElement(By.xpath("//label[normalize-space()='All']"));
		All.click();
		Thread.sleep(1000);

		WebElement Cancel = driver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
		Cancel.click();
		Thread.sleep(1000);
		String exp_Title = "Recent calls";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Recent calls']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc9_Filter_Custom_date() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Agent_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Agent_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Recent_Calls_BTN = driver.findElement(By.xpath("//li[2]//div[1]//div[1]//div[2]"));
		Recent_Calls_BTN.click();
		Thread.sleep(1000);
		WebElement Filter = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		Filter.click();
		Thread.sleep(1000);
		
		//calendar
		driver.findElement(By.xpath("//button[@aria-label='Choose date, selected date is Sep 21, 2022']")).click();
		
		String month = "August";
		String year = "2022";
		String date = "8";
		
		while(true) {
			String mon  = driver.findElement(By.xpath("//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf']")).getText();
			String yr = driver.findElement(By.xpath("(//div[@class='PrivatePickersFadeTransitionGroup-root css-1bx5ylf'])[2]")).getText();
			if(mon.equalsIgnoreCase(month)&&yr.equals(year))
				break;
			else{
				driver.findElement(By.xpath("//button[@title='Previous month']")).click();
				
			}
			
			List<WebElement> alldates = driver.findElements(By.xpath("//div[@role='grid']//div"));
			for(WebElement ele:alldates) {
				String dt = ele.getText();
				if(dt.equals(date)) {
					ele.click();
					break;
				}
			}
		}
		WebElement Apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		Apply.click();
		
		Thread.sleep(1000);
		String exp_Title = "Recent calls";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Recent calls']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
	@Test
	public void tc10_List_Of_Calls() throws IOException, InterruptedException {

		WebElement Enter_email_address = driver.findElement(By.xpath("(//input[@id='outlined-size-small undefined'])[1]"));
		Enter_email_address.sendKeys(p.getPropertyFiledata("Agent_email"));
		
		WebElement Enter_Pass = driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]"));
		Enter_Pass.sendKeys(p.getPropertyFiledata("Agent_pass"));
		
		WebElement LOGIN = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		LOGIN.click();
		Thread.sleep(1000);
		
		WebElement Recent_Calls_BTN = driver.findElement(By.xpath("//li[2]//div[1]//div[1]//div[2]"));
		Recent_Calls_BTN.click();
		Thread.sleep(1000);
		List<WebElement> all = driver.findElements(By.xpath("//ul[@class='flexCol mrgnTSM dataListGroup ']//li"));
		System.out.println(" The list of maximum "+ all.size()+" recent calls");
		
		String exp_Title = "Recent calls";
		WebElement Title = driver.findElement(By.xpath("//h3[normalize-space()='Recent calls']" ));
		String actual_Title = Title.getText();
		Assert.assertEquals(exp_Title, actual_Title);
		
	}
}
