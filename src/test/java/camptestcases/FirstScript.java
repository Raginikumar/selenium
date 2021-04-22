package camptestcases;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseSetup.Base;
import pages.Agreements;
import pages.AgreementsApproval;
import pages.HomePage;
import pages.Login;
import pages.PublishAgreements;

public class FirstScript extends Base {

	public WebDriver driver;
	Login loginObj; //declarion
	HomePage homeObj;
	Agreements agreeObj;
	AgreementsApproval agreeAppObj;
	PublishAgreements agreePubObj;
	
	@BeforeMethod
	public void setup() throws AWTException
	{
		driver=getDriver();
		loginObj=new Login(driver);
		homeObj=new HomePage(driver);
		agreeObj=new Agreements(driver);
		agreeAppObj=new AgreementsApproval(driver);
		agreePubObj=new PublishAgreements(driver);
		
	}
	
	@Test
	public void test1() throws InterruptedException
	{
		loginObj.NavigateToLoginPage();
		homeObj.initialHomeVerification();
		agreeObj.NavigateToAgreementsModule();
		agreeObj.searchFieldVerification();
		agreeObj.initialAgreementsPageVerification();
		agreeObj.scrollToBottomArow();
		agreeObj.clickLoadMoreButton();
		agreeAppObj.navigateToAgreementsApprovalModule();
		agreeAppObj.initialAgreementsApprovalVerification();
		agreePubObj.navigateToPublishAgreementsModule();
		agreePubObj.initialPublishAgreementsVerification();
		
	}
//		Login obj1=new Login(driver);
//		HomePage obj2=new HomePage(); //declaration & initlaization together
//		Agreements obj3=new Agreements();
//		AgreementsApproval obj4=new AgreementsApproval();
//		PublishAgreements obj5=new PublishAgreements();
//		
		// create Obj syntax 
		//classNAme variableName=new className();
		
		
//	//	Objects
//		test methods
//		driver 
		
	}
	


