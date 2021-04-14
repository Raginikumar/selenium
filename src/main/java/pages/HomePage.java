package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//HOw to implement page factory 
//How to create the objects ,i.e xpath 
//How to create the corresponding methods

	// Home Page burger sign
	@FindBy(id = "nav-toggle")
	public WebElement homeBurgerIcon;

	// 'Home' Module icon

	public WebDriver driver; // declare driver no memory

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[contains(text(),'Home')]")
	public WebElement homeIcon;

	@FindBy(className = "logo")
	public WebElement spectrumLogo;

	@FindBy(className = "name")
	public WebElement UserName;

	@FindBy(className = "rounded-circle")
	public WebElement ProfilePic;

	@FindBy(className = "welcome")
	public WebElement ProfileWelcome;

	@FindBy(xpath = "//*[contains(text(),'CUSTOMER AGREEMENT MANAGEMENT PORTAL (CAMP')]")
	public WebElement applicationName;

	public void initialHomeVerification() {
		assertTrue(ProfileWelcome.isDisplayed(), "ProfileWelcome");
		assertTrue(UserName.isDisplayed(), "UserName");
		assertTrue(ProfilePic.isDisplayed(), "ProfilePic");
		assertTrue(applicationName.isDisplayed(), "applicationName");
		assertTrue(spectrumLogo.isDisplayed(), "spectrumLogo");
		assertTrue(homeIcon.isDisplayed(), "homeIcon");
		assertTrue(homeBurgerIcon.isDisplayed(), "homeBurgerIcon");

	}

}
