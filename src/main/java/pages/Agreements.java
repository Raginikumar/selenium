package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Agreements {

	public WebDriver driver; // declare driver no memory

	public Agreements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Module- 'Agreements'
	@FindBy(xpath = "(//*[contains(text(),'Agreements')])[2]")
	public WebElement agreementsModule;

	@FindBy(xpath = "(//*[contains(text(),'Agreements')])[5]")
	public WebElement breadcrumbAgreements;

	@FindBy(xpath = "//*[contains(text(),'Create New Agreement')]")
	public WebElement createNewAgreement;

	@FindBy(className = "total")
	public WebElement totalNumber;

	@FindBy(xpath = "//*[@placeholder='I am looking for...']")
	public WebElement iamLookingForsearchfield;

	@FindBy(className = "loadMore")
	public WebElement btnLoadMore;

	@FindBy(xpath = "//*[@data-tip='Back to top']")
	public WebElement scrollUpArrow;

	@FindBy(xpath = "//a[@href='#/home']")
	public WebElement breadCrumbHome;

	@FindBy(className = "edit")
	public WebElement btnEdit;

	@FindBy(className = "preview")
	public WebElement btnPreview;

	@FindBy(xpath = "//*[@class='clone-active']")
	public WebElement btnclone;

	public void NavigateToAgreementsModule() {

		agreementsModule.click();

	}

	public void clickLoadMoreButton() {

		btnLoadMore.click();

	}

	public void clickNewAgreement() {
		createNewAgreement.click();
	}

	public void initialAgreementsPageVerification() throws InterruptedException {
		assertTrue(breadcrumbAgreements.isDisplayed(), "breadcrumbAgreements");
		assertTrue(breadCrumbHome.isDisplayed(), "breadCrumbHome");
		assertTrue(createNewAgreement.isDisplayed(), "createNewAgreement");
		assertTrue(totalNumber.isDisplayed(), "totalNumber");
		assertTrue(iamLookingForsearchfield.isDisplayed(), "iamLookingForsearchfield");
		scrollToBottomArow();
		assertTrue(btnLoadMore.isDisplayed(), "btnLoadMore");
		assertTrue(scrollUpArrow.isDisplayed(), "scrollUpArrow");
		assertTrue(breadCrumbHome.isDisplayed(), "breadCrumbHome");
		// assertTrue(btnEdit.isDisplayed(), "btnEdit");
		assertTrue(btnPreview.isDisplayed(), "btnPreview");

		// assertTrue(btnclone.isDisplayed(), "btnclone");

	}

	public void scrollToBottomArow() {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");
	}

	public void btnLoadMore() {
		// TODO Auto-generated method stub

	}

	public void searchAgreement() {

		iamLookingForsearchfield.sendKeys("E911 - NA -E911 - version 6");

	}

	public void iamLookingForsearchfield() {
		// TODO Auto-generated method stub

	}

}
