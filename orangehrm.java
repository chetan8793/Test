package slenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.navigate().to("https://www.orangehrm.com");
		
			
		JavascriptExecutor js = (JavascriptExecutor) d;  
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    
	    WebElement link=d.findElement(By.xpath("/html/body/div[11]/div/div/a"));
		link.click();
	    
		List<WebElement> links=d.findElements(By.tagName("a"));
		int a=links.size();
		
		System.out.println("number of links Available on page are " +a);
		
		List<WebElement> images=d.findElements(By.tagName("img"));
		int b=images.size();
		
		System.out.println("Number of images are " +b);
		
		List<WebElement> text1=d.findElements(By.tagName("input"));
		int c=text1.size();
		System.out.println("Number of text are " +c);
		
		
	}

}
