package uwu;

import java.util.Scanner;

public class programa_7 {
	 int num;
		 	     
	    public static void main(String[] args) {
			programa_7 llamar=new programa_7();
			llamar.datos();
			llamar.mostrar();
	      
	       
	    }
	     
	    
	    public void datos() {
	    	  Scanner sc = new Scanner(System.in);
		        System.out.print("Introduce un número: ");
		         num = sc.nextInt();
		        sc.close();
	    }
	    
	    public static int factorial(int num){
	        if(num == 0){
	            return 1;
	        }
	        else
	            return num * factorial(num-1);

	    }
	    
       public void mostrar() {
    	   
    	   System.out.println("\nEl factorial de " + num + " es: " + factorial(num));
    	   
	
}
}
	

