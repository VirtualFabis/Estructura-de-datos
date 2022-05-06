package segundas;

import javax.swing.JOptionPane;

public class persona_datos {

	public static void main(String[] args) {
		
		 String nombre;
		 
		 int edad;

		 String nombreempresa;
		
		 int telefono;
		 
		 
		 nombre =  JOptionPane.showInputDialog("Ingresa el nombre: ");
		 
		 edad =   Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad: "));
		 
		 nombreempresa =  JOptionPane.showInputDialog("Ingresa el nombre de la empresa ");
		 
		 telefono =   Integer.parseInt(JOptionPane.showInputDialog("Ingresa el telefono: "));
		 
		 
		 persona  datos = new  persona(nombre, edad);
		 
		 datos.mostar(nombre, edad);
		 
		 
		 Cliente_herencia datos2 = new Cliente_herencia(nombreempresa, telefono);
		 
		 datos2.mostar(nombre, nombreempresa, telefono);
		 
	}

}
