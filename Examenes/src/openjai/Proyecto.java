package openjai;

import java.util.ArrayList;

public class Proyecto implements Financiable {
    protected String nombre;
    protected int horasEstimadas;
    protected double coste;
    protected Responsable responsable;
    protected ArrayList<Desarrollador> lDesarrolladores;

    public Proyecto(String nombre, int horasEstimadas, double coste, Responsable responsable,
            ArrayList<Desarrollador> lDesarrolladores) {
        this.nombre = nombre;
        this.horasEstimadas = horasEstimadas;
        this.coste = coste;
        this.responsable = responsable;
        this.lDesarrolladores = lDesarrolladores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public ArrayList<Desarrollador> getlDesarrolladores() {
        return lDesarrolladores;
    }

    public void setlDesarrolladores(ArrayList<Desarrollador> lDesarrolladores) {
        this.lDesarrolladores = lDesarrolladores;
    }

    @Override
    public String toString() {
        // [EJERCICIO 1] Mostrar solo el nombre del responsable (no todos sus datos)
        return "Proyecto [nombre=" + nombre + ", horasEstimadas=" + horasEstimadas + ", coste=" + coste
                + ", responsable=" + responsable.getNombre() + ", \nlDesarrolladores=" + lDesarrolladores + "]";
    }

    @Override
    public void financiar(double coste) {
        this.coste = this.coste - coste;
        switch (responsable.getDepartamento()) {
        	case INDUSTRIA:
        	case MEDICINA:
                this.coste *= 0.9;
                break;
            case EDUCACION:
                this.coste *= 0.8;
                break;
            case FINANZAS:
            case MARKETING:
                this.coste *= 0.85;
        }
    }
}
