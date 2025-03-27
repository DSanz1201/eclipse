package Desutogram;

import java.util.ArrayList;
import java.util.Objects;

public class Publicacion extends Contenido implements Monetizable {
	private ArrayList<String> comentarios;

	public Publicacion(String titulo, String descripcion, String fecha, int likes, ArrayList<String> comentarios) {
		super(titulo, descripcion, fecha, likes);
		this.comentarios = comentarios;
	}
	
	public Publicacion() {
		super();
		ArrayList<String> temp = new ArrayList<String>();
		temp.add("Comentario1");
		temp.add("Comentario2");
		temp.add("Comentario3");
		this.comentarios = temp;
	}

	public ArrayList<String> getComentarios() {
		return comentarios;
	}

	public void setComentarios(ArrayList<String> comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "Publicaciones [comentarios=" + comentarios + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicacion other = (Publicacion) obj;
		return Objects.equals(comentarios, other.comentarios);
	}

	@Override
	public double monetizar() {
		double res = likes + (comentarios.size() * 1.5);
		return res;
	}
	
	
}
