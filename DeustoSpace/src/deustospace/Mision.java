package deustospace;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

/** Clase que permite crear objetos misiones espaciales
 */
public class Mision implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String lugar;
	private String destino;
	private LocalDate fecha;
	private ArrayList<Personal> personal;
	
	/** Crea una nueva misión
	 * @param nombre	Nombre
	 * @param lugar	Lugar
	 * @param destino	Destino de la misión
	 */
	public Mision(String nombre, String lugar, String destino) {
		super();
		this.nombre = nombre;
		this.lugar = lugar;
		this.destino = destino;
		this.personal = new ArrayList<Personal>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public void setFecha(int anyo, int mes, int dia) {
		this.fecha = LocalDate.of(anyo, mes, dia);
	}

	public ArrayList<Personal> getPersonal() {
		return personal;
	}

	public void setPersonal(ArrayList<Personal> personal) {
		this.personal = personal;
	}

	@Override
	public String toString() {
		return "Mision " + nombre + " a " + destino + " (" + fecha + ",personal: " + personal.size() + ")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(destino, fecha, lugar, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mision other = (Mision) obj;
		return Objects.equals(destino, other.destino) && Objects.equals(fecha, other.fecha)
				&& Objects.equals(lugar, other.lugar) && Objects.equals(nombre, other.nombre);
	}
		
}
