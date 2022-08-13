package Utilities.drivers;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestEnvironmentSetup {
	
	public WebDriver driver;
	public void chromeDriverSetup()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\Utilities\\drivers\\chromedriver.exe"  );
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://redacted.inspire.com/");
		driver.manage().window().maximize();
		
		
	}
	
	
	public void QuitBrowser()
	{
		driver.quit();
		System.out.println("Quit from the browser");
	}

}
