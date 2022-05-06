package listas;

public class lista {
	protected Node inicio,fin;
	
	public lista() {
		inicio = null;
		fin = null;
	}
	
	public void agregarAlinicio(int elemento) {
		inicio = new Node(elemento,inicio);
		if (fin ==null) {
			fin=inicio;
		}
	}
	
	public void mostrarlista() {
		Node recorrer=inicio;
		System.out.println();
		while(recorrer != null) {
			System.out.print("["+recorrer.dato+"]--->");
			recorrer=recorrer.siguiente;
		}
	}

}

