package surf;

public class Usuario {

	private String nombre;
	private String dni;
	private String telefono;
	private int edad;
	
	public Usuario() {
		super();
		this.nombre = "UsuarioX";
		this.dni = "000000000A";
		this.telefono = "111111111";
		this.edad = 16;
	}
	public Usuario(String nombre, String dni, String telefono, int edad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + ", edad=" + edad + "]";
	}
	
}
