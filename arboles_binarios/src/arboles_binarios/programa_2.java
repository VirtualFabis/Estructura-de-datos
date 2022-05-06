package arboles_binarios;

import java.util.Scanner;

public class programa_2 {

	 public static void main(String[] args) {
		 
	 System.out.println("Inserte el número del nodo:");
	 Scanner sc = new Scanner(System.in);
	 nodo_2 root = new nodo_2(sc.nextInt());
	 for (int i = 1; i < 4; i++) {
	
	 System.out.println("Inserte un Numero:");
	 root.add(sc.nextInt());
	}
	 System.out.println("Mostrando el contenido del arbol:");
	 root.printInOrder();
	 }
	}

