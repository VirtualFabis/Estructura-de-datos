
import javax.swing.JOptionPane;

public class estados_datos {

	public static void main(String[] args) {
		
		 int endentidad ,municipios ,poblacion,IDE,carreras;
		
		 String nombre,universidad;
		 try {
		 
		 nombre  =  JOptionPane.showInputDialog("Ingresa el nombre del estado : ");
		 
		 endentidad =  Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edentidad del estado: "));
		 
		 municipios  = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de municipios :"));
		  
		 poblacion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero da la poblacion "));
		 
		 IDE =  Integer.parseInt(JOptionPane.showInputDialog("Ingresa la clave del centro de trabajo: "));	
		 
		 universidad =  JOptionPane.showInputDialog("Ingresa el nombre de la universidad : ");
		 
		 carreras =  Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de carreras: "));
		 
		
		 estados datos = new estados( endentidad, municipios, poblacion, nombre);
		 
		 estado_h datos2 = new estado_h(endentidad,  municipios,  poblacion,  nombre);
		 
		 datos.mostar(endentidad, municipios, poblacion, nombre);
		 
		 datos2.mostar(IDE, universidad, carreras, nombre);
		 
		 datos.estudiar(nombre);
		 
		 datos.vacacionar(nombre);
		 
		 datos2.vacacionar(nombre, poblacion);
		 
			} catch (Exception a ) {
				JOptionPane.showConfirmDialog(null, "FALLO HUBO UN ERROR ");
			}
		

		
		 
		 
	}

}
