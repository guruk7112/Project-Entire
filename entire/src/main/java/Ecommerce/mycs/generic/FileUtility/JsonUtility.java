package Ecommerce.mycs.generic.FileUtility;

import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonUtility {        //json syntax exception

	public String getDataFromJsonFile(String key) throws Exception  {

	JSONParser parser=new JSONParser();
	Object object=parser.parse(new FileReader("C:\\eclipse\\framework\\src\\main\\resources\\file.json"));
	JSONObject jo=(JSONObject)object;
	 String data=(String) jo.get(key);
	 return data;
}
}
