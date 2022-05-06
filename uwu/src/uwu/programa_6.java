package uwu;

import java.util.Scanner;

public class programa_6 {

	public static void main(String[] args) {
	


				String c1, c2;
				Scanner teclado = new Scanner ( System.in );
				
				
				
				System.out.print("Ingrese su primera cadena: ");
				c1 = teclado.nextLine();
				
				System.out.print("Ingrese su segunda cadena: ");
				c2 = teclado.nextLine();
				
				if(c1.equals(c2))
				{
					System.out.println("Las cadenas son iguales  ");
				}
				
				else 
				System.out.println("Las cadenas no son iguales ");
				

			}

		}
	

