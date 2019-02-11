package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {

	Properties pro;
	public ConfigReader() {
		try {    // it is config reader method

			File src = new File(
					"C:\\Users\\hamed\\eclipse-workspace_nov_27_18\\Week1st.Automation\\Configuration\\Config.property");

			FileInputStream fis = new FileInputStream(src);

		    pro = new Properties();

			pro.load(fis);

		} catch (Exception e) {
			
			System.out.println("Exception is ==="+e.getMessage());
		}

	}
	public String getChromePath() {
		
		String path = pro.getProperty("ChromeDriver");
		return path;
	
	}
	public String getApplicationUrl() {
		
		return pro.getProperty("URL");
	}

}
