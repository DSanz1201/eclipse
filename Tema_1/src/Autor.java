import java.util.Objects;

public class Autor {
	private String nombre;
	private String apellidos;
	private int anyoNcto;
	private String lugarNcto;
	private String bio;
	
	public Autor() {
		super();
		this.nombre = "Nombre autor";
		this.apellidos = "Apellidos autor";
		this.anyoNcto = 1900;
		this.lugarNcto = "Madrid";
		this.bio = "Bio autor";
	}
	
	public Autor(String nombre, String apellidos, int anyoNcto, String lugarNcto, String bio) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.anyoNcto = anyoNcto;
		this.lugarNcto = lugarNcto;
		this.bio = bio;
	}

	public Autor(Autor r) {
		this.nombre = r.nombre;
		this.apellidos = r.apellidos;
		this.anyoNcto = r.anyoNcto;
		this.lugarNcto = r.lugarNcto;
		this.bio = r.bio;
		
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getAnyoNcto() {
		return anyoNcto;
	}

	public void setAnyoNcto(int anyoNcto) {
		this.anyoNcto = anyoNcto;
	}

	public String getLugarNcto() {
		return lugarNcto;
	}

	public void setLugarNcto(String lugarNcto) {
		this.lugarNcto = lugarNcto;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(nombre, other.nombre);
	}
	
	
	
}
