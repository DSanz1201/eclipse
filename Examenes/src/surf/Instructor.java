package surf;

public class Instructor extends Usuario {
	
	private int annosExperiencia;

	public Instructor() {
		super();
		this.annosExperiencia = 1;
	}

	public Instructor(String nombre, String dni, String telefono, int edad, int annosExperiencia) {
		super(nombre, dni, telefono, edad);
		this.annosExperiencia = annosExperiencia;
	}

	public int getAnnosExperiencia() {
		return annosExperiencia;
	}

	public void setAnnosExperiencia(int annosExperiencia) {
		this.annosExperiencia = annosExperiencia;
	}

	@Override
	public String toString() {
		return "Instructor [annosExperiencia=" + annosExperiencia + ", getNombre()=" + getNombre() + ", getDni()="
				+ getDni() + ", getTelefono()=" + getTelefono() + ", getEdad()=" + getEdad() + "]";
	}
	
	
}
