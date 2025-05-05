package deustobio.fenomenos;

import java.time.LocalDate;
import java.util.Random;

// EJERCICIO 1A
public class Tsunami extends FenomenoNatural implements Predecible {
	protected double velocidad;
	protected double alturaMaxima;
	private boolean alarma;
	
	public Tsunami(String nombre, LocalDate fecha, int duracion, float velocidad, float alturaMaxima) {
		super(nombre, fecha, duracion);
		this.velocidad = velocidad;
		this.alturaMaxima = alturaMaxima;
	}
	public Tsunami() {
		super();
		velocidad = 0;
		alturaMaxima = 0;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	public double getAlturaMaxima() {
		return alturaMaxima;
	}
	public void setAlturaMaxima(double alturaMaxima) {
		this.alturaMaxima = alturaMaxima;
	}
	
	// EJERCICIO 1A
	@Override
	public String toString() {
		return "Tsunami [velocidad=" + velocidad + ", alturaMaxima=" + alturaMaxima + "] " + super.toString();
	}

	// EJERCICIO 1A
	@Override
	public boolean isAlarma() {
		return alarma;
	}
	
	@Override
	public void generarAlarma() {
		alarma = true;
		System.out.println("Alarma activada para fenómeno Tsunami - " + nombre);		
	}

	@Override
	public void desactivarAlarma() {
		alarma = false;
		System.out.println("Alarma desactivada para fenómeno Tsunami - " + nombre);
	}
	
	@Override
	public void setValoresAleatorio() {
		Random r = new Random();
		
		velocidad = r.nextDouble() * 1000;
		alturaMaxima = r.nextDouble() * 200;		
	}
}
