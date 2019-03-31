package co.dtupai.src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.BasePage;

public class BuscarProducto {
	public WebDriver driver;
	private BasePage basePage;

	private By inputBuscar = By.xpath("//input[@value='Buscar']");

	public BuscarProducto(WebDriver driver) {
		this.driver = driver;
		basePage = new BasePage(driver);
	}

	public boolean buscarProducto() {
		try {
			basePage.waitPresenceOfElement(inputBuscar);

			basePage.writeText(inputBuscar, "zapatillas");
			basePage.getEvidence("2.BuscarProducto - Ingresar texto");
			basePage.submit(inputBuscar);
			basePage.getEvidence("2.BuscarProducto - Resultados");

			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
			return false;
		}
	}
}
