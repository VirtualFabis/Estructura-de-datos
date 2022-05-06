package arboles_binarios;

import java.util.Optional;

public class programa1_sh3 {

	 public static void main(String[] args) {
		 nodo_sh3 root = new nodo_sh3(12);
		 root.add(43);
		 root.add(65);
		 root.add(90);
		 root.add(100);
		 root.add(76);
		 root.add(373);
		 Optional<nodo_sh3> result = root.find(2000);
		 if (result.isPresent()) {
		 System.out.println(result.get());
		 } else {
		 System.out.println("Mostrando:");
		 }
		 System.out.println("INORDEN:");
		 root.printInOrder();
		 System.out.println("POSTORDEN");
		 root.printPosOrder();
		 System.out.println("PREORDEN");
		 root.printPreOrder();
		 }
		}

