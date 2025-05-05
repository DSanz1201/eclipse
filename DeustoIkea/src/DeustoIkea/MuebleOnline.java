package DeustoIkea;

import java.util.Objects;

public class MuebleOnline extends Mueble {
	private String url;

	public MuebleOnline(int codigo, String nombre, String categoria, double precio, String url) {
		super(codigo, nombre, categoria, precio);
		this.url = url;
	}
	
	public MuebleOnline() {
		super();
		this.url = "Sin especificar";
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	

	@Override
	public String toString() {
		return "MuebleOnline [codigo=" + codigo + ", nombre=" + nombre + ", categoria=" + categoria
				+ ", precio=" + precio + ", url=" + url + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(url);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		MuebleOnline other = (MuebleOnline) obj;
		return Objects.equals(url, other.url);
	}

}
