package transporte;

import java.util.Objects;

/**
 * Clase base Transporte que representa un vehículo de la flota.
 */
public abstract class Transporte { //De una clase abstracta no se puede crear un new
    protected String matricula;
    protected int anoCompra;
    protected int cv;
    protected String modelo;
    
    /**
     * Constructor de la clase Transporte. Inicializa los atributos con valores pasados como parámetros
     * @param matricula Número de matrícula del vehículo.
     * @param anoCompra Año de compra del vehículo.
     * @param cv Caballos (potencia) del vehículo.
     * @param modelo Modelo del vehículo.
     */
    public Transporte(String matricula, int anoCompra, int cv, String modelo) {
        this.matricula = matricula;
        this.anoCompra = anoCompra;
        this.cv = cv;
        this.modelo = modelo;
    }
    /**
     * Constructor de la clase Transporte. Inicializa los atributos con valores por defecto
     * @param matricula Número de matrícula del vehículo.
     * @param anoCompra Año de compra del vehículo.
     * @param cv Caballos (potencia) del vehículo.
     * @param modelo Modelo del vehículo.
     */
    public Transporte() {
        this.matricula = "";
        this.anoCompra = 2025;
        this.cv = 200;
        this.modelo = "";
    }
    /**
     * Constructor copia de la clase Transporte.
     * @param matricula Número de matrícula del vehículo.
     * @param anoCompra Año de compra del vehículo.
     * @param cv Caballos (potencia) del vehículo.
     * @param modelo Modelo del vehículo.
     */
    public Transporte(Transporte t) {
    	this.matricula = t.matricula;
        this.anoCompra = t.anoCompra;
        this.cv = t.cv;
        this.modelo = t.matricula;
    }
	public int getAnoCompra() {
		return anoCompra;
	}
	public void setAnoCompra(int anoCompra) {
		this.anoCompra = anoCompra;
	}
	public int getCv() {
		return cv;
	}
	public void setCv(int cv) {
		this.cv = cv;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	
	
	@Override
	public String toString() {
		return "Transporte [matricula=" + matricula + ", anoCompra=" + anoCompra + ", cv=" + cv + ", modelo=" + modelo
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transporte other = (Transporte) obj;
		return Objects.equals(matricula, other.matricula);
	}
	
	/*
	 * Genera valores aleatorios para algunos de los atributos de la clase
	 */
	
	public abstract void generarAleatorios(); //Forzar que las subclases tengan este metodo
    
}