import java.util.ArrayList;
import java.util.Objects;

public class Discografica {
	/*Atributos: 
	 * Nombre
	 * CIF
	 * Telefono 
	 * ArrayList de artistas
	 * */
	
	private String nombre;
	private String cif;
	private String telefono;
	private ArrayList<Artista> musicos;
	
	//Constructores
	
	public Discografica() {
		nombre = "";
		cif = "";
		telefono = "";
		musicos = new ArrayList<Artista>();
	}
	
	/**
	 * 
	 * @param nombre
	 * @param cif
	 * @param telefono
	 * @param musicos - Se hace una copia SUPERFICIAL (no profunda) de la lista de misicos
	 */

	public Discografica(String nombre, String cif, String telefono, ArrayList<Artista> musicos) {
		super();
		this.nombre = nombre;
		this.cif = cif;
		this.telefono = telefono;
		this.musicos = musicos;
	}
	
	public Discografica(Discografica d) {
		this.nombre = d.nombre;
		this.cif = d.cif;
		this.telefono = d.telefono;
		this.musicos = new ArrayList <Artista> (d.musicos);
	}
	
	
	//getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public ArrayList<Artista> getMusicos() {
		return musicos;
	}

	public void setMusicos(ArrayList<Artista> musicos) {
		this.musicos = musicos;
	}
	
	
	//equals
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Discografica other = (Discografica) obj;
		return Objects.equals(cif, other.cif) && Objects.equals(musicos, other.musicos)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(telefono, other.telefono);
	}

	//toString
	
	@Override
	public String toString() {
		return "Discografica [nombre=" + nombre + ", cif=" + cif + ", telefono=" + telefono + ", musicos=" + musicos
				+ "]";
	}
	
	
	//Método que devuelve el artista más veterano
	
	public Artista getMasVeterano() {
		int anyoMenor = 2026;
		Artista veterano = null;
		for(Artista musico: musicos) {
			if(musico.getAnyoInicio() < anyoMenor) {
				anyoMenor = musico.getAnyoInicio();
				veterano = musico;
			}
		}
		return veterano;
	}
	
	
	//Método que devuelve la duración media de los álbum de los artistas de la discográfica
	
	//Método que devuelve un ArrayList con los álbum publicados el año pasado como parámetro
}
