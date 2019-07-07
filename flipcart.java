package slenium1;

import java.awt.SecondaryLoop;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flipcart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		d.navigate().to("https://www.flipkart.com");
		
		WebDriverWait w=new WebDriverWait(d,120);
		
		WebElement close=d.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		close.click();
		
		
		//d.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		WebElement search=d.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
		search.sendKeys("mi 6 pro 32 GB");
		
		WebElement searchbutton=d.findElement(By.className("vh79eN"));
		searchbutton.click();
		
		WebElement mob=d.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img"));
		mob.click();
		
		WebElement buy=d.findElement(By.className("_279WdV"));
		buy.click();
		
		
			

	}

}
