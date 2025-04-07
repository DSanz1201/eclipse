package DesutoTrain;

public interface Reservable {
	public boolean reservar(Ocupante pasajero);
	public boolean anular(Ocupante pasajero);
}
