import javax.swing.JOptionPane;

public class cadenas8 {

	public static void main(String[] args) {
		int pos =0, tam =0;
		String nombre;
		
		nombre = JOptionPane.showInputDialog("Ingresa tu nombre: ");
		
	tam= nombre.length();
	
	pos = Integer.parseInt(JOptionPane.showInputDialog("Escribir la poscion deseada: "));
	
	char resultado= nombre.charAt(pos);
	
	JOptionPane.showMessageDialog(null, nombre + " tiene" + tam + " letras" + '\n' +"Por lo tanto la letra esta en la posicion" + pos
			+ " la letra es " + resultado);

	}

}
