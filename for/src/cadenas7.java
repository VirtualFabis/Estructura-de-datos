import java.util.Scanner;

import javax.swing.JOptionPane;

public class cadenas7 {

	public static void main(String[] args) {
		
		String s ;
		
		
		s = JOptionPane.showInputDialog("Ingresa una frase: ");
		
		JOptionPane.showMessageDialog( null,"Primera posicion "+  s.charAt(0) );
		
		char ultimo = s.charAt(s.length()-1);
		
		JOptionPane.showMessageDialog( null,"Ultima posicion "+ ultimo);
	}

}
