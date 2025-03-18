package transporte;

import java.util.ArrayList;
import java.util.Random;

public class UsaConductorDef {
	//Crear un programa principal MAIN
	public static void main(String[] args) {
	//Un ArrayList con 100 conductores generados automaticamente
		ArrayList<Conductor> conductores = new ArrayList<>();
		
		for(int i = 0; i < 100; i++) {
			conductores.add(new Conductor());
		}
		System.out.println();
		
	//Un ArrayList con 20 transportes (Taxis y Autobuses) - aleatoriamente sus valores (Utilizar el metodo generar valores aleatorios)
		ArrayList<Transporte> transportes = new ArrayList<>();
		
		Random random = new Random();
		
		for(int i = 0; i < 20; i++) {
			boolean temp = random.nextBoolean();
			if(temp == true) {
				Taxi taxi_temp = new Taxi("No especificada", random.nextInt(26) + 2000, random.nextInt(280) + 20, "No especificado", 1111);
				transportes.add(taxi_temp.generarAleatorios());
			} else {
				Autobus autobus_temp = new Autobus("No especificada", random.nextInt(26) + 2000, random.nextInt(280) + 20, "No especificado", 1111);
				transportes.add(autobus_temp.generarAleatorios());
			}
		}
		
	//Asignar un conductor a cada vehiculo - debe tener la licencia adecuada para ello
		for(int i = 0; i < transportes.size(); i++) {
			if(transportes.get(i) instanceof Taxi) {
				for(int n = 0; i < conductores.size(); n++) {
					if(conductores.get(i).isPermisoTaxi()) {
						System.out.println("Vehiculo numero " + i + " es un taxi, se asocia al " + conductores.get(n).getCodigo());
					}
				}
			} else {
				for(int m = 0; i < conductores.size(); m++) {
					if(conductores.get(i).isPermisoBus()) {
						System.out.println("Vehiculo numero " + i + " es un bus, se asocia al " + conductores.get(m).getCodigo());
					}
				}
			}
		}
		
	//Si nos quedamos sin conductores --> mostrar mensaje por pantalla y el total de vehiculos sin conductor
	
	//Calcular año medio de la flota de autobuses
		
		
	//Añadir un conductor al transporte
	}
}
