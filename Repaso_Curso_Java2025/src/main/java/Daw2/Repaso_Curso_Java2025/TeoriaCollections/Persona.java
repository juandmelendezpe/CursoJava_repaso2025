package Daw2.Repaso_Curso_Java2025.TeoriaCollections;

public class Persona {
	private String nombre;
	private double sueldo;
	
	public Persona(String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}
	@Override
	public int hashCode() {
		return nombre.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Persona other = (Persona) obj;
		return nombre.equals(other.nombre);
	}

}
