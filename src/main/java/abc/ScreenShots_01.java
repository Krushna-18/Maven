package abc;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots_01 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Testing Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		Thread.sleep(1500);
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		System.out.println("Aik ki");
		
		File A = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //We take Screenshots & Stored in Variable
		File B = new File("C:\\Users\\ADMIN\\Desktop\\Testing Files\\Screenshots"); //Then We cre
		
		FileHandler.copy(A, B);
		Thread.sleep(2000);
		
		System.out.println("Bapu");
		
		driver.close();
	
		
	}
	

}
