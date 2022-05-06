import java.util.Scanner;

public class divicionfor {

	public static void main(String[] args) {
		int i;
		
		  for( i=1;i<=2;i++) { 
			  
			  float  a,b,o  ;
				
				Scanner lector = new Scanner(System.in);
				
				System.out.println("Ingresa el divisor : ");
				
				a = lector.nextFloat();
				
				System.out.println("Ingresa dividendo  : ");
				
				b = lector.nextFloat();
				
				if (a == 0) {
					
					
				System.out.println("Error ");	
				
				}
				
				else   {
					
				o = b/a;
				
				System.out.println("EL REULTADO ES: " + o );
				
				}
			  
			  
			  
			  
		  }

	}

}
