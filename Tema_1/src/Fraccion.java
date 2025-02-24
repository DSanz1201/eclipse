
public class Fraccion {
	private int numerador;
	private int denominador;
	
	//Constructores x3
	
	
	
	//gtters y setters
	
	
	
	//toString
	
	
	
	//sumar, restar, dividir, multiplicar, simplificar
	
	public Fraccion sumar(Fraccion f) {
		//Tengo 2 fracciones con las que trabajar
		//this(Importante) y f
		Fraccion nueva = new Fraccion();
		nueva.denominador = this.denominador * f.denominador;
		//Calcular numerador
		//Simplificar nueva
		return nueva;
	}
	
}
