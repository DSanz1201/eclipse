
public class UsaDiscografica {

	public static void main(String[] args) {
		Discografica d1 = new Discografica();
		d1.getMusicos().add(new Artista("Jonny", 2000, Estilo.FUNKY, new Album("Moon", 80, 2015, "Disco1",8)));
		d1.getMusicos().add(new Artista("Paul", 2019, Estilo.HEAVY, new Album("Shine", 90, 2019, "Disco1",10)));
		d1.getMusicos().add(new Artista("Mary", 2017, Estilo.JAZZ, new Album("Always", 110, 2020, "Disco1",9)));
		
		//Mostrar toda la discografica por pantalla
		
		System.out.println(d1);
		
		//Poner discodeusto como el nombre de la discografica
		
		d1.setNombre("Disco Deusto");
		
		//Mostrar el nombre de la discografica
		
		System.out.println(d1.getNombre());
		
		//Mostrar el nombre de uno de los musicos de la discografica
		
		System.out.println(d1.getMusicos().get(1).getNombre());
		
		//Mostrar el titulo del album de uno de los musicos de esa discografica
		
		System.out.println(d1.getMusicos().get(1).getUltimoAlbum().getTitulo());
		
		//Mostrar todos los nombres de los musicos de la discografica - bucle
		
		for(Artista musico : d1.getMusicos()) {
			System.out.println(musico.getUltimoAlbum().getTitulo());
		}
		
		//Mostrar todos los titulos de album de los musicos de la discografica - bucle
	}

}
