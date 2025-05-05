package deustobio.fenomenos;

import java.time.LocalDate;
import java.util.Random;

// EJERCICIO 1A
public class Incendio extends Terrestre {
	protected double hectareas;
	protected boolean provocado;
	
	public Incendio(String nombre, LocalDate fecha, int duracion, Continentes continente, float hectareas, boolean provocado) {
		// EJERCICIO 1A
		super(nombre, fecha, duracion, continente);
		this.hectareas = hectareas;
		this.provocado = provocado;
	}

	public Incendio() {
		// EJERCICIO 1A
		super();
		this.hectareas = 0;
		this.provocado = true;
	}

	public double getHectareas() {
		return hectareas;
	}

	public void setHectareas(float hectareas) {
		this.hectareas = hectareas;
	}

	public boolean isProvocado() {
		return provocado;
	}

	public void setProvocado(boolean provocado) {
		this.provocado = provocado;
	}

	// EJERCICIO 1A
	@Override
	public String toString() {
		return "Incendio [hectareas=" + hectareas + ", provocado=" + provocado + "] " + super.toString();
	}
	

	// EJERCICIO 1B.B
	@Override
	public void setValoresAleatorio() {
		Random r = new Random();
		hectareas = r.nextDouble() * 1000;
		provocado = (r.nextInt(2) == 0);		
	}
	
}
