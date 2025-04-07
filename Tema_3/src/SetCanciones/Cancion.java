package SetCanciones;

import java.util.Objects;

public class Cancion implements Comparable <Cancion> {
	private String titulo;
	private String cantante;
	private double duracion;
	
	public Cancion(String titulo, String cantante, double duracion) {
		super();
		this.titulo = titulo;
		this.cantante = cantante;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCantante() {
		return cantante;
	}

	public void setCantante(String cantante) {
		this.cantante = cantante;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", cantante=" + cantante + ", duracion=" + duracion + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantante, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cancion other = (Cancion) obj;
		return Objects.equals(cantante, other.cantante) && Objects.equals(titulo, other.titulo);
	}

	@Override
	public int compareTo(Cancion o) {
		Double d1 = this.duracion;
		Double d2 = o.duracion;
		return (titulo + cantante).compareTo(o.titulo + o.cantante);
		}
	
	
	
}
