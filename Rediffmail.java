package slenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.FindsByLinkText;
import org.openqa.selenium.internal.FindsByName;
import org.openqa.selenium.support.ui.Select;

public class Rediffmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://mail.rediff.com");
		WebElement cuser=d.findElement(By.linkText("Create Account"));
		cuser.click();
		
		WebElement fname=d.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		fname.sendKeys("Chetan Pazade");
		
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
		
		
		
		WebElement chkbx=d.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
		chkbx.click();
		
		/*WebElement seqque=d.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[4]/td[3]/input"));
		Select seqqueEle=new Select(seqque);
		seqqueEle.selectByValue("What is your Favourite food");
		
		WebElement ans=d.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[4]/td[3]/input"));
		ans.sendKeys("test");
		
		WebElement mothermedian= d.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[6]/td[3]/input"));
		mothermedian.sendKeys("test");
		
		
		*/
	
		
		WebElement mobno=d.findElement(By.xpath("//*[@id=\"mobno\"]"));
		mobno.sendKeys("1234567890");
		
		WebElement DOB_day=d.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select DOB_dayEle=new Select(DOB_day);
		DOB_dayEle.selectByValue("03");
		
		WebElement DOB_mon=d.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select DOB_monEle=new Select(DOB_mon);
		DOB_monEle.selectByValue("04");
		
		WebElement DOB_Yr=d.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select DOB_YrEle=new Select(DOB_Yr);
		DOB_YrEle.selectByValue("1991");
		
		
		WebElement country=d.findElement(By.xpath("//*[@id=\"country\"]"));
		Select countryEle=new Select(country);
		countryEle.selectByValue("99");
		
		WebElement city=d.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"));
		Select cityEle=new Select(city);
		cityEle.selectByValue("pune");
				

	}

}
