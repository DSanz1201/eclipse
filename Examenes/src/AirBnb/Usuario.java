package AirBnb;

import java.util.Objects;

public class Usuario {
	protected double codigo;
	protected String nombre;
	protected String apellido;
	protected double saldo;
	
	public Usuario(double codigo, String nombre, String apellido, double saldo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.saldo = saldo;
	}
	
	public Usuario() {
		super();
		this.codigo = 237469123;
		this.nombre = "Nombre1";
		this.apellido = "Apellido1";
		this.saldo = 1550670;
	}

	public double getCodigo() {
		return codigo;
	}

	public void setCodigo(double codigo) {
		this.codigo = codigo;
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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", saldo=" + saldo + "]";
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
				&& Double.doubleToLongBits(codigo) == Double.doubleToLongBits(other.codigo)
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo);
	}
}
