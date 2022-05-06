package uwu;

import java.util.Scanner;

public class programa_5 {

	public static void main(String[] args) {
		String v1;
		double v2;
		int v3; 

		try (Scanner teclado = new Scanner ( System.in )) {
			
		System.out.print("Inserte un dato tipo string: ");
		
		v1 = teclado.nextLine();
		
		v3 = Integer.parseInt(v1);
		
		System.out.println("Su dato string a entero es: "+ v3);
		
		v2 = Double.parseDouble(v1); 
		
		System.out.println("Su dato string a double es: "+ v2);

	}
	}
}
