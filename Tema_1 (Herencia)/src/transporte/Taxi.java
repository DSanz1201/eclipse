package transporte;

import java.util.Random;

/**
 * Clase Taxi que hereda de Transporte e incluye el número de licencia.
 */
public class Taxi extends Transporte {
    private int numeroLicencia;

    /**
     * Constructor de la clase Taxi.
     * @param matricula Número de matrícula del taxi.
     * @param anoCompra Año de compra del taxi.
     * @param cv Caballos de vapor (potencia) del taxi.
     * @param modelo Modelo del taxi.
     * @param numeroLicencia Número de licencia del taxi.
     */
    public Taxi(String matricula, int anoCompra, int cv, String modelo, int numeroLicencia) {
        super(matricula, anoCompra, cv, modelo);
        this.numeroLicencia = numeroLicencia;
    }
    /**
     * Constructor de la clase Taxi que inicializa los atributos con valores por defecto
     * @param matricula Número de matrícula del taxi.
     * @param anoCompra Año de compra del taxi.
     * @param cv Caballos de vapor (potencia) del taxi.
     * @param modelo Modelo del taxi.
     * @param numeroLicencia Número de licencia del taxi.
     */
    public Taxi() {
        super();
        this.numeroLicencia = 0;
    }
    /**
     * Constructor copia de la clase Taxi
     * @param matricula Número de matrícula del taxi.
     * @param anoCompra Año de compra del taxi.
     * @param cv Caballos de vapor (potencia) del taxi.
     * @param modelo Modelo del taxi.
     * @param numeroLicencia Número de licencia del taxi.
     */
    public Taxi(Taxi t) {
        super(t.matricula, t.cv, t.anoCompra, t.modelo);
        this.numeroLicencia = 0;
    }
    
	public int getNumeroLicencia() {
		return numeroLicencia;
	}
	@Override
	public String toString() {
		return super.toString() + "\nTaxi [numeroLicencia=" + numeroLicencia + "]";
	}   
	
	public Transporte generarAleatorios() {
		Random random = new Random();
		numeroLicencia = random.nextInt(10000);
		return this;
	}
	
}
