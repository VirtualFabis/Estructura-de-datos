import java.util.Scanner;

public class mayorigualfor {

	public static void main(String[] args) {
		
		int i;
		
		  for( i=1;i<=3;i++) { 
			  
			  int a ,b; 
				
				Scanner lector = new Scanner(System.in); 
			
				System.out.print("Ingresa el numero : ");
				
				a = lector.nextInt();
				
				System.out.print("Ingresa el numero  : ");
				
				b = lector.nextInt();
				
				if (a <b) {
					
					System.out.println("el numero mayor es "+ b);	
					System.out.println("el numero menor "+ a);	
					
				}
				
				else if (a == b) {
					
					System.out.println("los numeros iguales  ");	
					
				}
				
				
				else if (a > b){
					System.out.println("el numero mayor es "+ a);	
					System.out.println("el numero menor "+ b);	
					
				}
			  
			  
			  
		  }
		
		
	}

}
