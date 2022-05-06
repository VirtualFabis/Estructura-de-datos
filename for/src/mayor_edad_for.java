import javax.swing.JOptionPane;

public class mayor_edad_for {

	public static void main(String[] args) {
		int inicio;
		
		
		  for(inicio=1;inicio<=5;inicio++) { 
			  
			  String nombre;
				
				int edad;
					
			nombre = JOptionPane.showInputDialog("Introduce tu nombre completo:");
				
			edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad :"));
				
				if (edad>=18){
					
					JOptionPane.showMessageDialog(null,nombre +" eres mayor edad ");
				}
				
				
				else {
					
					JOptionPane.showMessageDialog(null,nombre + " eres menor de edad ");
				}
			  
			  
			  
		  }

	}

}
