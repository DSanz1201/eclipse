package DesutoTrain;

import java.util.Objects;

public class Tren {
	private int cv;
	private String nombre;
	private static int cod = 0;
	
	public Tren(int cv, String nombre) {
		super();
		this.cv = cv;
		this.nombre = nombre;
		cod++;
	}
	
	public Tren() {
		super();
		this.cv = 10101010;
		this.nombre = "Tren1";
		cod++;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getCod() {
		return cod;
	}

	public static void setCod(int cod) {
		Tren.cod = cod;
	}

	@Override
	public String toString() {
		return "Tren [cv=" + cv + ", nombre=" + nombre + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tren other = (Tren) obj;
		return cv == other.cv && Objects.equals(nombre, other.nombre);
	}
	
	
	
	
}
