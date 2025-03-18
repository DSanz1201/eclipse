package openjai;

public class Empleado {
    // [EJERCICIO 1] Asignar un identificador único a cada Empleado. Modificar lo
    // necesario en esta clase.

    protected static int numEmpleado = 0;
    protected int id;
    protected String nombre;

    public Empleado(String nombre) {
        id = numEmpleado;
        numEmpleado++;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "\nEmpleado [id=" + id + ", nombre=" + nombre + "]";
    }
}
