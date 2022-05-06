import javax.swing.JOptionPane;

public class cadenas1 {

	public static void main(String[] args) {
		
	String s= "Anai Carrizales Lopez";
	
	String a= "Carrizales";
	
	JOptionPane.showMessageDialog( null, s.substring(0));
		
	JOptionPane.showMessageDialog( null,"Tus abrebiaturas son "+ s.substring(0,1)+ s.substring(5,6)+ s.substring(16,17));
		

	JOptionPane.showMessageDialog( null, "Carrizales tiene " + a.length() + " letras");

		
	}
	//Fabian Guadalupe Ibarra Carrizales
}
