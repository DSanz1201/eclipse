package openjai;

public class Responsable extends Empleado {
    protected Departamento departamento;

    // [EJERCICIO 1] Constructor de la clase con parámetros

    public Responsable(String nombre, Departamento departamento) {
        super(nombre);
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento tipoProyecto) {
        this.departamento = tipoProyecto;
    }

    @Override
    public String toString() {
        // [EJERCICIO 1] Mostrar también los datos correspondientes a la clase Empleado
        return super.toString() + "\nResponsable [tipoProyecto=" + departamento + "]";
        // return "ID: " + id + "Nombre: " + nombre + "\nResponsable [tipoProyecto=" +
        // departamento + "]";
    }
}
