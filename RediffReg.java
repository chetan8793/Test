package slenium1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

public class RediffReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.navigate().to("https://mail.rediff.com");
		
		WebElement cuser=d.findElement(By.linkText("Create Account"));
		cuser.click();
		
		WebElement fname=d.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		fname.sendKeys("chetan pazade");
		 
		WebElement mailid=d.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		mailid.sendKeys("chetanp001");
		
		WebElement chkavai=d.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
		chkavai.click();
		
		WebElement pass=d.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input"));
		pass.sendKeys("Mar#2019");
		
		WebElement Repass=d.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[11]/td[3]/input"));
		Repass.sendKeys("Mar#2019");
		
		WebElement altmail=d.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input"));
		altmail.sendKeys("chetanpazade@gmail.com");
		
		WebElement mobno=d.findElement(By.xpath("//*[@id=\"mobno\"]"));
		mobno.sendKeys("7021408203");
		
		
		 Scanner scan = new Scanner(System.in);
         System.out.println("Enter Captcha"); 
         String captcha = scan.nextLine(); 
		WebElement captcha1=d.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[32]/td[3]/input"));
		captcha1.sendKeys(captcha);
		
		
	}

}
