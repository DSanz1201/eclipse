import java.util.Arrays;
import java.util.Objects;

public class Grado {
	private String nombre;
	private Estudiante[] estudiantes;
	
	public Grado() {
		super();
		this.nombre = "Nombre3";
		this.estudiantes = new Estudiante[] {new Estudiante(), new Estudiante("Pepito", 67543212, 3, new Asignatura[] {new Asignatura()})};
	}
	
	public Grado(String nombre, Estudiante[] estudiantes) {
		super();
		if(nombre.length() < 3) {
			this.nombre = "Jose Luis";
		} else {
			this.nombre = nombre;
		}
		
		this.estudiantes = estudiantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre.length() < 3) {
			this.nombre = "Jose Luis";
		} else {
			this.nombre = nombre;
		}
	}

	public Estudiante[] getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(Estudiante[] estudiantes) {
		this.estudiantes = estudiantes;
	}

	@Override
	public String toString() {
		return "Grado [nombre=" + nombre + ", estudiantes=" + Arrays.toString(estudiantes) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grado other = (Grado) obj;
		return Arrays.equals(estudiantes, other.estudiantes) && Objects.equals(nombre, other.nombre);
	}

}
