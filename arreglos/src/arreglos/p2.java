package arreglos;

import java.util.Scanner;

public class p2 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			int numero, i= 0, resultado=0;
			 System.out.print("Inserte el numero: ");
			 numero=teclado.nextInt();
	
			 int num2=numero;
			
			 while (num2 != 0) {
			 resultado=num2 % 10;
			 num2=num2 / 10;
			 i=i * 10 + resultado;
			 }
			 if (numero==i) {
			 System.out.println("El numero "+ numero +" si es capicua"); 
			 } 
			 else {
			 System.out.println("El numero "+ numero +" no es capicua");
			 }
		}
	}
}
