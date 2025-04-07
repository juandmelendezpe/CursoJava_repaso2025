package Daw2.Repaso_Curso_Java2025.Ejercicio5_2_almacenamientoColecciones;

public class ListaEnlazada implements Lista {
	
	private Nodo primero;
	private int numElements;
	
	// informacion logica ( para ver cuando se inicializa en 0)
	
	public ListaEnlazada() {
		primero =null;
		numElements = 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return primero == null;
	}

	@Override
	public int getFirst() {
		// TODO Auto-generated method stub
		if(!isEmpty()) {
			return primero.getInfo();
			
		}
		return Integer.MIN_VALUE;
	}

	@Override
	public int getLast() {
		// TODO Auto-generated method stub
		if(!isEmpty()) {
			Nodo auxiliar = primero;
			while(auxiliar.getSig() != null) {
				auxiliar = auxiliar.getSig();		
				}
			return auxiliar.getInfo();
		}
			return Integer.MIN_VALUE;
	
	}

	@Override
	public void insertAtBegin(int info) {
		
		Nodo nuevo = new Nodo(info);
		
		if(!isEmpty()) {
			nuevo.setSig(primero);
			numElements++;
		}
		primero = nuevo;
		numElements++;
		
	}

	@Override
	public void insertAtEnd(int info) {
		Nodo nuevo = new Nodo(info);
		
		if (isEmpty()) {
			primero = nuevo;
		} else {
			Nodo aux = this.primero;
			while (aux.getSig() != null) {
				aux = aux.getSig();
			}

			aux.setSig(nuevo);
		}
		numElements++;
	}
		
		

	@Override
	public void insertAtPosition(int info, int index) {
		if (index >= 0 && index <= numElements) {
			Nodo nuevo = new Nodo(info);
			// Opciones
			// Inserto al ppio
			// Inserto al final
			// Inserto en una posición concreta
			if (index == 0) {
				nuevo.setSig(primero);
				primero = nuevo;
			} else {
				Nodo aux = primero;
				if (index == numElements) {
					while (aux.getSig() != null) {
						aux = aux.getSig();
					}
				} else {
					// Recorro la lista hasta la posición indicada -1
					for (int i = 1; i < index; i++) {
						aux = aux.getSig();
					}
					nuevo.setSig(aux.getSig());
				}
				aux.setSig(nuevo);
			}
			numElements++;
		}
		
	}
	public void insertAtPosition2(int info, int index) {
		if (index >= 0 && index <= numElements) {
			Nodo nuevo = new Nodo(info);
			// Opciones
			// Inserto al ppio
			// Inserto en otras posiciones
			if (index == 0) {
				nuevo.setSig(primero);
				primero = nuevo;
			} else {
				Nodo aux = primero;
				for (int i = 1; i < index; i++) {
					aux = aux.getSig();
				}
				nuevo.setSig(aux.getSig());
				aux.setSig(nuevo);
			}
			numElements++;
		}
	}

	@Override
	public boolean containsInfo(int info) {
		boolean resultado = false;
		if (!isEmpty()) {
			Nodo aux = primero;
			while (aux != null) {
				if (aux.getInfo().equals(info)) {
					resultado = true;
					break;
				}
				aux = aux.getSig();
			}
		}
		return resultado;
	}

	@Override
	public int getElementAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean removeByInfo(int info) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAt(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void print() {
		if (isEmpty()) {
			System.out.println("La lista está vacía!!");
		} else {
			Nodo aux = primero;

			while (aux != null) {
				System.out.println(aux.getInfo());
				aux = aux.getSig();
			}
		}

		System.out.println();
		
	}

	@Override
	public boolean clearList() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
