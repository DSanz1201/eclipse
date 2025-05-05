package DeustoIkea;

import java.util.Objects;

public class Mueble {
	protected int codigo;
	protected String nombre;
	protected String categoria;
	protected double precio;
	
	
	public Mueble(int codigo, String nombre, String categoria, double precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
	}
	
	
	public Mueble() {
		super();
		this.codigo = 0;
		this.nombre = "Nombre1";
		this.categoria = "Categoria1";
		this.precio = 999;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Mueble [codigo=" + codigo + ", nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio
				+ "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(categoria, codigo, nombre, precio);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mueble other = (Mueble) obj;
		return Objects.equals(categoria, other.categoria) && codigo == other.codigo
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}
	
}
