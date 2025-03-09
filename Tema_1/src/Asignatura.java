import java.util.Objects;

public class Asignatura {
	private String nombre;
	private int codigo;
	private int curso;
	private int creditos;
	
	public Asignatura() {
		super();
		this.nombre = "Nombre1";
		this.codigo = 12387651;
		this.curso = 4;
		this.creditos = 32;
	}
	
	public Asignatura(String nombre, int codigo, int curso, int creditos) {
		super();
		if(nombre.length() < 3) {
			this.nombre = "Sin especificar";
		} else {
			this.nombre = nombre;
		}
		
		if(codigo < 0) {
			this.codigo = 000000000;
		} else {
			this.codigo = codigo;
		}
		
		if(curso < 0 || curso > 5) {
			this.curso = 999;
		} else {
			this.curso = curso;
		}
		
		if(creditos < 0 || creditos > 200) {
			this.creditos = 0;
		} else {
			this.creditos = creditos;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre.length() < 3) {
			this.nombre = "Sin especificar";
		} else {
			this.nombre = nombre;
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if(codigo < 0) {
			this.codigo = 000000000;
		} else {
			this.codigo = codigo;
		}
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		if(curso < 0 || curso > 5) {
			this.curso = 999;
		} else {
			this.curso = curso;
		}
	}

	public int getCreditos() {
		return creditos;
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", codigo=" + codigo + ", curso=" + curso + ", creditos=" + creditos
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asignatura other = (Asignatura) obj;
		return codigo == other.codigo && creditos == other.creditos && curso == other.curso
				&& Objects.equals(nombre, other.nombre);
	}

}
