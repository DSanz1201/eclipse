package deustobio;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import deustobio.fenomenos.Continentes;
import deustobio.fenomenos.FenomenoNatural;
import deustobio.fenomenos.Incendio;
import deustobio.fenomenos.Terremoto;
import deustobio.fenomenos.Terrestre;
import deustobio.fenomenos.Tsunami;

public class DeustoBio {

	public static void main(String[] args) {
		// EJERCICIO 1B-A
		ArrayList<Experto> listaExpertos = new ArrayList<>();
		generarListaExpertos(listaExpertos);
		// Código de comprobación en consola
		System.out.println(listaExpertos);
		System.out.println("_____________________");
		System.out.println("EJERCICIO - GENERAR LISTA DE EXPERTOS - COMPROBACIÓN");
		System.out.println("Tamaño: " + listaExpertos.size()); // Debe ser 10
		System.out.println("Nombre experto 3: " + listaExpertos.get(3).getNombre()); // Debe ser Experto-4
		System.out.println("Especialidad: " + listaExpertos.get(0).getEspecialidad()); // Debe ser TERRESTRE o MARITIMA
		System.out.println("Tamaño de la lista de un experto: " + listaExpertos.get(1).getFenomenos().size()); // Debe
																												// ser 0

		//EJERCICIO - CARGAR EXPERTOS DE CSV
		cargarExpertosCSV(listaExpertos);
		System.out.println("\nLISTA DE EXPERTOS - CARGADA CSV");
		System.out.println(listaExpertos);
		
		// EJERCICIO 1B-B
		ArrayList<FenomenoNatural> listaFenomenos = new ArrayList<>();
		generarListaFenomenos(listaFenomenos);

		// Código de comprobación en consola
		System.out.println("\nEJERCICIO - GENERAR LISTA DE FENÓMENOS NATURALES - COMPROBACIÓN");
		System.out.println(listaFenomenos);
		System.out.println(listaFenomenos.size()); // Debe ser 30
		int contTsun = 0;
		int contTerrem = 0;
		int contIncend = 0;
		int contProvocados = 0;
		for (FenomenoNatural f : listaFenomenos) {
			if (f instanceof Tsunami)
				contTsun++;
			else if (f instanceof Terremoto)
				contTerrem++;
			else if (f instanceof Incendio) {
				contIncend++;
				if (((Incendio) f).isProvocado())
					contProvocados++;
			}
		}
		// Deberían variar en cada ejecución
		System.out.println("Incendios: " + contIncend);
		System.out.println("Incendios provocados: " + contProvocados);
		System.out.println("Terremotos: " + contTerrem);
		System.out.println("Tsunamis: " + contTsun);
		System.out.println(contIncend + contTerrem + contTsun); // Debe ser 30

		// EJERCICIO 1B-C
		System.out.println("EJERCICIO - ASIGNAR FENÓMENOS A LOS EXPERTOS - COMPROBACIÓN");
		int contador = asignarFenomenoExperto(listaFenomenos, listaExpertos);
		System.out.println(contador); // número entre 0 y 30
		int contAsignados = 0;
		for (Experto e : listaExpertos) { // Contamos el número de fenómenos en la lista de cada experto
			contAsignados += e.getFenomenos().size();
		}
		System.out.println((contador == contAsignados));// true

		// EJERCICIO 1B-D
		System.out.println("EJERCICIO - CALCULAR HECTÁREAS AFECTADAS - COMPROBACIÓN");
		System.out.println("Hectáreas afectadas: " + calcularHectareasAfectadas(listaExpertos));

		// EJERCICIO 1B-E
		System.out.println("EJERCICIO - COMPROBACIÓN FENOMENOS CONTINENTE DE UN EXPERTO");
		Experto e = null;
		int i = 0;
		do {
			e = listaExpertos.get(i);
			if (e.getEspecialidad() == Especialidad.TERRESTRE) {
				break;
			} else {
				i++;
			}
		} while (i < listaExpertos.size());
		System.out.println("EUROPA: " + e.obtenerFenomenosContinente(Continentes.EUROPA).size() + " --> "
				+ e.obtenerFenomenosContinente(Continentes.EUROPA));
		System.out.println("ASIA: " + e.obtenerFenomenosContinente(Continentes.ASIA).size());
		System.out.println("AMÉRICA: " + e.obtenerFenomenosContinente(Continentes.AMERICA).size());
		System.out.println("ÁFRICA: " + e.obtenerFenomenosContinente(Continentes.AFRICA).size());
		System.out.println("OCEANÍA: " + e.obtenerFenomenosContinente(Continentes.OCEANIA).size());
		System.out.println("Número de fenómenos del experto " + e.getNombre() + " = " + e.getFenomenos().size()); // El
																													// resultado
																													// debe
																													// ser
																													// igual
																													// a
																													// la
																													// suma
																													// de
																													// los
																													// 5
																													// valores
																													// anteriores

		// EJERCICIO 1B-F
		System.out.println("Fenómenos eliminados: " + eliminarFenomenosMeses(3, listaExpertos)); // 30 fenómenos
																									// eliminados porque
																									// todos son de
																									// marzo
		System.out.println("Fenómenos eliminados: " + eliminarFenomenosMeses(1, listaExpertos)); // 0 fenómenos
																									// eliminados porque
																									// todos son de
																									// marzo

		// EXTENSIÓN
		System.out.println(listaExpertos.get(0).gestionarFenomeno());
		System.out.println(listaExpertos.get(0).gestionarFenomeno());

		listaExpertos.get(0).anyadirFenomeno(new Terremoto());
		listaExpertos.get(0).anyadirFenomeno(new Incendio());
		listaExpertos.get(0).anyadirFenomeno(new Terremoto());

		// FENÓMENOS NATURALES POR CONTINENTE
		System.out.println("\n\nFenómenos naturales por continente");
		Map<Continentes, ArrayList<FenomenoNatural>> mapa = fenomenosPorContinente(listaExpertos);
		for (Continentes c : mapa.keySet()) {
			System.out.println(c + " - " + mapa.get(c));
		}

		// HECTÁREAS QUEMADAS POR CONTINENTE
		System.out.println("\n\nHectáreas quemadas por continente");
		Map<Continentes, Double> mapaH = hectareasQuemadasPorContinente(listaExpertos);
		for (Continentes c : mapaH.keySet()) {
			System.out.println(c + " - " + mapaH.get(c));
		}
	}

	// EJERCICIO 1B.A
	public static void generarListaExpertos(List<Experto> lista) {
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			String nombre = "Experto-" + (i + 1);
			Especialidad especialidad = Especialidad.values()[r.nextInt(2)];
			lista.add(new Experto(nombre, especialidad));
		}
	}

	public static void generarListaExpertosCopy(ArrayList<Experto> lista) {
		lista.add(new Experto("Experto-1", Especialidad.MARITIMO));
		lista.add(new Experto("Experto-2", Especialidad.MARITIMO));
		lista.add(new Experto("Experto-3", Especialidad.MARITIMO));
		lista.add(new Experto("Experto-4", Especialidad.TERRESTRE));
		lista.add(new Experto("Experto-5", Especialidad.MARITIMO));
		lista.add(new Experto("Experto-6", Especialidad.TERRESTRE));
		lista.add(new Experto("Experto-7", Especialidad.TERRESTRE));
		lista.add(new Experto("Experto-8", Especialidad.MARITIMO));
		lista.add(new Experto("Experto-9", Especialidad.MARITIMO));
		lista.add(new Experto("Experto-10", Especialidad.TERRESTRE));
	}

	// EJERCICIO 1B.B
	public static void generarListaFenomenos(ArrayList<FenomenoNatural> lista) {
		for (int i = 0; i < 30; i++) {
			FenomenoNatural f;
			Random r = new Random();
			int num = r.nextInt(3);
			switch (num) {
			case 0:
				f = new Terremoto();
				break;
			case 1:
				f = new Tsunami();
				break;
			default:
				f = new Incendio();
			}
			f.setValoresAleatorio();
			lista.add(f);
		}
	}

	// EJERCICIO 1B.C
	public static int asignarFenomenoExperto(List<FenomenoNatural> listaFenomenos, List<Experto> listaExpertos) {
		int asignados = 0;
		for (FenomenoNatural f : listaFenomenos) {
			Especialidad esp = Especialidad.MARITIMO;
			if (!(f instanceof Tsunami)) {
				esp = Especialidad.TERRESTRE;
			}
			for (Experto e : listaExpertos) {
				if ((e.getEspecialidad() == esp) && (e.getFenomenos().size() < 5)) {
					e.getFenomenos().add(f);
					asignados++;
					break;
				}
			}
		}
		return asignados;
	}

	public static double calcularHectareasAfectadas(List<Experto> listaExpertos) {
		double resultado = 0;
		for (Experto e : listaExpertos) {
			for (FenomenoNatural f : e.getFenomenos()) {
				if (f instanceof Incendio) {
					resultado += ((Incendio) f).getHectareas();
				}
			}
		}
		return resultado;
	}

	public static int eliminarFenomenosMeses(int mes, List<Experto> lExperto) {
		int contEliminados = 0;
		for (Experto e : lExperto) {
			LinkedList<FenomenoNatural> lFenomenos = e.getFenomenos();
			int i = 0;
			while (i < lFenomenos.size()) {
				FenomenoNatural f = lFenomenos.get(i);
				LocalDate fecha = f.getFecha();
				if (fecha.getMonthValue() == mes) {
					lFenomenos.remove(i);
					contEliminados++;
				} else
					i++;
			}
		}

		return contEliminados;
	}

	/*
	 * Implementa un método que devuelve un mapa, con la lista de fenómenos
	 * gestionados en cada continente.
	 */
	public static Map<Continentes, ArrayList<FenomenoNatural>> fenomenosPorContinente(List<Experto> listaExp) {
		Map<Continentes, ArrayList<FenomenoNatural>> mapa = new HashMap<>();
		for (Experto e : listaExp) {
			for (FenomenoNatural f : e.getFenomenos()) {
				if (f instanceof Terrestre) {
					Terrestre t = (Terrestre) f;
					Continentes c = t.getContinente();
					if (mapa.containsKey(c)) {
						mapa.get(c).add(t);
						//ArrayList<FenomenoNatural> l = mapa.get(c);
						//l.add(t);
					} else {
						ArrayList<FenomenoNatural> l = new ArrayList<>();
						l.add(t);
						mapa.put(c, l);
					}
				}
			}
		}
		return mapa;
	}

	/*
	 * Implementa un método que calcula cuántas hectáreas se han quemado por cada
	 * continente, utilizando un TreeMap.
	 */
	public static Map<Continentes, Double> hectareasQuemadasPorContinente(List<Experto> listaExp) {
		Map<Continentes, Double> mapa = new HashMap<>();
		for (Experto e : listaExp) {
			for (FenomenoNatural f : e.getFenomenos()) {
				if (f instanceof Incendio) {
					Incendio incendio = (Incendio) f;
					Continentes c = incendio.getContinente();
					Double hectareasFenActual = mapa.get(c);
					
					if (mapa.containsKey(c)) {
						mapa.replace(c, hectareasFenActual + incendio.getHectareas());
					} else {
						mapa.put(c, incendio.getHectareas());
					}
				}
			}
		}
		return mapa;
	}
	
	public static void cargarExpertosCSV(List<Experto> lista) {		
		File f = new File("expertos.csv");
		try {
			Scanner sc = new Scanner(f);
			
			while (sc.hasNextLine()) {
				String linea = sc.nextLine();
				//System.out.println(linea);
				//TO-DO: Procesar la línea para añadir un nuevo experto a la lista
				String [] campos = linea.split(";");
				//System.out.println(campos[0]+ " " +  campos[1]);
				String nombre = campos[0];
				Especialidad esp = null;
				if (campos[1].equals("M"))
					esp = Especialidad.MARITIMO;
				else
					esp = Especialidad.TERRESTRE;
				lista.add(new Experto(nombre, esp));
			}
			
			sc.close();			
		} catch (FileNotFoundException e) {
			System.out.println("Mensaje de error: MLG");
			System.err.println("Error al cargar datos: " + e.getMessage());
		}
	}
	
	public static void cargarFenomenosCSV(List<FenomenoNatural> lista) {		
		File f = new File("fenomenos.csv");
		try {
			Scanner sc = new Scanner(f);
			
			while (sc.hasNextLine()) {
				String linea = sc.nextLine();
				//System.out.println(linea);
				//TO-DO: Procesar la línea para añadir un nuevo experto a la lista
				
			}
			
			sc.close();			
		} catch (FileNotFoundException e) {
			System.out.println("Mensaje de error: MLG");
			System.err.println("Error al cargar datos: " + e.getMessage());
		}
	}
}
