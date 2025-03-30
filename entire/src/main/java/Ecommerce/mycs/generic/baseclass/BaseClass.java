package Ecommerce.mycs.generic.baseclass;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Ecommerce.mycs.generic.DatabaseUtility.DatabaseUtility;
import Ecommerce.mycs.generic.FileUtility.ExcelUtility;
import Ecommerce.mycs.generic.FileUtility.JsonUtility;
import Ecommerce.mycs.generic.FileUtility.PropertiesUtility;
import Ecommerce.mycs.generic.WebDriverUtility.JavaUtility;
import Ecommerce.mycs.generic.WebDriverUtility.WebDriverUtility;

public class BaseClass {
	public PropertiesUtility pLib = new PropertiesUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public JsonUtility jLib = new JsonUtility();
	public WebDriverUtility wLib = new WebDriverUtility();
	public JavaUtility JvLib = new JavaUtility();
	public DatabaseUtility dLib = new DatabaseUtility();
	public WebDriver driver;

	@BeforeSuite
	public void conigBS() throws SQLException {
		dLib.connectToDataBase();

	}

	@BeforeTest
	public void configBT() {
		System.out.println("Before Teset");
	}

	@BeforeClass
	public void configBC() throws IOException {
		String browser = pLib.getDataFromProperties("browser");

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}
	}

	@BeforeMethod
	public void configBM() throws IOException {
		String username = pLib.getDataFromProperties("username");
		String password = pLib.getDataFromProperties("password");

	}

	@AfterMethod
	public void configAM() {

	}

	@AfterClass
	public void configAC() {
		driver.close();
	}

	@AfterTest
	public void configAT() {
		System.out.println("aftertest");
	}

	@AfterSuite
	public void configAS() throws SQLException {
		dLib.closeConnections();
	}

}
