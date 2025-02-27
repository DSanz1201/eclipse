
public class prueba_libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro L1 = new Libro();
		Libro L2 = new Libro("Titulo Marciano");
		Libro L3 = new Libro("Breaking Bad", "JK Vincent");
		Libro L4 = new Libro("El secreto de los Barrow", "Autor x");
		
		L1.setTitulo("cambio");
		System.out.println(L2);
		L1.setTitulo("El hombre en busca del sentido");
		L4.setPaginas(-10);
		System.out.println(L4.getPaginas());
		System.out.println(L2.getAutor() + "   " + L2.getGenero());
		
		if(L2.getTitulo().equals(L4.getTitulo())) {
			System.out.println("Es igual");
		} else {
			System.out.println("No es igual");
		}
		
		System.out.println(L3);
	}

}
