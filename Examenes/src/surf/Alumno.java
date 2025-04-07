package surf;

public class Alumno extends Usuario {

	private int cantidadClases;
	
	public Alumno() {
		super();
		this.cantidadClases = 0;
	}

	public Alumno(String nombre, String dni, String telefono, int edad, int cantidadClases) {
		super(nombre, dni, telefono, edad);
		this.cantidadClases = cantidadClases;
	}

	public int getCantidadClases() {
		return cantidadClases;
	}

	public void setCantidadClases(int cantidadClases) {
		this.cantidadClases = cantidadClases;
	}

	@Override
	public String toString() {
		return "Alumno [cantidadClases=" + cantidadClases + ", getNombre()=" + getNombre() + ", getDni()=" + getDni()
				+ ", getTelefono()=" + getTelefono() + ", getEdad()=" + getEdad() + "]";
	}
	
	
}
