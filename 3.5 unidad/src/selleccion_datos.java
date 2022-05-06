import javax.swing.JOptionPane;

public class selleccion_datos {

	public static void main(String[] args) {
	
		String nombre;
		int id,edad,numero, presupuesto ;
		
		nombre = JOptionPane.showInputDialog("Ingresa el nombre :");
		
		id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la ID:"));
		
		edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad:"));
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de jugadores:"));
		
		presupuesto  = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el presupuesto:"));
		
		
		seleccion datos = new seleccion (presupuesto, presupuesto, nombre);
		
		datos.uwu(id, edad, nombre);
		
		
		datos.viajar(nombre);
		
		
		futbol owo = new futbol (presupuesto, presupuesto, nombre);
		
		owo.invitacion(nombre);
		
		
		
	}
	
	
	

}
