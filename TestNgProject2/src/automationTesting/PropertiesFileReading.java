package automationTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFileReading {
	public static void main(String[] args) throws IOException, InterruptedException {
		Properties properties=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\TestNgProject2\\src\\automationTesting\\config.properties");
		properties.load(fis);
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println(properties.getProperty("baseURL"));
		driver.get(properties.getProperty("baseURL"));
		Thread.sleep(3000);
		driver.close();
	}

}
