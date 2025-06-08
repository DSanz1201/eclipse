package tennisys;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

class Partido implements Serializable {
    private static final long serialVersionUID = 1L;
	private Jugador jugador1;
    private Jugador jugador2;
    private Arbitro arbitro;
    private Map<Jugador, Integer> setsGanados;
    private int duracion; // en minutos

    public Partido(Jugador j1, Jugador j2, Arbitro a, int duracion) {
        this.jugador1 = j1;
        this.jugador2 = j2;
        this.arbitro = a;
        this.duracion = duracion;
        this.setsGanados = new HashMap<>();
    }

    public Arbitro getArbitro() {
		return arbitro;
	}

	public void setArbitro(Arbitro arbitro) {
		this.arbitro = arbitro;
	}

	public void setResultado(Jugador jugador, int sets) {
        setsGanados.put(jugador, sets);
    }

    public Jugador getGanador() {
        return null;
    }

    public int getDuracion() {
        return duracion;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }
    
    public boolean esValido() {
    	if(this.arbitro.getNivel() >= 3 && this.jugador1.getRanking() > 0 && this.jugador2.getRanking() > 0) {
    		return true;
    	} else {
    		return false;
    	}
    }

}
