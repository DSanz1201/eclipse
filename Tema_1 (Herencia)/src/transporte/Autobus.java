package transporte;

import java.util.Random;

/**
 * Clase Autobus que hereda de Transporte e incluye el número de plazas.
 */
public class Autobus extends Transporte {
    private int numeroPlazas;

    /**
     * Constructor de la clase Autobus - recibe parámetros para los valores de los atributos
     * @param matricula Número de matrícula del autobús.
     * @param anoCompra Año de compra del autobús.
     * @param cv Caballos de vapor (potencia) del autobús.
     * @param modelo Modelo del autobús.
     * @param numeroPlazas Número de plazas del autobús.
     */
    public Autobus(String matricula, int anoCompra, int cv, String modelo, int numeroPlazas) {
        super(matricula, anoCompra, cv, modelo);
        this.numeroPlazas = numeroPlazas;
    }
    /**
     * Constructor de la clase Autobus - valores por defecto
     * @param matricula Número de matrícula del autobús.
     * @param anoCompra Año de compra del autobús.
     * @param cv Caballos de vapor (potencia) del autobús.
     * @param modelo Modelo del autobús.
     * @param numeroPlazas Número de plazas del autobús.
     */
    public Autobus() {
        super();
        this.numeroPlazas = 0;
    }
    /**
     * Constructor de la clase Autobus - copia
     * @param matricula Número de matrícula del autobús.
     * @param anoCompra Año de compra del autobús.
     * @param cv Caballos de vapor (potencia) del autobús.
     * @param modelo Modelo del autobús.
     * @param numeroPlazas Número de plazas del autobús.
     */
    public Autobus(Autobus a) {
        super(a.matricula, a.anoCompra, a.cv, a.modelo);
        this.numeroPlazas = a.numeroPlazas;
    }
	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}

	@Override
	public String toString() {
		return super.toString() + "\nAutobus [numeroPlazas=" + numeroPlazas + "]";
	}
	
	public Transporte generarAleatorios() {
		Random random = new Random();
		numeroPlazas = random.nextInt(20) + 10;
		return this;
	}
}