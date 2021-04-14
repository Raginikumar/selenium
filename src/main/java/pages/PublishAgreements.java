package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PublishAgreements {

	public WebDriver driver; // declare driver no memory

	public PublishAgreements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "active")
	public WebElement breadcrumbPublishAgreements;

	@FindBy(className = "title-header")
	public WebElement agreementsReadyToPublishText;

	@FindBy(className = "total")
	public WebElement totalNumber;

	@FindBy(xpath = "(//*[contains(text(),'Publish Agreements')])[1]")
	public WebElement publishAgreementsModuleicon;

	@FindBy(xpath = "//a[@href='#/home']")
	public WebElement breadCrumbHome;

	@FindBy(className = "pa-publish")
	public WebElement iconPublish;

	public void navigateToPublishAgreementsModule() {
		publishAgreementsModuleicon.click();
	}

	public void initialPublishAgreementsVerification() {
		assertTrue(breadCrumbHome.isDisplayed(), "breadCrumbHome");
		assertTrue(breadcrumbPublishAgreements.isDisplayed(), "breadcrumbPublishAgreements");
		assertTrue(agreementsReadyToPublishText.isDisplayed(), "agreementsReadyToPublishText");
		assertTrue(totalNumber.isDisplayed(), "totalNumber");
		assertTrue(iconPublish.isDisplayed(), "iconPublish");

	}
}
