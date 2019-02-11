package configurationDemo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class TestSeleniumBlog {
	
	@Test
	public void testConfig() throws Exception {
		
		File src = new File("C:\\Users\\hamed\\eclipse-workspace_nov_27_18\\Week1st.Automation\\Configuration\\Config.property");
		
		FileInputStream fis = new FileInputStream(src);
		
		Properties pro =new Properties();
		
		pro.load(fis);
		
		String chromepath =pro.getProperty("ChromeDriver");
		
		System.out.println("Hey chrome path is ====="+chromepath);
		
		
		
	}

}
