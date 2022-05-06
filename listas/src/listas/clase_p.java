package listas;

import java.util.Scanner;

public class clase_p {

	public static void main(String[] args) {
		
		lista listita=new lista();
		int o=0,elemento;
		Scanner sc = new Scanner(System.in);

		do {
			try {
				System.out.println("");
			System.out.println("1.Agregar \n2.Mostrar elementos\n3.Salir");
			
			System.out.print("Ingresa la opción que desees: ");
			o = sc.nextInt();
			
				switch(o) {
				case 1:
					try {
						System.out.print("Ingresa el elemento a la lista: ");
						elemento = sc.nextInt();
						listita.agregarAlinicio(elemento);
					}catch(NumberFormatException n) {
						System.out.println("Error"+n.getMessage());
						
					}
				break;
				case 2:
					listita.mostrarlista();
				break;
				case 3:
					break;
				default:
					System.out.println( "Opcion Incorrecta");
					
				}
				
			}catch(Exception e) {
				System.out.println( "Error"+e.getMessage());
				
			}
			
		}
		
		while (o!=3);	
		

	}

}
