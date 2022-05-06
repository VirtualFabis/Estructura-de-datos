package arboles_binarios;

import java.util.Scanner;

public class programa_1_sh2 {
	static int desicion = 0;
	 public static void main(String[] args) {
	 nodo_sh2 root = new nodo_sh2(10);
	
	 root.add(2);
	 root.add(12);
	 root.add(6);
	 root.add(10);
	 root.add(14);
	 root.add(18);
	 System.out.println("Mostrando el contenido del árbol original:");
	 root.printPreOrder();
	 do {
	 System.out.println("¿Qué quieres hacer?");
	 System.out.println("1. Agregar");
	 System.out.println("2. Eliminar");
	 System.out.println("3. Salir");

	 Scanner sc= new Scanner(System.in);

	 desicion=sc.nextInt();


	 switch (desicion) {
	case 1:
	System.out.println("Inserte el nuevo número: ");
	root.add(sc.nextInt());
	System.out.println("Mostrando el contenido del árbol modificado");
	 root.printPreOrder();
	break;
	case 2:
	
	System.out.println("Inserte el número a eliminar: ");
	root.delete(sc.nextInt());
	System.out.println("Mostrando el contenido del árbol modificado");
	 root.printInOrder();
	break;
	}
	 }while(desicion!=3);
	 }
	

}
