package lista_sh_2;

import java.util.Scanner;

public class main_pila1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         pila1 obj=new pila1();
         Scanner op=new Scanner(System.in);
         int opcion;
         do {
        	 System.out.println("Menú de la pila");
        	 System.out.println("1.Inserta elementos(push): ");
        	 System.out.println("2.Eliminar  un elemento (pop): ");
        	 System.out.println("3.Mostrar la Pila: ");
        	 System.out.println("4.Salir");
        	 System.out.print("Ingresa una opción:");
        	 opcion=op.nextInt();
        	 
        	 switch(opcion) {
        	 case 1:
        		 obj.push();
        		 break;
        	 case 2:
        		 obj.pop();
        		 break;
        	 case 3:
        		 obj.mostrarPila();
        		 break;
        	 case 4:
        		 break;
        	 default:
        		 System.out.println("\nIngrese una opción válida");
        			 
        	 }
         }while (opcion!=4);
         }

}