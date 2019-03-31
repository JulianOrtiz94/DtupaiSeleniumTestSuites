package co.dtupai.src;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static void guardarScreenshot(WebDriver driver, String nombreArchivo) {
		TakesScreenshot ts = (TakesScreenshot)driver;	
		 
	    try {
	        FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("C:\\SELENIUM\\Evidencia\\"+ nombreArchivo +".png"));
	    } catch (WebDriverException e) {
	 
	    } catch (IOException e) {
	 
	    }
	}
}
