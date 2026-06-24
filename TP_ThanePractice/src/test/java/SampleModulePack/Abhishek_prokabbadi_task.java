package SampleModulePack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Abhishek_prokabbadi_task {
	
	@Test
	public void porkabbadiyteam() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.prokabaddi.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("//a[@title=\"Standings\"]")).click();

		List<WebElement> ele = driver.findElements(By.xpath(
				"//ul[@class=\"form-listing\" and contains(.,'WWW')]/parent::div[@class=\"table-data form\"]/preceding-sibling::div[@class=\"table-data team\"]"));

		for (WebElement name : ele) {
			System.out.println(name);
			String st = name.getText();
			System.out.println(st);
		}
		
	System.out.println("test execution succsesully");
	
	}
}
