import java.util.ArrayList;

public class Libreria {
	private String nombre;
	private String calle;
	private String localidad;
	private ArrayList<Librolibrer> libros;
	
	public Libreria() {
		super();
		this.nombre = "Nombre1";
		this.calle = "Calle1";
		this.localidad = "Localidad1";
		this.libros = libros.add(new Librolibrer());
	}
	
	public Libreria(String nombre, String calle, String localidad, ArrayList<Librolibrer> libros) {
		super();
		this.nombre = nombre;
		this.calle = calle;
		this.localidad = localidad;
		this.libros = libros;
	}
	
	public Libreria(Libreria l) {
		super();
		this.nombre = l.nombre;
		this.calle = l.calle;
		this.localidad = l.localidad;
		this.libros = l.libros;
	}
	
	
}

