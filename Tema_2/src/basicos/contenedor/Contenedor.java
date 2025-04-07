package basicos.contenedor;

import java.util.ArrayList;
import java.util.Iterator;

public class Contenedor implements Iterable<Envase> {
	private String nombre;
	private String color;
	private ArrayList<Envase> envases;
	
	
	public Contenedor(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.envases = null;
	}

	//TO-DO1: constructor que recibe 1 envase para incluir en la lista
	
	public Contenedor(String nombre, String color, Envase ...envases) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.envases = new ArrayList();
		
		for (Envase e: envases) {
			this.envases.add(e);
		}
		
	}
	
	//TO-DO2: constructor que recibe 2 envase para incluir en la lista
	public void anyadirEnvases(Envase e) {
		this.envases.add(e);
	}
	
	
	//TO-DO3: constructor que recibe N envases para incluir en la lista (...)
	public void anyadirEnvase (Envase ...envases) {
		for(Envase e: envases) {
			this.envases.add(e);
		}
	}
	
	
	
	//TO-DO4 (est): crear método para añadir 1 envase al contenedor
	
	//TO-DO5 (est): crear método para añadir N envases al contenedor

	@Override
	public String toString() {
		return "Contenedor [nombre=" + nombre + ", color=" + color + ", envases=" + envases + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ArrayList<Envase> getEnvases() {
		return envases;
	}

	public void setEnvases(ArrayList<Envase> envases) {
		this.envases = envases;
	}

	@Override
	public Iterator<Envase> iterator() {
		return envases.iterator();
	}
	
	class Iterator implements Iterator<Envase>{
		
	}
	
	
	
	
}
