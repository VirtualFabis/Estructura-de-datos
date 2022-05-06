import javax.swing.JOptionPane;

public class estado_h  extends estados{

	private int carreras,IDE;
	
	private String universidad;
	
	
	
	public estado_h(int endentidad, int municipios, int poblacion, String nombre) {
		super(endentidad, municipios, poblacion, nombre);
		
			setide(IDE);
		
			setuniversidad(universidad);
		
			setcarreras(carreras);
	}



	private void setide(int iDE2) {
		this.IDE=iDE2;
		
	}



	private void setuniversidad(String universidad2) {
		this.universidad=universidad2;
	}



	private void setcarreras(int carreras2) {
		this.carreras=carreras2;
		
	}

	public void mostar (int IDE,String universidad,int carreras2,String nombre) {
	
		 JOptionPane.showConfirmDialog(null,"VEN Y FORMA PARTE DE LA  "+ universidad+ " en el estado de "+ nombre+ '\n'+ 
				 "La clave del centro de trabajo es m: "+ IDE +" y las numero de las carreras son "+ carreras2);
		
		
	}
	
	public void  vacacionar  (String nombre,int poblacion) {
		
		JOptionPane.showMessageDialog(null,"Ya no pudes vacacionar en "+ nombre +" porque tiene el limite de problacion "+ poblacion);
		
	}
}
