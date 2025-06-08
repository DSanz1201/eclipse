package greenpark;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.*;

public class GreenPark {
    private List<Parque> parques;
    private List<Personal> personal;
    private List<Proyecto> proyectos;

    public GreenPark() {
        parques = new ArrayList<>();
        personal = new ArrayList<>();
        proyectos = new ArrayList<>();
    }

    public List<Parque> getParques() {
        return parques;
    }

    public List<Personal> getPersonal() {
        return personal;
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    /**
     * Carga los datos de parques desde un fichero CSV.
     * Formato esperado: Nombre;País;Día;Mes;Año;Hectáreas
     */
    public void cargarParquesCSV(String nombreFichero) {
        try {
        	File fichero = new File(nombreFichero);
        	Scanner sc = new Scanner(fichero);
        	
        	while(sc.hasNextLine()) {
        		String linea = sc.nextLine();
        		String[] campos = linea.split(";");
        		Parque parque = new Parque(campos[0], campos[1], LocalDate.of(Integer.parseInt(campos[4]), Integer.parseInt(campos[3]), Integer.parseInt(campos[2])), Double.parseDouble(campos[5]));
        		this.parques.add(parque);
        	}
        	sc.close();
        	
        } catch(FileNotFoundException e) {
        	System.err.println("No se ha encontrado el archivo: " + e.getMessage());
        } catch(DateTimeException e) {
        	System.err.println("Se encontro una linea mal formateada: " + e.getMessage());
        }
    }

    /**
     * Carga los datos de personal desde un fichero CSV.
     * Formato esperado: Tipo;Nombre;País
     */
    public void cargarPersonalCSV(String nombreFichero) {
        try {
        	File fichero = new File(nombreFichero);
        	Scanner sc = new Scanner(fichero);
        	
        	while(sc.hasNextLine()) {
        		String linea = sc.nextLine();
        		String[] campos = linea.split(";");
        		Personal trabajador = null;
        		if(campos[0].equals("Botánico")) {
        			trabajador = new Botanico(campos[1], campos[2], campos[3]);
        			
        		} else if(campos[0].equals("Guarda")) {
        			String[] carnets = campos[3].split(",");
        			ArrayList<String> carnets_def = new ArrayList<>();
        			for(String carnet : carnets) {
        				carnets_def.add(carnet);
        			}
        			trabajador = new Guarda(campos[1], campos[2], carnets_def);
        		} else {
        			trabajador = new IngAmbiental(campos[1], campos[2], Integer.parseInt(campos[3]));
        		}
        		this.personal.add(trabajador);
        	}
        	
        } catch(FileNotFoundException e) {
        	System.err.println("No se encontro el archivo especificado: " + e.getMessage());
        }
    }

    /**
     * Asigna aleatoriamente personal a los parques siguiendo las restricciones:
     * - 2 botánicos, 2 guardas y 1 ingeniero ambiental por parque
     */
    public void asignarPersonalAleatorio() {
    	Random r = new Random();
        for(Parque parque : this.parques) {
        	while(parque.getPersonalAsignado().size() < 2) {
        		Personal temp = this.personal.get(r.nextInt(this.personal.size()));
        		if(temp instanceof Botanico && !parque.getPersonalAsignado().contains(temp)) {
        			parque.getPersonalAsignado().add(temp);
        		}
        	}
        	while(parque.getPersonalAsignado().size() < 4) {
        		Personal temp = this.personal.get(r.nextInt(this.personal.size()));
        		if(temp instanceof Guarda && !parque.getPersonalAsignado().contains(temp)) {
        			parque.getPersonalAsignado().add(temp);
        		}
        	}
        	while(parque.getPersonalAsignado().size() < 5) {
        		Personal temp = this.personal.get(r.nextInt(this.personal.size()));
        		if(temp instanceof IngAmbiental && !parque.getPersonalAsignado().contains(temp)) {
        			parque.getPersonalAsignado().add(temp);
        		}
        	}
        }
    }

    /**
     * Muestra los parques ordenados por coste total (ascendente).
     */
    public void mostrarParquesPorCoste() {
        Collections.sort(parques);
        System.out.println(parques);
    }

    /**
     * Devuelve un mapa con el coste total de proyectos por país.
     */
    public Map<String, Double> mapaCostePorPais() {
        // Por implementar
        return new HashMap<>();
    }

    /**
     * Muestra por consola los proyectos agrupados por tipo y ordenados por presupuesto.
     */
    public void proyectosPorTipo() {
        // Por implementar
    }
}