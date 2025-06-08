import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import atracciones.Entrada;
import atracciones.Visitante;

class testVisitante {

	@Test
	void test() {
		Visitante v1 = new Visitante(120, Entrada.EXPRESS);
		
		//Comprobra altura
		assertEquals(120, v1.getAltura());
		
		//Comprobar entrada
		assertEquals(Entrada.EXPRESS, v1.getEntrada());
	}

}
