package arreglos;

import java.util.Scanner;

public class p10 {

	public static void main(String[] args) {
		Scanner vec = new Scanner(System.in);
		System.out.print("Inserta el tamaño  de filas: ");
		int f= vec.nextInt();
		System.out.print("Inserta el tamaño de Columnas: ");
		int c= vec.nextInt();
		int [][] matriz = new int [f][c];
		
		for (int x=0; x < matriz.length; x++) {
			  for (int y=0; y < matriz[x].length; y++) {
			    System.out.print("Introduzca el elemento [" + x + "," + y + "]: ");
			    matriz[x][y] = vec.nextInt();
			  }
			}
		int mayor,menor;
		mayor = menor = matriz[0][0];
	int f1=0,c1=0,m=0,l=0;
		for (int x=0; x < matriz.length; x++) {
			 
			  for (int y=0; y < matriz[x].length; y++) {
				  
			   if(matriz[x][y]> mayor) {
				   mayor =matriz[x][y];
				  
				   f1=x;
				   c1=y;
				  
				   
			   }
			   if(matriz[x][y]< menor) {
				   menor =matriz[x][y];
				   m=x;
				   l=y;
			   }
			   
			}}
		
		int k=1;
		for (int x=0; x < matriz.length; x++) {
			  for (int y=0; y < matriz[x].length; y++) {
			    System.out.println (k++ +" [" + x + "," + y + "] = " + matriz[x][y]);
			  }
			}
		
		
		System.out.println("El numero mayor es:"+mayor+ " posicion " +"["+f1+"]"+"["+c1+"]");
		System.out.println("El numero menor es:"+menor+" posicion " +"["+m+"]"+"["+l+"]");


	}
	}


