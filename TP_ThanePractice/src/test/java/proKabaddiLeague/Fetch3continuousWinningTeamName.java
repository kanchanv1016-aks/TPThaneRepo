package proKabaddiLeague;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.comcast.crm.generic.fileutility.ExcelUtilityForFillForm;
import com.comcast.crm.generic.fileutility.JavaUtility;
import com.comcast.crm.generic.fileutility.WebDriverUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Fetch3continuousWinningTeamName {
	@Test
	public void Fetch3continuousWinningTeamName() throws Throwable {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.prokabaddi.com/");

		driver.findElement(By.xpath("//a[@href='https://www.prokabaddi.com/standings']")).click();

		List<WebElement> teamName = driver.findElements(By.xpath(
				"//ul[@class='form-listing' and contains(.,'WWW')]//ancestor::div[@class='table-row-wrap' and contains(.,'P')]//p[@class='name']"));
		for(WebElement team : teamName)
		System.out.println(team.getText());
		
		System.out.println(";;;;;;;;;;");
		System.out.println("++++++++++++++");
		System.out.println("=-=-=-=-==-=");
	}
}