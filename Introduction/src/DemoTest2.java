import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	// selenium code-
		
		// Create Driver Object for Chrome Browser
		
		
		/* Class new= X
				
				X driver=new X(); */
		
		// invoke exe file first
		
   System.setProperty("webdriver.chrome.driver", "D:\\WORK\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://kec.kiteqa.com/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("username_email")).sendKeys("kec@yopmail.com");
		       Thread.sleep(3000);
		driver.findElement(By.id("password_password")).sendKeys("Kite@135#");
		     Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='next_button']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
        		
		driver.findElement(By.xpath("//div[@id='sidebar_reports_button']")).click();
		driver.findElement(By.xpath("//div[@id='reports_pendingApproval_tab_link']")).click();
		
		   Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='reports_all_tab_link']")).click();
		
		    Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='sidebar_employees_button']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='addEmployee_button']")).click();
		     
		    Thread.sleep(2000);
		driver.findElement(By.id("firstName_text")).sendKeys("Selenium");
		    Thread.sleep(2000);
		driver.findElement(By.id("lastName_text")).sendKeys("Two");
		
		   Thread.sleep(2000);
		driver.findElement(By.id("email_email")).sendKeys("seleniumthree@yopmail.com");
		   Thread.sleep(1000);
		
	   driver.findElement(By.id("employeeMobile_number")).sendKeys("8300000000");
	   
	   Thread.sleep(5000);
	
		driver.findElement(By.xpath("//div[@class='k-single-select-selected ng-star-inserted']")).click();
		
		   Thread.sleep(6000);
		
		driver.findElement(By.xpath("//button[@id='next_0_button']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@id='next_2_button']")).click();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@id='header_topbar_userSettings_button']")).click();
            Thread.sleep(5000);
    
        driver.findElement(By.xpath("//button[@id='header_topbar_logout_button']")).click();
    
             Thread.sleep(2000);
             
             driver.findElement(By.id("username_email")).sendKeys("selenium@yopmail.com");
		       Thread.sleep(3000);
		driver.findElement(By.id("password_password")).sendKeys("Kite@123#");
		     Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='next_button']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.quit();
		
		
		

		
	}
	
	
	}
	    
