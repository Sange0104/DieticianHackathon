package appHooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	
	public WebDriver driver;
	private System prop;

	@Before
	public void setup()
	{
		
       String browserName = prop.getProperty("browser");

			if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shobh\\eclipse-workspace\\DieticianHackathon\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			}
			else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\shobh\\eclipse-workspace\\DieticianHackathon\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			}



	}

	/**@AfterStep(order=1)
	public void takeScreenshotOnFailure(Scenario scenario)
	{
		if (scenario.isFailed())
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			final byte[]src=ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "screenshot");
		}
	}
*/
	@After(order=0)
	public void teardown()
	{
		driver.close();
	}


}
