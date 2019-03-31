package co.dtupai.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import co.dtupai.src.SeleccionarProducto;

public class TestSeleccionarProducto {
	public SeleccionarProducto seleccionarProducto;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		seleccionarProducto = new SeleccionarProducto(TestAbrirApp.getDriver());
		boolean respuesta = seleccionarProducto.seleccionarProducto();
		assertTrue("Error al seleccionar producto", respuesta);
	}

}
