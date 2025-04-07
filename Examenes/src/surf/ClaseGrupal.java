package surf;

public class ClaseGrupal extends ClaseSurf {
	
	private int cantidadMinima;

	public ClaseGrupal(NivelParticipacion nivelParticipacion, int duracion, int capacidadMaxima, boolean disponibilidad,
			Instructor instructor, float puntuacion, int cantidadMinima) {
		super(nivelParticipacion, duracion, capacidadMaxima, disponibilidad, instructor, puntuacion);
		this.cantidadMinima = cantidadMinima;
	}
	
	public ClaseGrupal() {
		super();
		this.cantidadMinima = 5;
	}

	public int getCantidadMinima() {
		return cantidadMinima;
	}

	public void setCantidadMinima(int cantidadMinima) {
		this.cantidadMinima = cantidadMinima;
	}

	@Override
	public String toString() {
		return "ClaseGrupal [cantidadMinima=" + cantidadMinima + "]";
	}
	
}
