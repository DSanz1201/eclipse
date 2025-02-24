import java.util.Random;

public class Libro {
	Random random = new Random();
	
	//4 propiedades de un libro (Atributos)
	
	private String titulo; //> 0
	private String autor;
	private String genero;
	private int n_paginas;
	
	//3 metodos constructores: Usa parametros, no devuelve nada, ni void
	
	public Libro() {
		titulo = "Harry Potter";
		autor = "J.K Rowlling";
		genero = "Fantasia";
		n_paginas = 500;
	}
	
	/**
	 * Sobrecarga del constructor
	 * @param tituloF - Titulo forzado
	 * @param autorF - Autor forzado
	 */
	
	public Libro(String tituloF, String autorF) {
		titulo = tituloF;
		autor = autorF;
		genero = "No especificado";
		n_paginas = random.nextInt(300) + 200;
	}
	
	/**
	 * Sobrecarga 2
	 * @param tituloM - Titulo marciano
	 */
	
	public Libro(String tituloM) {
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
	
	public void setTitulo(String tituloN) {
		titulo = tituloN;
	}
	
	public void setAutor(String autorN) {
		autor = autorN;
	}
	
	public void  setGenero(String generoN) {
		genero = generoN;
	}
	
	public void setPaginas(Integer paginasN) {
		if(paginasN > 0) {
			n_paginas = paginasN;
		}
	}
	
	//toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Titulo: " + titulo + "   Autor/a: " + autor + "   Genero: " + genero + "   Paginas: " + n_paginas;
	}
	
}
