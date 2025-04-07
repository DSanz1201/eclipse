package DesutoTrain;

import java.util.Objects;

public class Trayecto {
	private Estacion est_origen;
	private Estacion est_destino;
	private int n_km;
	
	public Trayecto(Estacion est_origen, Estacion est_destino, int n_km) {
		super();
		this.est_origen = est_origen;
		this.est_destino = est_destino;
		this.n_km = n_km;
	}
	
	public Trayecto() {
		super();
		this.est_origen = new Estacion();
		this.est_destino = new Estacion();
		this.n_km = 9999999;
	}

	public Estacion getEst_origen() {
		return est_origen;
	}

	public void setEst_origen(Estacion est_origen) {
		this.est_origen = est_origen;
	}

	public Estacion getEst_destino() {
		return est_destino;
	}

	public void setEst_destino(Estacion est_destino) {
		this.est_destino = est_destino;
	}

	public int getN_km() {
		return n_km;
	}

	public void setN_km(int n_km) {
		this.n_km = n_km;
	}

	@Override
	public String toString() {
		return "Trayecto [est_origen=" + est_origen + ", est_destino=" + est_destino + ", n_km=" + n_km + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trayecto other = (Trayecto) obj;
		return Objects.equals(est_destino, other.est_destino) && Objects.equals(est_origen, other.est_origen)
				&& n_km == other.n_km;
	}
	
	
}
