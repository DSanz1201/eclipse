package tennisys;

import java.io.Serializable;

public abstract class Jugador implements Serializable {
    private static final long serialVersionUID = 1L;
	protected String nombre;
    protected int edad;
    protected int ranking;

    public Jugador(String nombre, int edad, int ranking) {
        this.nombre = nombre;
        this.edad = edad;
        this.ranking = ranking;
    }

    public String getNombre() {
        return nombre;
    }

    public int getRanking() {
        return ranking;
    }
    
    public abstract double getFactorPromocion();
}