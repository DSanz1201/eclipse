package DesutoTrain;

import java.util.Objects;

public class Ocupante {
	private String nombre;
	private String dni;
	private double telefono;
	
	public Ocupante(String nombre, String dni, double telefono) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
	}
	
	public Ocupante() {
		super();
		this.nombre = "Nombre2";
		this.dni = "89131241Q";
		this.telefono = 621943522;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getTelefono() {
		return telefono;
	}

	public void setTelefono(double telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Ocupante [nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ocupante other = (Ocupante) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(telefono) == Double.doubleToLongBits(other.telefono);
	}
	
	
	
}
