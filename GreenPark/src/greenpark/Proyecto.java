package greenpark;

import java.time.LocalDate;

class Proyecto implements Financiable {
    private String nombre;
    private TipoProyecto tipo; // Restauración, Educación, etc.
    private double presupuesto;
    private LocalDate fechaInicio;
    private Parque parque;

    public Proyecto(String nombre, TipoProyecto tipo, double presupuesto, LocalDate fechaInicio, Parque parque) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.presupuesto = presupuesto;
        this.fechaInicio = fechaInicio;
        this.parque = parque;
    }

    public double getCosteFinal() {
    	return (this.presupuesto - (this.presupuesto * (getPorcentajeFinanciacion() / 100)));
    }

	public String getNombre() {
		return nombre;
	}

	public TipoProyecto getTipo() {
		return tipo;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public Parque getParque() {
		return parque;
	}

	@Override
	public String toString() {
		return "Proyecto [nombre=" + nombre + ", tipo=" + tipo + ", presupuesto=" + presupuesto + ", fechaInicio="
				+ fechaInicio + ", parque=" + parque + "]";
	}

	@Override
	public boolean esFinanciable() {
		if(tipo.equals(TipoProyecto.RESTAURACION) || tipo.equals(TipoProyecto.INVESTIGACION)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int getPorcentajeFinanciacion() {
		if(tipo.equals(TipoProyecto.RESTAURACION) || tipo.equals(TipoProyecto.INVESTIGACION)) {
			return 80;
		} else {
			return 0;
		}
	}

    // Getters y toString() a completar según se necesiten
}
