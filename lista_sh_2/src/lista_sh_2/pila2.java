package lista_sh_2;
import java.util.Stack;
import java.util.EmptyStackException;
import java.util.Scanner;

public class pila2 {

		public static void main(String[] args) {
		Stack<String> pila = new Stack<String>();
		 Stack<String> pil = new Stack<String>();
		 Scanner a = new Scanner(System.in);

		 for(int i = 0; i<=9; i++) {
		 System.out.println("Inserta 10 letras:");
		 String s = a.nextLine();
		 pila.add(s);

		 }
		 System.out.println("" + pila);
		 System.out.println("Palabra que Desea formar:");
		 String b = a.nextLine();
		 String cadena = b;
		 for (int i = 0; i < cadena.length(); i++){
		 char letra = cadena.charAt(i);
		 String let =String.valueOf(letra);
		 pil.add(let);
		 //Tratamiento del caracter
		 int q=i+1;
		 System.out.println(q +" letra que conjunción");
		 System.out.println("" + pil); }

	}

}