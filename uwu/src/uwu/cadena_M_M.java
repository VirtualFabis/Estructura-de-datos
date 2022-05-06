package uwu;

import java.util.Scanner;

public class cadena_M_M {

	public static void main(String[] args) {
		
		
		String cadena ;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.print("Ingresa una cadena en minuscula: ");
		
		cadena = lector.nextLine();
		
		
		System.out.println("La cadena en mayuscula: "+cadena.toUpperCase());
		
		
		System.out.print("Ingresa una cadena en mayuscula: ");
		
		cadena = lector.nextLine();
		
		System.out.println("La cadena en mayuscula: "+cadena.toLowerCase());
	
	}

}
