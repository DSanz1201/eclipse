import java.util.Objects;

public class Escultor extends Artista {
	//Nacionalidad del escultor, valor enum de Pais
	private Pais nacionalidad;
	//Nombre de la escultura más reconocida
	private String nombreEscultura;
	
	 
	
	//Constructores
	
	public Escultor(String nombre, int anyoInicio, Pais nacionalidad, String nombreEscultura) {
		
		this.nacionalidad = nacionalidad;
		
		if(nombreEscultura.length() < 3) {
			this.nombreEscultura = nombreEscultura;
		} else {
			this.nombreEscultura = "Indefinida";
		}
	}
	
	public Escultor() {
		super();
		this.nacionalidad = Pais.ITALIA;
		this.nombreEscultura = "David";
	}
	
	public Escultor(Escultor e) {
		super(new Artista(e.nombre, e.anyoInicio));
		this.nacionalidad = e.nacionalidad;
		this.nombreEscultura = e.nombreEscultura;
	}

	//getters y setters

	public Pais getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Pais nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNombreEscultura() {
		return nombreEscultura;
	}

	public void setNombreEscultura(String nombreEscultura) {
		if(nombreEscultura.length() < 3) {
			this.nombreEscultura = nombreEscultura;
		} else {
			this.nombreEscultura = "Indefinida";
		}
	}

	//toString
	
	@Override
	public String toString() {
		return "Escultor [" +  super.toString() + " , nacionalidad=" + nacionalidad
				+ ", nombreEscultura=" + nombreEscultura + "]";
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
		Escultor other = (Escultor) obj;
		return super.equals(other) && nacionalidad == other.nacionalidad
			 && Objects.equals(nombreEscultura, other.nombreEscultura);
	}
	
	
}