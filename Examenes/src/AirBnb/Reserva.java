package AirBnb;

import java.util.Objects;
import java.util.Random;

public class Reserva implements Confirmable {
	private Huesped huesped;
	private Alojamiento alojamiento;
	private int n_dias;
	private boolean confirmacion;
	private Valoracion valoracion;
	
	public Reserva(Huesped huesped, Alojamiento alojamiento, int n_dias, boolean confirmacion, Valoracion valoracion) {
		super();
		this.huesped = huesped;
		this.alojamiento = alojamiento;
		this.n_dias = n_dias;
		this.confirmacion = confirmacion;
		this.valoracion = valoracion;
	}
	
	public Reserva() {
		super();
		this.huesped = new Huesped();
		this.alojamiento = new Alojamiento();
		
		Random random = new Random();
		this.n_dias = random.nextInt(30) + 1;
		
		this.confirmacion = random.nextBoolean();
		this.valoracion = Valoracion.values()[random.nextInt(Valoracion.values().length)];
	}

	public Huesped getHuesped() {
		return huesped;
	}

	public void setHuesped(Huesped huesped) {
		this.huesped = huesped;
	}

	public Alojamiento getAlojamiento() {
		return alojamiento;
	}

	public void setAlojamiento(Alojamiento alojamiento) {
		this.alojamiento = alojamiento;
	}

	public int getN_dias() {
		return n_dias;
	}

	public void setN_dias(int n_dias) {
		this.n_dias = n_dias;
	}

	public boolean isConfirmacion() {
		return confirmacion;
	}

	public void setConfirmacion(boolean confirmacion) {
		this.confirmacion = confirmacion;
	}

	public Valoracion getValoracion() {
		return valoracion;
	}

	public void setValoracion(Valoracion valoracion) {
		this.valoracion = valoracion;
	}

	@Override
	public String toString() {
		return "Reserva [huesped=" + huesped + ", alojamiento=" + alojamiento + ", n_dias=" + n_dias + ", confirmacion="
				+ confirmacion + ", valoracion=" + valoracion + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		return Objects.equals(alojamiento, other.alojamiento) && confirmacion == other.confirmacion
				&& Objects.equals(huesped, other.huesped) && n_dias == other.n_dias && valoracion == other.valoracion;
	}
	
	public void confirmar() {
		int costeTotal = n_dias * alojamiento.getPrecio();
        if (huesped.getSaldo() >= costeTotal) {
            huesped.setSaldo(huesped.getSaldo() - costeTotal);
            alojamiento.getAnfitrion().setSaldo(alojamiento.getAnfitrion().getSaldo() + costeTotal);
            confirmacion = true;
            System.out.println("Reserva confirmada para " + huesped.getNombre());
        } else {
            System.out.println("Saldo insuficiente para confirmar la reserva de " + huesped.getNombre());
        }
	}
	
}
