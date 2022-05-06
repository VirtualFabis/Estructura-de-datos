package arreglos;

import java.util.Arrays;
import java.util.Scanner;


public class p1 {

	  public static void main (String[] args) {
	        int[] arreglo;
	        arreglo = new int[5];
	        
	        arreglo[0] = 1;
	        arreglo[1] = 2;
	        arreglo[2] = 3;
	        arreglo[3] = 4;
	        arreglo[4] = 5;
	       
	 
	        for (int i = 0 ; i < arreglo.length ; i++) {
	            System.out.println("Arreglo [" + i + "] " + arreglo[i]);
	            
	        }
	 
	        System.out.println();
	 
	        int[] copia;
	        copia = Arrays.copyOf(arreglo, 5);
	 
	 
	        for (int i = 0 ; i < copia.length ; i++) {
	            System.out.println("Arreglo copia [" + i + "] " + copia[i]);
	        }
	    }
	}