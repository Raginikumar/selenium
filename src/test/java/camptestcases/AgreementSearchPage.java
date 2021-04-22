package camptestcases;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseSetup.Base;
import pages.Agreements;
import pages.HomePage;
import pages.Login;
import pages.createNewAgreement;

public class AgreementSearchPage extends Base {

	
		public WebDriver driver;
		Login loginObj; //declarion
		HomePage homeObj;
		Agreements agreeObj;
		createNewAgreement CreateBtnobj; 
		
		@BeforeTest
		public void setup() throws AWTException
		{
			driver=getDriver();
			loginObj=new Login(driver);
			homeObj=new HomePage(driver);
			agreeObj=new Agreements(driver);
			CreateBtnobj=new createNewAgreement(driver);
			
			
	}

		
		@Test
		public void test1()
		{
			loginObj.NavigateToLoginPage();
			homeObj.initialHomeVerification();
			agreeObj.NavigateToAgreementsModule();
			agreeObj.searchFieldVerification();
			agreeObj.searchAgreement("E911 - NA -E911 - version 12");
			agreeObj.suggestionCheck();
		
			
		}
}
