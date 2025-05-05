package DeustoIkea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class DeustoIkea {
	public static List<Mueble> cargarMueblesCSV(List<Mueble> muebles) {
		File f = new File("ikea-muebles.csv");
		
		try {
			Scanner sc = new Scanner(f);
			
			while(sc.hasNextLine()) {
				String linea = sc.nextLine();
				String[] campos = linea.split(",");
				if(campos[4].equals("True")) {
					MuebleOnline nuevo = new MuebleOnline(Integer.parseInt(campos[0]), campos[1], campos[2], Double.parseDouble(campos[3]), campos[5]);
					muebles.add(nuevo);
				} else {
					Mueble nuevo_online = new Mueble(Integer.parseInt(campos[0]), campos[1], campos[2], Double.parseDouble(campos[3]));
					muebles.add(nuevo_online);
				}
			}
			sc.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("No se pudo cargar el archivo: " + e.getMessage());
		}
		return muebles;
	}
	
	public static Set<String> totalCategorias(List<Mueble> muebles) {
		Set<String> set = new HashSet<>();
		Iterator<Mueble> it = muebles.iterator();
		while(it.hasNext()) {
			set.add(it.next().getCategoria());
		}
		return set;
	}
	
	public static Map<String, Integer> calcularTotalesPorCategoria(List<Mueble> muebles) {
		Map<String, Integer> mapa = new HashMap<>();
		for(Mueble mueble : muebles) {
			if(mapa.containsKey(mueble.getCategoria())) {
				mapa.put(mueble.getCategoria(), mapa.get(mueble.getCategoria()) + 1);
			} else {
				mapa.put(mueble.getCategoria(), 1);
			}
		}
		return mapa;
	}
	
	
	public static Map<String, List<Mueble>> asociarMueblesPorCategoria(List<Mueble> muebles) {
		Map<String, List<Mueble>> mapa = new HashMap<>();
		for(Mueble mueble : muebles) {
			if(mapa.containsKey(mueble.getCategoria())) {
				mapa.get(mueble.getCategoria()).add(mueble);
			} else {
				mapa.put(mueble.getCategoria(), new ArrayList<>());
			}
		}
		return mapa;
	}
	
	public static List<Tienda> cargarTiendasCSV(List<Tienda> tiendas) {
		File f = new File("ikea-tiendas.csv");
		
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				String linea = sc.nextLine();
				String[] campos = linea.split(";");
				Tienda tienda_temp = new Tienda(campos[0], campos[1], campos[2], campos[3], new HashMap<Mueble, Integer>());
				tiendas.add(tienda_temp);
			}
			sc.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("No se pudo cargar el archivo: " +e.getMessage());
		}
		return tiendas;
	}
	
	public static List<Tienda> rellenarAlmacenesTiendas(List<Tienda> tiendas, List<Mueble> muebles) {
		Random r = new Random();
		for(Tienda tienda : tiendas) {
			for(int i = 0; i < 5000; i++) {
				Mueble mueble_temp = muebles.get(r.nextInt(muebles.size()));
				if(tienda.getAlmacen().containsKey(mueble_temp)) {
					tienda.getAlmacen().put(mueble_temp, tienda.getAlmacen().get(mueble_temp) + 1);
				} else {
					tienda.getAlmacen().put(mueble_temp, 1);
				}
			}
		}
		return tiendas;
	}
	
	public static Tienda tiendaMasOnline(List<Tienda> tiendas) {
		Integer suma_act = 0;
		Integer suma_mayor = 0;
		Tienda mayor_tienda = tiendas.get(0);
		for(Tienda tienda : tiendas) {
			for(Mueble mueble : tienda.getAlmacen().keySet()) {
				suma_act = 0;
				if(mueble instanceof MuebleOnline) {
					suma_act += tienda.getAlmacen().get(mueble);
				}
			}
			if(suma_act > suma_mayor) {
				suma_mayor = suma_act;
				mayor_tienda = tienda;
			}
		}
		return mayor_tienda;
	}
	
	public static Mueble muebleMasDisponible(List<Tienda> tiendas) {
		Map<Mueble, Integer> mapa = new HashMap<>();
		Integer mayor_suma = 0;
		Mueble mayor = null;
		for(Tienda tienda : tiendas) {
			for(Mueble mueble : tienda.getAlmacen().keySet()) {
				if(mapa.containsKey(mueble)) {
					mapa.put(mueble, mapa.get(mueble) + 1);
				} else {
					mapa.put(mueble, 1);
				}
			}
		}
		for(Map.Entry<Mueble, Integer> entrada : mapa.entrySet()) {
			if(entrada.getValue() > mayor_suma) {
				mayor_suma = entrada.getValue();
				mayor = entrada.getKey();
			}
		}
		return mayor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Mueble> muebles = new ArrayList<>();
		
		muebles = cargarMueblesCSV(muebles);
		
		System.out.println(muebles);
		
		Set<String> set = new HashSet<>();
		
		set = totalCategorias(muebles);
		
		System.out.println(set);
		
		Map<String, Integer> mapa = new HashMap<>();
		
		mapa = calcularTotalesPorCategoria(muebles);
		
		System.out.println(mapa);
		
		System.out.println(muebles.size());
		
		List<Tienda> tiendas = new ArrayList<>();
		
		tiendas = cargarTiendasCSV(tiendas);
		
		System.out.println(tiendas);
		
		tiendas = rellenarAlmacenesTiendas(tiendas, muebles);
		
		System.out.println(tiendas.get(0).getAlmacen().size());
		
		Tienda mayor_tienda;
		
		mayor_tienda = tiendaMasOnline(tiendas);
		
		//System.out.println(mayor_tienda);
		
		
	}

}
