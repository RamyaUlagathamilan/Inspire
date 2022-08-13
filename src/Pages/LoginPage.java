package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Locators.LocatorRepository;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	@FindBy(how=How.XPATH,using=LocatorRepository.SignInButton)
	
	private WebElement SignInButton;

	@FindBy(how=How.XPATH,using=LocatorRepository.SigninLink)
	
	private WebElement signInLink;
	
	
@FindBy(how=How.XPATH,using=LocatorRepository.Email)
	
	private WebElement Email;

@FindBy(how=How.XPATH,using=LocatorRepository.Password)

private WebElement Password;

@FindBy(how=How.XPATH,using=LocatorRepository.LoginButton)

private WebElement Login;
	
	
	
	public void SignIn() throws InterruptedException {
		 SignInButton.click();
		// signInLink.click();
		 Email.sendKeys("ramyaambika29@gmail.com");
		 Password.sendKeys("InspireTest");
			
		 Login.click();
			 
		System.out.println("Logged into Application");
		Thread.sleep(10000);
		
		 
	}
	
	
}
