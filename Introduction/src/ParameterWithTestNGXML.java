
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ParameterWithTestNGXML {
	
  WebDriver driver;

  String actualerrormessage;
  String expectederrormessage="Please enter the first name.";
  
	@BeforeMethod
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WORK\\chromedriver.exe");  
		driver=  new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://kec.kiteqa.com/login");
	    driver.findElement(By.id("username_email")).sendKeys("kec@yopmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("password_password")).sendKeys("Kite@135#");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='next_button']")).click();
	}
	  
	
	
   @Test (priority = 1)   
   public void verifyOne() throws InterruptedException
	
	{
	
driver.findElement(By.xpath("//div[@id='sidebar_reports_button']")).click();
	driver.findElement(By.xpath("//div[@id='reports_pendingApproval_tab_link']")).click();
	
	   Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='reports_all_tab_link']")).click();
	
	    Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='sidebar_employees_button']")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@id='addEmployee_button']")).click();
	     
	    Thread.sleep(2000);
	driver.findElement(By.id("firstName_text")).sendKeys("TestNG");
	    Thread.sleep(2000);
	driver.findElement(By.id("lastName_text")).sendKeys("Ten");
	
	   Thread.sleep(2000);
	driver.findElement(By.id("email_email")).sendKeys("testngten@tenopmail.com");
	   Thread.sleep(1000);
	
   driver.findElement(By.id("employeeMobile_number")).sendKeys("9610000000");
   
   Thread.sleep(2000);

   driver.findElement(By.id("4d01a042-7b98-4c4d-99f0-11d5c02ce2c1")).sendKeys("AXIS BANK");
     
       Thread.sleep(1000);
       
   driver.findElement(By.id("085378f5-f819-44ec-a80b-dfe5888aea02")).sendKeys("4545455445");
    
   
	driver.findElement(By.xpath("//div[@class='k-single-select-selected ng-star-inserted']")).click();
	
	   Thread.sleep(6000);
	
	driver.findElement(By.xpath("//button[@id='next_0_button']")).click();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//button[@id='next_2_button']")).click();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

         
	}
	   
   @Test (priority = 1)
   public void verifyTwo() throws InterruptedException
	
	{
	   
	   driver.findElement(By.xpath("//div[@id='header_topbar_userSettings_button']")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("//button[@id='header_topbar_logout_button']")).click();
       Thread.sleep(2000);
       driver.findElement(By.id("username_email")).sendKeys("kec@yopmail.com");
       Thread.sleep(3000);
       driver.findElement(By.id("password_password")).sendKeys("Kite@135#");
       Thread.sleep(2000);

      driver.findElement(By.xpath("//button[@id='next_button']")).click();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
       
	}
   
   @Test (priority = 1)   
   public void verifyThree() throws InterruptedException
	
	{
	
	driver.findElement(By.xpath("//div[@id='sidebar_employees_button']")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@id='addEmployee_button']")).click();
	  Thread.sleep(2000);
	
	driver.findElement(By.id("lastName_text")).sendKeys("Eleven");
	
	   Thread.sleep(2000);
	driver.findElement(By.id("email_email")).sendKeys("testngeleven@yopmail.com");
	   Thread.sleep(1000);
	
   driver.findElement(By.id("employeeMobile_number")).sendKeys("9620000000");
   
   Thread.sleep(2000);

   driver.findElement(By.id("4d01a042-7b98-4c4d-99f0-11d5c02ce2c1")).sendKeys("AXIS BANK");
     
       Thread.sleep(1000);
       
   driver.findElement(By.id("085378f5-f819-44ec-a80b-dfe5888aea02")).sendKeys("4545455445");
    
   
	driver.findElement(By.xpath("//div[@class='k-single-select-selected ng-star-inserted']")).click();
	
	 actualerrormessage=driver.findElement(By.id("firstName_error")).getText();
      Assert.assertEquals(actualerrormessage, expectederrormessage);
      System.out.println("Test PASSED");
      
      
	}
   
   @AfterMethod 
   public void tearDown() {
	   driver.quit();

   }
   
   }
         
	       
	 
