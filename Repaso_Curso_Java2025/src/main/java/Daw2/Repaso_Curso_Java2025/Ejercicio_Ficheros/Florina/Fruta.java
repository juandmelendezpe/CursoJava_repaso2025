
package Daw2.Repaso_Curso_Java2025.Ejercicio_Ficheros.Florina;

import java.util.Objects;

public class Fruta {
	
	private String nombre;
	private int cantidad;
	private double precio;
	private int numApariciones;
	
	public Fruta(String nombre, int cantidad, double precio) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.numApariciones = 1;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio/numApariciones;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public int getNumApariciones() {
		return numApariciones;
	}
	
	public void acumular(int cantidad, double d) {
		this.cantidad += cantidad;
		this.precio += d;
		numApariciones++;
	}
	
	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cantidad, nombre, precio);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruta other = (Fruta) obj;
		return cantidad == other.cantidad && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}


}
