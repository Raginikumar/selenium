package baseSetup;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import helpers.HelperMethods;

public class Base {

	WebDriver driver;
	private static Properties properties;
	
	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties =new Properties();
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"./src/main/java/utilities/config.properties");
		properties.load(file);
	}
	
	@SuppressWarnings("unused")
	public WebDriver getDriver() throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				properties.getProperty("CHROME_DRIVER_PATH"));
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver = new ChromeDriver(options);		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(properties.getProperty("SIT_URL"));
		HelperMethods.keyBoardKeysPress(KeyEvent.VK_ESCAPE);
		return driver;
		

	}

}
