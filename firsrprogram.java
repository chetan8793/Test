package slenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class firsrprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://newtours.demoaut.com");
		d.manage().window().maximize();
		/*WebElement un=d.findElement(By.name("userName"));
		un.sendKeys("tutorial1");
		
		WebElement un1=d.findElement(By.name("password"));
		un1.sendKeys("tutorial1");
		
		WebElement un2=d.findElement(By.name("login"));
		un2.click();
		
		*/
		
		WebElement unl=d.findElement(By.linkText("REGISTER"));
		unl.click();
		
		WebElement unname=d.findElement(By.name("firstName"));
		unname.sendKeys("Chetan");
		
		WebElement unlname=d.findElement(By.name("lastName"));
		unlname.sendKeys("p");
		
		WebElement unph=d.findElement(By.name("phone"));
		unph.sendKeys("8793871162");
		
		
		WebElement unmail=d.findElement(By.id("userName"));
		unmail.sendKeys("chetanp@gmail.com");
		
		WebElement unAdd1=d.findElement(By.name("address1"));
		unAdd1.sendKeys("abc");
		
		
		WebElement uncity=d.findElement(By.name("city"));
		uncity.sendKeys("pune");
		
		WebElement unstate=d.findElement(By.name("state"));
		unstate.sendKeys("MH");
		
		WebElement unptc=d.findElement(By.name("postalCode"));
		unptc.sendKeys("400147");
		
		WebElement unddn=d.findElement(By.name("country"));
		Select unddnEle=new Select(unddn);
	
				
			     unddnEle.selectByValue("92");
				
		

		WebElement unmail1=d.findElement(By.name("email"));
		unmail1.sendKeys("test1");
		
		
		WebElement unpass=d.findElement(By.name("password"));
		unpass.sendKeys("test1");
		
		
		WebElement unconpass=d.findElement(By.name("confirmPassword"));
		unconpass.sendKeys("test1");
		
		
		WebElement un2=d.findElement(By.name("register"));
		un2.click();
		
		
		//d.navigate().to("http://facebook.com");
		//d.navigate().refresh();
		//d.navigate().back();
		//d.navigate().forward();
		//d.close();
		System.exit(0);
		

	}

}
