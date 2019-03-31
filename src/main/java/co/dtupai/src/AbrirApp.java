package co.dtupai.src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import co.dtupai.src.Screenshot;

public class AbrirApp {
	public WebDriver driver;
	
	public AbrirApp (WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean abrirApp() {
		try {
			driver.manage().window().maximize();
			driver.get("http://www.dtupai.co/");
			
			WebDriverWait wait = new WebDriverWait(driver , 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='Buscar']")));
			Screenshot.guardarScreenshot(driver, "1. Abrir app");
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
			return false;
		}
		
	}
}
