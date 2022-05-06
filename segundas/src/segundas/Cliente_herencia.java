package segundas;

import javax.swing.JOptionPane;

public class Cliente_herencia extends persona {

	
	private String nombreempresa;
	
	private int telefono;
	
	
	public Cliente_herencia(String nombre, int edad) {
		super(nombre, edad);
		
		setempresa(nombreempresa);
		
		settelefono(telefono);
		
	}


	private void setempresa(String nombreempresa2) {
	this.nombreempresa=nombreempresa2;
		
	}


	private void settelefono(int telefono2) {
	this.telefono=telefono2;
		
	}
	void mostar (String nombre, String nombreempresa, int telefono ) {
		
		
		JOptionPane.showMessageDialog(null,"Tu nombre es: "+ nombre+ '\n'+ "Tu empresa es "+  nombreempresa + '\n'+"  Tu telefono es "+ telefono);
		
		
	}

}
