import java.util.Scanner;

public class cifras {

	public static void main(String[] args) {
		
		int a;
		
		Scanner l = new Scanner (System.in);
		
		System.out.print("INGRESA UN NUMERO: ");
		
		a =l.nextInt();
		
		if (a<= 9)    {
			
			System.out.print("es de una cifra ");
			
		}
		
		else if (a <= 99) {
			
			
			System.out.print("es de dos cifras ");
		}
		else if (a <= 999) {
			
			
			System.out.print("es de tres cifras ");
		}
		else if (a <= 9999) {
			
			
			System.out.print("es de cuatro cifras ");
		}
		else if (a <= 99999) {
			
			
			System.out.print("es de cinco cifras  ");
		}

		else {
			 
			System.out.print("es mas de cinco cifras  ");
			
		}
		
		
		
		
		
		
		

	}

}
