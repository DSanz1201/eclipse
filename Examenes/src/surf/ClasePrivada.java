package surf;

public class ClasePrivada extends ClaseSurf {

	private double costoExtra;

	public ClasePrivada(NivelParticipacion nivelParticipacion, int duracion, int capacidadMaxima,
			boolean disponibilidad, Instructor instructor, float puntuacion, double costoExtra) {
		super(nivelParticipacion, duracion, capacidadMaxima, disponibilidad, instructor, puntuacion);
		this.costoExtra = costoExtra;
	}
	
	public ClasePrivada() {
		super();
		this.costoExtra = 100;
	}

	public double getCostoExtra() {
		return costoExtra;
	}

	public void setCostoExtra(double costoExtra) {
		this.costoExtra = costoExtra;
	}

	@Override
	public String toString() {
		return "ClasePrivada [costoExtra=" + costoExtra + "]";
	}
		
}
