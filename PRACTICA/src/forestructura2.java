import java.util.Scanner;

public class forestructura2 {

	public static void main(String[] args) {
		int i;
		
		  for( i=1;i<=5;i++) { 
			  
		
			  int a;
				
				Scanner l = new Scanner (System.in);
				
				System.out.println("INGRESA UN NUMERO: ");
				
				a =l.nextInt();
				
				if (a<= 9)    {
					
					System.out.println("Es de una cifra ");
					
				}
				
				else if (a <= 99) {
					
					
					System.out.println("Es de dos cifras ");
				}
				else if (a <= 999) {
					
					
					System.out.println("Es de tres cifras ");
				}
				else if (a <= 9999) {
					
					
					System.out.println("Es de cuatro cifras ");
				}
				else if (a <= 99999) {
					
					
					System.out.println("Es de cinco cifras  ");
				}

				else {
					 
					System.out.println("Es mas de cinco cifras  ");
					
				}
		  }

	}

}
