package agenda;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Agenda implements Serializable {
	/**
	 * Version 1 de objetos Agenda: 2020/04/07
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private ArrayList<Contacto> contactos;
	
	public Agenda(String nombre, ArrayList<Contacto> contactos) {
		super();
		this.nombre = nombre;
		this.contactos = new ArrayList<Contacto>(contactos);
	}
	
	public Agenda() {
		super();
		this.nombre = "";
		this.contactos = new ArrayList<Contacto>();
	}
	
	public Agenda(Agenda a) {
		super();
		this.nombre = a.nombre;
		this.contactos = new ArrayList<Contacto>(a.contactos);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	@Override
	public String toString() {
		return "Agenda [nombre=" + nombre + ", contactos=" + contactos + "]";
	}
	
	public void anyadir(Contacto c) {
		this.contactos.add(c);
	}
	
	public boolean borrar(Contacto c) {
		return this.contactos.remove(c);
	}
	
	public boolean modificar(Contacto viejo, Contacto nuevo) {
		int posicion = this.contactos.indexOf(viejo);
		
		if (posicion >= 0) {
			this.contactos.set(posicion, nuevo);
			return true;
		} else {
			return false;
		}
	}
	
	public void ordenar() {
		Collections.sort(this.contactos);
	}
	
	public void leerDatosTexto(String fichero) {
		try {
			Scanner sc = new Scanner(new FileInputStream(fichero));
			
			while (sc.hasNext()) {
				String linea = sc.nextLine();
				String[] campos = linea.split(";");
				// Tratar el contacto que está definido en linea
				Contacto nuevo = new Contacto();
				nuevo.setNombre(campos[0]);
				nuevo.setTelefono(campos[1]);
				ArrayList<String> emails = new ArrayList<String>();
				for (int i = 2; i < campos.length; i++) {
					emails.add(campos[i]);
				}
				nuevo.setEmails(emails);
				anyadir(nuevo);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: no se ha podido abrir el fichero " + fichero);
		}
	}
	
	public void guardarDatosTexto(String fichero) {
		try {
			PrintStream ps = new PrintStream(fichero);
			
			for (Contacto contacto : contactos) {
				ps.println(contacto);
			}
			
			ps.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: no se ha podido abrir el fichero " + fichero);
		} 
	}
	
	public void guardarDatosBinario(String fichero) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));
			
			oos.writeObject(this);
			
			oos.close();
		} catch (IOException e) {
			System.out.println("Error al guardar datos en el fichero " + fichero);
		} 
	}
	
	public void leerDatosBinario(String fichero) {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));
			
			Agenda agenda = (Agenda) ois.readObject();
			
			this.setNombre(agenda.getNombre());
			this.setContactos(agenda.getContactos());
			
			ois.close();
		} catch (IOException e) {
			System.out.println("Error al acceder al fichero " + fichero);
		} catch (ClassNotFoundException e) {
			System.out.println("Error al leer datos del fichero " + fichero);
		}
	}
	
}
