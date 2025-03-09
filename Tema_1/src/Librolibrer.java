import java.util.Objects;

public class Librolibrer {
	private String titulo;
	private String autor;
	private int anyo;
	private String isbn;
	
	
	public Librolibrer() {
		super();
		this.titulo = "Titulo1";
		this.autor = "Autor1";
		this.anyo = 1999;
		this.isbn = "256765432";
	
	}
		
	public Librolibrer(String titulo, String autor, int anyo, String isbn) {
		super();
		if(titulo.length() < 3) {
			this.titulo = "Titulodefault";
		} else {
			this.titulo = titulo;
		}
		
		this.autor = autor;
		
		if(anyo < 0) {
			this.anyo = 9999;
		} else {
			this.anyo = anyo;
		}
		
		if(isbn.length() < 9) {
			this.isbn = "000000000";
		}
		this.isbn = isbn;
	}
	
	public Librolibrer(Librolibrer l) {
		super();
		this.titulo = l.titulo;
		this.autor = l.autor;
		this.anyo = l.anyo;
		this.isbn = l.isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if(titulo.length() < 3) {
			this.titulo = "Titulodefault";
		} else {
			this.titulo = titulo;
		}
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		if(anyo < 0) {
			this.anyo = 9999;
		} else {
			this.anyo = anyo;
		}
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		if(isbn.length() < 9) {
			this.isbn = "000000000";
		}
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Librolibrer [titulo=" + titulo + ", autor=" + autor + ", anyo=" + anyo + ", isbn=" + isbn + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Librolibrer other = (Librolibrer) obj;
		return anyo == other.anyo && Objects.equals(autor, other.autor) && Objects.equals(isbn, other.isbn)
				&& Objects.equals(titulo, other.titulo);
	}
	
	
	
	
}