import javax.swing.JOptionPane;

public class automovil_datos {

	public static void main(String[] args) {
		
		 String marca,color;
		 
		 int modelo,hp,num_llantas;
		 
		 double km;
		 
		 
		 try {
		 marca =  JOptionPane.showInputDialog("ingresa la marca: ");
		 
		 modelo = Integer.parseInt(JOptionPane.showInputDialog("ingresa el modelo: "));
		 
		 color  =  JOptionPane.showInputDialog("ingresa el color : ");
		 
		 km = Double.parseDouble(JOptionPane.showInputDialog("ingresa el numero de km: "));
		 
		 hp= Integer.parseInt(JOptionPane.showInputDialog("ingresa los caballos de fuerza: "));
	
		 num_llantas = Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero de llantas: "));
		 
		 automoviles  datos = new automoviles  (marca, modelo,  color,  km, hp);

		 llantas datos2 = new llantas(marca, modelo, color, km, hp);
		 
		 datos.datos(marca, modelo, color, km, hp);
		 
		 datos2.datos(num_llantas, marca);
		 
		 datos.apagar( marca);
		 
		 datos.arrancar( marca);
		 
		 datos2.arrancar(marca, modelo, color);
		 
			} catch (Exception a ) {
				JOptionPane.showConfirmDialog(null, "FALLO HUBO UN ERROR ");
			}
		 	
	}

}
