import java.util.Scanner;

public class owo {

	public static void main(String[] args) {
		
		String cadena ;
	
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingresa la palabra  : ");
		
		cadena = lector.nextLine();
		
		StringBuilder stringBuilder = new StringBuilder(cadena);
		
		String invertida = stringBuilder.reverse().toString();
		
		
		
		System.out.println(invertida);
		
	}
		 
	
}









