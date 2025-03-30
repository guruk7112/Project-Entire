package Ecommerce.Mycs.Practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class JavascriptExecutorTest {

	@Test
	public void test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions action =new Actions(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;                     //driver.get(stirng url)
		js.executeScript("window.location = 'http://localhost:8888';");

		WebElement username = driver.findElement(By.name("user_name"));         //send keys
		js.executeScript("arguments[0].value='admin';", username);

		WebElement password = driver.findElement(By.xpath("//input[@type='password' and @name='user_password']"));
		js.executeScript("arguments[0].value='admin';", password);
		
		WebElement login = driver.findElement(By.id("submitButton"));            //click
		js.executeScript("arguments[0].click();", login);
		
		js.executeScript("alert('Hello,i m dielan');");                          //create alert
		Alert al=driver.switchTo().alert();
		al.accept();
			
		js.executeScript("history.go(0);");                                    //refresh the page

		WebElement element =driver.findElement(By.xpath("//img[@src='cache/images/vert_']"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);      //scroll to element  
		     
	//   or	js.executeScript("window.scrollBy(1000, 1000);");  //down

		js.executeScript("window.scrollBy({ top: -1000, left: 0, behavior: 'smooth' });"); //smooth scroll
		

		action.scrollByAmount(0, -1000).perform();    //scroll to top

	}
}
