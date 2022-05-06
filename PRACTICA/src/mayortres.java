import java.util.Scanner;

public class mayortres {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner lector = new Scanner(System.in); 
		
		System.out.print("Ingresa el numero : ");
		
		a = lector.nextInt();
		
		System.out.print("Ingresa el numero  : ");
		
		b = lector.nextInt();
		
		System.out.print("Ingresa el numero  : ");
		
		c = lector.nextInt();
		
		 if (a > b) {
	            if (a > c) {
	                System.out.println("El mayor es: " + a);
	                }
	            else {
	                System.out.println("el mayor es: " + c);
	            }
	        } 
		   else if (b > c) {
			   System.out.println("el mayor es: " + b);
	        }
	          

				else {
	        	
				System.out.println("el mayor es: " + c);
	        }

	}

	

}
