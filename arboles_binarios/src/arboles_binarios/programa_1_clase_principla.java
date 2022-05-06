package arboles_binarios;

public class programa_1_clase_principla {

	public static void main(String[] args) {
		
nodo_1 root = new nodo_1(8);
		 root.add(13);
		 root.add(21);
		 root.add(32);
		 System.out.println("Mostrando el contenido del arbol:");
		 root.printInOrder();
		 }
		}