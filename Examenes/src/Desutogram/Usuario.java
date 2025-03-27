package Desutogram;

import java.util.ArrayList;
import java.util.Objects;

public class Usuario {
	private static int ident = 0;
	private String nombre;
	private String apellidos;
	private String correo;
	private String contra;
	private ArrayList<Contenido> contenido;
	
	public Usuario(String nombre, String apellidos, String correo, String contra, ArrayList<Contenido> contenido) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.contra = contra;
		this.contenido = contenido;
	}
	
	public Usuario() {
		super();
		this.nombre = "Nombre0";
		this.apellidos = "Apellido00 apellido01";
		this.correo = "Correo0";
		this.contra = "Contraseña0";
		this.contenido = new ArrayList<Contenido>();
		this.contenido.add(new Contenido());
	}

	public static int getIdent() {
		return ident;
	}

	public static void setIdent(int ident) {
		Usuario.ident = ident;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	public ArrayList<Contenido> getContenido() {
		return contenido;
	}

	public void setContenido(ArrayList<Contenido> contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", correo=" + correo + ", contra=" + contra
				+ ", contenido=" + contenido + "]";
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
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(contenido, other.contenido)
				&& Objects.equals(contra, other.contra) && Objects.equals(correo, other.correo)
				&& Objects.equals(nombre, other.nombre);
	}
	
	
}
