package federacion;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Torneo extends Evento {
	protected ArrayList<Ajedrecista> ajedrecistas;

	/**
	 * @param nombre nombre del evento
	 * @param edadMin edad mínima para poder participar
	 * @param edadMax edad máxima para poder participar
	 * @param fecha fecha inicial del evento
	 * @param partidas lista de partidas del evento
	 * @param ajedrecistas lista de ajedredrecistas del torneo
	 */
	public Torneo(String nombre, int edadMin, int edadMax, LocalDateTime fecha, ArrayList<Partida> partidas,
			ArrayList<Ajedrecista> ajedrecistas) {
		super(nombre, edadMin, edadMax, fecha, partidas);
		this.ajedrecistas = ajedrecistas;
	}

	/**
	 * @return la lista de ajedredrecistas del torneo
	 */
	public ArrayList<Ajedrecista> getAjedrecistas() {
		return ajedrecistas;
	}

	/**
	 * @param ajedrecistas la lista de ajedredrecistas del torneo
	 */
	public void setAjedrecistas(ArrayList<Ajedrecista> ajedrecistas) {
		this.ajedrecistas = ajedrecistas;
	}

	@Override
	public String toString() {
		return "Torneo [ajedrecistas=" + ajedrecistas + ", nombre=" + nombre + ", edadMin=" + edadMin + ", edadMax="
				+ edadMax + ", fecha=" + fecha + ", partidas=" + partidas + "]";
	}

	@Override
	public void actualizarElo() {
		for (Partida partida : partidas) {
			if(partida.getResultado() == Resultado.BLANCAS) {
				partida.getBlancas().setPuntosElo(partida.getBlancas().getPuntosElo() + 2);
				partida.getNegras().setPuntosElo(partida.getNegras().getPuntosElo() - 1);
				
			} else if (partida.getResultado() == Resultado.NEGRAS) {
				partida.getNegras().setPuntosElo(partida.getNegras().getPuntosElo() + 2); 
				partida.getBlancas().setPuntosElo(partida.getBlancas().getPuntosElo() - 1);
			} else {
				partida.getBlancas().setPuntosElo(partida.getBlancas().getPuntosElo() + 1);
				partida.getNegras().setPuntosElo(partida.getNegras().getPuntosElo() + 1);
			}
		}
		
	}
	
}
