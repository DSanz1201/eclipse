import java.util.LinkedList;

public class Yoda {
	public static void yodaLetras(String frase) {
		LinkedList<Character> pila = new LinkedList<>();
		
		for(int i = 0; i < frase.length(); i++) {
			pila.push(frase.charAt(i));
		}
		
		while(!pila.isEmpty()) {
			System.out.print(pila.pop());
		}
	}
	
	public static void yodaPalabras(String frase) {
		String[] palabras = frase.split(" ");
		for(int m = palabras.length - 1; m >= 0; m--) {
			System.out.print(palabras[m] + " ");
		}
	}

	public static void main(String[] args) {
		yodaLetras("Hola que tal");
		System.out.println();
		yodaPalabras("Hola que tal");
	}

}
