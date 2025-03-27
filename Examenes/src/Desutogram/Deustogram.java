package Desutogram;

import java.util.ArrayList;
import java.util.Random;

public class Deustogram {

	public static void main(String[] args) {
		ArrayList<Usuario> usuarios = new ArrayList<>();
		
		for(int i = 0; i < 50; i++) {
			String nombre = "usuario" + i;
			String apellidos = "";
			String correo = "";
			String contra = "";
			
			ArrayList<Contenido> contenido = new ArrayList<>();
			
			Random random = new Random();
			
			contenido.add(new Publicacion("", "", "", random.nextInt(99001) + 1000, null));
			contenido.add(new Publicacion("", "", "", random.nextInt(99001) + 1000, null));
			
			for(int n = 0; n < 2; n++) {
				ArrayList<String> temp = new ArrayList<>();
				
				for(int m = 0; m < random.nextInt(2000) + 500; m++) {
					temp.add("");
				}
				
				contenido.add(new Historia("", "", "", random.nextInt(999900) + 100, temp.size()));
			}
			
			
			
			usuarios.add(new Usuario(nombre, apellidos, correo, contra, contenido));
		}
		System.out.println(usuarios);	}

}
