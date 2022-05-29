package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class base {

	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws Throwable {

		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Java Projects\\Automation\\src\\main\\resources\\data.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Java Projects\\Mahmood\\driver2\\chromedriver.exe");
			driver = new ChromeDriver();
			//execute in chrome driver
		} else if (browserName.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "\\src\\main\\resources\\geckodriver.exe"); // ?
			driver = new FirefoxDriver();
			//firefox code
		} else if (browserName.equals("IE")) {
//	IE code
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;


//public void getScreenshot(String result) throws IOException {
//
//	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(src, new File("C:\\Screenshots\\" + result + "Screenshot.png"));
//}
//"C:\\Screenshots\\Sreenshot1.png"

	}
}
