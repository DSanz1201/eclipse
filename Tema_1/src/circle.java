public class Circle/*Entidad*/ {
	//Propiedades de la clase
	private double radius; //Private --> Solo dentro de la clase, no se mod fuera
	private String color;
	
	//Metodo constructor (No devueleve nada, ni siquiera void, se llama exactamente igual que la clase)
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	/**
	 * Constructor de la clase
	 * @param nuevoR - Valor del radio
	 * @param nuevoC - Valor del color
	 * 
	 */
	public Circle(double nuevoR, String nuevoC) { //Estamos sobrecargando el constructor (Mas de uno, tienen que tener didstinto numero de parametros)
		
		if(nuevoR > 0) {
			radius = nuevoR;
		} else {
			radius = 1;
		}
		color = nuevoC;
	}
	
	//Getters y setters
	/**
	 * Metodo que devuelve el valor del radio
	 * @return - valor del radio (double)
	 */
	public double getRadius() { // Métodos
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	/**
	 * 
	 * @param nuevoR - Valor con el que modificar el radio, debe ser > 0, si no es asi,
	 * devuelve un error
	 */
	public void setRadius(double nuevoR) {
		if(nuevoR > 0) {
			radius = nuevoR;
		} else {
			System.out.println("Error");
		}
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Radio: " + radius + "   Color: " + color;
	}
}