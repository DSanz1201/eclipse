package adoptakide;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.*;

public class Adoptakide {

    public static TreeSet<Animal> cargarAnimales(String rutaCSV) {
    	TreeSet<Animal> animales = new TreeSet<>();
    	File f = new File(rutaCSV);
    	
    	try {
    		Scanner sc = new Scanner(f);
    		while(sc.hasNextLine()) {
    			String linea = sc.nextLine();
    			String[] campos = linea.split(";");
    			Animal nuevo = new Animal(campos[0], Especie.valueOf(campos[1].toUpperCase()), Integer.parseInt(campos[2]), campos[3], Boolean.parseBoolean(campos[4]));
    			animales.add(nuevo);
    		}
    		sc.close();
    		
    	} catch (FileNotFoundException e){
    		System.err.println("No se puedo cargar el archivo: " + e.getMessage());
    	}
    	return animales;
    }

    public static ArrayList<Adopcion> registrarAdopciones(Set<Animal> animales) {
    	ArrayList<Adopcion> adopciones = new ArrayList<Adopcion>();
        File f = new File("adopciones.csv");
        
        try {
        	Scanner sc = new Scanner(f);
        	while(sc.hasNextLine()) {
        		String linea = sc.nextLine();
        		String[] campos = linea.split(";");
        		Adopcion nueva;
        		for(int i = 2; i < campos.length; i++) {
        			
        		}
        	}
        	
        } catch (FileNotFoundException e) {
        	System.err.println("No se pudo cargar el archivo: " + e.getMessage());
        }
    }
    
    public static HashMap<Especie, Integer> contarPorEspecie(List<Adopcion> adopciones) {
        return null;
    }

    public static TreeMap<Integer, ArrayList<Animal>> animalesPorEdad(List<Adopcion> listaAdopciones) {
        return null;
    }

    public static Map<Especie, Integer> contarAdopcionesPorEspecie(List<Adopcion> adopciones) {
    	return null;
    }
    
    public static void simulacionEntrega(List<Adopcion> adopciones) {

    }
    
    public static void exportarAnimalesPorEspecie(Set<Animal> animales) {

    }


    public static void main(String[] args) {
    	TreeSet<Animal> animales = cargarAnimales("animales.csv");
        System.out.println("Animales cargados: " + animales.size());
        System.out.println(animales);
//        List<Adopcion> adopciones = registrarAdopciones(animales);
//        Map<Especie, Integer> mapaPorEspecie = contarPorEspecie(adopciones);
//        for (Especie e : mapaPorEspecie.keySet()) {
//            System.out.println(e + ":" + mapaPorEspecie.get(e));
//        }
//        Map<Integer, ArrayList<Animal>> mapaPorEdad = animalesPorEdad(adopciones);
//        for (Integer e : mapaPorEdad.keySet()) {
//            System.out.println(e + " años:");
//            for (Animal a : mapaPorEdad.get(e)) {
//            	System.out.println(a);
//            }
//        }
//        simulacionEntrega(adopciones);
//        exportarAnimalesPorEspecie(animales);
    }
}