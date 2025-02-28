
public class UsaArtista {

	public static void main(String[] args) {
		//Versión 1
		//Crear 3 artistas.
		
		Artista a1 = new Artista();
		Artista a2 = new Artista("Artista25", 2006, Estilo.JAZZ, new Album());
		Artista a3 = new Artista("Artista50", 2024, Estilo.POP, new Album("Album7777", 7777, 2024, "Discografia7777", 10));
		
		//Mostrar por pantalla alguno de sus atributos (p.e. nombre y estilo), atributos del álbum editado (p.e. duracion o numCanciones) y al artista completo (todos sus datos y los de su álbum)
		
		System.out.println("#############################################");
		System.out.println(a1.getNombre()); //Devuelve nombre1
		System.out.println(a1.getEstilo()); //Devuelve BLUES
		System.out.println(a1.getUltimoAlbum().getDuracion()); //Devuelve 1111
		System.out.println(a1.getUltimoAlbum().getNumCanciones()); //Devuelve 9999
		System.out.println(a1); //Devuelve a1
		
		
		//Modificar alguno de sus atributos (p.e. nombre y estilo), modificar algún atributo de su álbum (p.e. duracion o numCanciones)
		
		System.out.println("#############################################");
		System.out.println(a1.getNombre()); //Nombre1
		System.out.println(a1.getEstilo()); //JAZZ
		a1.getUltimoAlbum().setDuracion(888);
		a1.getUltimoAlbum().setNumCanciones(1010);
		System.out.println(a1); //Devuelve con los cambios
		
		//Comparar 2 artistas
		
		System.out.println("#############################################");
		System.out.println(a1.equals(a2)); //Devuelve false
		
		//Crear un 4º artista, copia de alguno de los anteriores y comparar si son iguales --> debería devolver true
		
		System.out.println("#############################################");
		Artista a4 = new Artista(a2); //Crea nuevo artista
		System.out.println(a2); //Igual
		System.out.println(a4); //Igual
		System.out.println(a2.equals(a4)); //Devuelve true
		
		//Modificar alguno de los atributos de artista 4 (p.e. nombre y estilo)
		
		System.out.println("#############################################");
		a4.setNombre("Nombre_mod_4"); //Cambia nombre a4
		a4.setEstilo(Estilo.FUNKY); //Cambia estilo a4
		
		//modificar algún atributo de su álbum (p.e. duracion o numCanciones)
		
		System.out.println("#############################################");
		a4.getUltimoAlbum().setDuracion(7878787); //Cambia estilo album4	 
		
		//Mostrar artista 2 y artista 4 completos, el cambio anterior solo debería haber afectado a 4
		
		System.out.println("#############################################");
		System.out.println(a2); //Ver cambios
		System.out.println(a4); //Ver cambios
		
	}

}
