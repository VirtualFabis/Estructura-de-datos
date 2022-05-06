package uwu;

import java.util.Scanner;

public class programa_4 {

	public static void main(String[] args) {
	
		String cadena ;
		
		Scanner lector = new Scanner(System.in);
			
			System.out.print("Ingresa una cadena : ");
			
			cadena = lector.nextLine();
			
			String sSubCadena = cadena.substring(5,10);
			System.out.println(sSubCadena);
		    }
		    
		}
	

