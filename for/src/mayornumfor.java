import java.util.Scanner;

public class mayornumfor {

	public static void main(String[] args) {
		int i;
		
		  for( i=1;i<=2;i++) { 
			  
			  int a ,b; 
				
				Scanner lector = new Scanner(System.in); 
				
				System.out.print("Ingresa el numero : ");
				
				a = lector.nextInt(); 
				
				System.out.print("Ingresa el numero  : ");
				
				b = lector.nextInt();
				
				
				
				if (a>b)  	{
					
					System.out.println("el numero mayor es "+ a);	
					
				}
				
				
				
				else {
					System.out.println("el numero mayor es "+b);	
				}
			  
			  
			  
		  }
	}

}
