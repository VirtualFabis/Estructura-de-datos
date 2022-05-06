package pilas;

public class pila2_clase_principal {


		 public static void main(String[] args) {
		  pila2 pila = new pila2();
		  
		  //Insertando datos a la pila
		  pila.push(10);
		  pila.push(20);
		  pila.push(30);
		  
		  //Mostrando los datos de la pila
		  System.out.println("Mostrando los datos de la pila:");
		  System.out.println(pila.pop());
		  System.out.println(pila.pop());
		  System.out.println(pila.pop());
		  
		

		  

		 }

		
}
