package deustobio.fenomenos;

import java.time.LocalDate;

// EJERCICIO 1A
public abstract class FenomenoNatural {
	private static int contador = 0;
	protected int codigo;
	protected String nombre;
	protected LocalDate fecha;
	protected int duracion;
	
	public FenomenoNatural(String nombre, LocalDate fecha, int duracion) {
		super();
		this.codigo = contador;
		contador++;
		
		this.nombre = nombre;
		this.fecha = fecha;
		this.duracion = duracion;
	}
	
	public FenomenoNatural() {
		super();
		this.codigo = contador;
		contador++;
		
		this.nombre = "";
		this.fecha = LocalDate.now();
		this.duracion = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getCodigo() {
		return codigo;
	}

	// EJERCICIO 1A
	// Se quita este método
//	public void setCodigo( int codigo ) {
//		this.codigo = codigo;
//	}
	
	@Override
	public String toString() {
		return "Fenómeno Natural [codigo=" + codigo + ", nombre=" + nombre + ", fecha=" + fecha + ", duracion=" + duracion + "]";
	}

	// EJERCICIO 1A
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof FenomenoNatural) {
			FenomenoNatural other = (FenomenoNatural) obj;
			return codigo == other.codigo;
		} else {
			return false;
		}
	}	
	
	// EJERCICIO 1B.B
	public abstract void setValoresAleatorio();
}
