package deustobio;
import java.util.ArrayList;
import java.util.Objects;

import deustobio.fenomenos.Continentes;
import deustobio.fenomenos.FenomenoNatural;
import deustobio.fenomenos.Terrestre;

public class Experto {
	private String nombre;
	private Especialidad especialidad;
	private ArrayList<FenomenoNatural> fenomenos;
	
	//CONSTRUCTORES
	public Experto(String nombre, Especialidad especialidad) {
		super();
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.fenomenos = new ArrayList<>();
	}

	public Experto() {
		super();
		this.nombre = "";
		this.especialidad = Especialidad.TERRESTRE;
		this.fenomenos = new ArrayList<>();
	}

	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	
	// EJERCICIO 1A
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public ArrayList<FenomenoNatural> getFenomenos() {
		return fenomenos;
	}

	@Override
	public String toString() {
		return "Experto [nombre=" + nombre + ", especialidad=" + especialidad + ", fenomenos=" + fenomenos + "]";
	}

	// EJERCICIO 1A
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Experto) {
			Experto other = (Experto) obj;
			return especialidad == other.especialidad && Objects.equals(nombre, other.nombre);
		} else {
			return false;
		}
	}
	
	// EJERCICIO 1B.E
	public ArrayList<FenomenoNatural> obtenerFenomenosContinente(Continentes c){
		ArrayList<FenomenoNatural> resultado = new ArrayList<FenomenoNatural>();
		for(FenomenoNatural f: fenomenos) {
			if (f instanceof Terrestre) {
				Terrestre ter = (Terrestre) f;
				if (ter.getContinente() == c)
					resultado.add(ter);
			} 
		}
		return resultado;
	}
	
	
}
