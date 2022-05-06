import javax.swing.JOptionPane;

public class futbol extends seleccion {

	private int numero, presupuesto ;
	
	public futbol(int id, int edad, String nombre) {
		super(id, edad, nombre);
		
		setnumero(numero);
		setpresupuesto(presupuesto);
		
	}

	private void setnumero(int numero2) {
		this.numero=numero2;
		
	}

	private void setpresupuesto(int presupuesto2) {
		this.presupuesto=presupuesto2;
		
	}

	
	public void invitacion (String nombre) {
		
		JOptionPane.showConfirmDialog(null,"Felicidadez "+ nombre +" has sido inviatdo a jugar en el estadio azteca" );
		
	}
	
}
