package openjai;

import java.util.ArrayList;

public class Desarrollador extends Empleado {

    protected ArrayList<Lenguaje> lLenguajes;
    protected int horasDisponibles;

    // [EJERCICIO 1] Crear el constructor de la clase con parámetros
    public Desarrollador(String nombre, ArrayList<Lenguaje> lLenguajes) {
        super(nombre);
        this.lLenguajes = lLenguajes;
        this.horasDisponibles = 1600;
    }

    public ArrayList<Lenguaje> getlLenguajes() {
        return lLenguajes;
    }

    public void setlLenguajes(ArrayList<Lenguaje> lLenguajes) {
        this.lLenguajes = lLenguajes;
    }

    public int getHorasDisponibles() {
        return horasDisponibles;
    }

    public void setHorasDisponibles(int horasDisponibles) {
        this.horasDisponibles = horasDisponibles;
    }

    @Override
    public String toString() {
        // [EJERCICIO 1] Mostrar también los datos correspondientes a la clase Empleado
        return super.toString() + " Desarrollador [lLenguajes=" + lLenguajes + ", horasDisponibles=" + horasDisponibles
                + "]";
        /*
         * return "Id: " + id + "Nombre: " + nombre + " Desarrollador [lLenguajes=" +
         * lLenguajes + ", horasDisponibles="
         * + horasDisponibles + "]";
         */
    }
}
