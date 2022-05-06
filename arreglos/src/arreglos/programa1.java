package arreglos;

import java.util.Scanner;

public class programa1 {

	public static class arreglo {

		 private Scanner t;
		 
	     private int[] entero;
	 	public static void main(String[] args) {
	      	arreglo llamar=new arreglo();
	      	llamar.a();
	      	llamar.mostrar();
	      	}
	      
	     public void a() {
	     	t = new Scanner (System.in);
	     	entero=new int[10];
	     	for(int i=0; i<entero.length; i++) {
	     		System.out.print("Digite un valor para el arreglo: ");
	     		entero[i]=t.nextInt();
	     	}
		   }
	     public void mostrar() {
	     	for(int i=0; i<entero.length; i++) {
	     		System.out.print("índice["+(i)+"]= ");
	     		System.out.println(entero[i]);
	     	} 
	     }
	}   
	}