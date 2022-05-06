import javax.swing.JOptionPane;

public class datos_libros {

	public static void main(String[] args) {
		
		 String nombre,autor,editorial,material;
		 int pag,isbn;
		 
		 try {
		 
			 nombre =  JOptionPane.showInputDialog("Ingresa el nombre: ");
		 	
		 autor = JOptionPane.showInputDialog("Ingresa el autor: ");
		 
		 editorial  =  JOptionPane.showInputDialog("Ingresa el editorial: ");
		 
		 isbn = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el ISBN: "));
		 
		 pag = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el umero de paginas: "));
		 
		 material =JOptionPane.showInputDialog("Ingresa el material del libro: ");
		 
		 libros datos = new libros( nombre, autor, editorial, pag, isbn);
		 
		 material datos2 = new material(nombre, autor, editorial, pag, isbn);
		 
		 datos.datos(nombre, autor, editorial, pag, isbn);
		 
		datos2.datos(material, nombre);
		 
		 datos.leer(nombre);
		 
		 datos.comprar(nombre);
		 
		 datos.regalar(nombre);
		 
		 datos.prestar(nombre);
		 
		 datos2.prestar(nombre, autor);
						 
		
			} catch (Exception a ) {
				JOptionPane.showConfirmDialog(null, "FALLO HUBO UN ERROR ");
			}
	
		 
	}

}
