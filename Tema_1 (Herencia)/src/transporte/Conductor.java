package transporte;

import java.util.Objects;
import java.util.Random;
import java.time.LocalDate;

public class Conductor {
	private String nombre;
	private String codigo;
	private int anyoPermiso;
	private boolean permisoTaxi;
	private boolean permisoBus; //No-static --> Son propios de cada objeto/instancia que se crea de esa clase
	private static int contador = 1; //Static --> Unico para todos los objetos de la clase (Atributo de la clase)
	
	public Conductor(String nombre, int anyoPermiso, boolean permisoTaxi, boolean permisoBus) {
		super();
		this.nombre = nombre;
		this.anyoPermiso = anyoPermiso;
		this.permisoTaxi = permisoTaxi;
		this.permisoBus = permisoBus;
		codigo = "Cod-con-" + contador;
		contador++;
	}
	
	public Conductor() {
		super();
		this.nombre = "Sin especificar";
		
		Random random = new Random();
		
		int temp = LocalDate.now().getYear() - 2000;
		
		this.anyoPermiso = random.nextInt(temp + 1) + 2000;
		
		this.permisoTaxi = random.nextBoolean();
		
		if(permisoTaxi == false) {
			this.permisoBus = true;
		} else {
			this.permisoBus = random.nextBoolean();
		}
		
		codigo = "Cod-con-" + contador;
		contador++;
	}
	
	public boolean isPermisoTaxi() {
		return permisoTaxi;
	}

	public void setPermisoTaxi(boolean permisoTaxi) {
		this.permisoTaxi = permisoTaxi;
	}

	public boolean isPermisoBus() {
		return permisoBus;
	}

	public void setPermisoBus(boolean permisoBus) {
		this.permisoBus = permisoBus;
	}

	public String getNombre() {
		return nombre;
	}

	public int getAnyoPermiso() {
		return anyoPermiso;
	}

	@Override
	public String toString() {
		return "Conductor [nombre=" + nombre + ", anyoPermiso=" + anyoPermiso + ", permisoTaxi=" + permisoTaxi
				+ ", permisoBus=" + permisoBus + ", codigo=" + codigo + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conductor other = (Conductor) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
	
	
}
