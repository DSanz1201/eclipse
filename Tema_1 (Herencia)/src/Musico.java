import java.util.Objects;

public class Musico extends Artista {
	private Estilo estilo; //Enumerado.
	private Album ultimoAlbum;
	
	public Musico() {
		super();
		this.estilo = Estilo.BLUES;
		this.ultimoAlbum = new Album();
	}
	
	public Musico(Musico a) {
		super(new Artista(a.nombre, a.anyoInicio));
		this.estilo = a.estilo;
		this.ultimoAlbum = new Album(a.ultimoAlbum); //Importante hacer una copia profunda para el constructor de copia
	}
	
	public Musico(String nombre, int anyoInicio, Estilo estilo, Album ultimoAlbum) {
		super(nombre, anyoInicio);
		this.estilo = estilo;
		this.ultimoAlbum = ultimoAlbum;
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
		return "Artista [" + super.toString() + ", estilo=" + estilo + ", ultimoAlbum="
				+ ultimoAlbum + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Musico other = (Musico) obj;
		return super.equals(other) && estilo == other.estilo && Objects.equals(ultimoAlbum, other.ultimoAlbum);
	}
	
	//super.equals(other.nombre) o super.equals(other.anyoInicio)  ---> Especifico, solo other es general
	
	
	
	
	
	
}
