

import javax.swing.JOptionPane;

public class persona {
	private String d_nombre;
	private int d_edad;
	private double d_peso;
	private String d_sexo;
	

	public persona (String d_nombre, int d_edad, double d_peso, String d_sexo) {
		
		setNombre (d_nombre);
		setEdad (d_edad);
		setPeso (d_peso);
		setSexo(d_sexo);
			

	}


	private void setNombre(String d_nombre2) {
		this.d_nombre=d_nombre2;
		
	}


	private void setEdad(int d_edad2) {
		this.d_edad=d_edad2;
	
	
	}


	private void setPeso(double d_peso2) {
		this.d_peso=d_peso2;
	}


	private void setSexo(String d_sexo2) {
		
		this.d_sexo=d_sexo2;
		if (d_sexo.equals("m") || (d_sexo.equals("f"))) {
			}
	
		
		else {
			
			JOptionPane.showMessageDialog(null,"EL SEXO DEBE SER M O F CABEZA DEL ALCORNOQUE");
		}
	
		
	}
	
	void mostar (String d_nombre, int d_edad, double d_peso, String d_sexo){
		
		JOptionPane.showConfirmDialog(null,
				"Tu nombre es: "+ d_nombre+ '\n'+ "Tienes "+d_edad  +" años de edad"+ '\n'+"Pesas "+d_peso+ "kg"+'\n'+"Tu sexo es: "+d_sexo);
		
		
	}
	
	public void hablar(String d_nombre) {
		
		JOptionPane.showMessageDialog(null,"Hola soy " + d_nombre+ "  estoy hablando ");
		
		
	}
		public void dormir(String d_nombre) {
		
			JOptionPane.showMessageDialog(null,"zzzzzzzzz  "+ d_nombre +  "  esta durmiendo");
		
	
	}
}
