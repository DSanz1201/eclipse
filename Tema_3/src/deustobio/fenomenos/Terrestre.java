package deustobio.fenomenos;

import java.time.LocalDate;
import java.util.Random;

//EJERCICIO 1A
public abstract class Terrestre extends FenomenoNatural {
	protected Continentes continente;

	public Terrestre(String nombre, LocalDate fecha, int duracion, Continentes continente) {
		// EJERCICIO 1A
		super(nombre, fecha, duracion);
		this.continente = continente;
	}

	public Terrestre() {
		// EJERCICIO 1A
		super();
		Random r = new Random();
		int num = r.nextInt(5);
		continente = Continentes.values()[num];
	}

	public Continentes getContinente() {
		return continente;
	}

	public void setContinente(Continentes continente) {
		this.continente = continente;
	}

	@Override
	public String toString() {
		return "Terrestre - continente=" + continente + "] " + super.toString();
	}
	
}
