package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
public static WebDriver driver;
	
	
	public static void initialisationDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.thewarehouse.co.nz/");
	}
	
	
	public static void closeDriver() {
		driver.close();
		driver.quit();
	}
	
	public static String randomName() {
		Faker faker = new Faker();
		return faker.name().firstName();
	}

}
