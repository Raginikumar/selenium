package baseSetup;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import helpers.HelperMethods;

public class Base {

	WebDriver driver;

	@SuppressWarnings("unused")
	public WebDriver getDriver() throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\P2854155\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver = new ChromeDriver(options);		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://dev-camp.corp.chartercom.com/");
		HelperMethods.keyBoardKeysPress(KeyEvent.VK_ESCAPE);
		return driver;
		

	}

}
