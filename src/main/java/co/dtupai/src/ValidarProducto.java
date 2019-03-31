package co.dtupai.src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidarProducto {
	public WebDriver driver;
	private static String nombreProd;
	private static String precioProd;
	private static String cantProd;
	
	public ValidarProducto (WebDriver driver) {
		this.driver = driver;
		
	}
	
	public static String getNombreProducto() {
		return nombreProd;
	}
	
	public static String getPrecioProducto() {
		return precioProd;
	}
	
	public static String getCantidadProducto() {
		return cantProd;
	}
	
	public void VerificarNombrePrecio() {
		nombreProd = driver.findElement(By.xpath("//span[@id='cartProdTitle']")).getText();
		precioProd = driver.findElement(By.xpath("//tr[@class='rowEven']//td[@class='cartUnitDisplay'][contains(text(),'€60.18')]")).getText();
		cantProd = driver.findElement(By.xpath("//td[@class='cartQuantity']//input[@value='1']")).getText();
	}
	
}
