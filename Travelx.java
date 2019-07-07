package slenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Travelx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		d.navigate().to("https://www.travelx.com");
		
		WebElement hotels=d.findElement(By.xpath("//*[@id=\"menu-item-153\"]/a"));
		hotels.click();
		
		WebElement flights=d.findElement(By.xpath("//*[@id=\"menu-item-14\"]/a"));
		flights.click();
		
		WebElement cruises=d.findElement(By.xpath("//*[@id=\"menu-item-13\"]/a"));
		cruises.click();
		
		WebElement rentelcars=d.findElement(By.xpath("/html/body"));
		rentelcars.click();
		
		WebElement tips=d.findElement(By.xpath("//*[@id=\"menu-item-121\"]/a"));
		tips.click();
		
		WebElement gear=d.findElement(By.xpath("//*[@id=\"menu-item-122\"]/a"));
		gear.click();
		
		WebElement destination=d.findElement(By.xpath("//*[@id=\"menu-item-126\"]/a"));
		destination.click();
		
		

	}

}
