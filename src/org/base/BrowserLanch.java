package org.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLanch {
	
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","F:\\eclipse\\BrowserLanch\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");

	//to print all data present in the webTable
	//step1 locate the webTable

	WebElement tableElement = driver.findElement(By.tagName("table"));
	
	//step2 find the heading and contend in the table
	
	WebElement headingElement = tableElement.findElement(By.tagName("thead"));
	
	//step3 find adding data
	
	List<WebElement> findElements = headingElement.findElements(By.tagName("th"));
//	
//	//Separate each and every heading data
    for (int i = 0; i < findElements.size(); i++) {
 	 WebElement headingdata = findElements.get(i);
   	 String text = headingdata.getText();
    	 System.out.println(text);
	}     
     //step4 find the table body      
    List<WebElement> rowElement = tableElement.findElements(By.tagName("tr"));
    
    //Separate each row 
     for (int i = 0; i < rowElement.size(); i++) {
    
    //	if (i%2==0) {
    		 
    		 WebElement eachrow = rowElement.get(i);	
        	 List<WebElement> findElements2 = eachrow.findElements(By.tagName("td"));
    	
    	 for (int j = 0; j < findElements2.size(); j++) {
   		 WebElement dataElement = findElements2.get(j);
   		 String text = dataElement.getText();
   		 System.out.println(text);
    	
    	 }	
		}
			
		}
	}
	
     
     
     
	}    
     
     
     
	
	
	
	
	
	
	
	
	
	
	

