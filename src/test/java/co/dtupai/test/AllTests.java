package co.dtupai.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	TestAbrirApp.class, 
	TestBuscarProducto.class,
	TestSeleccionarProducto.class,
	TestConfirmarProducto.class,
	TestValidarProducto.class})
public class AllTests {

}
