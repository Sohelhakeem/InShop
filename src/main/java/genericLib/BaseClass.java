package genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public PropertyFile p=new PropertyFile();
	public WebDriverUtilies driverutilies=new WebDriverUtilies();
	
	@BeforeTest
	public void open() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(null);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void close(ITestResult result) throws IOException {
	int status = result.getStatus();
	String name = result.getName();
	if(status == 2) {
		Sceenshot s = new Sceenshot();
		s.getScreenshot(driver, name);
	}
	driver.quit();
	}
	
	}
