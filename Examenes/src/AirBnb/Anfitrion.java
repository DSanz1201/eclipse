package AirBnb;

import java.util.ArrayList;
import java.util.Objects;

public class Anfitrion extends Usuario {
	private ArrayList <Alojamiento> alojamientos;
	
	public Anfitrion(String nombre, String apellido, int saldo, ArrayList<Alojamiento> alojamientos) {
		super(nombre, apellido, saldo);
		this.alojamientos = alojamientos;
	}


	public Anfitrion() {
		super();
		this.alojamientos.add(new Alojamiento());
	}


	public ArrayList<Alojamiento> getAlojamientos() {
		return alojamientos;
	}


	public void setAlojamientos(ArrayList<Alojamiento> alojamientos) {
		this.alojamientos = alojamientos;
	}


	@Override
	public String toString() {
		return "Anfitrion [alojamientos=" + alojamientos + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Anfitrion other = (Anfitrion) obj;
		return Objects.equals(alojamientos, other.alojamientos);
	}
	
	
}
