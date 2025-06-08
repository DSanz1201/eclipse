package tennisys;

public class JugadorNacional extends Jugador {
	private int anyosExperiencia;

	public JugadorNacional(String nombre, int edad, int ranking) {
		super(nombre, edad, ranking);
		this.anyosExperiencia = 10;
	}

	public int getAnyosExperiencia() {
		return anyosExperiencia;
	}



	public void setAnyosExperiencia(int anyosExperiencia) {
		this.anyosExperiencia = anyosExperiencia;
	}

	@Override
	public double getFactorPromocion() {
		return this.getAnyosExperiencia() * 1.5;
	}

}
