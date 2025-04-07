package DesutoTrain;

import java.util.ArrayList;
import java.util.Objects;

public class Pasajeros extends Ruta implements Reservable {
	private int vag_primera;
	private int vag_segunda;
	private int vag_cochecama;
	private ArrayList <Ocupante> pasajeros;
	
	public Pasajeros(Tren tren, ArrayList<Trayecto> lista_trayec, int vag_primera, int vag_segunda, int vag_cochecama,
			ArrayList<Ocupante> pasajeros) {
		super(tren, lista_trayec);
		this.vag_primera = vag_primera;
		this.vag_segunda = vag_segunda;
		this.vag_cochecama = vag_cochecama;
		this.pasajeros = pasajeros;
	}
	
	public Pasajeros() {
		super();
		this.vag_primera = 10;
		this.vag_segunda = 13;
		this.vag_cochecama = 22;
		this.pasajeros = new ArrayList<Ocupante>();
		this.pasajeros.add(new Ocupante());
	}

	public int getVag_primera() {
		return vag_primera;
	}

	public void setVag_primera(int vag_primera) {
		this.vag_primera = vag_primera;
	}

	public int getVag_segunda() {
		return vag_segunda;
	}

	public void setVag_segunda(int vag_segunda) {
		this.vag_segunda = vag_segunda;
	}

	public int getVag_cochecama() {
		return vag_cochecama;
	}

	public void setVag_cochecama(int vag_cochecama) {
		this.vag_cochecama = vag_cochecama;
	}

	public ArrayList<Ocupante> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(ArrayList<Ocupante> pasajeros) {
		this.pasajeros = pasajeros;
	}

	@Override
	public String toString() {
		return "Pasajeros [vag_primera=" + vag_primera + ", vag_segunda=" + vag_segunda + ", vag_cochecama="
				+ vag_cochecama + ", pasajeros=" + pasajeros + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pasajeros other = (Pasajeros) obj;
		return Objects.equals(pasajeros, other.pasajeros) && vag_cochecama == other.vag_cochecama
				&& vag_primera == other.vag_primera && vag_segunda == other.vag_segunda;
	}

	@Override
	public boolean reservar(Ocupante pasajero) {
		if(this.pasajeros.contains(pasajero)) {
			return false;
		} else {
			this.pasajeros.add(pasajero);
			return true;
		}
	}

	@Override
	public boolean anular(Ocupante pasajero) {
		if(this.pasajeros.contains(pasajero)) {
			this.pasajeros.remove(pasajero);
			return true;
		} else {
			return false;
		}
	}
	
	
	
}
