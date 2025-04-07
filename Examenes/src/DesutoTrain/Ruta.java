package DesutoTrain;

import java.util.ArrayList;
import java.util.Objects;

public class Ruta {
	protected Tren tren;
	protected ArrayList <Trayecto> lista_trayec;
	
	public Ruta(Tren tren, ArrayList<Trayecto> lista_trayec) {
		super();
		this.tren = tren;
		this.lista_trayec = lista_trayec;
	}
	
	public Ruta() {
		super();
		this.tren = new Tren();
		this.lista_trayec = new ArrayList<Trayecto>();
		this.lista_trayec.add(new Trayecto());
	}

	public Tren getTren() {
		return tren;
	}

	public void setTren(Tren tren) {
		this.tren = tren;
	}

	public ArrayList<Trayecto> getLista_trayec() {
		return lista_trayec;
	}

	public void setLista_trayec(ArrayList<Trayecto> lista_trayec) {
		this.lista_trayec = lista_trayec;
	}

	@Override
	public String toString() {
		return "Ruta [tren=" + tren + ", lista_trayec=" + lista_trayec + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ruta other = (Ruta) obj;
		return Objects.equals(lista_trayec, other.lista_trayec) && Objects.equals(tren, other.tren);
	}
	
}
