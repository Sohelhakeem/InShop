package Agent_Scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Agent_BaseClass;

public class testt extends Agent_BaseClass {

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
		js.executeScript("window.scrollBy(0, 350)","");
		Thread.sleep(1000);
		
		String exp_Title = "Analytics";
		WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Analytics']"));
		String act_Title = title.getText();
		Assert.assertEquals(exp_Title, act_Title);
		
	}
	
}
