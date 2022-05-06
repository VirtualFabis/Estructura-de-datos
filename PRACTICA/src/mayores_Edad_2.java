import java.util.Scanner;

public class mayores_Edad_2 {


		public static void main(String[] args) {
			String c;
			
			int a;
			
			Scanner t =new Scanner( System.in );
			
			System.out.print("introduce tu nombre completo: ");

			c = t.nextLine();
			
			System.out.print("introduce tu edad : ");

			a = t.nextInt();
			
			
			if (a>=60){
				
				System.out.print(c + "Eres adulto mayor  ");
			
			}
			
			else if (a>=18){
				
				System.out.print(c + "Eres adulto   ");
				
			}
			
			
			else {
				
				System.out.print(c + "eres menor de edad ");
			}

		
		}
}
