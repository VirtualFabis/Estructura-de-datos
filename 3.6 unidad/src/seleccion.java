import javax.swing.JOptionPane;

public class seleccion {

	private int edad,numero ;
	private String nombre;
	
	
	public seleccion (int numero, int edad, String nombre) {
		
	
		
		setedad(edad);
		
		setnombre(nombre);
		
		setnumero(numero);
	}




	private void setnumero(int numero2) {
	this.numero=numero2;
		
	}




	private void setedad(int edad2) {
	this.edad=edad2;
		
	}


	private void setnombre(String nombre2) {
		this.nombre=nombre2;
		
	}
	
	void uwu (int numero, int edad, String nombre,int presupuesto) {
		
		JOptionPane.showMessageDialog(null,"El Nombre de la seleccion es "+ nombre +'\n'+"El numero  es "+ numero +'\n'+" La edad es "+ edad 
				 +'\n'+ "El presupuesto del viaje es "+presupuesto + "$" );
		
	}
	

		
	
	public void viajar (String nombre) {
		
		JOptionPane.showConfirmDialog(null,nombre   + " El Proximo viaje se esta programando  "  );
		
	}
	
	public void invitacion () {
		
		JOptionPane.showConfirmDialog(null,"Las invitaciones se estan procesando " );
		
	}
	
	
}
