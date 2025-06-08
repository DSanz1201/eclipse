package adoptakide;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
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
    		
    	} catch (FileNotFoundException e) {
    		System.err.println("No se puedo cargar el archivo: " + e.getMessage());
    	}
    	return animales;
    }

    public static ArrayList<Adopcion> registrarAdopciones(Set<Animal> animales) {
    	ArrayList<Adopcion> adopciones = new ArrayList<>();
        File f = new File("adopciones.csv");
        
        try {
        	Scanner sc = new Scanner(f);
        	while(sc.hasNextLine()) {
        		ArrayList<Animal> animales_adoptados = new ArrayList<>();
        		animales_adoptados.clear();   
        		String linea = sc.nextLine();
        		String[] campos = linea.split(";");
        		Adopcion nueva;
        		String[] chips = campos[2].split(",");
        		for(int i = 0; i < chips.length; i++) {
        			for(Animal animal : animales) {
        				if(animal.getChip().equals(chips[i])) {
        					animales_adoptados.add(animal);
        				}
        			}
        		}
        		if(animales_adoptados.isEmpty()) {
        			System.out.println("Ha ocurrido un error en el proceso de adopcion");
        		} else {
        			nueva = new Adopcion(campos[0], LocalDate.now(), animales_adoptados);
            		adopciones.add(nueva);
        		}
        }
        sc.close();
        	
        } catch (FileNotFoundException e) {
        	System.err.println("No se pudo cargar el archivo: " + e.getMessage());
        }
        return adopciones;
    }
    
    public static HashMap<Especie, Integer> contarPorEspecie(List<Adopcion> adopciones) {
    	HashMap<Especie, Integer> mapa = new HashMap<>();
        for(Adopcion adopcion : adopciones) {
        	ArrayList<Animal> animales = adopcion.getAnimalesAdoptados();
        	for(int i = 0; i < animales.size(); i++) {
        		if(mapa.containsKey(animales.get(i).getEspecie())) {
        			mapa.put(animales.get(i).getEspecie(), mapa.get(animales.get(i).getEspecie()) + 1);
        		} else {
        			mapa.put(animales.get(i).getEspecie(), 1);
        		}
        	}
        }
        return mapa;
    }

    public static TreeMap<Integer, ArrayList<Animal>> animalesPorEdad(List<Adopcion> listaAdopciones) {
    	TreeMap<Integer, ArrayList<Animal>> mapa = new TreeMap<>();
        for(Adopcion adopcion : listaAdopciones) {
        	for(Animal animal : adopcion.getAnimalesAdoptados()) {
        		if(mapa.containsKey(animal.getEdad())) {
        			mapa.get(animal.getEdad()).add(animal);
        		} else {
        			mapa.put(animal.getEdad(), new ArrayList<Animal>());
        			mapa.get(animal.getEdad()).add(animal);
        		}
        	}
        }
        return mapa;
    }

    public static Map<Especie, Integer> contarAdopcionesPorEspecie(List<Adopcion> adopciones) {
    	return null;
    }
    
    public static void simulacionEntrega(List<Adopcion> adopciones) {
    	for(Adopcion adopcion : adopciones) {
    		for(Animal animal : adopcion.getAnimalesAdoptados()) {
    			if(animal.getEdad() < 2 && animal.tieneNecesidadesEspeciales()) {
    				System.out.println(adopcion.getNombrePersona() + " no puede adoptar a " + animal.getNombre() + " (necesidades especiales y menor de 2)");
    			} else {
    				System.out.println(adopcion.getNombrePersona() + " recoge a " + animal.getNombre());
    			}
    		}
    	}
    }
    
    public static void exportarAnimalesPorEspecie(Set<Animal> animales) {
    	HashMap<Especie, ArrayList<Animal>> mapa = new HashMap<>();
    	for(Animal animal : animales) {
    		if(mapa.containsKey(animal.getEspecie())) {
    			mapa.get(animal.getEspecie()).add(animal);
    		} else {
    			mapa.put(animal.getEspecie(), new ArrayList<Animal>());
    			mapa.get(animal.getEspecie()).add(animal);
    		}
    	}
    	
    	for(Map.Entry<Especie, ArrayList<Animal>> entry : mapa.entrySet()) {
    		try {
    			PrintStream ps = new PrintStream(entry.getKey().toString() + ".csv");
    			for(Animal animal : entry.getValue()) {
    				ps.println(animal.getNombre() + ";" + animal.getEspecie() + ";" + animal.getEdad() + ";" + animal.getChip() + ";" + animal.tieneNecesidadesEspeciales() + ";");
    			}
    			ps.close();
    		} catch (FileNotFoundException e) {
    			System.err.println("No se ha podido crear el archivo: " + e.getMessage());
    		}
    	}
    }


    public static void main(String[] args) {
    	TreeSet<Animal> animales = cargarAnimales("animales.csv");
        System.out.println("Animales cargados: " + animales.size());
        System.out.println(animales);
        ArrayList<Adopcion> adopciones = registrarAdopciones(animales);
        System.out.println(adopciones);
        Map<Especie, Integer> mapaPorEspecie = contarPorEspecie(adopciones);
        for (Especie e : mapaPorEspecie.keySet()) {
            System.out.println(e + ":" + mapaPorEspecie.get(e));
        }
        Map<Integer, ArrayList<Animal>> mapaPorEdad = animalesPorEdad(adopciones);
        for (Integer e : mapaPorEdad.keySet()) {
            System.out.println(e + " años:");
           for (Animal a : mapaPorEdad.get(e)) {
            	System.out.println(a);
            }
        }
        simulacionEntrega(adopciones);
    	exportarAnimalesPorEspecie(animales);
    }
}