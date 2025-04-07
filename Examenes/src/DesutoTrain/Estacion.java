package DesutoTrain;

import java.util.ArrayList;
import java.util.Objects;

public class Estacion implements Reservable {
	private String nombre;
	private int latitud;
	private int longitud;
	private boolean cafeteria;
	private ArrayList <Ocupante> lista_pasajeros;
	
	public Estacion(String nombre, int latitud, int longitud, boolean cafeteria, ArrayList <Ocupante> lista_pasajeros) {
		super();
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
		this.cafeteria = cafeteria;
		this.lista_pasajeros = lista_pasajeros;
	}
	
	public Estacion() {
		super();
		this.nombre = "Nombre1";
		this.latitud = 500;
		this.longitud = 0;
		this.cafeteria = true;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLatitud() {
		return latitud;
	}

	public void setLatitud(int latitud) {
		this.latitud = latitud;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public boolean isCafeteria() {
		return cafeteria;
	}

	public void setCafeteria(boolean cafeteria) {
		this.cafeteria = cafeteria;
	}

	public ArrayList <Ocupante> getLista_pasajeros() {
		return lista_pasajeros;
	}

	public void setLista_pasajeros(ArrayList <Ocupante> lista_pasajeros) {
		this.lista_pasajeros = lista_pasajeros;
	}

	@Override
	public String toString() {
		return "Estacion [nombre=" + nombre + ", latitud=" + latitud + ", longitud=" + longitud + ", cafeteria="
				+ cafeteria + ", lista_pasajeros=" + lista_pasajeros + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estacion other = (Estacion) obj;
		return cafeteria == other.cafeteria && latitud == other.latitud
				&& Objects.equals(lista_pasajeros, other.lista_pasajeros) && longitud == other.longitud
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public boolean reservar(Ocupante pasajero) {
		if(cafeteria == true) {
			if(this.lista_pasajeros.contains(pasajero)) {
				return false;
			} else {
				this.lista_pasajeros.add(pasajero);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean anular(Ocupante pasajero) {
		if(cafeteria == true) {
			if(this.lista_pasajeros.contains(pasajero)) {
				this.lista_pasajeros.remove(pasajero);
				return true;
			} else {
				return false;
			}
		}
		return false;
	}	
}
