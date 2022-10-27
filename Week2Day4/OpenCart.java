package Week2Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-username")).sendKeys("AzhaguManickam");
		driver.findElement(By.id("input-firstname")).sendKeys("Azhagu");
		driver.findElement(By.id("input-lastname")).sendKeys("Manickam");
		driver.findElement(By.id("input-email")).sendKeys("azhagumanickam2002@gmail.com");
		WebElement country_id=driver.findElement(By.name("country_id"));
		Select dd1=new Select(country_id);
		dd1.selectByValue("3");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Manickam@02");
		
		
	}

}
