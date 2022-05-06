import java.util.Scanner;

public class multipfor {

	public static void main(String[] args) {
		
		
		int i;
		
		  for( i=1;i<=1;i++) { 
			  
				int  a,b,c;
				
				Scanner lector = new Scanner(System.in);
				
				System.out.println("Ingresa el primer valor: ");
				
				a = lector.nextInt();
				
				System.out.println("Ingresa el segundo valor: ");
				
				b = lector.nextInt();
				
				c = a*b;
				
				System.out.println("EL REULTADO ES: " + c);
			  
		  }
	}

}
