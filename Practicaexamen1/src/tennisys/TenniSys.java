package tennisys;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class TenniSys {
	private List<Torneo> torneos;
    private List<Jugador> jugadores;

    public TenniSys() {
        this.torneos = new ArrayList<>();
        this.jugadores = new ArrayList<>();
    }

	@SuppressWarnings("unchecked")
	public void leerTorneosBinario(String nombreArchivo) {
        try {
            FileInputStream fis = new FileInputStream(nombreArchivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            torneos = (List<Torneo>) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Torneos cargados correctamente.");
            
        } catch (FileNotFoundException e) {
            System.err.println("El archivo no se encontró: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error de lectura del archivo: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Clase no encontrada al deserializar: " + e.getMessage());
        }
    }

    public void guardarRankingBinario(String nombreArchivo) {
        List<Jugador> lista = new ArrayList<>(jugadores);
        Collections.sort(lista, new Comparator<Jugador>() {
			@Override
			public int compare(Jugador o1, Jugador o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getRanking(), o2.getRanking());
			}
        });
        
        try {
        	FileOutputStream fos = new FileOutputStream(nombreArchivo);
        	ObjectOutputStream oos = new ObjectOutputStream(fos);
        	oos.writeObject(lista);
        	oos.close();
        	fos.close();
        		
        } catch (IOException e){
        	System.err.println("Error al guardar el ranking: " + e.getMessage());
        }
        
    }

    public String paisConMasTorneos() {
        HashMap<String, Integer> mapa = new HashMap<>();
        for(Torneo torneo : torneos) {
        	if(mapa.containsKey(torneo.getUbicacion())) {
        		mapa.put(torneo.getUbicacion(), mapa.get(torneo.getUbicacion()) + 1);
        	} else {
        		mapa.put(torneo.getUbicacion(), 1);
        	}
        }
        Integer mayor = 0;
        List<String> mayor_lugar = new ArrayList<>();
        for(Map.Entry<String, Integer> lugar : mapa.entrySet()) {
        	if(lugar.getValue() >= mayor) {
        		mayor = lugar.getValue();
        		mayor_lugar.add(lugar.getKey());
        	}
        }
        if(mayor_lugar.size() > 1) {
        	Collections.sort(mayor_lugar);
        }
        return mayor_lugar.get(0);
    }
    

    public void ordenarPartidosPorDuracion() {
        List<Partido> lista = new ArrayList<>();
        for(Torneo torneo : torneos) {
        	for(Partido partido : torneo.getPartidos()) {
        		lista.add(partido);
        	}
        }
        Collections.sort(lista, new Comparator<Partido>() {

			@Override
			public int compare(Partido o1, Partido o2) {
				// TODO Auto-generated method stub
				if(o1.getDuracion() > o2.getDuracion()) {
					return -1;
				} else if(o1.getDuracion() == o2.getDuracion()) {
					return 0;
				} else {
					return 1;
				}
			}
        });
        List<Partido> devolver = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
        	devolver.add(lista.get(i));
        }
        System.out.println(devolver);
    }

    public List<Torneo> getTorneos() {
        return torneos;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }
}