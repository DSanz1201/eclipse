package restaurante;

public class Ingrediente {

	private String nombre;
	private Double precio;
	public Ingrediente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ingrediente(String nombre, Double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Ingrediente [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
}
