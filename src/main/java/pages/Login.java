package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver driver; // declare driver no memory

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type= 'submit']")
	public WebElement loginBtn;

	@FindBy(id = "username")
	public WebElement username;

	@FindBy(id = "password")
	public WebElement password;

	public void NavigateToLoginPage() {

		username.sendKeys("P2854155");
		password.sendKeys("Agreements@1");
		loginBtn.click();
	}

}
