import java.util.Scanner;

import javax.swing.JOptionPane;

public class cadenas6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s ;
			
	

		s = JOptionPane.showInputDialog("Ingresa una frase: ");
		
	
		
				for (int x=0;x<s.length();x++)
					
					JOptionPane.showMessageDialog( null,"La posocion es " + x + ": " + s.charAt(x));
	}

}
