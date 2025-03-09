import java.util.Objects;

public class Escultor {
	private String nombre;
	private int anyoInicio;
	//Nacionalidad del escultor, valor enum de Pais
	private Pais nacionalidad;
	//Nombre de la escultura más reconocida
	private String nombreEscultura;
	
	 
	
	//Constructores
	
	public Escultor(String nombre, int anyoInicio, Pais nacionalidad, String nombreEscultura) {
		if(nombre.length() < 3) {
			this.nombre = nombre;
		} else {
			this.nombre = "Indefinido";
		}
		
		if(anyoInicio < 0) {
			this.anyoInicio = anyoInicio;
		} else {
			this.anyoInicio = 9999;
		}
		
		this.nacionalidad = nacionalidad;
		
		if(nombreEscultura.length() < 3) {
			this.nombreEscultura = nombreEscultura;
		} else {
			this.nombreEscultura = "Indefinida";
		}
	}
	
	public Escultor() {
		this.nombre = "Miguel Angel";
		this.anyoInicio = 1256;
		this.nacionalidad = Pais.ITALIA;
		this.nombreEscultura = "David";
	}
	
	public Escultor(Escultor e) {
		this.nombre = e.nombre;
		this.anyoInicio = e.anyoInicio;
		this.nacionalidad = e.nacionalidad;
		this.nombreEscultura = e.nombreEscultura;
	}

	//getters y setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre.length() < 3) {
			this.nombre = nombre;
		} else {
			this.nombre = "Indefinido";
		}
	}

	public int getAnyoInicio() {
		return anyoInicio;
	}

	public void setAnyoInicio(int anyoInicio) {
		if(anyoInicio < 0) {
			this.anyoInicio = anyoInicio;
		} else {
			this.anyoInicio = 9999;
		}
	}

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
		return "Escultor [nombre=" + nombre + ", anyoInicio=" + anyoInicio + ", nacionalidad=" + nacionalidad
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
		return anyoInicio == other.anyoInicio && nacionalidad == other.nacionalidad
				&& Objects.equals(nombre, other.nombre) && Objects.equals(nombreEscultura, other.nombreEscultura);
	}
	
	
}