package pages;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createNewAgreement {
	public WebDriver driver; // declare driver no memory

	public createNewAgreement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locators defining

	@FindBy(className = "agreementCode")
	public WebElement AgreementCodefield;

	@FindBy(name = "agreementTitle")
	public WebElement AgreementsTitleField;

	@FindBy(className = "agreementShortDescription")
	public WebElement ShortDescriOfAgreement;

	@FindBy(xpath = "//*[contains(text(),'Cancel')]")
	public WebElement CancelBtn;

	@FindBy(xpath = "//*[contains(text(),'Create Agreement')]")
	public WebElement CreateAgreemntBtn;

	@FindBy(name = "agreementCode")
	public WebElement AgreementCodeField;

	@FindBy(name = "agreementShortDescription")
	public WebElement AgreementShortDescriptionField;

	@FindBy(className = "toast-body")
	public WebElement toastSuccess;
	
	@FindBy(xpath = "//*[text()='Agreement code should not contain special characters, Only Alphanumeric is allowed']")
	public WebElement agreeCodeSpecialCharValidation_Msg;
	
	@FindBy(xpath = "//*[text()='Agreement code must be 3 to 5 characters']")
	public WebElement agreeCodeMinimumlCharValidation_Msg;

	public void initialCreateNewAgreement() {
		assertTrue(AgreementCodefield.isDisplayed(), "AgreementCodefield");
		assertTrue(AgreementsTitleField.isDisplayed(), "AgreementsTitleField");
		assertTrue(ShortDescriOfAgreement.isDisplayed(), "ShortDescriOfAgreement");
		assertTrue(CancelBtn.isDisplayed(), "CancelBtn");
		assertTrue(CreateAgreemntBtn.isDisplayed(), "CreateAgreemntBtn");

	}

	public void clickCancelBtn() {

		inputAgreementCodeField("RA9");
		inputAgreementsTitleField("AutomationTest");
		inputAgreementShortDescriptionField("Testing");
		CancelBtn.click();

	}
	
	public void inputAgreementCodeField(String code)
	{
		AgreementCodeField.sendKeys(code);
	}
	
	public void inputAgreementsTitleField(String title)
	{
		AgreementCodeField.sendKeys(title);
	}
	
	public void inputAgreementShortDescriptionField(String shortDescription)
	{
		AgreementCodeField.sendKeys(shortDescription);
	}
	

	public void clickNewAgrmnBtn() {

		AgreementCodeField.sendKeys("RA939");
		AgreementsTitleField.sendKeys("AutomationTest");
		AgreementShortDescriptionField.sendKeys("Testing");
		CreateAgreemntBtn.click();

	}

	public void toastIsDisplayed() {
		assertTrue(toastSuccess.isDisplayed());
		System.out.println(toastSuccess.getText());

	}
	
	public void agreementCodeInputValidation()
	{
		inputAgreementCodeField("1");
		assertEquals(agreeCodeMinimumlCharValidation_Msg.getText(), "Agreement code must be 3 to 5 characters");
		AgreementCodeField.clear();
		inputAgreementCodeField("###");
		assertEquals(agreeCodeSpecialCharValidation_Msg.getText(), "Agreement code should not contain special characters, Only Alphanumeric is allowed");
		AgreementCodeField.clear();
		}
	}
