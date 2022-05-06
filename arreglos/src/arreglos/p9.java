package arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class p9 {

	public static void main(String[] args) {
		Scanner vec = new Scanner(System.in);
		int a,b;
		System.out.print("Inserte el tamaño del vector: ");
		a=vec.nextInt();
		int[] numeros = new int [a];
		for(int i=0;i< numeros.length ;i++) {
			System.out.print("Inserte un numero: " );
			b=vec.nextInt();
			numeros[i]=b;
		}
		Arrays.sort(numeros);
		for (int numero:numeros)
			  System.out.println(numero);
	}
	}


