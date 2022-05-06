package lista_sh_2;
import java.util.Scanner;


public class pila1 {

	
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int pilaNumerica[]=new int [5];
		int tope=-1;
		//Metodo para insertar datos
		public void push() 
		{
			if (tope>=pilaNumerica.length-1) {
				System.out.println("La pila esta llena");
			}
			else 
			{
				tope+=1;
				System.out.print("Inserte dato: " );
				pilaNumerica[tope]=teclado.nextInt();
			}
		}
		//Método para eliminar datos
		public int pop() 
		{
			if(tope==-1) {
				System.out.println("La pila está vacía");
			}else {
				System.out.println("Se ha eliminado un elemento de la pila " +pilaNumerica);
				pilaNumerica[tope]=0;
			}
			return tope--;
		}
		//Método para mostrar la pila
		public void mostrarPila() 
		{
			for (int tope=4; tope>=0; tope--) {
				System.out.println("Datos de la pila: "+pilaNumerica[tope]);
			}
		}
	}
	