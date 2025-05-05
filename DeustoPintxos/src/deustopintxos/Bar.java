package deustopintxos;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;

public class Bar {
	private String nombre;
	private LinkedList<Pedido> pedidos;
	// TAREA 2A: nuevo atributo recaudacion
		
	public Bar(String nombre, LinkedList<Pedido> pedidos) {
		super();
		this.nombre = nombre;
		this.pedidos = new LinkedList<Pedido>(pedidos);
	}
	
	public Bar(String nombre) {
		super();
		this.nombre = nombre;
		this.pedidos = new LinkedList<Pedido>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LinkedList<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(LinkedList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "Bar " + nombre + ", " + pedidos.size() + " pedidos";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bar other = (Bar) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	// TAREA 2C: metodo cobrarPedidos
	
}
