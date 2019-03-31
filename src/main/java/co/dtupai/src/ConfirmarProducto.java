package co.dtupai.src;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import utilities.BasePage;

public class ConfirmarProducto {
	public WebDriver driver;
	private BasePage basePage;
	private static String nombreProd;
	private static String precioProd;
	private static String cantidadProd;
	
	private By nameProduct = By.xpath("//h1[@class='productGeneral']");
	private By priceProduct = By.xpath("//span[contains(text(),'€60.18')]");
	private By countProduct = By.xpath("//span[@class='qty']//input[@value='1']");
	private By checkTalla = By.xpath("//input[@value='9']");
	private By checkColor = By.xpath("//input[@id='selColIMG2']");
	private By buyButton = By.xpath("//input[contains(@title,'Añadir al carro')]");
	
	public ConfirmarProducto (WebDriver driver) {
		this.driver = driver;
		basePage = new BasePage(driver);
		
	}
	
	public static String getNombreProducto() {
		return nombreProd;
	}
	
	public static String getPrecioProducto() {
		return precioProd;
	}
	
	public static String getCantidadProducto() {
		return cantidadProd;
	}
	
	public boolean confirmarProducto() {
		try {
			nombreProd = basePage.readText(nameProduct);
			precioProd = basePage.readText(priceProduct);
			cantidadProd = basePage.readText(countProduct);
			
			basePage.click(checkTalla);
			basePage.click(checkColor);
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,150)", "");
			
			basePage.waitElementToBeSelected(checkTalla);
			basePage.waitElementToBeSelected(checkColor);
			
			Thread.sleep(1000);
			
			basePage.getEvidence( "4.Seleccionar Caracteristicas Producto");
		
			basePage.click(buyButton);

			jse.executeScript("window.scrollBy(0,350)", "");
			Thread.sleep(1000);
			basePage.getEvidence("5. Carrito de compras");
		
			
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
			return false;
		}
		
	}
}
