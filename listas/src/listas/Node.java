package listas;

public class Node {
	
	public int dato;
	public Node siguiente;
	public Node (int d) {
		this.dato=d;
	}
	public Node(int d, Node n) {
		dato=d;
		siguiente=n;
		
	}
}
