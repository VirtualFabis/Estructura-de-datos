import java.util.Scanner;

public class Mayores_edad_for_2 {

	public static void main(String[] args) {
		int i;
		
		  for( i=1;i<=5;i++) { 
			  
			  String c;
				
				int a;
				
				Scanner t =new Scanner( System.in );
				
				System.out.print("introduce tu nombre completo: ");

				c = t.nextLine();
				
				System.out.print("introduce tu edad : ");

				a = t.nextInt();
				
				
				if (a>=60){
					
					System.out.println(c + " "+ "Eres adulto mayor  ");
				
				}
				
				else if (a>=18){
					
					System.out.println(c + " "+ "Eres adulto    ");
					
				}
				
				
				else {
					
					System.out.println(c +" "+ "eres menor de edad ");
				}
			  
			  
			  
		  }
	}

}
