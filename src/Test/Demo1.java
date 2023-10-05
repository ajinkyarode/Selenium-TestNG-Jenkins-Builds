package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {

	
	@Parameters({"URL"})
	@Test
	public void T1(String url)
	{
		
		  System.setProperty("webdriver.chrome.driver", "C://Users//ajink//eclipse-workspace//Demo//TestNGSample//lib//chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get(url); 
		  WebElement we = driver.findElement(By.id("checkbox-example"));
		  //int temp=we.findElements(By.tagName("label")).size(); 
		  //int randomNum = getRandomNumber(1,temp);
		  int randomNum = 3;
		  
		  driver.findElement(By.xpath("//div[@id='checkbox-example']//label["+randomNum+"]/input")).click(); 
		  String option = driver.findElement(By.xpath("//div[@id='checkbox-example']//label["+randomNum+"]")).getText(); 
		  option = option.trim();
		  
		  WebElement web = driver.findElement(By.id("dropdown-class-example")); 
		  Select se = new Select(web); se.selectByVisibleText(option);
		  
		  driver.findElement(By.id("name")).sendKeys(option);
		  driver.findElement(By.id("alertbtn")).click(); 
		  String verifyName = driver.switchTo().alert().getText(); 
		  
			  if(verifyName.contains(option)) {
				  driver.switchTo().alert().accept(); 
			  } 
			  else {
				  System.out.println("Something went wrong"); 
			  } 
		  
	}

	@Test
	public void T2()
	{
		System.out.println("Sample test case 2 in Demo1");
	}
	
	@Test
	public void T3()
	{
		System.out.println("Sample test case 3 in Demo1");
	}
	
	@BeforeTest
	public void start()
	{
		System.out.println("Test Demo1 is starting");
	}
	
	@AfterTest
	public void end()
	{
		System.out.println("Test Demo1 finished executing");
	}
//	@Test
//	public static int getRandomNumber(int min, int max) 
//	{
//		return (int) ((Math.random() * (max - min)) + min);
//	}
}