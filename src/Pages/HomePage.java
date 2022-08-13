package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Locators.LocatorRepository;

public class HomePage {

	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	@FindBy(id =LocatorRepository.StartPostButton)
	private WebElement StartpostButton;
	
	@FindBy(xpath  =LocatorRepository.Popup)
	private WebElement PopUp;
	
	@FindBy(xpath  =LocatorRepository.ChooseTopic)
	private WebElement Choosetopic;
	
	@FindBy(xpath  =LocatorRepository.DrugAllergy)
	private WebElement SelectTopic;
	
	@FindBy(xpath  =LocatorRepository.Title)
	private WebElement Title;
	
	@FindBy(xpath  =LocatorRepository.Body)
	private WebElement BodyContent;
	
	@FindBy(xpath  =LocatorRepository.PrivacyDropdown)
	private WebElement PrivacyDropdown;
	
	@FindBy(xpath  =LocatorRepository.DropdownItems)
	private List<WebElement> dropdownItems;
	
	@FindBy(xpath  =LocatorRepository.SubmitPost)
	private WebElement SubmitPost;
	
	@FindBy(xpath  =LocatorRepository.ValidatePost)
	private WebElement VerifyPost;
	
	
	
	public void StartPost() {
		 StartpostButton.click();
			 
		System.out.println("Clicked on Create Post Button");
		 
	}
	
	public void VerifyPopUp()
	{
		Assert.assertEquals(true, PopUp.isDisplayed());
		if(PopUp.isDisplayed())
		{
			System.out.println("Pop up is Displayed");
		}
		else
		{
			System.err.println("Pop up is Displayed");
		}		
		
	}
	
	public void ChooseTopic()
	{
		Choosetopic.click();
		SelectTopic.click();
		
		System.out.println("Topic is choosed");
		
	}
	
	public void EnterTitle(String text)
	{
		Title.sendKeys(text);
		System.out.println("Title is entered");
	}
	
	public void EnterBodyText()
	{
		BodyContent.sendKeys("Automation Post QA Challenge");
		System.out.println("Body content is entered");
	}
	
	public void privacyOptions() throws InterruptedException
	{
		PrivacyDropdown.click();
		for (WebElement e : dropdownItems)
		{
			
			if(e.getText().equals("Inspire Friends"))
			{
				e.click();
				System.out.println("Privacy option is set as Inspire Friends");
				
				break;
			}
		}
		
		Thread.sleep(3000);
		
	}
	
	public void SubmitPost() throws InterruptedException
	{
		SubmitPost.click();
		
		System.out.println("Post is Submitted");
		Thread.sleep(10000);
		
	}
	
	
	public void VerifyPost(String Text)
	{
		boolean flag;
		if(Text.equals(VerifyPost.getText()))
		{
		  flag=true;	
			System.out.println("Post is verified ");
		}
			else
		{
				 flag=false;
			System.err.println("Post is not verified ");
		}
		Assert.assertEquals(true, flag);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
