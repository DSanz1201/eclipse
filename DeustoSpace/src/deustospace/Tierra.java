package deustospace;

/** Clase que permite crear objetos de personas que trabajan como personal de tierra
 */
public class Tierra extends Personal {
	private static final long serialVersionUID = 1L;
	private int nivelLaboral;
	
	/** Crea un nuevo objeto personal de tierra
	 * @param pais	País de origen
	 * @param nombre	Nombre
	 * @param nivel	Nivel laboral del trabajador/a (de 1 a 5)
	 */
	public Tierra(String pais, String nombre, int nivel) {
		super(pais, nombre);
		this.nivelLaboral = nivel;
	}

	public int getNivelLaboral() {
		return nivelLaboral;
	}

	public void setNivelLaboral(int nivel) {
		this.nivelLaboral = nivel;
	}

	@Override
	public String toString() {
		return "Personal de tierra " + getNombre() + " (" + getPais() + " nivel laboral " + nivelLaboral + ")";
	}

}
