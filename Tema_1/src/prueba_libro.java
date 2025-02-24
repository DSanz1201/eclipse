
public class prueba_libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		libro L1 = new libro();
		libro L2 = new libro("Titulo Marciano");
		libro L3 = new libro("Breaking Bad", "JK Vincent");
		libro L4 = new libro("El secreto de los Barrow", "Autor x");
		
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
