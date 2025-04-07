package Daw2.Repaso_Curso_Java2025.Ejercicio5_2_almacenamientoColecciones;

public class Nodo2<T> {
	private Nodo2<T> sig;
	private T info;
 
	public Nodo2(T info) {
		this.info = info;
		this.sig = null;
	}
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	public Nodo2<T> getSig() {
		return sig;
	}
	public void setSig(Nodo2<T> sig) {
		this.sig = sig;
	}
	@Override
	public String toString() {
		return info.toString();
	}
	

}
