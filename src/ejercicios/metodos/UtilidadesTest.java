package ejercicios.metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class UtilidadesTest {

	//
//	@Test
//	public void testSaludarString() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testSaludarStringString() throws Exception {

		assertEquals("Hola Manolo", Utilidades.saludar("Manolo", Utilidades.IDIOMA_CASTELLANO));
		assertEquals("Kaixo Manolo", Utilidades.saludar("Manolo", Utilidades.IDIOMA_EUSKERA));
		assertEquals("Hello Manolo", Utilidades.saludar("Manolo", Utilidades.IDIOMA_INGLES));

		try {
			Utilidades.saludar("Manolo", "suagiuli");
			fail("deberia lanzar Exception");
		} catch (Exception e) {
			// funciona la excepccion
			assertEquals("Idioma no permitido suagiuli", e.getMessage());
		}

	}

	@Test
	public void testSuma() {

		assertEquals(6, Utilidades.suma(3, 3));

		// mas asserciones que podemos usar
		assertTrue(true);
		assertFalse(2 > 300);
		assertNull(null);
		// assertNotNull

	}

//	@Test
//	public void testCalcularLetraDniInt() {
//		fail("Not yet implemented");
//	}
//
	@Test
	public void testCalcularLetraDniString() throws Exception {

		assertEquals('H', Utilidades.calcularLetraDni("11111111"));
		assertEquals('H', Utilidades.calcularLetraDni(11111111));

		try {
			assertEquals('H', Utilidades.calcularLetraDni("123"));
			fail("deberia lanzar Exception");
		} catch (Exception e) {

		}

		try {
			assertEquals('H', Utilidades.calcularLetraDni(null));
			fail("deberia lanzar Exception");
		} catch (Exception e) {

		}

		try {
			assertEquals('H', Utilidades.calcularLetraDni("1234567a"));
			fail("deberia lanzar Exception");
		} catch (Exception e) {

		}

	}

	@Test(expected = Exception.class)
	public void testCalcularLetraDniStringException1() throws Exception {
		Utilidades.calcularLetraDni("1234567a");
	}

	@Test
	public void bubbleShort() {

		int[] aDesordenado = { 8, 3, 1, 0 };

		int[] aOrdenado = Utilidades.bubbleShort(aDesordenado);

		assertEquals(0, aOrdenado[0]);
		assertEquals(1, aOrdenado[1]);
		assertEquals(3, aOrdenado[2]);
		assertEquals(8, aOrdenado[3]);

		int[] aOrdenado2 = Utilidades.bubbleShortJoseba(aDesordenado);

		assertEquals(0, aOrdenado2[0]);
		assertEquals(1, aOrdenado2[1]);
		assertEquals(3, aOrdenado2[2]);
		assertEquals(8, aOrdenado2[3]);

	}

}
