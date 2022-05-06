import javax.swing.JOptionPane;

public class material  extends libros{

	private String material;
	
	public material(String nombre, String autor, String editorial, int pag, int isbn) {
		super(nombre, autor, editorial, pag, isbn);
		
		setmaterial(material);
		
	}

	private void setmaterial(String material2) {
		 this.material=material2;
		
	}

	void datos (String material,String nombre) {
		
		JOptionPane.showMessageDialog(null,"Tu libro "+ nombre + " es de un material "+ material );
	}
	
	public void prestar (String nombre, String autor) {
		
		JOptionPane.showMessageDialog(null,"Perdiste tu libro "+ nombre +" ahora ya no lo puedes prestar rayos de tu autor "+ autor);
			
		}
}
