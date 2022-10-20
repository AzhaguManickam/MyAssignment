package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver = new EdgeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Azhagu");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Manickam");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Azhagu");
	driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Manickam");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("BSC");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("cgnnkjbgcgfx");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("azhagumanickam2002@gmail.com");
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.className("subMenuButton")).click();
	driver.findElement(By.name("description")).clear();
	driver.findElement(By.name("importantNote")).sendKeys("Qa analyst is best");
	driver.findElement(By.name("submitbutton")).click();
	String title = driver.getTitle();
	System.out.println(title);
	
	
	
	}
}
