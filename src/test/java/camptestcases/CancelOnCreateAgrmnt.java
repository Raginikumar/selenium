package camptestcases;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseSetup.Base;
import pages.Agreements;
import pages.AgreementsApproval;
import pages.HomePage;
import pages.Login;
import pages.PublishAgreements;
import pages.createNewAgreement;

public class CancelOnCreateAgrmnt extends Base {

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
		agreeObj.clickNewAgreement();
		CreateBtnobj.agreementCodeInputValidation();
		CreateBtnobj.clickCancelBtn();
		agreeObj.clickNewAgreement();
		CreateBtnobj.clickNewAgrmnBtn();
		CreateBtnobj.toastIsDisplayed();
	}
	
	//@Test
//	public void test1() throws InterruptedException
//	{
//		loginObj.NavigateToLoginPage();
//		homeObj.initialHomeVerification();
//		agreeObj.NavigateToAgreementsModule();
//		agreeObj.clickNewAgreement();
//		CreateBtnobj.clickCancelBtn();
//		agreeObj.clickNewAgreement();
//		CreateBtnobj.clickNewAgrmnBtn();
//		CreateBtnobj.toastIsDisplayed();
//		
//		
//		
//	}
	


}

