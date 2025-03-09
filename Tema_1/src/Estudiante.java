import java.util.Arrays;
import java.util.Objects;

public class Estudiante {
	private String nombre;
	private int dni;
	private int curso;
	private Asignatura[] matricula;
	
	
	public Estudiante() {
		super();
		this.nombre = "Nombre2";
		this.dni = 79497377;
		this.curso = 2;
		this.matricula = new Asignatura[] {new Asignatura(), new Asignatura("Pablo", 2374628, 4, 9)};	
	}
	
	public Estudiante(String nombre, int dni, int curso, Asignatura[] matricula) {
		super();
		if(nombre.length() < 3) {
			this.nombre = "No definido";
		} else {
			this.nombre = nombre;
		}
		
		if(dni < 0) {
			this.dni = 999999;
		} else {
			this.dni = dni;
		}
		
		if(curso < 0 || curso > 5) {
			this.curso = 1;
		} else {
			this.curso = curso;
		}
		
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre.length() < 3) {
			this.nombre = "No definido";
		} else {
			this.nombre = nombre;
		}
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		if(dni < 0) {
			this.dni = 999999;
		} else {
			this.dni = dni;
		}
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		if(curso < 0 || curso > 5) {
			this.curso = 1;
		} else {
			this.curso = curso;
		}
	}

	public Asignatura[] getMatricula() {
		return matricula;
	}

	public void setMatricula(Asignatura[] matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", dni=" + dni + ", curso=" + curso + ", matricula="
				+ Arrays.toString(matricula) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return curso == other.curso && dni == other.dni && Arrays.equals(matricula, other.matricula)
				&& Objects.equals(nombre, other.nombre);
	}

}
