
public class usaRevista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Crear 3 revistas, diferentes constructores
		
		Revista r1 = new Revista();
		Revista r2 = new Revista(100, "TituloMod", "AutorMod", "EditorialMod", 25, "GeneroMod");
		Revista r3 = new Revista("TituloMod2", "AutorMod2", "EditorialMod2");
		
		//Modificar y mostrar por pantalla algunos atrubutos y toda la revista
		
		r1.setAutor("AutorSet1");
		System.out.println(r1.getAutor());
		System.out.println(r2.getEditorial());
		
		System.out.println(r3);
		
		//Modificar los atributos de una revista para q sea igual que otra y compararla
		
		r1.setPaginas(100);
		r1.setTitulo("TituloMod");
		r1.setAutor("AutorMod");
		r1.setEditorial("EditorialMod");
		r1.setEjemplaresAnyo(25);
		r1.setGenero("GeneroMod");
		
		System.out.println(r1.equals(r2));
		
		//Crear una fraccion e intentar comparar una revista y una fraccion
		
		Fraccion2 f1 = new Fraccion2(2, 11);
		
		System.out.println(f1.equals(r2));
		
	}

}
