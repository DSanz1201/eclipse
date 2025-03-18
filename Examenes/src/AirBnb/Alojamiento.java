package AirBnb;

import java.util.Objects;

public class Alojamiento {
	private Anfitrion anfitrion;
	private String nombre;
	private String descripcion;
	private int precio;
	
	public Alojamiento(Anfitrion anfitrion, String nombre, String descripcion, int precio) {
		super();
		this.anfitrion = anfitrion;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	public Alojamiento() {
		super();
		this.anfitrion = new Anfitrion();
		this.nombre = "Nombre2";
		this.descripcion = "Descripcion2";
		this.precio = 777;
	}

	public Anfitrion getAnfitrion() {
		return anfitrion;
	}

	public void setAnfitrion(Anfitrion anfitrion) {
		this.anfitrion = anfitrion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Alojamiento [anfitrion=" + anfitrion + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", precio=" + precio + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alojamiento other = (Alojamiento) obj;
		return Objects.equals(anfitrion, other.anfitrion) && Objects.equals(descripcion, other.descripcion)
				&& Objects.equals(nombre, other.nombre) && precio == other.precio;
	}
	
	
}
