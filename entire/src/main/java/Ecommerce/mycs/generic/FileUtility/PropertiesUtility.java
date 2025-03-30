package Ecommerce.mycs.generic.FileUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {

	public String getDataFromPropertiesFile(String path,String key) throws IOException  {
		FileInputStream fis=new FileInputStream(path);
		Properties po=new Properties();
		po.load(fis);
		String value=po.getProperty(key);
		return value;
	}
	public String getDataFromProperties(String key) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\eclipse\\entire\\src\\main\\resources\\commondata.properties");
		Properties po=new Properties();
		po.load(fis);
		String value=po.getProperty(key);
		return value;
	}
}
