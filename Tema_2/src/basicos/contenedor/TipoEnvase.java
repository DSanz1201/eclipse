package basicos.contenedor;

public enum TipoEnvase {
	LATA, BRICK, BOTELLA, CAJA, ENVOLTORIO, PAPEL, FRASCOCRIS, FRASCOPLAS;
	
	private static String[] contenedores= { "AMARILLO", "AMARILLO", "VERDE", "AZUL", "AMARILLO", "AZUL", "VERDE", "AMARILLO"};
	
	public String getContenerdor() {
		return contenedores[ this.ordinal() ]; //Devuelve el String en la posicion ordinal del array
	}
}
