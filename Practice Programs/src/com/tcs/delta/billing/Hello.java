package com.tcs.delta.billing;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Hello{
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.crome.driver","E:\\Pooja Tetu Java Practice\\Practice Programs\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 //to navigate the url
	driver.get("https://en-gb.facebook.com/r.php");
	String title=driver.getTitle();
	System.out.println(title);
	String cu=driver.getCurrentUrl();
	System.out.println(cu);
	//driver.close();
	WebElement email=driver.findElement(By.id("email"));
	email.sendKeys("java");
	WebElement pwd=driver.findElement(By.name("pass"));
	pwd.sendKeys("selenium");
	
	 
 }
}
