public class Revista {

	//6 atributos 
	private int paginas; //>10
	private String titulo;
	private String autor; //>2 caracteres
	private String editorial;
	private int ejemplaresAnyo; //>= 1
	private String genero;
	
	//3 constructores
	
	public Revista (){
		paginas = 10;
		titulo = "Revista 1";
		autor = "Autor 1";
		editorial = "Editorial 1";
		ejemplaresAnyo = 1;
		genero = "Genero 1";
		
	}
	
	public Revista (int paginas, String titulo, String autor, String editorial, int ejemplaresAnyo, String genero){
		this.paginas = paginas;
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.ejemplaresAnyo = ejemplaresAnyo;
		this.genero = genero;
		
		if(paginas > 10) {
			this.paginas = paginas;
		} else {
			this.paginas = 10;
		}
		
		if(autor.length() > 2) {
			this.autor = autor;
		} else {
			this.autor = "Autor 3";
		}
		
		if(ejemplaresAnyo > 1) {
			this.ejemplaresAnyo = ejemplaresAnyo;
		} else {
			this.ejemplaresAnyo = 1;
		}
		
	}
	
	public Revista (String titulo, String autor, String editorial){
		this.titulo = titulo;
		this.editorial = editorial;
		this.ejemplaresAnyo = 10;
		this.genero = "Genero 3";
		this.paginas = 10;
		
		if(autor.length() > 2) {
			this.autor = autor;
		} else {
			this.autor = "Autor 3";
		}
		
	}
	
	public Revista(Revista r) {
		this.titulo = r.titulo;
		this.editorial = r.editorial;
		this.autor = r.autor;
		this.ejemplaresAnyo = r.ejemplaresAnyo;
		this.genero = r.genero;
		this.paginas = r.paginas;
	}

	
	//setters y getters
	
	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		if(paginas > 10) {
			this.paginas = paginas;
		} else {
			this.paginas = 10;
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if(autor.length() > 2) {
			this.autor = autor;
		} else {
			this.autor = "Autor 3";
		}
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getEjemplaresAnyo() {
		return ejemplaresAnyo;
	}

	public void setEjemplaresAnyo(int ejemplaresAnyo) {
		if(ejemplaresAnyo > 1) {
			this.ejemplaresAnyo = ejemplaresAnyo;
		} else {
			this.ejemplaresAnyo = 1;
		}
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	//toString
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = "Autor: " + autor + "\n";
		s += "Titulo: " + autor + "\n";
		s += "Editorial: " + editorial + "\n";
		s += "Paginas: " + paginas + "\n";
		s += "Ejemplares: " + ejemplaresAnyo + "\n";
		s += "Genero: " + genero + "\n";
		return s;
		
	}
	
	
	//equals
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || this.getClass() != obj.getClass())
			return false;
		Revista other = (Revista) obj;
		return other.autor.equals(this.autor) && other.editorial.equals(this.editorial)
				&& ejemplaresAnyo == other.ejemplaresAnyo && other.genero.equals(this.genero)
				&& paginas == other.paginas && other.titulo.equals(this.titulo);
	}
	
}
