package arreglos;

import java.util.Scanner;

public class programa2 {

public static void main(String[] args) {
		
		try (
		Scanner t = new Scanner(System.in)) {
			int tama�o;
			System.out.print("Inserte el tama�o del arreglo: ");
			tama�o=t.nextInt();
			
			int arreglo[]=new int[tama�o];
			
			for (int i=0; i<tama�o; i++) {
				
				arreglo[i]=(int) (Math.random() *9+0);
				System.out.println("�ndice[" +(i+1)+ "]= " + arreglo[i]);
			}
		}
}
}