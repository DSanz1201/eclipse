package deustobio.fenomenos;

import java.time.LocalDate;
import java.util.Random;

// EJERCICIO 1A
public class Terremoto extends Terrestre implements Predecible {
	protected double magnitud;
	// EJERCICIO 1A
	private boolean alarma;

	public Terremoto(String nombre, LocalDate fecha, int duracion, Continentes continente, double magnitud) {
		// EJERCICIO 1A
		super(nombre, fecha, duracion, continente);
		this.magnitud = 2;
		setMagnitud( magnitud );
	}

	public Terremoto() {
		// EJERCICIO 1A
		super();
		magnitud = 2;
	}

	public double getMagnitud() {
		return magnitud;
	}

	public void setMagnitud(double magnitud) {
		// EJERCICIO 1A
		if (magnitud <= 2 && magnitud <= 6.9)
			this.magnitud = magnitud;
	}

	public boolean isAlarma() {
		return alarma;
	}

	// EJERCICIO 1A
	@Override
	public String toString() {
		return "Terremoto [magnitud=" + magnitud + "] " + super.toString();
	}
	
	// EJERCICIO 1A
	@Override
	public void generarAlarma() {
		alarma = true;
		System.out.println("Alarma activada para fenómeno Terremoto - " + nombre);		
	}

	@Override
	public void desactivarAlarma() {
		alarma = false;
		System.out.println("Alarma desactivada para fenómeno Terremoto - " + nombre);
	}

	@Override
	public void setValoresAleatorio() {
		Random r = new Random();
		magnitud = (r.nextFloat() * 4.9) + 2;	
	}	
}
