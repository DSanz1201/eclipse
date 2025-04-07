package AirBnb;

import java.util.ArrayList;
import java.util.Random;

public class Bilbon {

	public static void main(String[] args) {
		ArrayList <Huesped> huespedes = new ArrayList<Huesped>();
		ArrayList <Anfitrion> anfitriones = new ArrayList<Anfitrion>();
		ArrayList <Alojamiento> alojamientos = new ArrayList<Alojamiento>();
		
		Random random = new Random();
		
		for(int i = 0; i < 50; i++) {
			alojamientos.add(new Alojamiento(null, "alojamiento-" + i, "", random.nextInt(101) + 50));
		}
		
		for(int n = 0; n < 50; n++) {
			anfitriones.add(new Anfitrion());
		}

}

}
