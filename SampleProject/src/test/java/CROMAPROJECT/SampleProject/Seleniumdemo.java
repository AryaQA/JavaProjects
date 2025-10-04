package CROMAPROJECT.SampleProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Seleniumdemo {
	
	
	
	
    @Test
	public void run() {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://en.wikipedia.org/wiki/Google_Meet");
		
		
		System.out.println("text message");

	}

}
