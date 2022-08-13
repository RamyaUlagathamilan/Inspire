package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Utilities.drivers.TestEnvironmentSetup;


public class TC01_Start_a_Post {
	
	@Test
	
	public void Test()
	{
		 TestEnvironmentSetup obj=new TestEnvironmentSetup();
		 obj.chromeDriverSetup();
		 
		 LoginPage loginPage=PageFactory.initElements(obj.driver, LoginPage.class);
		 HomePage homePage=PageFactory.initElements(obj.driver, HomePage.class);
			
		try
		{
			loginPage.SignIn();
			homePage.StartPost();
			homePage.VerifyPopUp();
			homePage.ChooseTopic();
			homePage.EnterTitle("Automation post");
			homePage.EnterBodyText();
			homePage.privacyOptions();
			homePage.SubmitPost();
			homePage.VerifyPost("Automation post");
			
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally{
			
			obj.QuitBrowser();
			obj=null;
			
		}
	

	}

	
}
