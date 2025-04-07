package Viajes;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Agencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		Set<Viaje> viajes = new TreeSet<>();
		HashMap<Pais, Integer> map = new HashMap<>();
		
		int[] contadores = new int[Pais.values().length];
		
		
		while(viajes.size() < 20) {
			Pais destino = Pais.values()[random.nextInt(Pais.values().length)];
			viajes.add(new Viaje(Pais.values()[random.nextInt(Pais.values().length)], destino, random.nextInt(365) + 1));
		}
		
		for (Viaje v : viajes) {
			int ord = v.getDestino().ordinal();
			contadores[ord]++;
		}
		
		for (Viaje v : viajes) {
			if(map.containsKey(v.getDestino())) {
				map.put(v.getDestino(), map.get(v.getDestino()) + 1);
			} else {
				map.put(v.getDestino(), 1);
			}
			
		}
		
		for (Pais p : Pais.values()) {
			System.out.println(p.toString() + " - " + contadores[p.ordinal()]);
		}
		
		System.out.println("---------------------------------------");
		
		System.out.println(map);
		
	}

}
