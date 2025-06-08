package atracciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class DeustoAventura {

	public static void main(String[] args) {
		// Lista de atracciones de DeustoAventura
		Atraccion[] ats = {
				new Atraccion("Carrusel", 0, 50),
				new Atraccion("Montaña rusa", 140, 25),
				new Atraccion("Autos locos", 100, 35),
				new Atraccion("Mansión embrujada", 120, 15),
				new Atraccion("Water splash", 90, 40)
		};
		ArrayList<Atraccion> atracciones = new ArrayList<Atraccion>(Arrays.asList(ats));

		// EJERCICIO 1: Cargar lista de visitantes de DeustoAventura
		ArrayList<Visitante> visitantes = cargarDatosVisitantes();
		System.out.println(visitantes.size()); // debería mostrar 50
		System.out.println(visitantes); // debería mostrar la lista de visitantes ordenada por altura
		System.out.println(visitantes.get(0).getAltura());
		
		// EJERCICIO 2: Asignar atracciones a visitantes
		asignarAtracciones(atracciones, visitantes);
		System.out.println(visitantes.get(0)); // debería mostrar un visitante con 3 atracciones asignadas
		
		// EJERCICIO 3: Contar visitantes por tipo de entrada
		HashMap<Entrada, Integer> numeroPorEntrada = contarVisitantes(visitantes);
		System.out.println(numeroPorEntrada); // debería mostrar {VIP=8, EXPRESS=17, NORMAL=25}
		
		// EJERCICIO 4: Agrupar visitantes por atracción
		HashMap<Atraccion, LinkedList<Visitante>> visitantesPorAtraccion = agruparVisitantes(visitantes);
		System.out.println(visitantesPorAtraccion.get(atracciones.get(0)).size()); // debería mostrar un número aleatorio entre 0 y 50
		
		// EJERCICIO 5: Simular el comportamiento de los visitantes
		simularComportamiento(visitantesPorAtraccion);
		//simularComportamiento2(visitantesPorAtraccion);
		
		// EXTRA: Simular el comportamiento de los visitantes teniendo en cuenta la duración de las atracciones
		//simularComportamientoExtra(visitantesPorAtraccion);
	}
	
	public static ArrayList<Visitante> cargarDatosVisitantes() {
		ArrayList<Visitante> lista = new ArrayList<>();
		File f = new File("visitantes.csv");
		
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				String linea = sc.nextLine();
				String[] campos = linea.split(";");
				Visitante nuevo = new Visitante(Integer.parseInt(campos[0]), Entrada.valueOf(campos[1]));
				lista.add(nuevo);
			}
			sc.close();
				
		} catch (FileNotFoundException e) {
			System.err.println("No se puedo encontrar el archivo: " + e.getMessage());
		}
		return lista;
	}
	
	public static HashMap<Entrada, Integer> contarVisitantes(List<Visitante> visitantes) {
		HashMap<Entrada, Integer> mapa = new HashMap<>();
		for(Visitante visitante : visitantes) {
			if(mapa.containsKey(visitante.getEntrada())) {
				mapa.put(visitante.getEntrada(), mapa.get(visitante.getEntrada()) + 1);
			} else {
				mapa.put(visitante.getEntrada(), 1);
			}
		}
		return mapa;
	}
	
	public static List<Visitante> asignarAtracciones(List<Atraccion> atracciones, List<Visitante> visitantes) {
		Random r = new Random();
		for(Visitante visitante : visitantes) {
			for(int i = 0; i < 3; i++) {
				Integer size_before = visitante.getAtracciones().size();
				while(visitante.getAtracciones().size() != size_before + 1) {
					visitante.getAtracciones().add(atracciones.get(r.nextInt(atracciones.size())));
				}
			}
		}
		return visitantes;
	}
	
	public static HashMap<Atraccion, LinkedList<Visitante>> agruparVisitantes(List<Visitante> visitantes) {
		HashMap<Atraccion, LinkedList<Visitante>> mapa = new HashMap<>();
		for(Visitante visitante : visitantes) {
			for(Atraccion atraccion : visitante.getAtracciones()) {
				if(mapa.containsKey(atraccion)) {
					mapa.get(atraccion).add(visitante);
				} else {
					mapa.put(atraccion, new LinkedList<Visitante>());
					mapa.get(atraccion).add(visitante);
				}
			}
		}
		return mapa;
	}
	
	public static void simularComportamiento(Map<Atraccion, LinkedList<Visitante>> mapa) {
		for(Map.Entry<Atraccion, LinkedList<Visitante>> atraccion : mapa.entrySet()) {
			Integer montados = 0;
			System.out.println("Atraccion " + atraccion.getKey().getNombre());
			while(!atraccion.getValue().isEmpty()) {
				Visitante visitante = atraccion.getValue().pop();
				if(visitante.getAltura() < atraccion.getKey().getAltura()) {
					System.out.println(visitante.getCodigo() + " no entra por falta de altura");
				} else {
					if(atraccion.getKey().getCapacidad() < montados) {
						System.out.println("Siguiente turno: ");
						montados = 0;
					}
					System.out.println("Entra " + visitante.getCodigo());
					montados++;
				}
			}
		}
	}
	
	//EJERCICIO 6 SIN COMPLETAR
	
	/**
	public static void simularComportamiento2(Map<Atraccion, LinkedList<Visitante>> mapa) {
		ArrayList<Visitante> vip = new ArrayList<>();
		ArrayList<Visitante> express = new ArrayList<>();
		ArrayList<Visitante> normal = new ArrayList<>();
		for(Map.Entry<Atraccion, LinkedList<Visitante>> atraccion : mapa.entrySet()) {
			Integer montados = 0;
			System.out.println("Atraccion " + atraccion.getKey().getNombre());
			while(!atraccion.getValue().isEmpty()) {
				Visitante visitante = atraccion.getValue().pop();
				if(visitante.getEntrada().equals(Entrada.VIP)) {
					vip.add(visitante);
				} else if (visitante.getEntrada().equals(Entrada.EXPRESS)) {
					express.add(visitante);
				} else {
					normal.add(visitante);
				}
				
			}
			
			for(Visitante visitante : vip) {
				if(visitante.getAltura() < atraccion.getKey().getAltura()) {
					System.out.println(visitante.getCodigo() + " no entra por falta de altura");
				} else {
					if(atraccion.getKey().getCapacidad() < montados) {
						System.out.println("Siguiente turno: ");
						montados = 0;
					}
				}
				System.out.println("Entra " + visitante.getCodigo());
				montados++;
			}
			
			for(Visitante visitante : express) {
				if(visitante.getAltura() < atraccion.getKey().getAltura()) {
					System.out.println(visitante.getCodigo() + " no entra por falta de altura");
				} else {
					if(atraccion.getKey().getCapacidad() < montados) {
						System.out.println("Siguiente turno: ");
						montados = 0;
					}
				}
				System.out.println("Entra " + visitante.getCodigo());
				montados++;
			}
			
			for(Visitante visitante : normal) {
				if(visitante.getAltura() < atraccion.getKey().getAltura()) {
					System.out.println(visitante.getCodigo() + " no entra por falta de altura");
				} else {
					if(atraccion.getKey().getCapacidad() < montados) {
						System.out.println("Siguiente turno: ");
						montados = 0;
					}
				}
				System.out.println("Entra " + visitante.getCodigo());
				montados++;
			}
		}
	}
	*/

	public static ArrayList<Visitante> cargaDatosVisitantes2() {
		ArrayList<Visitante> resultado = new ArrayList<Visitante>();
		for (int i = 0; i < 50; i++) {
			Entrada entrada = Entrada.NORMAL;
			if (i % 3 == 0) {
				entrada = Entrada.EXPRESS;
			} else if (i % 4 == 0) {
				entrada = Entrada.VIP;
			}  
			Visitante nuevo = new Visitante((int)(Math.random()*100)+100, entrada);
			resultado.add(nuevo);
		}
		return resultado;
	}
	
}