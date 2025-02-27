import java.util.Objects;

public class Artista {
	private String nombre;
	private int anyoInicio;
	private Estilo estilo; //Enumerado.
	private Album ultimoAlbum;
	
	public Artista() {
		this.nombre = "Nombre1";
		this.anyoInicio = 1980;
		this.estilo = Estilo.BLUES;
		this.ultimoAlbum = new Album();
	}
	
	public Artista(Artista a) {
		this.nombre = a.nombre;
		this.anyoInicio = a.anyoInicio;
		this.estilo = a.estilo;
		this.ultimoAlbum = a.ultimoAlbum;
	}
	
	public Artista(String nombre, int anyoInicio, Estilo estilo, Album ultimoAlbum) {
		
		if(nombre.length() < 1) {
			this.nombre = "Sin especificar";
		} else {
			this.nombre = nombre;
		}
		
		if(anyoInicio < 0) {
			this.anyoInicio = 9999;
		} else {
			this.anyoInicio = anyoInicio;
		}
		
		this.estilo = estilo;
		this.ultimoAlbum = ultimoAlbum;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre.length() < 1) {
			this.nombre = "Sin especificar";
		} else {
			this.nombre = nombre;
		}
	}

	public int getAnyoInicio() {
		return anyoInicio;
	}

	public void setAnyoInicio(int anyoInicio) {
		if(anyoInicio < 0) {
			this.anyoInicio = 9999;
		} else {
			this.anyoInicio = anyoInicio;
		}
	}

	public Estilo getEstilo() {
		return estilo;
	}

	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}

	public Album getUltimoAlbum() {
		return ultimoAlbum;
	}

	public void setUltimoAlbum(Album ultimoAlbum) {
		this.ultimoAlbum = ultimoAlbum;
	}

	@Override
	public String toString() {
		return "Artista [nombre=" + nombre + ", anyoInicio=" + anyoInicio + ", estilo=" + estilo + ", ultimoAlbum="
				+ ultimoAlbum + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artista other = (Artista) obj;
		return anyoInicio == other.anyoInicio && estilo == other.estilo && Objects.equals(nombre, other.nombre)
				&& Objects.equals(ultimoAlbum, other.ultimoAlbum);
	}
	
	
	
	
	
}
