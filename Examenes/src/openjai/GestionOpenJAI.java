package openjai;

import java.util.ArrayList;

public class GestionOpenJAI {
    public static void main(String[] args) {

        // **************** EJERCICIO 2.A ************************
        ArrayList<Responsable> listaResponsables = new ArrayList<Responsable>();

        for (int i = 0; i < 10; i++) {
            // [EJERCICIO 2.A.] Crear la variable depto con un departamento aleatorio de
            // entre los existentes. Descomentar la siguiente línea de código y completarla
            int numDepto = (int) (Math.random() * Departamento.values().length);
            Departamento depto = Departamento.values()[numDepto];

            /*
             * Departamento depto;
             * switch (numDepto) {
             * case 0:
             * depto = Departamento.EDUCACION;
             * break;
             * case 1:
             * depto = Departamento.FINANZAS;
             * break;
             * case 2:
             * depto = Departamento.INDUSTRIA;
             * break;
             * default:
             * break;
             * }
             */

            // IMPORTANTE: si no sabes cómo hacerlo, puedes asignar un departamento fijo
            // para seguir con el programa. Esta solución no obtendrá ninguna puntuación
            // pero te permitirá seguir con el ejercicio.

            /// Ese Departamento es con el que se crea el Responsable
            Responsable r = new Responsable("Responsable-" + i, depto);

            listaResponsables.add(r);
        }

        // PRUEBA 2.A.
        System.out.println("\nLISTA DE RESPONSABLES");
        for (Responsable r : listaResponsables) {
            System.out.println(r);
        }

        // **************** EJERCICIO 2.B ************************
        ArrayList<Desarrollador> listaDesarrolladores = new ArrayList<Desarrollador>();

        for (int i = 0; i < 20; i++) {
            // [EJERCICIO 2.B.] Genera la lista con 3 lenguajes no repetidos en la lista
            // lLenguajes.
            // Esa lista es la que se pasa al constructor del Desarrollador
            // IMPORTANTE: si no sabes cómo hacerlo, puedes asignar 3 lenguajes fijos
            // a todos los desarrolladores. Esta solución no obtendrá ninguna puntuación
            // pero te permitirá seguir con el ejercicio.
            ArrayList<Lenguaje> lLenguajes = new ArrayList<Lenguaje>();
            while (lLenguajes.size() < 3) {
                int numLenguaje = (int) (Math.random() * Lenguaje.values().length);
                Lenguaje lenguaje = Lenguaje.values()[numLenguaje];

                if (!lLenguajes.contains(lenguaje))
                    lLenguajes.add(lenguaje);
            }

            /*
             * for (int j = 0; j < 3; j++) {
             * Lenguaje lenguaje;
             * do {
             * int numLenguaje = (int) (Math.random() * Lenguaje.values().length);
             * lenguaje = Lenguaje.values()[numLenguaje];
             * } while (lLenguajes.contains(lenguaje));
             * }
             */

            Desarrollador desarrollador = new Desarrollador("Desarrollador-" + i, lLenguajes);
            listaDesarrolladores.add(desarrollador);
        }
        // PRUEBA 2.B.
        System.out.println("\nLISTA DE DESARROLLADORES");
        for (Desarrollador d : listaDesarrolladores) {
            System.out.println(d);
        }

        // **************** EJERCICIO 2.C ************************
        ArrayList<Proyecto> listaProyectos = new ArrayList<Proyecto>();

        for (int i = 0; i < 30; i++) {
            // Obtener las horas estimadas
            int N = 10;
            int M = 1500;
            int horasEstimadas = (int) (Math.floor(Math.random() * (N - M + 1) + M));

            // Obtener el coste
            N = 500;
            M = 150000;
            double coste = (int) (Math.floor(Math.random() * (N - M + 1) + M));

            // [EJERCICIO 2.C.] Debes obtener el Responsable de forma aleatoria
            // y asignarlo a la variable responsable. Descomenta la siguiente línea
            // Responsable responsable = ....
            int numResponsable = (int) (Math.random() * listaResponsables.size());
            Responsable responsable = listaResponsables.get(numResponsable);
            // [EJERCICIO 2.C.] Debes obtener la lista de desarrolladores sobre una
            // variables
            // que se llame listaDesarrolladoresProyecto. De esta forma funcionará
            // correctamente la siguiente
            // línea de código

            ArrayList<Desarrollador> listaDesarrolladoresProyecto = new ArrayList<Desarrollador>();
            int numeroDeDesarrolladores;
            if (horasEstimadas <= 100)
                numeroDeDesarrolladores = 1;
            else if (horasEstimadas <= 500)
                numeroDeDesarrolladores = 2;
            else
                numeroDeDesarrolladores = 3;

            while (listaDesarrolladoresProyecto.size() < 3) {
                int numDesarrollador = (int) (Math.random() * listaDesarrolladores.size());
                Desarrollador d = listaDesarrolladores.get(numDesarrollador);
                if (!listaDesarrolladoresProyecto.contains(d))
                    listaDesarrolladoresProyecto.add(d);
            }

            // IMPORTANTE: si no sabes resolver alguno de los dos apartados anteriores,
            // puedes asignar un valor fijo a las variables (responsable y
            // listaDesarrolladoresProyecto). Esa solución no obtendrá ninguna puntuación
            // pero te permitirá seguir con el ejercicio.

            Proyecto proyecto = new Proyecto("Proyecto-" + i, horasEstimadas, coste, responsable,
                    listaDesarrolladoresProyecto);

            listaProyectos.add(proyecto);
        }
        // PRUEBA 2.C.
        System.out.println("\nLISTA DE PROYECTOS");
        for (Proyecto proyecto : listaProyectos) {
            System.out.println(proyecto);
        }

        // **************** EJERCICIO 2.D ************************
        // PRUEBA 2.D.
        System.out.println("\nACTUALIZAR HORAS DE DESARROLLADORES");
        // [EJERCICIO 2.D] Debes crear el método actualizarHorasDesarrolladores para que
        // esta llamada funcione correctamente
        actualizarHorasDesarrolladores(listaProyectos);

        // **************** EJERCICIO 3.A. PRUEBA ************************
        // [EJERCICIO 3] Implementa todo lo necesario en el programa para responder al
        // enunciado del ejercicio 3 y que esta llama al método financiar funcione
        // correctamente
        for (int i = 0; i < 5; i++) {
            System.out.println(listaProyectos.get(i + 4));
            listaProyectos.get(i + 4).financiar(100);
            System.out.println(listaProyectos.get(i + 4));
        }
    }

    public static void actualizarHorasDesarrolladores(ArrayList<Proyecto> listaProyectos) {
        for (Proyecto proyecto : listaProyectos) {
            for (Desarrollador desarrollador : proyecto.getlDesarrolladores()) {
                int horasDisponibles = desarrollador.getHorasDisponibles();
                int horasDedicadasProyecto = proyecto.getHorasEstimadas() / proyecto.getlDesarrolladores().size();

                if (horasDisponibles >= horasDedicadasProyecto)
                    desarrollador.setHorasDisponibles(horasDisponibles - horasDedicadasProyecto);
                else
                    System.out.println("El desarrollador " + desarrollador.getNombre() + " tiene un deficit de: "
                            + (horasDisponibles) + " horas");
            }
        }
    }
}



################################################################

Contains va con equals
