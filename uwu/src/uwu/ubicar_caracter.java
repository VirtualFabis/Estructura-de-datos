package uwu;

import java.util.Scanner;

public class ubicar_caracter {

	public static void main(String[] args) {
		
		String cadena, a ;
	
	
	Scanner lector = new Scanner(System.in);
		
		System.out.print("Ingresa una cadena : ");
		
		cadena = lector.nextLine();
		
		System.out.print("Ingresa la letra que quieres saber la posicion : ");
		
		a = lector.nextLine();
	
	
		
		System.out.println("La posicion de la letra es: "+cadena.indexOf(a));

	}

	}

	


