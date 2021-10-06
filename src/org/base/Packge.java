
package org.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Packge {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\BrowserLanch\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		
		WebElement findElement = driver.findElement(By.tagName("table"));
		WebElement findElement2 = findElement.findElement(By.tagName("thead"));
		WebElement findElement3 = findElement2.findElement(By.tagName("tr"));
		
		List<WebElement> findElements = findElement3.findElements(By.tagName("th"));
		
		for (int i = 0; i <findElements.size(); i++) {
			WebElement webElement = findElements.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}
		
		WebElement bodyElement =tableElement.findElement(By.tagName("tbody"));
		  List<WebElement> elementRows = bodyElement.findElements(By.tagName("tr"));
		  
		  WebElement middleRow = elementRows.get(elementRows.size()/2);
		  List<WebElement> ListDatas = middleRow.findElements(By.tagName("td"));
		  
		  for (int i = 0; i < ListDatas.size(); i++) {
			  WebElement allMiddleData= ListDatas.get(i);
			  String text = allMiddleData.getText();
			  System.out.println(text);
			
		}
		   
		  
		
			
			
		}
		    
		
		 
		
		
		
	}
	
	


