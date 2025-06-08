package greenpark;

class Botanico extends Personal {
	protected String especialidad;
	
    public Botanico(String nombre, String pais, String especialidad) {
        super(nombre, pais);
        this.especialidad = especialidad;
    }
}
