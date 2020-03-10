package jotaiunit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPrincipal {

//	@Test
//	public void testOperacion() { // Testea la multiplicación
//		double resultado = Principal.operacion(10, 5);
//		double esperado = 50d;
//
//		assertEquals(esperado, resultado, 0); // delta es la diferencia máxima entre resultado y esperado

//	}

	@Test
	public void testMetodoestring() {
		String resultado = Principal.metodoestring();
		String esperado = "Hola amiguitos del progressive";

		assertEquals("Hola amiguitos del progressive", esperado, resultado);
	}

	@Test
	public void testEsBisiesto() {
		String resultado = Principal.esBisiesto(2004);
		String esperado = "SÍ es bisiesto";

		assertEquals("Es bisiesto", esperado, resultado);

	}

}
