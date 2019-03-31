package co.dtupai.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.dtupai.src.ConfirmarProducto;
import co.dtupai.src.ValidarProducto;

public class TestValidarProducto {
	public ConfirmarProducto confirmarProducto = new ConfirmarProducto(TestAbrirApp.getDriver());
	public ValidarProducto validarProd = new ValidarProducto(TestAbrirApp.getDriver());
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		TestAbrirApp.getDriver().close();
	}

	@Test
	public void test() {
		validarProd.VerificarNombrePrecio();
		System.out.println(ConfirmarProducto.getNombreProducto());
		System.out.println(ValidarProducto.getNombreProducto());

		assertEquals("Validar nombre producto en el carrito de compras",ConfirmarProducto.getNombreProducto().toUpperCase(),  ValidarProducto.getNombreProducto().toUpperCase());
		
		System.out.println(ConfirmarProducto.getPrecioProducto());
		System.out.println(ValidarProducto.getPrecioProducto());
		
		assertEquals("Validar precio producto en el carrito de compras",ConfirmarProducto.getPrecioProducto().toUpperCase() , ValidarProducto.getPrecioProducto().toUpperCase());
		
		System.out.println(ConfirmarProducto.getCantidadProducto());
		System.out.println(ValidarProducto.getCantidadProducto());
		
		assertEquals("Validar cantidad producto en el carrito de compras",ConfirmarProducto.getCantidadProducto().toUpperCase() , ValidarProducto.getCantidadProducto().toUpperCase());
	}

}
