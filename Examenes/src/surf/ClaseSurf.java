package surf;

public class ClaseSurf implements Evaluable {
	private static int cont = 0;
	
	private int identificador;
	private NivelParticipacion nivelParticipacion;
	private int duracion;
	private int capacidadMaxima;
	private boolean disponibilidad;
	private Instructor instructor;
	private float puntuacion;
	
	public ClaseSurf(NivelParticipacion nivelParticipacion, int duracion, int capacidadMaxima,
			boolean disponibilidad, Instructor instructor, float puntuacion) {
		super();
		this.identificador = cont;
		this.nivelParticipacion = nivelParticipacion;
		this.duracion = duracion;
		this.capacidadMaxima = capacidadMaxima;
		this.disponibilidad = disponibilidad;
		this.instructor = instructor;
		this.puntuacion = puntuacion;
		cont++;
	}
	
	public ClaseSurf() {
		super();
		this.identificador = cont;
		this.nivelParticipacion = NivelParticipacion.Principiante;
		this.duracion = 120;
		this.capacidadMaxima = 1;
		this.disponibilidad = true;
		this.instructor = new Instructor();
		this.puntuacion = 0;
		cont++;
	}
	
	public int getIdentificador() {
		return identificador;
	}
	public NivelParticipacion getNivelParticipacion() {
		return nivelParticipacion;
	}
	public void setNivelParticipacion(NivelParticipacion nivelParticipacion) {
		this.nivelParticipacion = nivelParticipacion;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	public boolean isDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public float getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(float puntuacion) {
		this.puntuacion = puntuacion;
	}

	@Override
	public String toString() {
		return "ClaseSurf [identificador=" + identificador + ", nivelParticipacion=" + nivelParticipacion
				+ ", duracion=" + duracion + ", capacidadMaxima=" + capacidadMaxima + ", disponibilidad="
				+ disponibilidad + ", instructor=" + instructor + ", puntuacion=" + puntuacion + "]";
	}

	@Override
	public void evaluar(float nuevo) {
		this.puntuacion = this.puntuacion + nuevo;
	}
	
}
