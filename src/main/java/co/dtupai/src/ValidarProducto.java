package co.dtupai.src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.BasePage;

public class ValidarProducto {
	public WebDriver driver;
	private BasePage basePage;
	private static String nombreProd;
	private static String precioProd;
	private static String cantProd;
	private By productName = By.xpath("//span[@id='cartProdTitle']");
	private By productPrice = By.xpath("//tr[@class='rowEven']//td[@class='cartUnitDisplay'][contains(text(),'€60.18')]");
	private By productCount = By.xpath("//td[@class='cartQuantity']//input[@value='1']");

	public ValidarProducto(WebDriver driver) {
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
		return cantProd;
	}

	public void VerificarNombrePrecio() {
		nombreProd = basePage.readText(productName);
		precioProd = basePage.readText(productPrice);
		cantProd = basePage.readText(productCount);
	}

}
