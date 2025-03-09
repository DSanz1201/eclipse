import java.util.ArrayList;
import java.util.Objects;

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
		for(int i = 0; i < 3; i++) {
			this.libros.add(new Librolibrer());
		}
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public ArrayList<Librolibrer> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Librolibrer> libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "Libreria [nombre=" + nombre + ", calle=" + calle + ", localidad=" + localidad + ", libros=" + libros
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libreria other = (Libreria) obj;
		return Objects.equals(calle, other.calle) && Objects.equals(libros, other.libros)
				&& Objects.equals(localidad, other.localidad) && Objects.equals(nombre, other.nombre);
	}
	
	

}

