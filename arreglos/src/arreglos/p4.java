package arreglos;

import java.util.Scanner;

public class p4 {

	public static void main(String[] args) {
		 try (Scanner teclado = new Scanner(System.in)) {
			String palabra;
			 int con=0;
			 int vocal=0;
			 int totalcon;
			 int letras=0;
			 System.out.println("Esciba una palabra: ");
			 palabra=teclado.nextLine();
			 for(int j=0; j<palabra.length(); j++) {
			 if(palabra.charAt(j) != (char)32)
			 letras++;
			 }
			 for (int j=0; j<palabra.length(); j++) {
			 con ++;
			 }
			 for (int j=0; j<palabra.length(); j++) {
			 if(
			 (palabra.charAt(j) == 'a') || (palabra.charAt(j) == 'A')||
			 (palabra.charAt(j) == 'e') || (palabra.charAt(j) == 'E')||
			 (palabra.charAt(j) == 'i') || (palabra.charAt(j) == 'I')||
			 (palabra.charAt(j) == 'o') || (palabra.charAt(j) == 'O')||
			 (palabra.charAt(j) == 'u') || (palabra.charAt(j) == 'U')) {
			 vocal++;
			 } 
			 }
			 totalcon=con-vocal;
			 System.out.println("La palabra " + palabra + " tiene: " + letras + " letras ");
			 System.out.println("La palabra " + palabra + " tiene: " + vocal + " vocales ");
			 System.out.println("La palabra " + palabra + " tiene: " + totalcon + " consonantes ");
}
}
}