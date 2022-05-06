package pilas;
import java.util.LinkedList;
import java.util.Queue;
public class cola1 {

    public static void main(String[] args) {
        //Creamos la Cola Indicando el tipo de dato
        Queue<Integer> cola=new LinkedList();
        //Insertamos datos
            cola.offer(3);
            cola.add(14);
            cola.offer(12);
            cola.add(7);
            cola.offer(10);
            cola.add(820);
        //Impresion de la Cola llena con los datos
        System.out.println("Mostrando los datos de la cola: " + cola);
       
    }
}


