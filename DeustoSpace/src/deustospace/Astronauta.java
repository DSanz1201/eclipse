package deustospace;

import java.util.ArrayList;

/** Clase que permite crear objetos astronautas
 */
public class Astronauta extends Personal {
	private static final long serialVersionUID = 1L;
	private ArrayList<Habilidad> listaHabilidades;

	/** Crea un astronauta
	 * @param pais	País
	 * @param nombre	Nombre
	 * @param habilidades	Lista de habilidades
	 */
	public Astronauta(String pais, String nombre, ArrayList<Habilidad> habilidades) {
		super(pais, nombre);
		this.listaHabilidades = new ArrayList<Habilidad>(habilidades);
	}
	
	public Astronauta(String nombre, String pais) {
		super(nombre, pais);
		this.listaHabilidades = new ArrayList<Habilidad>();
	}

	public ArrayList<Habilidad> getListaHabilidades() {
		return listaHabilidades;
	}

	public void setListaHabilidades(ArrayList<Habilidad> habilidades) {
		this.listaHabilidades = habilidades;
	}

	@Override
	public String toString() {
		return "Astronauta " + getNombre() + " (" + getPais() + "): " + listaHabilidades;
	}

}
