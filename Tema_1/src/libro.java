import java.util.ArrayList;
import java.util.Random;

public class libro {
	Random random = new Random();
	//4 propiedades de un libro
	
	private String titulo;
	private String autor;
	private String genero;
	private int n_paginas;
	
	//3 metodos constructores
	
	public libro() {
		titulo = "Harry Potter";
		autor = "J.K Rowlling";
		genero = "Fantasia";
		n_paginas = 500;
	}
	
	public libro(String tituloF, String autorF) {
		titulo = tituloF;
		autor = autorF;
		genero = "No especificado";
		n_paginas = random.nextInt(300) + 200;
	}
	
	public libro(String tituloM) {
		if(tituloM == "Titulo Marciano") {
			titulo = tituloM;
			String temp1 = "";
			String temp2 = "";
			for(int i = 0; i < 8; i++) {
				temp1 = temp1 + (char) ('a' + random.nextInt(26));
				temp2 = temp2 + (char) ('a' + random.nextInt(26));
			}
			autor = temp1;
			genero = temp2;
			n_paginas = random.nextInt(300) + 200;
			
		} else {
			System.out.println("ERROR");
		}
	}
	
	//6 getters y setters
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return titulo;
	}
	
	public String getGenero() {
		return titulo;
	}
	
	public Integer getPaginas() {
		return n_paginas;
	}
	
	public String setTitulo(String tituloN) {
		titulo = tituloN;
		return titulo;
	}
	
	public String setAutor(String autorN) {
		autor = autorN;
		return autor;
	}
	
	public String setGenero(String generoN) {
		genero = generoN;
		return genero;
	}
	
	public Integer setPaginas(Integer paginasN) {
		if(paginasN > 0) {
			n_paginas = paginasN;
		} else {
			n_paginas = 1010101010;
		}
		return n_paginas;
	}
	
	//Override
	
	public String toString() {
		// TODO Auto-generated method stub
		return "Titulo: " + titulo + "   Autor/a: " + autor + "   Genero: " + genero + "   Paginas: " + n_paginas;
	}
	
}
