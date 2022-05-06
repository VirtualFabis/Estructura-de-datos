import javax.swing.JOptionPane;

public class futbol extends seleccion {
																
	private int  presupuesto ;
	
	
	public futbol(int numero, int edad, String nombre) {
		super( numero,  edad,  nombre);
		
		setpresupuesto(presupuesto);

}

	private void setpresupuesto(int presupuesto2) {
		this.presupuesto=presupuesto2;
		
	}
	public void invitacion (String nombre) {
		
		JOptionPane.showConfirmDialog(null,"Felicidadez "+ nombre +" Has sido inviatdo a futbol mexico" );
		
	}
	
	public void viajar (String nombre) {
		
		JOptionPane.showConfirmDialog(null, nombre +" Has sido inviatdo a jugar en el estadio azteca" );
		
	}
}