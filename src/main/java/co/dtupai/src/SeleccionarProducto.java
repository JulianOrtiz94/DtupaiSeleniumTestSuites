package co.dtupai.src;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleccionarProducto {
	public WebDriver driver;
	
	public SeleccionarProducto (WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean seleccionarProducto() {
		try {
			WebElement producto = driver.findElement(By.xpath("//a[contains(text(),'2016 hombres zapatos Zapatillas Hombre calzado zap')]"));
			producto.click();
			Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,320)", "");
			Screenshot.guardarScreenshot(driver, "3.Seleccionar Producto");
			return true;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			return false;
		}
		
	}
}
