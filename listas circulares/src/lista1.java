
	import javax.swing.JOptionPane;
	public class lista1 {
	 nodo ultimo;
	 public lista1 () {
	 ultimo=null;

	 }
	 //Metodo para ver si la lista esta vacia
	 public boolean estaVacia () {
	 return ultimo==null;
	 }

	 //Metodo para insertar en la lista
	 public lista1 insertar (int elemento) {
	 nodo nuevo=new nodo(elemento);
	 if (ultimo!=null) {
	 nuevo.siguiente=ultimo.siguiente;
	 ultimo.siguiente=nuevo;
	 }
	 ultimo=nuevo;
	 return this;

	 }
	 //Metodo para mostar  la lista
	 public void mostrarLista() {
	 nodo auxiliar=ultimo.siguiente;
	 String cadena="";
	 do {
	 cadena=cadena + "["+auxiliar.dato+"]->";
	 auxiliar=auxiliar.siguiente;
	 }while(auxiliar!=ultimo.siguiente);
	 JOptionPane.showMessageDialog(null, cadena, "Mostrando la listaCircular",
	JOptionPane.INFORMATION_MESSAGE);
	 }
	 
	 //Metodo para eliminar un elemento en la lista
	public boolean eliminar(int elemento) {
	 nodo actual;
	 boolean encontrado=false;
	 actual=ultimo;
	 while(actual.siguiente!=ultimo && !encontrado) {
	 encontrado=(actual.siguiente.dato==elemento);
	 if (!encontrado ) {
	 actual=actual.siguiente;
	 }
	 }
	encontrado=(actual.siguiente.dato==elemento);
	if (encontrado) {
	nodo auxiliar=actual.siguiente;
	if(ultimo==ultimo.siguiente) {
	ultimo=null;
	}else {
	if(auxiliar==ultimo) {
	ultimo=actual;
	}
	actual.siguiente=auxiliar.siguiente;
	}
	auxiliar=null;
	}
	 return encontrado==true;
	 }
	}
	