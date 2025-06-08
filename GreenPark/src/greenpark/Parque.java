package greenpark;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Parque implements Financiable, Comparable<Parque> {
    private String nombre;
    private String pais;
    private LocalDate fechaFundacion;
    private double hectareas;
    private List<Personal> personalAsignado;
    private List<Proyecto> proyectos;

    public Parque(String nombre, String pais, LocalDate fechaFundacion, double hectareas) {
        this.nombre = nombre;
        this.pais = pais;
        this.fechaFundacion = fechaFundacion;
        this.hectareas = hectareas;
        this.personalAsignado = new ArrayList<>();
        this.proyectos = new ArrayList<>();
    }

    public void asignarPersonal(Personal p) {
        personalAsignado.add(p);
    }

    public void añadirProyecto(Proyecto p) {
        proyectos.add(p);
    }

    public double getCosteTotal() {
    	double total = 0.0;
        for(Proyecto proyecto : proyectos) {
        	total += proyecto.getCosteFinal();
        }
        return total;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	public double getHectareas() {
		return hectareas;
	}

	public void setHectareas(double hectareas) {
		this.hectareas = hectareas;
	}

	public List<Personal> getPersonalAsignado() {
		return personalAsignado;
	}

	public void setPersonalAsignado(List<Personal> personalAsignado) {
		this.personalAsignado = personalAsignado;
	}

	public List<Proyecto> getProyectos() {
		return proyectos;
	}

	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}
	
	@Override
	public String toString() {
		return "Parque [nombre=" + nombre + ", pais=" + pais + ", fechaFundacion=" + fechaFundacion + ", hectareas="
				+ hectareas + ", personalAsignado=" + personalAsignado + ", proyectos=" + proyectos + "]";
	}

	@Override
	public boolean esFinanciable() {
		return hectareas > 100000;
	}

	@Override
	public int getPorcentajeFinanciacion() {
		if(this.hectareas > 100000) {
			return 50;
		}
		return 0;
	}

	@Override
	public int compareTo(Parque o) {
		// TODO Auto-generated method stub
		return Double.compare(this.getCosteTotal(), o.getCosteTotal());
	}

    // Getters y toString() a completar según se necesiten  
}