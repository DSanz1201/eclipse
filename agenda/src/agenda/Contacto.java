package agenda;

import java.io.Serializable;
import java.util.ArrayList;

public class Contacto implements Comparable<Contacto>, Serializable {
	/**
	 * Version 1 de objetos Contacto: 2020/04/07
	 */
	private static final long serialVersionUID = 1L;
	//Es necesario poner esto, el 1L se peude cambiar

	@Override
	public int hashCode() {
		return this.telefono.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Contacto) {		
			return this.telefono.equals(((Contacto) obj).getTelefono());
		} else { // obj no es un Contacto
			return false;
		}
	}

	private String nombre;
	private String telefono;
	private ArrayList<String> emails;
	
	public Contacto(String nombre, String telefono, ArrayList<String> emails) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.emails = new ArrayList<String>(emails);
	}
	
	public Contacto() {
		super();
		this.nombre = "";
		this.telefono = "";
		this.emails = new ArrayList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public ArrayList<String> getEmails() {
		return emails;
	}

	public void setEmails(ArrayList<String> emails) {
		this.emails = new ArrayList<String>(emails);
	}

	@Override
	public String toString() {
		String resultado = nombre + ";" + telefono + ";";
		
		for (String email : emails) {
			resultado += email + ";";
		}
		
		return resultado;
	}

	@Override
	public int compareTo(Contacto o) {
		return this.nombre.compareToIgnoreCase(o.nombre);
	}
	
	
}
