import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjemploComparable {

	public static void main(String[] args) {
		List<Foto> listaFotos = new ArrayList<>();
		
		listaFotos.add(new Foto(true, "Navidad 2024", 15, 10, 2010));
		listaFotos.add(new Foto(false, "Amigos en Mallorca", 25, 15, 2011));
		listaFotos.add(new Foto(true, "Viaje a Grecia", 15, 10, 2023));
		listaFotos.add(new Foto(false, "Navidad 2023", 15, 10, 2014));
		listaFotos.add(new Foto(false, "Familia en Ibiza", 30, 20, 1996));
		
		Collections.sort(listaFotos);
		
		System.out.println(listaFotos);
	}
}

class Foto {
	private boolean color;
	private String titulo;
	private long ancho;
	private long alto;
	private int anyo;
	
	public Foto(boolean color, String titulo, long ancho, long alto, int anyo) {
		super();
		this.color = color;
		this.titulo = titulo;
		this.ancho = ancho;
		this.alto = alto;
		this.anyo = anyo;
	}

	@Override
	public String toString() {
		return "\nFoto [color=" + color + ", titulo=" + titulo + ", ancho=" + ancho + ", alto=" + alto + ", anyo= " + anyo + "]";
	}

	public int compareTo(Foto o) {
		//return this.titulo.compareTo(f.titulo);
		
		/*if (this.ancho*this.ancho > o.alto*o.ancho)
			return 1;
		else if (this.ancho*this.ancho == o.alto*o.ancho)
			return 0;
		else return -1; */
		
		Integer f1 = this.anyo;
		Integer f2 = o.anyo;
		return f1.compareTo(f2);
		
	}
}