package deustospace;

import java.io.Serializable;
import java.util.Objects;

/** Clase abstracta madre para las personas de la agencia espacial
 */
public abstract class Personal implements Serializable {
	private static final long serialVersionUID = 1L;
	private String pais;
	private String nombre;
	
	/** Crea un objeto personal
	 * @param pais	País de origen de la persona
	 * @param nombre	Nombre de la persona
	 */
	public Personal(String pais, String nombre) {
		super();
		this.nombre = nombre;
		this.pais = pais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return nombre + "(" + pais + ")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, pais);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personal other = (Personal) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(pais, other.pais);
	}
	
}
