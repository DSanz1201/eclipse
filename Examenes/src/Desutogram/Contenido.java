package Desutogram;

import java.util.Objects;
import java.util.Random;

public class Contenido {
		protected String titulo;
		protected String descripcion;
		protected String fecha;
		protected int likes;
		
		public Contenido(String titulo, String descripcion, String fecha, int likes) {
			super();
			this.titulo = titulo;
			this.descripcion = descripcion;
			this.fecha = fecha;
			this.likes = likes;
		}
		
		public Contenido() {
			super();
			this.titulo = "Titulo1";
			this.descripcion = "Descripcion1";
			this.fecha = "Fecha1";
			
			Random random = new Random();
			
			this.likes = random.nextInt(500000);
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public String getFecha() {
			return fecha;
		}

		public void setFecha(String fecha) {
			this.fecha = fecha;
		}

		public int getLikes() {
			return likes;
		}

		public void setLikes(int likes) {
			this.likes = likes;
		}

		@Override
		public String toString() {
			return "Contenido [titulo=" + titulo + ", descripcion=" + descripcion + ", fecha=" + fecha + ", likes="
					+ likes + "]";
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Contenido other = (Contenido) obj;
			return Objects.equals(descripcion, other.descripcion) && Objects.equals(fecha, other.fecha)
					&& likes == other.likes && Objects.equals(titulo, other.titulo);
		}
		
}
