package surf;

import java.util.ArrayList;

public class MainEscuelaOlasVivas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario instructor1 = new Instructor("Instructor1", "001101", "+345689745", 25, 3);
		Usuario instructor2 = new Instructor("Instructor2", "002202", "+345689745", 21, 1);
		Usuario instructor3 = new Instructor("Instructor3", "003303", "+345689745", 31, 6);
		Usuario instructor4 = new Instructor("Instructor4", "004404", "+345689745", 28, 2);
		Usuario instructor5 = new Instructor("Instructor5", "005505", "+345689745", 29, 4);
		
		Usuario alumno1 = new Alumno("Juan", "111111", "258147369", 19, 2);
		Usuario alumno2 = new Alumno("Iker", "222222", "258147369", 24, 6);
		Usuario alumno3 = new Alumno("Leire", "333333", "258147369", 21, 10);
		Usuario alumno4 = new Alumno("Aritz", "333333", "258147369", 32, 1);
		Usuario alumno5 = new Alumno("Laura", "444444", "258147369", 14, 5);
		Usuario alumno6 = new Alumno("Carolina", "555555", "258147369", 18, 8);
		Usuario alumno7 = new Alumno("Itziar", "666666", "258147369", 20, 1);
		Usuario alumno8 = new Alumno("Xabier", "777777", "258147369", 25, 10);
		Usuario alumno9 = new Alumno("Julian", "888888", "258147369", 16, 4);
		Usuario alumno10 = new Alumno("Telmo", "999999", "258147369", 27, 11);
		
		ClaseSurf claseSurf1 = new ClaseGrupal(NivelParticipacion.Principiante, 60, 8, true, (Instructor) instructor2, (float)0.0, 4);
		ClaseSurf claseSurf2 = new ClaseGrupal(NivelParticipacion.Intermedio, 50, 10, true, (Instructor) instructor4, (float)0.0, 5);
		ClaseSurf claseSurf3 = new ClaseGrupal(NivelParticipacion.Avanzado, 45, 10, true, (Instructor) instructor3, (float)0.0, 5);
		ClaseSurf claseSurf4 = new ClaseGrupal(NivelParticipacion.Principiante, 60, 10, true, (Instructor) instructor4, (float)0.0, 5);
		
		ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();
		listaUsuario.add(instructor1);
		listaUsuario.add(instructor2);
		listaUsuario.add(instructor3);
		listaUsuario.add(instructor4);
		listaUsuario.add(instructor5);
		listaUsuario.add(alumno1);
		listaUsuario.add(alumno2);
		listaUsuario.add(alumno3);
		listaUsuario.add(alumno4);
		listaUsuario.add(alumno5);
		listaUsuario.add(alumno6);
		listaUsuario.add(alumno7);
		listaUsuario.add(alumno8);
		listaUsuario.add(alumno9);
		listaUsuario.add(alumno10);
		
		ArrayList<ClaseSurf> listaClaseSurfs = new ArrayList<ClaseSurf>();
		listaClaseSurfs.add(claseSurf1);
		listaClaseSurfs.add(claseSurf2);
		listaClaseSurfs.add(claseSurf3);
		listaClaseSurfs.add(claseSurf4);
		
		EscuelaOlasVivas escuelaOlasVivas = new EscuelaOlasVivas(listaUsuario, listaClaseSurfs);
		
		System.out.println("**************** EJERCICIO 2.2 ************************");
		
		System.out.println();
		System.out.println("**************** EJERCICIO 2.3 ************************");
		
		System.out.println();
		System.out.println("**************** EJERCICIO 2.4 ************************");
		
		System.out.println();
		System.out.println("**************** EJERCICIO 2.5 ************************");
	}

}
