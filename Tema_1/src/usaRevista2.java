
public class usaRevista2 {

	public static void main(String[] args) {
		//Crear 3 revistas, utilizando los diferentes constructores de la clase
		Revista2 r1 = new Revista2();
		Revista r2 = new Revista(87, "National Geographic", "NG Foundation", "NG editorial", 12, "Ciencia y tecnología");
		Revista r3 = new Revista("PC Actual", "Soc. Española de Computación", "Computer editorial");
		Revista2 r4 = new Revista2();
		
		System.out.println(r1.equals(null));
			
		//Modificar y mostrar por pantalla algunos atributos y toda una revista
		//Modificar los atributos de una revista para que sea exactamente igual a otra
				//y compararlas -> debería devolver true
		System.out.println(r1.getTitulo());
		System.out.println(r2.getPaginas());
		System.out.println(r3.getEditorial());
		r1.setTitulo("Arte e historia");
		System.out.println(r1.getTitulo());
		r2.setEjemplaresAnyo(24);
		System.out.println(r2.getEjemplaresAnyo());
		
		r4 = new Revista2(87, "National Geographic", new Autor("Ane", "Burrueta", 2001, "Hermani", "Bio de Ane"), "NG editorial", 12, "Ciencia y tecnología");
		Revista2 r5 = new Revista2(r4);
		System.out.println(r2.equals(r4));
		
		//Crear una fracción e intentar comparar una revista y una fracción --> debería devolver false
		Fraccion2 f1 = new Fraccion2(3, 54);
		System.out.println(r1.equals(f1));
		
		
	}

}