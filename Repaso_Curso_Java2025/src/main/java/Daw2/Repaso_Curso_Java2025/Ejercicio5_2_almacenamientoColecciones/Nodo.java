package Daw2.Repaso_Curso_Java2025.Ejercicio5_2_almacenamientoColecciones;

import java.util.Objects;

public class Nodo {


	private int info;
	private Nodo sig;
	private int tam;
	private Nodo ant;
	
	public Nodo getSig() {
		return sig;
	}

	public void setSig(Nodo sig) {
		this.sig = sig;
	}

	
	public Nodo getAnt() {
		return ant;
	}

	public void setAnt(Nodo ant) {
		this.ant = ant;
	}

	
	public Nodo(int info) {
		this.info = info;
	}
	
	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(ant, info, sig, tam);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nodo other = (Nodo) obj;
		return Objects.equals(ant, other.ant) && info == other.info && Objects.equals(sig, other.sig)
				&& tam == other.tam;
	}

	@Override
	public String toString() {
		return "Nodo [info=" + info + ", tam=" + tam + ", ant=" + ant + ", sig=" + sig + "]";
	}
	

}
