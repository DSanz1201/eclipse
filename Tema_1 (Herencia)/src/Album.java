import java.util.Objects;

public class Album {
	private String titulo;
	private int duracion;
	private int anyo;
	private String discografica;
	private int numCanciones;
	
	
	public Album() {
		this.titulo = "Titulo1";
		this.duracion = 1111;
		this.anyo = 1980;
		this.discografica = "Discografia1";
		this.numCanciones = 9999;
		
	}
	
	public Album(Album a) {
		this.titulo = a.titulo;
		this.duracion = a.duracion;
		this.anyo = a.anyo;
		this.discografica = a.discografica;
		this.numCanciones = a.numCanciones;
	}
	
	
	public Album(String titulo, int duracion, int anyo, String discografica, int numCanciones) {
		this.titulo = titulo;
		
		if(duracion < 0) {
			this.duracion = 9999;
		} else {
			this.duracion = duracion;
		}
		
		if(anyo < 0) {
			this.anyo = 2024;
		} else {
			this.anyo = anyo;
		}
		
		if(discografica.length() < 2) {
			this.discografica = "No especificada";
		} else {
			this.discografica = discografica;
		}
		
		if(numCanciones < 0) {
			this.numCanciones = 9999;
		} else {
			this.numCanciones = numCanciones;
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		if(duracion < 0) {
			this.duracion = 9999;
		} else {
			this.duracion = duracion;
		}
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		if(anyo < 0) {
			this.anyo = 2024;
		} else {
			this.anyo = anyo;
		}
	}

	public String getDiscografica() {
		return discografica;
	}

	public void setDiscografica(String discografica) {
		if(discografica.length() < 2) {
			this.discografica = "No especificada";
		} else {
			this.discografica = discografica;
		}
	}

	public int getNumCanciones() {
		return numCanciones;
	}

	public void setNumCanciones(int numCanciones) {
		if(numCanciones < 0) {
			this.numCanciones = 9999;
		} else {
			this.numCanciones = numCanciones;
		}
	}

	@Override
	public String toString() {
		return "Album [titulo=" + titulo + ", duracion=" + duracion + ", anyo=" + anyo + ", discografica="
				+ discografica + ", numCanciones=" + numCanciones + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Album other = (Album) obj;
		return anyo == other.anyo && Objects.equals(discografica, other.discografica) && duracion == other.duracion
				&& numCanciones == other.numCanciones && Objects.equals(titulo, other.titulo);
	}
	
	
	
	
	
}
