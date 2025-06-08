package tennisys;

import java.util.Objects;

public class Arbitro {
	private String nombre;
	private int nivel;
	
	public Arbitro(String nombre, int nivel) {
		super();
		this.nombre = nombre;
		this.nivel = nivel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "Arbitro [nombre=" + nombre + ", nivel=" + nivel + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nivel, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arbitro other = (Arbitro) obj;
		return nivel == other.nivel && Objects.equals(nombre, other.nombre);
	}
	
	
}
