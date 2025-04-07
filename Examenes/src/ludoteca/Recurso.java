package ludoteca;

public abstract class Recurso {
	
	protected static int codigo = 0;
	
	
	public Recurso() {
		super();
		codigo++;
	}

	@Override
	public String toString() {
		return "Recurso, codigo= " + codigo;
	}
	
	public abstract boolean esFamiliar();
	
}
