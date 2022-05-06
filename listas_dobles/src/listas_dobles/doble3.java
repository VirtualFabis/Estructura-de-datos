package listas_dobles;

import java.util.Scanner;
public class doble3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doble3 n = new doble3();
		n.comparacion();
	
		
        
	}
	public void comparacion() {
	
		Scanner sc = new Scanner(System.in);
		doble a = new doble();
		doble b = new doble();
		
		System.out.println("Inserte 3 numeros para la lista 1: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		a.insertar (1, x);
        a.insertar (2, y);
        a.insertar (3, z);
    	System.out.println("Inserte 3 numeros para la lista 2: ");
		int f = sc.nextInt();
		int g = sc.nextInt();
		int h = sc.nextInt();
		b.insertar (1, f);
        b.insertar (2, g);
        b.insertar (3, h);
        if(a.cantidad()==b.cantidad()) {
        if (x==f && y==g && z==h) {
        	System.out.println("Las listas Son iguales");
        	System.out.println("Lista 1");
        	a.imprimir();
        	
        	System.out.println("Lista 2");
        	b.imprimir();
        	
        }else {
        	System.out.println("Las listas son diferentes");
        }
        }else {
        	System.out.println("Las listas son diferentes por su cantida de datos");
        }
	}

}