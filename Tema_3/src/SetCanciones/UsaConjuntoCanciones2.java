package SetCanciones;

import java.util.Set;
import java.util.TreeSet;

public class UsaConjuntoCanciones2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Cancion> conjCanciones = new TreeSet<>();
		
		conjCanciones.add(new Cancion("AAA", "BBB", 5));
		conjCanciones.add(new Cancion("AAA", "BBB", 10));
		conjCanciones.add(new Cancion("CCC", "BBB", 5));
		conjCanciones.add(new Cancion("AAA", "DDD", 20));
		conjCanciones.add(new Cancion("GGG", "LLL", 5));
		conjCanciones.add(new Cancion("LLL", "GGG", 20));
		conjCanciones.add(new Cancion("NNN", "MMM", 5));
		conjCanciones.add(new Cancion("NNN", "MMM", 5));
		
		for (Cancion cancion : conjCanciones) {
			System.out.println(cancion);
		}
		
	}

}
