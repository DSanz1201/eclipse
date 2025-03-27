package Desutogram;

import java.util.Random;

public class Historia extends Contenido implements Monetizable {
	private int views;

	public Historia(String titulo, String descripcion, String fecha, int likes, int views) {
		super(titulo, descripcion, fecha, likes);
		this.views = views;
	}
	
	public Historia() {
		super();
		Random random = new Random();
		this.views = random.nextInt(1000000);
	}
	

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	@Override
	public String toString() {
		return "Historias [views=" + views + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Historia other = (Historia) obj;
		return views == other.views;
	}

	@Override
	public double monetizar() {
		double res = (views * 0.75) + likes;
		return res;
	}
	
}
