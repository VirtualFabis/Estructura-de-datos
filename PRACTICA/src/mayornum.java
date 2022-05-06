import java.util.Scanner;

public class mayornum {

	public static void main(String[] args) {
	
		int a ,b; 
		
		Scanner lector = new Scanner(System.in); 
		
		System.out.print("Ingresa el numero : ");
		
		a = lector.nextInt(); 
		
		System.out.print("Ingresa el numero  : ");
		
		b = lector.nextInt();
		
		
		
		if (a>b)  	{
			
			System.out.print("el numero mayor es "+ a);	
			
		}
		
		
		
		else {
			System.out.print("el numero mayor es "+b);	
		}
		

	}

}
