import java.util.ArrayList;

public class UsaArtista2 {

	public static void main(String[] args) {
		//Versión 2
		
		//Crear un ArrayList de artistas
		
		ArrayList<Artista> array = new ArrayList<Artista>();
			
		
		//Cargarlo con 3 artistas
		
		for(int i = 1; i <= 3; i++) {
			array.add(new Artista());
		}
		
		System.out.println(array);	
		
		//Repetir las acciones anteriores con los objetos almacenados en el ArrayList
		
		//Mostrar por pantalla alguno de sus atributos (p.e. nombre y estilo), atributos del álbum editado (p.e. duracion o numCanciones) y al artista completo (todos sus datos y los de su álbum)
		
				System.out.println("#############################################");
				System.out.println(array.get(0).getNombre()); //Devuelve nombre1
				System.out.println(array.get(0).getEstilo()); //Devuelve BLUES
				System.out.println(array.get(0).getUltimoAlbum().getDuracion()); //Devuelve 1111
				System.out.println(array.get(0).getUltimoAlbum().getNumCanciones()); //Devuelve 9999
				System.out.println(array.get(0)); //Devuelve a1
				
				
				//Modificar alguno de sus atributos (p.e. nombre y estilo), modificar algún atributo de su álbum (p.e. duracion o numCanciones)
				
				System.out.println("#############################################");
				System.out.println(array.get(0).getNombre()); //Nombre1
				System.out.println(array.get(0).getEstilo()); //JAZZ
				array.get(0).getUltimoAlbum().setDuracion(888);
				array.get(0).getUltimoAlbum().setNumCanciones(1010);
				System.out.println(array.get(0)); //Devuelve con los cambios
				
				//Comparar 2 artistas
				
				System.out.println("#############################################");
				System.out.println(array.get(0).equals(array.get(1))); //Devuelve false
				
				//Crear un 4º artista, copia de alguno de los anteriores y comparar si son iguales --> debería devolver true
				
				System.out.println("#############################################");
				array.add(new Artista(array.get(1))); //Crea nuevo artista
				System.out.println(array.get(1)); //Igual
				System.out.println(array.get(3)); //Igual
				System.out.println(array.get(1).equals(array.get(3))); //Devuelve true
				
				//Modificar alguno de los atributos de artista 4 (p.e. nombre y estilo)
				
				System.out.println("#############################################");
				array.get(3).setNombre("Nombre_mod_4"); //Cambia nombre a4
				array.get(3).setEstilo(Estilo.FUNKY); //Cambia estilo a4
				
				//modificar algún atributo de su álbum (p.e. duracion o numCanciones)
				
				System.out.println("#############################################");
				array.get(3).getUltimoAlbum().setDuracion(7878787); //Cambia estilo album4	 
				
				//Mostrar artista 2 y artista 4 completos, el cambio anterior solo debería haber afectado a 4
				
				System.out.println("#############################################");
				System.out.println(array.get(1)); //Ver cambios
				System.out.println(array.get(3)); //Ver cambios
		
		//Definir una función que devuelve el artista más veterano (static, en la clase con el main)
				
				
		
		//Definir una función que devuelve el artista cuyo álbum tenga menor número de canciones (static, en la clase con el main)

	}

}
