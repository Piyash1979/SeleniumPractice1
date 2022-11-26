package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriber.chrome.driver", "./Drivers/drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());
		
		
		
		driver.close();
		


			/*//launch Chrome browser
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\git\\repository\\SeleniumTraining\\drivers\\chromedriver.exe");
			
			//Object of ChromeDriver class 
			ChromeDriver driver = new ChromeDriver();
			
			//Explicitly wait
			Thread.sleep(3000);
			
			//Maximize window
			driver.manage().window().maximize();
			
			// load url
			driver.get("http://leaftaps.com/opentaps");
							
			//Print Title of the page
			driver.getTitle();
			System.out.println(driver.getTitle());
			
			 
			 //Implicitly wait
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			 //enter username
			driver.findElementById("username").sendKeys("DemoSalesManager");
			//driver.findElementById("username").sendKeys("DemoSalesManager");
			 
			//enter password
			 driver.findElementById("password").sendKeys("crmsfa");
			//driver.findElementByName("PASSWORD").sendKeys("crmsfa");
			 
			 //click login btn
			 driver.findElementByClassName("decorativeSubmit").click();
			// driver.findElementByClassName("decorativeSubmit").click();
			 
			 //click CRM/SFA
			 driver.findElementByLinkText("CRM/SFA").click();
			 //driver.findElementByLinkText("CRM/SFA").click();
			 
			 //Click Leads link
			 driver.findElementByLinkText("Leads").click();
			
			 Thread.sleep(3000); 			 
			 //close browser
			driver.close();		
			
		}*/
}
	}


