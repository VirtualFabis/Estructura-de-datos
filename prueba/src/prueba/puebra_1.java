package prueba;

import javax.swing.JOptionPane;

public class puebra_1 {

	public static void main(String[] args) {
		
		String a;
		char b ;
		double c;
		int d;
		
		
		
		a = JOptionPane.showInputDialog("nombre: ");
	
		b = JOptionPane.showInputDialog("letra: ").charAt(0);
		
		c = Double.parseDouble(JOptionPane.showInputDialog("peso: "));
		
		d = Integer.parseInt(JOptionPane.showInputDialog("edad: "));
		
		
		JOptionPane.showMessageDialog(null, "tu nombre es " + a );
		
		JOptionPane.showMessageDialog(null, "tu letra es es " + b);
		
		JOptionPane.showMessageDialog(null, "tu peso es " + c);
		
		JOptionPane.showMessageDialog(null, "tu edad es " + d);
		
		JOptionPane.showMessageDialog(null, a +" "+ b +" "+c+" "+ d);
		

	}

}
