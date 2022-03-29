package org.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample01 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP PC\\eclipse-workspace\\Dropdown\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement Btnclick = driver.findElement(By.xpath("//a [@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	Btnclick.click();
	Thread.sleep(3000);
	WebElement Dropday = driver.findElement(By.id("day"));
	Select select = new Select(Dropday);
	select.selectByValue("8");
	WebElement Dropmonth = driver.findElement(By.id("month"));
	Select select1 =new Select(Dropmonth);
	select1.selectByVisibleText("Oct");
	WebElement Dropyear= driver.findElement(By.id("year"));
	Select select2 = new Select(Dropyear);
	select2.selectByValue("1996");


}
}
