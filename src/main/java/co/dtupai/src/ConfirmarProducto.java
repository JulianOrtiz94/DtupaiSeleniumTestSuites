package co.dtupai.src;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmarProducto {
	public WebDriver driver;
	private static String nombreProd;
	private static String precioProd;
	private static String cantidadProd;
	public ConfirmarProducto (WebDriver driver) {
		this.driver = driver;
		
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
			nombreProd = driver.findElement(By.xpath("//h1[@class='productGeneral']")).getText();
			precioProd = driver.findElement(By.xpath("//span[contains(text(),'€60.18')]")).getText();
			cantidadProd = driver.findElement(By.xpath("//span[@class='qty']//input[@value='1']")).getText();
			
			WebElement checkTalla = driver.findElement(By.xpath("//input[@value='9']"));
			checkTalla.click();
			WebElement checkColor = driver.findElement(By.xpath("//input[@id='selColIMG2']"));
			checkColor.click();
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,150)", "");
			
			WebDriverWait wait = new WebDriverWait(driver , 5);
			wait.until(ExpectedConditions.elementToBeSelected(checkTalla));
			wait.until(ExpectedConditions.elementToBeSelected(checkColor));
			
			Thread.sleep(1000);
			Screenshot.guardarScreenshot(driver, "4.Seleccionar Caracteristicas Producto");
			
			WebElement buyButton = driver.findElement(By.xpath("//input[contains(@title,'Añadir al carro')]"));
			
			buyButton.click();

			jse.executeScript("window.scrollBy(0,350)", "");
			Thread.sleep(1000);
			Screenshot.guardarScreenshot(driver, "5. Carrito de compras");
			
			
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
			return false;
		}
		
	}
}
