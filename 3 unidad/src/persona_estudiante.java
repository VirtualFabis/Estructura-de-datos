import javax.swing.JOptionPane;

public class persona_estudiante extends persona {

	private String escuela;
	
	private int grado;
	
	public persona_estudiante(String d_nombre, int d_edad, double d_peso, String d_sexo) {
		super(d_nombre, d_edad, d_peso, d_sexo);
		
		setescuela(escuela);
		
		setgrado(grado);
	}

	private void setgrado(int grado2) {
		
		
	}

	private void setescuela(String escuela2) {
		
		
	}

	
	 
	
	void  mostar (String escula,int grado,String d_nombre) {
		
		JOptionPane.showMessageDialog(null,d_nombre+" tu escuela es "+ escula+ " y tu grado es "+ grado + " grado");
		
	}
	public void hablar(String d_nombre,String escula) {
		
		JOptionPane.showMessageDialog(null,"Hola soy " + d_nombre+ "  estoy hablando " + " y estoy en la escuela " + escula);
		
		
	}
}
