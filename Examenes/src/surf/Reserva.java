package surf;

public class Reserva {
	private Alumno alumno;
	private ClaseSurf clase;
	private Estado estado;
	
	public Reserva(Alumno alumno, ClaseSurf clase, Estado estado) {
		super();
		this.alumno = alumno;
		this.clase = clase;
		this.estado = estado;
	}
	
	public Reserva() {
		super();
		this.alumno = new Alumno();
		this.clase = new ClaseSurf();
		this.estado = Estado.Confirmado;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public ClaseSurf getClase() {
		return clase;
	}

	public void setClase(ClaseSurf clase) {
		this.clase = clase;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Reserva [alumno=" + alumno + ", clase=" + clase + ", estado=" + estado + "]";
	}
	
}
