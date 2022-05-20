import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SearchFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://link.springer.com");
		
	
		System.out.println(driver.getTitle());
		
		WebElement sertextbar = driver.findElement(By.xpath("//input[@name='query']"));
		
		sertextbar.sendKeys("Biomedicine ");
		
		driver.findElement(By.xpath("//input[@class='search-submit']")).click();
		
		String expected_title= "Search Results - Springer";
		String actual_title = driver.getTitle();
		
		Assert.assertEquals(actual_title, expected_title, "We are on Biomedicine search resuly page");
		
		driver.findElement(By.xpath("//input[@name='query']")).clear();
		
		
	}

}
