package arreglos;

import java.util.Scanner;
import java.util.Arrays;

public class p8 {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			System.out.println("Inserte el tamaño de filas: ");
			int f= sc.nextInt();
			System.out.println("Inserte el tamaño de Columnas: ");
			int c= sc.nextInt();
			int [][] matriz = new int [f][c];
		
			for (int x=0; x < matriz.length; x++) {
				  for (int y=0; y < matriz[x].length; y++) {
				    System.out.println("Introduzca el elemento [" + x + "," + y + "]");
				    matriz[x][y] = sc.nextInt();
				  }
				}
			int s=0;
			int c1=1,o=0;
			int v=2,b=0;
			int j=3,k=0;
			int m=4,n=0;
			
			for(s = 0; s < 4; s++)
			{
				
				o=o+matriz[s][c1];
				b=b+matriz[s][v];
				k=k+matriz[s][j];
				n=n+matriz[s][m];
				
			}
			int g=(o+b+k+n);
			
			for (int x=0; x < matriz.length; x++) {
				  for (int y=0; y < matriz[x].length; y++) {
					  System.out.print("    "+matriz[x][y] );
				  }
				  System.out.println("");
				}
			
			System.out.println("La suma de todo menos la primera linea es: "+g);
			
		}

	}


