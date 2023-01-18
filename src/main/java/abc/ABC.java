package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABC {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Testing Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in");
		Thread.sleep(1500);
		
		driver.manage().window().maximize();
		Thread.sleep(150);
		
		driver.close();
		
		
	}

	
}
