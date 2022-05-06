package uwu;

import java.util.Scanner;

public class programe_8 {

	public static int n1;
	public static int n2;
	
	
	public static void main(String[] args) {
		programe_8 llamar=new programe_8();
      	llamar.datos();
      	llamar.mostrar();
		
	}
		  public void datos() {
			  Scanner teclado = new Scanner ( System.in );
			  
		System.out.print("Ingrese el primer numero: ");
		n1 = teclado.nextInt();
		
		System.out.print("Ingrese el segundo numero: ");
		n2 = teclado.nextInt();
		
		  }
		
		  public void mostrar() {
		int resultado =  (int) Math.pow(n1, n2);
		System.out.println("El resultado de " +n1+ " por la potencia de " +n2+ " es " +resultado);
		
		  }
	}

