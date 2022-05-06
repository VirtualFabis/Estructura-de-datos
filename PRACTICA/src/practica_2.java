import java.util.Scanner;

public class practica_2 {

	public static void main(String[] args) {
		
		float  a,b,o  ;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.print("Ingresa el divisor : ");
		
		a = lector.nextFloat();
		
		System.out.print("Ingresa dividendo  : ");
		
		b = lector.nextFloat();
		
		if (a == 0) {
			
			
		System.out.print("Error ");	
		
		}
		
		else   {
			
		o = b/a;
		
		System.out.print("EL REULTADO ES: " + o );
		
		}
		
		
		
	}

	

}
