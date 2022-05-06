import javax.swing.JOptionPane;

public class seleccion {

	private int id,edad;
	private String nombre;
	
	
	public seleccion (int id, int edad, String nombre) {
		
		setid(id);
		
		setedad(edad);
		
		setnombre(nombre);
		
		
	}


	private void setid(int id2) {
	this.id=id2;
		
	}


	private void setedad(int edad2) {
	this.edad=edad2;
		
	}


	private void setnombre(String nombre2) {
		this.nombre=nombre2;
		
	}
	
	void uwu (int id, int edad, String nombre) {
		
		JOptionPane.showMessageDialog(null,"El Nombre de la seleccion es "+ nombre +'\n'+"El id es "+ id +'\n'+" La edad es "+ edad);
		
	}
	

		
	
	public void viajar (String nombre) {
		
		JOptionPane.showConfirmDialog(null,"La "+ nombre +" viajaran el proximo viernes a estadio azteca  ");
		
	}
	
}
