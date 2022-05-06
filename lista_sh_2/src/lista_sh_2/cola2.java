package lista_sh_2;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class cola2 {

	
		public static void main(String[] args) {
		 //Creamos la Cola Indicando el tipo de dato
		 Queue<String> cola=new LinkedList<>();
		 Queue<String> col=new LinkedList<>();
		 Scanner a = new Scanner(System.in);
		 for(int i = 0; i<=10; i++) {
		 System.out.println("Inserta 10 letras:");
		 String s = a.nextLine();
		 cola.add(s);
		}
		 System.out.println("" + cola);
		 System.out.println("Palabra Desea formar:");
		 String b = a.nextLine();
		 String cadena = b;
		 for (int i = 0; i < cadena.length(); i++){
		 char letra = cadena.charAt(i);
		 String let =String.valueOf(letra);
		 col.add(let);
		 //Tratamiento del caracter
		 int q=i+1;
		 System.out.println(q +" letra coincidida");
		 System.out.println("" + col);
		 }

	}

}