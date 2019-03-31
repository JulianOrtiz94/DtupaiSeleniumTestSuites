package co.dtupai.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import co.dtupai.src.AbrirApp;

public class TestAbrirApp {
	private static WebDriver driver;
	public AbrirApp abrirApp;

	public static WebDriver getDriver() {
		return driver;
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		abrirApp = new AbrirApp(driver);
		boolean respuesta = abrirApp.abrirApp();
		System.out.println(respuesta);
		assertTrue("Error al abrir la app", respuesta);

	}

}
