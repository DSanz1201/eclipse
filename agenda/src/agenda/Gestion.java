package agenda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Gestion {

	public static void main(String[] args) {
		Agenda trabajo = new Agenda();
		
		trabajo.setNombre("Mi agenda de trabajo");
		
		ArrayList<String> emailsPablo = new ArrayList<String>();
		emailsPablo.add("garaizar@deusto.es");
		emailsPablo.add("pablo.garaizar@deusto.es");
		emailsPablo.add("pgaraizar@deusto.es");

		Contacto c1 = new Contacto("Pablo", "123456789", emailsPablo);
		
		trabajo.anyadir(c1);
		
		trabajo.guardarDatosBinario("trabajo.dat");
		
		Agenda casa = new Agenda();
		
		casa.leerDatosBinario("trabajo.dat");
		
		System.out.println(casa);
		
	}

}

