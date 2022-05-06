package pilas;

import java.util.Stack;

public class pila1 {
 
    public static void main(String[] args) {
 
    	//Creando Pila
        Stack pila =new Stack();
 
        //	Insertando valores a la pila
        pila.push("elemento 1");
        pila.push("elemento 2");
        pila.push("elemento 3");
 
        
       //Mostrando pila
        System.out.println("Mostar los datos de la pila: "+ pila);
 
    
    }
}