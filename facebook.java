package slenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.internal.FindsByName;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d =new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://facebook.com");
		WebElement uname=d.findElement(By.name("email"));
		uname.sendKeys("chetanpazade@yahoo.com");
		
		WebElement pass=d.findElement(By.name("pass"));
		pass.sendKeys("9421463713");
		
		WebElement login=d.findElement(By.id("u_0_2"));
		login.click();
		
		//System.exit(0);
		

	}

}
