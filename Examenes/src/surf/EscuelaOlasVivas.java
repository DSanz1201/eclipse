package surf;

import java.util.ArrayList;
import java.util.Random;

public class EscuelaOlasVivas implements Evaluable {

	private ArrayList<Usuario> listaUsuarios;
	private ArrayList<ClaseSurf> listaClases;

	public EscuelaOlasVivas() {
		super();
		this.listaUsuarios = new ArrayList<>();
		this.listaClases = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			listaUsuarios.add(new Usuario());
		}
		for(int n = 0; n < 3; n++) {
			listaClases.add(new ClaseSurf());
		}
	}

	public EscuelaOlasVivas(ArrayList<Usuario> listaUsuarios, ArrayList<ClaseSurf> listaClases, Estado estado) {
		super();
		this.listaUsuarios = listaUsuarios;
		this.listaClases = listaClases;
	}

	public ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public ArrayList<ClaseSurf> getListaClases() {
		return listaClases;
	}

	public void setListaClases(ArrayList<ClaseSurf> listaClases) {
		this.listaClases = listaClases;
	}
	
	/**
	 * Método que devuelva el instructor con más clases impartidas
	 * */
	
	public Instructor masClasesImpartidas() {
		Instructor instructor_mas_clases = null;
		int mas_clases = 0;
		for (ClaseSurf claseSurf : listaClases) {
			int cont_temp = 0;
			Instructor instructor_temp = null;
			for (ClaseSurf claseSurf2 : listaClases) {
				if(claseSurf.equals(claseSurf2)) {
					instructor_temp = claseSurf.getInstructor();
					cont_temp++;
				}
			}
			if(cont_temp > mas_clases) {
				mas_clases = cont_temp;
				instructor_mas_clases = instructor_temp;
			}
		}
		return instructor_mas_clases;
	}
	
	
	/**
	 * Método que dado un nivel de participantes devuelva una lista el identificador 
	 * de todas las clases disponibles de ese nivel
	 * @return 
	 * */
	
	public ArrayList<Integer> lista_nivel(NivelParticipacion nivel) {
		ArrayList<Integer> lista = new ArrayList<>();
		for(int i = 0; i < listaClases.size(); i++) {
			if(listaClases.get(i).getNivelParticipacion() == nivel) {
				lista.add(listaClases.get(i).getIdentificador());
			}
		}
		return lista;
	}
	
	/**
	 * Método que dado un alumno nos indique si tiene alguna clase reservada o no, y en caso de que 
	 * no tenga ninguna clase reservada, cree una reserva que sea Confirmada, seleccionado aleatoriamente 
	 * alguna clase de surf grupal que tenga capacidad.
	 **/
	
	public void clase_reservada(Alumno alumno) {
		if(alumno.getCantidadClases() == 0) {
			Random random = new Random();
			ClaseSurf temp = listaClases.get(random.nextInt(listaClases.size() + 1));
			while(temp.getCapacidadMaxima() == 1) {
				temp = listaClases.get(random.nextInt(listaClases.size() + 1));
			}
			Reserva reserva = new Reserva(alumno, temp, Estado.Confirmado);
		}
	}

	@Override
	public void evaluar() {
		// TODO Auto-generated method stub
		
	}
}
