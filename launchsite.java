package slenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://newtours.demoaut.com");
		d.manage().window().maximize();
		//d.navigate().to("http://facebook.com");
		//d.navigate().refresh();
		//d.navigate().back();
		//d.navigate().forward();
		//d.close();
		System.exit(0);
		
		

	}

}
