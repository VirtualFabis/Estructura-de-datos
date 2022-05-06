package segundas;

import javax.swing.JOptionPane;

public class persona {
  
	private String nombre;
	private int edad;
	
	public persona (String nombre, int edad) {
		
		setnombre (nombre);
		
		setedad(edad);
	}

	private void setnombre(String nombre2) {
		this.nombre=nombre2;
		
	}

	private void setedad(int edad2) {
		this.edad=edad2;		
	}
	
	
		void mostar (String nombre, int edad) {
			JOptionPane.showMessageDialog(null,"Tu nombre es: "+ nombre+ '\n'+ "Tienes "+edad  +" años de edad");
			
			
		}
}
