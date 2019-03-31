package co.dtupai.src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuscarProducto {
	public WebDriver driver;
	
	public BuscarProducto (WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean buscarProducto() {
		try {
			WebElement inputBuscar = (new WebDriverWait(driver, 10))
    				  .until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@value='Buscar']"))));
			inputBuscar.sendKeys("zapatillas");
			Screenshot.guardarScreenshot(driver, "2.BuscarProducto - Ingresar texto");
			inputBuscar.submit();
			Screenshot.guardarScreenshot(driver, "2.BuscarProducto - Resultados");
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
			return false;
		}
	}
}
