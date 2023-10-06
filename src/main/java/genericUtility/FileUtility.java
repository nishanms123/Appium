package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtility {
	
	public String getDataFromPropertyFile(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./commonData.properties");
		Properties p=new Properties();
		p.load(fis);
		 return p.getProperty(key);
		
	}

}
