package Viajes;

import java.util.Objects;

public class Viaje implements Comparable<Viaje> {
	private static int cont = 0;
	private int codigo;
	private Pais origen;
	private Pais destino;
	private int dias;
	
	
	public Viaje(Pais origen, Pais destino, int dias) {
		super();
		this.codigo = cont;
		this.origen = origen;
		this.destino = destino;
		this.dias = dias;
		cont++;
	}


	public static int getCont() {
		return cont;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public Pais getOrigen() {
		return origen;
	}


	public void setOrigen(Pais origen) {
		this.origen = origen;
	}


	public Pais getDestino() {
		return destino;
	}


	public void setDestino(Pais destino) {
		this.destino = destino;
	}


	public int getDias() {
		return dias;
	}


	public void setDias(int dias) {
		this.dias = dias;
	}


	@Override
	public String toString() {
		return "Viaje [codigo=" + codigo + ", origen=" + origen + ", destino=" + destino + ", dias=" + dias + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Viaje other = (Viaje) obj;
		return codigo == other.codigo;
	}


	@Override
	public int compareTo(Viaje o) {
		Integer c1 = (Integer) this.codigo;
		Integer c2 = (Integer) o.codigo;
		return c1.compareTo(c2);
	}
	
}
