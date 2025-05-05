package DeustoIkea;

import java.util.HashMap;
import java.util.Objects;

public class Tienda {
	private String nombre;
	private String direccion;
	private String tipo;
	private String horario;
	private HashMap<Mueble, Integer> almacen;
	
	
	public Tienda(String nombre, String direccion, String tipo, String horario, HashMap<Mueble, Integer> almacen) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.tipo = tipo;
		this.horario = horario;
		this.almacen = almacen;
	}
	
	public Tienda() {
		super();
		this.nombre = "Nombretienda0";
		this.direccion = "Direcciontienda0";
		this.tipo = "Tipotienda0";
		this.horario = "Horariotienda0";
		this.almacen = new HashMap<Mueble, Integer>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horarios) {
		this.horario = horarios;
	}

	public HashMap<Mueble, Integer> getAlmacen() {
		return almacen;
	}

	public void setAlmacen(HashMap<Mueble, Integer> almacen) {
		this.almacen = almacen;
	}

	@Override
	public String toString() {
		return "Tienda [nombre=" + nombre + ", direccion=" + direccion + ", tipo=" + tipo + ", horario=" + horario
				+ ", almacen=" + almacen + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(almacen, direccion, horario, nombre, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tienda other = (Tienda) obj;
		return Objects.equals(almacen, other.almacen) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(horario, other.horario) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(tipo, other.tipo);
	}
	
}
