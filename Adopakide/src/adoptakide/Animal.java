package adoptakide;

import java.util.Objects;

public class Animal implements Comparable<Animal>{
    private String nombre;
    private Especie especie;
    private int edad;
    private String chip;
    private boolean necesidadesEspeciales;

    public Animal(String nombre, Especie especie, int edad, String chip, boolean necesidadesEspeciales) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.chip = chip;
        this.necesidadesEspeciales = necesidadesEspeciales;
    }

    public String getNombre() { return nombre; }
    public Especie getEspecie() { return especie; }
    public int getEdad() { return edad; }
    public String getChip() { return chip; }
    public boolean tieneNecesidadesEspeciales() { return necesidadesEspeciales; }

    @Override
    public String toString() {
        return nombre + " (" + especie + ", " + edad + " años, chip " + chip + ")";
    }

	@Override
	public int compareTo(Animal o) {
		// TODO Auto-generated method stub
		return this.chip.compareTo(o.chip);
	}
    
}
