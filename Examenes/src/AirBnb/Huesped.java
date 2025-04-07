package AirBnb;

import java.util.ArrayList;
import java.util.Objects;

public class Huesped extends Usuario {
	private ArrayList <Reserva> reservas;

	public Huesped(double codigo, String nombre, String apellido, int saldo, ArrayList<Reserva> reservas) {
		super(nombre, apellido, saldo);
		this.reservas = reservas;
	}
	
	public Huesped() {
		super();
		for(int i = 0; i < 5; i++) {
			this.reservas.add(new Reserva());
		}
				
	}

	public ArrayList<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(ArrayList<Reserva> reservas) {
		this.reservas = reservas;
	}

	@Override
	public String toString() {
		return "Huesped [reservas=" + reservas + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Huesped other = (Huesped) obj;
		return Objects.equals(reservas, other.reservas);
	}
}
