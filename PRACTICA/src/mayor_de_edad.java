import java.util.Scanner;

public class mayor_de_edad {

	public static void main(String[] args) {
	String c;
		
		int a;
		
		Scanner teclado =new Scanner( System.in );
		
		System.out.print("introduce tu nombre completo: ");

		c = teclado.nextLine();
		
		System.out.print("introduce tu edad : ");

		a = teclado.nextInt();
		
		
		if (a>=18){
			
			System.out.print(c + " " +"Eres mayor edad ");
		
		}
		
		
		
		else {
			
			System.out.print(c +  " " +"eres menor de edad ");
		}
		

	}

}
