package Week2Day4;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redBus {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("chennai");
         Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Tenkasi");
		  Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//td[text()='27']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		driver.findElement(By.xpath("//div[text()='View Seats']")).click();
		driver.findElement(By.xpath("//div[text()='HIDE SEATS']")).click();
		
		
		
		
	}

}
