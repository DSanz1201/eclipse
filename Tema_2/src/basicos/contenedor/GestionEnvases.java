package basicos.contenedor;

import java.util.ArrayList;

public class GestionEnvases {

	public static void main(String[] args) {
		Envase e1 = new Envase(12, 12.3, TipoEnvase.BOTELLA, "Botella de Coca-Cola");
		Envase e2 = new Envase(2, 15, TipoEnvase.FRASCOPLAS, "Botella de aceituna");
		
		ArrayList<Envase> listaEnvases = new ArrayList<Envase>();
		listaEnvases.add(e1);
		listaEnvases.add(e2);
		
		listaEnvases.sort(null);
		System.out.println(listaEnvases);
		
		listaEnvases.sort(new compararPorPeso());
		System.out.println(listaEnvases);
		
		listaEnvases.sort(new compararPorNombre());
		System.out.println(listaEnvases);
		
		if(e1.compareTo(e2) < 0) {
			System.out.println("e1 es menor que e2");
		} else {
			System.out.println("e1 es mayor que e2");
		}
		
		Envase miClon = null;
		
		try {
			miClon = (Envase) e1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		miClon.setNombre("Botella de fanta");
		System.out.println(miClon.getNombre());
		System.out.println(e1.getNombre());
		
		Contenedor contenedor = new Contenedor("Papel enero", "Azul", null);
		//TO-DO: crear un contendor con 5 envases
		
		
		//TO-DO: añadir 3 envases al contenedor, en la misma llamada al método anyadirEnvases
		
		//TO-DO: recorrer los envases del contenedor, accediendo a la lista de envases
		
		
		//TO-DO: recorrer los envases del contenedor --> Iterable
		
		
		//TO-DO: recorrer los envases del contenedor --> Iterator
		
		
		//TO-DO: eliminar los envases que no pertenezcan al contenedor azul
		
		

	}

}
