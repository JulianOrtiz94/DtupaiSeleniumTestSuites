package co.dtupai.src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BasePage;

public class AbrirApp {
	private BasePage basePage;
	private WebDriver driver;
	private String website = "http://www.dtupai.co/";
	private By inputBuscar = By.xpath("//input[@value='Buscar']");

	public AbrirApp(WebDriver driver) {
		this.driver = driver;
		basePage = new BasePage(driver);
	}

	public boolean abrirApp() {
		try {
			driver.manage().window().maximize();
			driver.get(website);

			basePage.waitPresenceOfElement(inputBuscar);
			basePage.getEvidence("1. Abrir app");

			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}

	}
}
