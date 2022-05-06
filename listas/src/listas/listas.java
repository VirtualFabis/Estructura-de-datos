package listas;

import java.util.ArrayList;
import java.util.Scanner;
public class listas {
private ArrayList<String> listitaNumeros;

public static void main(String[] args) {
listas ln = new listas();
ln.listitaNumeros = new ArrayList();
ln.agregar();
}
public void agregar() {
Scanner sc = new Scanner(System.in);
int op=0;
do {
	System.out.println("\nLista de Numeros");
	System.out.println("\n[1] Agregar "+ " [2] Buscar Elemento");
	System.out.println("\n[3] Ordenar "+" [4] Eliminar Elemento");
	System.out.println("\n[5] Insertar "+" [6] Mostrar Elemento");
	System.out.println("\n[7] Salir");
	System.out.println("\nIngresa la Opcion que Deseas");
op = sc.nextInt();
switch(op){

case 1:
ingresarvalor();
break;
case 2:
buscarvalor();
break;
case 3:
ordenar();
break;
case 4:
eliminarvalor();
break;
case 5:
insertarvalor();
break;
case 6:
mostrarvalor();
break;
case 7:
}
}while(op!=7);
System.out.println("Usted ah finalizado la ejecucion");
}
public void ingresarvalor() {
Scanner sc = new Scanner(System.in);

String v="";
System.out.println("Ingresa un valor: ");
v = sc.nextLine();
listitaNumeros.add(v);
}
public void buscarvalor() {
Scanner sc = new Scanner(System.in);
String v="";
int indice=0;
System.out.println("Tecla un valor para buscar: ");
v = sc.nextLine();
indice = listitaNumeros.indexOf(v);
if (indice != - 1) {
System.out.println("El Dato esta en la posicion: "+indice);
}else {
System.out.println("Dato no Encontrado");
}
}
public void ordenar() {

java.util.Collections.sort(listitaNumeros);
System.out.println("Lista ordenada!! ");


}
public void eliminarvalor() {
Scanner sc = new Scanner(System.in);
String v="";
int indice=0;
System.out.println("Tecla un valor para Eliminar: ");
v = sc.nextLine();
indice = listitaNumeros.indexOf(v);
if (indice != - 1) {
listitaNumeros.remove(indice);
System.out.println("Dato Eliminado");
}else {
System.out.println("Dato no Encontrado");
}
}
public void insertarvalor() {

Scanner sc = new Scanner(System.in);
String v="";
int indice=0;
System.out.println("Tecla un valor para Insertar: ");
v = sc.nextLine();
System.out.println("Tecla un valor para la Posicion: ");
indice = sc.nextInt();
listitaNumeros.add(indice, v);
}
public void mostrarvalor() {
if(!listitaNumeros.isEmpty()) {
System.out.println("Mostrando Elementos....");
for (int i=0;i<listitaNumeros.size();i++) {
System.out.println(listitaNumeros.get(i));
}
}else {
System.out.println("No hay valores en la lista");
}
}
}