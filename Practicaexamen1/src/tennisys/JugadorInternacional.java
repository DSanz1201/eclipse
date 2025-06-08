package tennisys;

public class JugadorInternacional extends Jugador {

	public JugadorInternacional(String nombre, int edad, int ranking) {
		super(nombre, edad, ranking);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getFactorPromocion() {
		// TODO Auto-generated method stub
		return this.getRanking() * 0.8;
	}

}
