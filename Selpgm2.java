package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selpgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		WebElement elementUsername= driver.findElement(By.xpath("//input[@id='username']"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementpwd= driver.findElement(By.xpath("//input[@id='password']"));
		elementpwd.sendKeys("crmsfa");
		WebElement elementBtn= driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		elementBtn.click();
		
		WebElement elementBtn1= driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		elementBtn1.click();
		
		WebElement elmleads= driver.findElement(By.xpath("//a[text()='Leads']"));
		elmleads.click();
		WebElement elmCreateleads= driver.findElement(By.linkText("Create Lead"));
		elmCreateleads.click();
		/*
		 * WebElement elmCreateleads=
		 * driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]"));
		 * elmCreateleads.click()
		 */
		//input[@id='createLeadForm_companyName']
		 WebElement elementCmpname= driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
			elementCmpname.sendKeys("sgfhgh");
			WebElement elementfirst= driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
			elementfirst.sendKeys("sdc");
			WebElement elementlast= driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
			elementlast.sendKeys("ds");
			WebElement createleads= driver.findElement(By.xpath("//input[@name='submitButton']"));
			createleads.click();
			
			String title=driver.getTitle();
			System.out.println(title);
			
		
		 
	
	}
}
