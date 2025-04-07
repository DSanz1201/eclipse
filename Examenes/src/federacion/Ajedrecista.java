package federacion;

import java.util.Objects;

public class Ajedrecista implements Comparable <Ajedrecista> {
	private static int cont = 0;
	private String nombre;
	private int edad;
	private int puntosElo;
	private int codigo;
	
	/** 
	 * Constructor con argumentos
	 * 
	 * @param nombre nombre del ajedrecista
	 * @param edad edad del ajedrecista
	 * @param puntosElo puntos Elo del ajedrecista
	 */
	public Ajedrecista(String nombre, int edad, int puntosElo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.puntosElo = puntosElo;
		this.codigo = cont;
		cont++;
	}

	/**
	 * @return el nombre del ajedrecista
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nombre del ajedrecista
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return la edad del ajedrecista
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad la edad del ajedrecista
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return los puntos Elo
	 */
	public int getPuntosElo() {
		return puntosElo;
	}

	/**
	 * @param puntosElo los puntos Elo del ajedrecista
	 */
	public void setPuntosElo(int puntosElo) {
		this.puntosElo = puntosElo;
	}

	@Override
	public String toString() {
		return "Ajedrecista: " + nombre + " (" + edad + " años), Elo=" + puntosElo + ", Codigo=" + codigo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ajedrecista other = (Ajedrecista) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}

	@Override
	public int compareTo(Ajedrecista o) {
		if(this.puntosElo > o.puntosElo) {
			return 1;
		} else if (this.puntosElo < o.puntosElo) {
			return -1;
		} else {
			return 0;
		}
	}
}
