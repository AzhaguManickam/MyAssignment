package Week5Day2;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundNewAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']")).click();
	    Alert alert1= driver.switchTo().alert();
	    alert1.accept();
	    
	    driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']")).click();
	    Alert alert2= driver.switchTo().alert();
	    alert2.accept();

	    WebElement value=driver.findElement(By.xpath("//span[@id='result']"));
	    String text =value.getText();
	    System.out.println(text);
	    
	    if(value.getText().equals("User Clicked : Cancel")) {
	    	System.out.println("Confirmed dialog");
	    } else {
	    	System.out.println("Not Confirmed");
	    }
	    
	    driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']")).click();
	    Alert sA1= driver.switchTo().alert();
	    sA1.sendKeys("manickam");
	    sA1.accept();
	    String name=driver.findElement(By.id("confirm_result")).getText();
	    System.out.println(name);
	    
	    driver.findElement(By.xpath("//button[@id='j_idt88:j_idt95']")).click();
	    driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).click();
	    
	    driver.findElement(By.xpath("//button[@id='j_idt88:j_idt106']")).click();
	    driver.findElement(By.xpath("//button[@id='j_idt88:j_idt109']")).click();
	    
	    driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();

}
}
