package pilas;
public class pila2 {
	 private int[] pila;
	 private int top;
	 private int tamanioPila;
	 
	 public pila2(){
	  tamanioPila = 1;
	  top = -1;
	  pila = new int[tamanioPila];
	 }
	 
	 //las operaciones basicas de la pila
	 public void push(int dato){
	  if (top == (tamanioPila -1))
	   redimensionar();
	  pila[++top] = dato;
	 }
	 
	 public Integer pop(){
	  if(top < 0)
	   return null;
	  return pila[top--];
	 }
	 
	 private void redimensionar(){
	  int[] temp = pila;
	  tamanioPila *= 2;
	  pila = new int[tamanioPila];
	  
	  for(int i = 0; i <= top; i++)
	   pila[i] = temp[i];
	 }
	}
