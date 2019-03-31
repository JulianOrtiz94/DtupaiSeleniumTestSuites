package co.dtupai.src;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import utilities.BasePage;

public class SeleccionarProducto {
	public WebDriver driver;
	private BasePage basePage;
	private By product = By.xpath("//a[contains(text(),'2016 hombres zapatos Zapatillas Hombre calzado zap')]");
	
	public SeleccionarProducto (WebDriver driver) {
		this.driver = driver;
		basePage = new BasePage(driver);
	}
	
	public boolean seleccionarProducto() {
		try {
			basePage.click(product);
			Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,320)", "");
			basePage.getEvidence("3.Seleccionar Producto");
			
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			return false;
		} 
		
	}
}
