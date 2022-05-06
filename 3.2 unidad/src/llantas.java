import javax.swing.JOptionPane;

public class llantas extends automoviles {

	private int num_llantas;
	
	public llantas(String marca, int modelo, String color, double km, int hp) {
		super(marca, modelo, color, km, hp);
		
		 setllantas(num_llantas);
	}

	private void setllantas(int num_llantas2) {
	this.num_llantas=num_llantas2;
		
	}
	public void datos ( int num_llantas,String marca ) {
		
		JOptionPane.showMessageDialog(null,"El numero de llantas para tu auto "+ marca + " son "+ num_llantas );
		
		
	}
	public void arrancar  ( String marca, int modelo,String color) {
		
		JOptionPane.showMessageDialog(null, "Tu auto "+ marca +  " modelo "+ modelo +" color "+ color 
				+" no encendio debidamente");
		
		return;
	}

}


