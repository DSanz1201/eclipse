import java.util.Objects;

public class Artista {
	protected String nombre;
	protected int anyoInicio;
	
	public Artista() {
		nombre = "";
		anyoInicio = 2000;
	}

	public Artista(String nombre, int anyoInicio) {
		super();
		this.nombre = nombre;
		this.anyoInicio = anyoInicio;
	}
	
	public Artista(Artista a) {
		super();
		this.nombre = a.nombre;
		this.anyoInicio = a.anyoInicio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnyoInicio() {
		return anyoInicio;
	}

	public void setAnyoInicio(int anyoInicio) {
		this.anyoInicio = anyoInicio;
	}

	@Override
	public String toString() {
		return "Artista [nombre=" + nombre + ", anyoInicio=" + anyoInicio + "]";
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
		return anyoInicio == other.anyoInicio && Objects.equals(nombre, other.nombre);
	}

}
