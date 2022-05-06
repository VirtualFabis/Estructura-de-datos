import javax.swing.JOptionPane;

public class cadenas5 {

	public static void main(String[] args) {
		
		String cadena = JOptionPane.showInputDialog("Ingresa la frase");
		
		JOptionPane.showMessageDialog( null,"esta es tu primera letra " +cadena.charAt(0));  
	}

}
