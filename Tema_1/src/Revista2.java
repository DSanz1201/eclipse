public class Revista2 {

	//6 atributos 
	private int paginas; //>10
	private String titulo;
	private Autor autor; //>2 caracteres
	private String editorial;
	private int ejemplaresAnyo; //>= 1
	private String genero;
	
	//3 constructores
	
	public Revista2 (){
		paginas = 10;
		titulo = "Revista 1";
		autor = new Autor();
		editorial = "Editorial 1";
		ejemplaresAnyo = 1;
		genero = "Genero 1";
		
	}
	
	public Revista2 (int paginas, String titulo, Autor autor, String editorial, int ejemplaresAnyo, String genero){
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
		
		this.autor = autor;
		
		if(ejemplaresAnyo > 1) {
			this.ejemplaresAnyo = ejemplaresAnyo;
		} else {
			this.ejemplaresAnyo = 1;
		}
		
	}
	
	public Revista2 (String titulo, Autor autor, String editorial){
		this.titulo = titulo;
		this.editorial = editorial;
		this.ejemplaresAnyo = 10;
		this.genero = "Genero 3";
		this.paginas = 10;
		
		this.autor = autor;
		
	}
	
	public Revista2 (Revista2 r) {
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

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
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
		String s = "Autor: " + autor.toString() + "\n";
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
		Revista2 other = (Revista2) obj;
		return other.autor.equals(this.autor) && other.editorial.equals(this.editorial)
				&& ejemplaresAnyo == other.ejemplaresAnyo && other.genero.equals(this.genero)
				&& paginas == other.paginas && other.titulo.equals(this.titulo);
	}
	
}
