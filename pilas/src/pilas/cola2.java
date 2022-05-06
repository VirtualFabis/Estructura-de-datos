package pilas;
import java.util.LinkedList;
public class cola2 {
	
	    public static void main(String[] args) {        
	        LinkedList cola=new LinkedList();//Usamos LinkedList
	        
	        	//Insertando datos a la cola 
	            cola.offer(3);
	            cola.add(14);
	            cola.offer(12);
	            cola.add(7);
	            cola.offer(10);
	            cola.add(10.5);
	            cola.add("cadena");
	            
	            
	        System.out.println("Mostrando valores de la cola oquela: " + cola);
	        
	      
	    }
	}

