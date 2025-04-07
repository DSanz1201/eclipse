package federacion;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class Liga extends Evento {
	protected ArrayList<Ajedrecista> ajedrecistas;

	/**
	 * Constructor con argumentos
	 * 
	 * @param nombre nombre del evento
	 * @param edadMin edad mínima para poder participar
	 * @param edadMax edad máxima para poder participar
	 * @param fecha fecha inicial del evento
	 * @param partidas lista de partidas del evento
	 * @param ajedrecistas lista de ajedredrecistas de la liga
	 */
	public Liga(String nombre, int edadMin, int edadMax, LocalDateTime fecha, ArrayList<Partida> partidas,
			ArrayList<Ajedrecista> ajedrecistas) {
		super(nombre, edadMin, edadMax, fecha, partidas);
		this.ajedrecistas = ajedrecistas;
	}

	/**
	 * @return la lista de ajedredrecistas de la liga
	 */
	public ArrayList<Ajedrecista> getAjedrecistas() {
		return ajedrecistas;
	}

	/**
	 * @param ajedrecistas la lista de ajedredrecistas de la liga
	 */
	public void setAjedrecistas(ArrayList<Ajedrecista> ajedrecistas) {
		this.ajedrecistas = ajedrecistas;
	}

	@Override
	public String toString() {
		return "Liga [ajedrecistas=" + ajedrecistas + ", nombre=" + nombre + ", edadMin=" + edadMin + ", edadMax="
				+ edadMax + ", fecha=" + fecha + ", partidas=" + partidas + "]";
	}

	@Override
	public void actualizarElo() {
		for (Partida partida : partidas) {
			if(partida.getBlancas().getPuntosElo() > partida.getNegras().getPuntosElo()) {
				partida.getNegras().setPuntosElo(partida.getNegras().getPuntosElo() + 1);
			}
			else {
				partida.getBlancas().setPuntosElo(partida.getBlancas().getPuntosElo() + 1);
			}
		}
		
	}

	@Override
	public void crearEvento() {
		ArrayList <Partida> partidas = new ArrayList<>();
		Random random = new Random();
		for(int i = 0; i < (ajedrecistas.size() / 2); i = i + 2) {
			Partida partida_temp = new Partida(ajedrecistas.get(i), ajedrecistas.get(i + 1), null, null);
			partidas.add(partida_temp);
		}
		
	}
	
}
