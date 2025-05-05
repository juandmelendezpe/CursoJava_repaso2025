package Daw2.Repaso_Curso_Java2025.Ejercicio_Ficheros;

import java.io.Serializable;

public class Frutas implements Serializable {
	
    private static final long serialVersionUID = 1L; 

	
	
	private String nombre;
	private int cantidad;
	private double precio;
	
	public Frutas() {
		
	}

	public Frutas(String nombre, int cantidad, double precio) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
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
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Frutas [nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}
	
	

}
