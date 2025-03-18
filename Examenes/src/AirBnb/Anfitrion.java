package AirBnb;

import java.util.ArrayList;

public class Anfitrion extends Usuario {
	private ArrayList <Alojamiento> alojamientos;

	public Anfitrion(double codigo, String nombre, String apellido, double saldo, ArrayList alojamientos) {
		super(codigo, nombre, apellido, saldo);
		this.alojamientos = new ArrayList<>();
		alojamientos.add(new Alojamiento());
		
	}
	
	public Anfitrion() {
		super();
		this.alojamientos = alojamientos;
	}
}
