package deustobio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

import deustobio.fenomenos.Continentes;
import deustobio.fenomenos.FenomenoNatural;
import deustobio.fenomenos.Terrestre;

/*Modifica la clase Experto para que la lista de fenómenos sea una cola que
se gestiona por orden de asignación de los fenómenos al experto. Añade,
además, los métodos gestionarFenomeno, que muestra por pantalla los
datos del fenómeno gestionado, lo elimina de la cola y devuelve el número
total de fenómenos que quedan al experto por gestionar, y
anyadirFenomeno, que añade un nuevo fenómeno a la cola del experto,
comprobando que no sobrepasa los 5 (en ese caso, muestra un mensaje
por pantalla y no lo añade). 
*/
public class Experto {
	private String nombre;
	private Especialidad especialidad;
	private LinkedList<FenomenoNatural> fenomenos;

	// CONSTRUCTORES
	public Experto(String nombre, Especialidad especialidad) {
		super();
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.fenomenos = new LinkedList<>();
	}

	public Experto() {
		super();
		this.nombre = "";
		this.especialidad = Especialidad.TERRESTRE;
		this.fenomenos = new LinkedList<>();
	}

	// GETTERS Y SETTERS
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

	public LinkedList<FenomenoNatural> getFenomenos() {
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
	public ArrayList<FenomenoNatural> obtenerFenomenosContinente(Continentes c) {
		ArrayList<FenomenoNatural> resultado = new ArrayList<FenomenoNatural>();
		for (FenomenoNatural f : fenomenos) {
			if (f instanceof Terrestre) {
				Terrestre ter = (Terrestre) f;
				if (ter.getContinente() == c)
					resultado.add(ter);
			}
		}
		return resultado;
	}

	/*
	 * que muestra por pantalla los datos del fenómeno gestionado, lo elimina de la
	 * cola y devuelve el número total de fenómenos que quedan al experto por
	 * gestionar
	 */
	public int gestionarFenomeno() {
		FenomenoNatural f = fenomenos.poll();
		System.out.println(f);
		return fenomenos.size();
	}

	/*
	 * que añade un nuevo fenómeno a la cola del experto, comprobando que no
	 * sobrepasa los 5 (en ese caso, muestra un mensaje por pantalla y no lo añade)
	 */
	public void anyadirFenomeno(FenomenoNatural f) {
		if (fenomenos.size() < 5) {
			fenomenos.addLast(f);
			System.out.println("Añadido fenómeno: " + f);
		}else
			System.out.println("El experto no puede atender más fenómenos");
	}
}
