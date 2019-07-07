package slenium1;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Internetexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver","G:\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver d=new InternetExplorerDriver();
		d.get("http://newtours.demoauth.com");
		d.manage().window().maximize();
		d.navigate().to("http://facebook.com");
		d.navigate().refresh();
		d.navigate().back();
		d.navigate().forward();
		d.close();
		System.exit(0);
		

	}

}
