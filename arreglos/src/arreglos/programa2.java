package arreglos;

import java.util.Scanner;

public class programa2 {

public static void main(String[] args) {
		
		try (
		Scanner t = new Scanner(System.in)) {
			int tamaño;
			System.out.print("Inserte el tamaño del arreglo: ");
			tamaño=t.nextInt();
			
			int arreglo[]=new int[tamaño];
			
			for (int i=0; i<tamaño; i++) {
				
				arreglo[i]=(int) (Math.random() *9+0);
				System.out.println("índice[" +(i+1)+ "]= " + arreglo[i]);
			}
		}
}
}