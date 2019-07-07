package slenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Snapdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.navigate().to("https://snapdeal.com");

		WebElement sign=d.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]"));
		sign.click();
		
		WebElement login=d.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]"));
		login.click();
		
		//d.switchTo().frame(0);
		WebDriverWait w=new WebDriverWait(d, 120);
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		
		System.out.println("frame switched");
		
		WebElement mobileno=d.findElement(By.name("username"));
		mobileno.sendKeys("8793871162");
		
		WebElement cont=d.findElement(By.xpath("//*[@id=\"checkUser\"]"));
		cont.click();
		
		
	}

}
