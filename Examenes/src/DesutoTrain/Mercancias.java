package DesutoTrain;

import java.util.ArrayList;

public class Mercancias extends Ruta {
	private double max_ton;

	public Mercancias(Tren tren, ArrayList<Trayecto> lista_trayec, double max_ton) {
		super(tren, lista_trayec);
		this.max_ton = max_ton;
	}
	
	public Mercancias() {
		super();
		this.max_ton = 12345;
	}

	public double getMax_ton() {
		return max_ton;
	}

	public void setMax_ton(double max_ton) {
		this.max_ton = max_ton;
	}

	@Override
	public String toString() {
		return "Mercancias [max_ton=" + max_ton + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mercancias other = (Mercancias) obj;
		return Double.doubleToLongBits(max_ton) == Double.doubleToLongBits(other.max_ton);
	}
	
	
	
	
}
