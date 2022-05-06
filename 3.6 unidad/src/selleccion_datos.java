import javax.swing.JOptionPane;

public class selleccion_datos {

	public static void main(String[] args) {
	
		String nombre;
		int edad, presupuesto,numero ;
		
		nombre = JOptionPane.showInputDialog("Ingresa el nombre :");
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero del jugador:"));
		
		edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad:"));
		
		presupuesto  = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el presupuesto:"));
		
		
		seleccion datos = new seleccion ( edad, numero, nombre);
		

		datos.uwu( numero,  edad,  nombre, presupuesto);
		
		datos.viajar(nombre);
		
		datos.invitacion();
		
		futbol owo = new futbol ( edad, numero, nombre);
		
		owo.invitacion(nombre);
		
		owo.viajar(nombre);
		
		
	}
	
	
	

}
