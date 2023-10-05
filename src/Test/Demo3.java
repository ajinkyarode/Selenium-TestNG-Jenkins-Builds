package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo3 {

	@Parameters({"URL"})
	@Test
	public void T1(String url)
	{
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		driver.findElements(By.cssSelector("input[value='checkbox']")).size();
	}
	
	@Test
	public void T2()
	{
		System.out.println("Sample test case 2 in Demo3");
	}
	
	@Test
	public void T3()
	{
		System.out.println("Sample test case 3 in Demo3");
	}
}
