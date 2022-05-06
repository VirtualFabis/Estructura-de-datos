package lista_sh_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class cola1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> cola =  new LinkedList();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa 5 números:");
		
		for (int i = 0; i < 5; i++) {
			cola.add(input.nextInt());
		}
		
		System.out.println("¿Qué elemento deseas eliminar?");
		
		cola.remove(input.nextInt());
		
		System.out.println("Mostrando Cola");
		System.out.println(cola);

	}

}