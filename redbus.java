package slenium1;

import java.awt.event.FocusEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class redbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.navigate().to("https://www.redbus.in");
		d.manage().window().maximize();
      
		
		 ChromeOptions opt=new ChromeOptions();
		opt.addArguments("_ _disabled_notofication");
		WebDriver w=new ChromeDriver(opt);
		
		
		WebElement source=d.findElement(By.id("src"));
		source.sendKeys("Vashi,Mumbai");
	    
	    
	    WebElement destination=d.findElement(By.id("dest"));
	    destination.sendKeys("swarget,pune");

	    
	    WebElement cal=d.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/span"));
	    cal.click();
	    
	  /*  List<WebElement> tdcoll=d.findElements(By.tagName(("td")));
	    for(WebElement tdEle:tdcoll); 
	   
	    {
	    	String W=tdEle.getText();
	    	if (W.equals("29"));
	    	{
	    		tdEle.click();
	    		
	    		break;
	    	}
	    }
	   */
	    
	    WebElement fdate=d.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[7]/td[3]"));
	    fdate.click();
	    
	    /*
	    WebElement cal2=d.findElement(By.xpath("//*[@id=\"search\"]/div/div[4]/span"));
	    cal2.click();
	    
	    
	    WebElement Retdate=d.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[7]/td[4]"));
	    Retdate.click();
	    */
	    
	   // WebElement search=d.findElement(By.xpath("//*[@id=search_btn]"));
	    //search.click();
	    
	    WebDriverWait wait=new WebDriverWait(d, 30);
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("search_btn")));
	    
	}
	
	

}
