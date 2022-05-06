import javax.swing.JOptionPane;
public class clase_main {
public static void main(String[] args) {
	//manda a llamar ala clase lista
	lista1 lista=new lista1();
	int opcion=0, elemento;
	boolean eliminado=false;
	do {
 try {
	 //Pide la Opcion para insertar, eliminar y mostar
 opcion=
Integer.parseInt(JOptionPane.showInputDialog(null,"1.Agregar un nodo a la lista \n" 

+ "2.Eliminar un nodo de la lista\n"

+ "3.Mostrar una Lista Circular\n"

+ "4.Salir\n"

+ "¿Escoge tu proceso?", "Seleccione una opción",
JOptionPane.INFORMATION_MESSAGE));
 switch(opcion) {
 //caso para agrgagar un elemento a la lista 
 case 1:
 elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
"Ingresa el elemento del Nodo", "Agregando Nodo a la lista",
JOptionPane.INFORMATION_MESSAGE));
 lista.insertar(elemento);
 break;
 
 //caso para elimiar un elemento a la lista
 case 2:
 if(!lista.estaVacia()) {
 elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
"Ingresa el elemento del Nodo", "Agregando Nodo a la lista",
JOptionPane.INFORMATION_MESSAGE));
 eliminado=lista.eliminar(elemento);
 if(eliminado) {
 JOptionPane.showMessageDialog(null, "El elemento eliminado es: "+elemento, "Eliminando elemento", JOptionPane.INFORMATION_MESSAGE);
 }else {
 JOptionPane.showMessageDialog(null, "El elemento "+elemento+
" No está en la lista", "Elemento no encontrado",
JOptionPane.INFORMATION_MESSAGE);
 }
 }else {
 JOptionPane.showMessageDialog(null, "Aún no hay Nodos",
"Lista vacia", JOptionPane.INFORMATION_MESSAGE);
 }
 break;
 //caso para mostrar la lista
 case 3:
 if(!lista.estaVacia()) {
 lista.mostrarLista();
 }else {
 JOptionPane.showMessageDialog(null, "Aún no hay Nodos", "Lista vacia", JOptionPane.INFORMATION_MESSAGE);
 }
 break;
 //caso para dar por finalizada la lista
 case 4:
 JOptionPane.showMessageDialog(null, "Lista finalizada",
"Saliendo", JOptionPane.INFORMATION_MESSAGE);
 break;
 default:
	 //por si la opcion que elige no existe!!
 JOptionPane.showMessageDialog(null, "La opcion no esta en el menú", "Incorrecto", JOptionPane.INFORMATION_MESSAGE);
 }
 }
 //Mensaje de error por si falla algun proceso
 catch (NumberFormatException n) {
 JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
 }
 }
 while (opcion !=4);
 }

 }