import javax.swing.JOptionPane;


public class persona4 {

	public static void main(String[] args) {
		String d_nombre,d_sexo,escula;
		int d_edad,grado;
		double d_peso;
		
	try { 
		d_nombre =JOptionPane.showInputDialog("Ingresa el nombre: ");
		
		
		
		d_sexo =JOptionPane.showInputDialog("Ingresa el sexo: ");
	
		d_edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad: "));
		
		
		d_peso= Double.parseDouble(JOptionPane.showInputDialog("Ingresa el peso: "));
		
		escula =JOptionPane.showInputDialog("Ingresa la escuela: "); 
		
		grado =Integer.parseInt(JOptionPane.showInputDialog("Ingresa el gardo: "));
		
		
		persona datos = new persona (d_nombre, d_edad, d_peso, d_sexo);
	
		persona_estudiante datos2 = new persona_estudiante (d_nombre, d_edad, d_peso, d_sexo);
		
		datos.mostar(d_nombre, d_edad, d_peso, d_sexo);
		
		datos2.mostar(escula, grado, d_nombre);
		
		datos.hablar(d_nombre);
		
		datos2.hablar(d_nombre, escula);
		
		datos.dormir(d_nombre);
		

		} catch (Exception a ) {
			JOptionPane.showConfirmDialog(null, "FALLO HUBO UN ERROR ");
		}
		
		
		
	}
		
		 
	}


