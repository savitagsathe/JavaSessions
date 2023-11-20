package JavaProgram;

import java.awt.event.ActionEvent;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumSessions.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice 
{
	   static WebDriver driver;
	public static void main(String args[])  {
		
          WebDriverManager.chromedriver().setup();
          driver=new ChromeDriver();
          driver.get("https://crmpro.com/");
         // By fn=By.name("firstname");
          //driver.findElement(fn).sendKeys("savita");
          
          //By ln=By.id("input-lastname");
          
          ElementUtil ele=new ElementUtil(driver);
          //ele.doSendKeys(fn, "savita");
          //ele.doSendKeys(ln, "sathe");
          
          //3.classname :duplicate 
          //driver.findElement(By.className("form-control")).sendKeys("savita");
          
          //4.xpath:is not an attribute
          //driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("savita");
          
          //5.Css : 
          //driver.findElement(By.cssSelector("#input-firstname")).sendKeys("savita");
          
         // driver.findElement(By.partialLinkText("Delivery")).click();
         // String hearderText=driver.findElement(By.tagName("h3")).getText();
         // System.out.println(hearderText);
          
          By customers=By.linkText("Customers");
          doClick(customers);
           By tagmarketing=By.tagName("h3");
           System.out.println(doGetText(tagmarketing));
           
	
}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}
	

}


