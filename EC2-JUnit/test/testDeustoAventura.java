import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import atracciones.Atraccion;
import atracciones.DeustoAventura;
import atracciones.Entrada;
import atracciones.Visitante;

class testDeustoAventura {
	@Test
	void asignarAtracciones() {
		ArrayList<Visitante> visitantes = DeustoAventura.cargaDatosVisitantes("visitantes.csv");
		Atraccion[] ats = {
				new Atraccion("Carrusel", 0, 50),
				new Atraccion("Montaña rusa", 140, 25),
				new Atraccion("Autos locos", 100, 35),
				new Atraccion("Mansión embrujada", 120, 15),
				new Atraccion("Water splash", 90, 40)
		};
		ArrayList<Atraccion> atracciones = new ArrayList<Atraccion>(Arrays.asList(ats));
		DeustoAventura.asignarAtracciones(atracciones, visitantes);
		
		//Todos tienen 3
		for(int i = 0; i < atracciones.size(); i++) {
			assertEquals(3, visitantes.get(i).getAtracciones().size());
		}
	}
	/**
	@Test
	void testCargaDatosVisitantes() {
		try {
			ArrayList<Visitante> visitantes = DeustoAventura.cargaDatosVisitantes("visitantes.csv");
			assertEquals(50, visitantes.size());
			
			//Primer visitante
			assertEquals(147, visitantes.get(0).getAltura());
			assertEquals(Entrada.VIP, visitantes.get(0).getEntrada());
			assertEquals(1, visitantes.get(0).getCodigo());
			assertTrue(visitantes.get(0).getAtracciones().isEmpty());
			
			//Ultimo visitantes
			assertEquals(102, visitantes.get(49).getAltura());
			assertEquals(Entrada.NORMAL, visitantes.get(49).getEntrada());
			assertEquals(50, visitantes.get(49).getCodigo());
			assertTrue(visitantes.get(49).getAtracciones().isEmpty());
			
			//Visitante 20
			assertEquals(173, visitantes.get(19).getAltura());
			assertEquals(Entrada.EXPRESS, visitantes.get(19).getEntrada());
			assertEquals(20, visitantes.get(19).getCodigo());
			assertTrue(visitantes.get(19).getAtracciones().isEmpty());
			
		} catch (Exception e) {
			fail("Se ha producido la excepcion con un nombre de fichero correcto");
		}
		
		//Estoy com`probando que la extepcion se lanza cuando deberia en caso de si excepcion
		try {
			ArrayList<Visitante> visitantes = DeustoAventura.cargaDatosVisitantes("clientes.csv");
			fail("No se a producido la excepcion y si deberia");
		} catch (Exception e) {
			//Ok
		}
	}
	*/

}
