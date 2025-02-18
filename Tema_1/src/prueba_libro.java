
public class prueba_libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		libro L1 = new libro();
		libro L2 = new libro("Libro Marcian");
		libro L3 = new libro("Breaking Bad", "JK Vincent");
		
		System.out.println(L1.getPaginas());
		System.out.println(L2);
		System.out.println(L3);
	}

}
