package greenpark;

class Principal {
    public static void main(String[] args) {
        GreenPark gp = new GreenPark();

        // gp.cargarParquesCSV("parques.csv");
        gp.cargarParquesCSV("parques.csv");
        System.out.println(gp.getParques());
        
        // gp.cargarPersonalCSV("personal.csv");
        gp.cargarPersonalCSV("personal.csv");
        System.out.println(gp.getPersonal());
        
        // gp.asignarPersonalAleatorio();
        gp.asignarPersonalAleatorio();
        System.out.println(gp.getParques());
        
        // gp.mostrarParquesPorCoste();
        gp.mostrarParquesPorCoste();
        
    }
}
