package basicos.contenedor;

import java.util.Comparator;

public class Envase implements Comparable<Envase>, Cloneable { 
	//TO-DO 1: poder comparar envases por codigo
	//TO-DO 2: poder comparar envases, por otros criterios (p.e. nombre)
	//TO-DO 3 (est): poder comparar envases por peso
	//TO-DO 4: poder clonar envases
	
	private int codigo;
	private double peso;
	private TipoEnvase tipo;
	private String nombre;
	
	public Envase(int codigo, double peso, TipoEnvase tipo, String nombre) {
		super();
		this.codigo = codigo;
		this.peso = peso;
		this.tipo = tipo;
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public TipoEnvase getTipo() {
		return tipo;
	}

	public void setTipo(TipoEnvase tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "\nEnvase [codigo=" + codigo + ", peso=" + peso + ", tipo=" + tipo + ", nombre=" + nombre + "]";
	}

	@Override
	public int compareTo(Envase o) {
		Integer i1 = this.codigo;
		Integer i2 = o.codigo;
		return i1.compareTo(i2);
	}

	public Object clone() throws CloneNotSupportedException {
		return new Envase(this.codigo, this.peso, this.tipo, this.nombre);
	}
	
}


class compararPorPeso implements Comparator<Envase>{

	@Override
	public int compare(Envase o1, Envase o2) {
		Double p1 = o1.getPeso();
		Double p2 = o2.getPeso();
		return p1.compareTo(p2);
	}
}
	
class compararPorNombre implements Comparator<Envase>{

	@Override
	public int compare(Envase o1, Envase o2) {
		String p1 = o1.getNombre();
		String p2 = o2.getNombre();
		return p1.compareTo(p2);
	}
}
