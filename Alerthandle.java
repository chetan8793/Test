package slenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("http://jsbin.com/usidix/1");
		WebElement go=d.findElement(By.xpath("/html/body/input"));
		go.click();
		
		Thread.sleep(5000);
		Alert alt=d.switchTo().alert();
		String s=alt.getText();
		System.out.println(s);
		
		alt.accept();
		//alt.dismiss();

	}

}
