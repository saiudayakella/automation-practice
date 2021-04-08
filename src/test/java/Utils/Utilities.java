package Utils;

import java.util.Random;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Utilities {
	
	/**
	 * 
	 * @param allowedCharacters - Characters to be part of random string
	 * @param length - Desired length of the random string
	 * @return generated random string
	 */
	public static String generateRandomString(String allowedCharacters, int length) {		
	    Random random = new Random();
	    
	    StringBuilder builder = new StringBuilder();
	    
	    for (int i = 0; i < length; i++) {
	       int randIndex=random.nextInt(allowedCharacters.length()); 
	       builder.append(allowedCharacters.charAt(randIndex));            
	    }
	    
	    return builder.toString();
	}
	
	/**
	 * 
	 * @return instance of ExtentReports
	 */
	public static ExtentReports getReporter() {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/ExecutionReport.html");
		extent.attachReporter(spark);
		return extent;		
	}

}
