package co.dtupai.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import co.dtupai.src.BuscarProducto;

public class TestBuscarProducto {
	public BuscarProducto buscarProducto;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		buscarProducto = new BuscarProducto(TestAbrirApp.getDriver());
		boolean respuesta = buscarProducto.buscarProducto();
		assertTrue("Error al buscar un producto", respuesta);
	}

}
