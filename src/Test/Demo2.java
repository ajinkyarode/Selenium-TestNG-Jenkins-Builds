package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo2 {

	@Parameters({"URL"})
	@Test
	public void T1(String url)
	{
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,640)");
		List<WebElement> rows = driver.findElements(By.cssSelector("table[name='courses'] tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//table[@name='courses'] //tr[1]/th"));
		System.out.println("Rows present: "+rows.size());
		System.out.println("Columns present "+columns.size());
		List<WebElement> rowTwo = driver.findElements(By.xpath("//table[@name='courses'] //tr[3]/td"));
		String secondRow = "";
		for(int i=0;i<rowTwo.size();i++) {
			secondRow += " "+ rowTwo.get(i).getText().toString();
		}
		System.out.println("2nd row in the table is: \n" +secondRow);
	}
	
	@Test
	public void T2()
	{
		System.out.println("Sample test case 2 in Demo2");
	}
	
	@Test
	public void T3()
	{
		System.out.println("Sample test case 3 in Demo2");
	}
}
