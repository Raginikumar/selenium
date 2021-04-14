package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgreementsApproval {

	public WebDriver driver; // declare driver no memory

	public AgreementsApproval(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "active")
	public WebElement breadcrumbAgreementsApproval;

	@FindBy(className = "title-header")
	public WebElement AwaitingForYourApprovalText;

	@FindBy(className = "total")
	public WebElement totalNumber;

	@FindBy(xpath = "//a[@href='#/home']")
	public WebElement breadCrumbHome;

	@FindBy(xpath = "//*[@data-tip= 'Back to top']")
	public WebElement scrollUpArrow;

	@FindBy(xpath = "(//*[contains(text(),'Agreements')])[3]")
	public WebElement agreementsApprovalModuleicon;

	@FindBy(className = "preview-active")
	public WebElement PreviewIcon;

	public void navigateToAgreementsApprovalModule() {
		agreementsApprovalModuleicon.click();
	}

	public void initialAgreementsApprovalVerification() {
		assertTrue(breadCrumbHome.isDisplayed(), "breadCrumbHome");
		assertTrue(breadcrumbAgreementsApproval.isDisplayed(), "breadcrumbAgreementsApproval");
		assertTrue(AwaitingForYourApprovalText.isDisplayed(), "AwaitingForYourApprovalText");
		assertTrue(totalNumber.isDisplayed(), "totalNumber");
		// assertTrue(scrollUpArrow.isDisplayed(), "scrollUpArrow");
		assertTrue(PreviewIcon.isDisplayed(), "PreviewIcon");

	}

}
