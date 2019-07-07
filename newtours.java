package slenium1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newtours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.navigate().to("http://newtours.demoaut.com");
		d.manage().window().maximize();
		 
		int i=0;
		
		List<WebElement> collLinks=d.findElements(By.tagName("a"));
		
		String [] arr=new String [collLinks.size()];
		
		for(WebElement x:collLinks)
		{
			arr[i]=x.getText();
			i++;
			
		}
		
		for(String  abc:arr)
		{
			
			d.findElement(By.linkText(abc)).click();
			
			if((d.getTitle()).contains("Under Construction"))
			{
				System.out.println(abc+ "is broken link");
				
			}
			
			else
			{
				System.out.println(abc+ "is working");
			}
		}
		
		d.navigate().back();
		}
		
		
       
	}


