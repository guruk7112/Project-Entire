package Ecommerce.Mycs.Practice;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Ecommerce.mycs.generic.ListenereUtility.LIstImpClass.class)
public class ChromeDinoGame {

	@Test
	public void kdTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("chrome://dino/");
		} catch (Exception e) {
			for (;;) {
				Actions action = new Actions(driver);
				Thread.sleep(350);
				action.keyUp(Keys.SPACE).keyDown(Keys.SPACE).perform();
				int a = 1;
//				if (a > 0) {
//				Thread.sleep(4300);
//					a--;
				//}
			}
		}
	}

}