package genericUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestlistnerImplementation implements ITestListener{


	@Override
	public void onTestFailure(ITestResult result) {
		String failedMethod = result.getMethod().getMethodName();
	   TakesScreenshot ts = (TakesScreenshot)BaseClassForPeppaApp.sdriver;
	      File src = ts.getScreenshotAs(OutputType.FILE);
	      File dst=new File("./Screenshot/"+failedMethod+".png");
	     try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	

}
