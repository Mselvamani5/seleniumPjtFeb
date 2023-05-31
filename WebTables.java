package Selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
	
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");//locating driver
		
		 WebDriver driver=new ChromeDriver();//
		 
		 driver.get("https://www.leafground.com/table.xhtml");//launching website
		 
		 driver.manage().window().maximize();//maximizing
		
		 //to find the column
		 List<WebElement>col=driver.findElements(By.xpath("//table[@role='grid']/tbody/tr[1]/td"));
		 
		 int len = col.size();
		 
		 System.out.println("The Size Of The Column Is"+len);
		 //to find the row
		 
         List<WebElement>row=driver.findElements(By.xpath("//table[@role='grid']/tbody/tr"));
		 
		 int len2 = row.size();
		 
		 System.out.println("The Size Of The Row Is"+len2);
		
          //to find the names given by country
		 
		 String country ="Japan";
		
		List<WebElement> countries=driver.findElements(By.xpath("//table[@role='grid']/tbody/tr/td[2]"));
	      
		for(int i=0; i< countries.size();i++) {
			String con=countries.get(i).getText();
			
			if(con.equals(country)) {
				int pos=i+1;
			String name = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr["+pos+"/td[3]")).getText();
			  System.out.println(name); 
						
			}
		}
		 
		 //driver.close();//close your browser	Q
		 
	}
}
		

	
		
		




