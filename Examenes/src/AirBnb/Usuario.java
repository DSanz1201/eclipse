package AirBnb;

import java.util.Objects;

public class Usuario {
	private static int contador = 0;
	protected double codigo;
	protected String nombre;
	protected String apellido;
	protected int saldo;
	
	public Usuario(String nombre, String apellido, int saldo) {
		super();
		this.codigo = contador;
		contador++;
		this.nombre = nombre;
		this.apellido = apellido;
		this.saldo = saldo;
	}
	
	public Usuario() {
		super();
		this.codigo = contador;
		contador++;
		this.nombre = "Nombre1";
		this.apellido = "Apellido1";
		this.saldo = 1550670;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", saldo=" + saldo + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(apellido, other.apellido)
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo);
	}
}
