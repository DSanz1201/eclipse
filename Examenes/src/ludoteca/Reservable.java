package ludoteca;

public interface Reservable {
	public boolean Reservar(Usuario usuario);
	
	public boolean Anular(Usuario usuario);
}
