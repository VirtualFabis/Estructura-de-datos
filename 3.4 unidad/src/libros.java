import javax.swing.JOptionPane;

public class libros {

	
	private String nombre,autor,editorial;
	private int pag,isbn;
	
	public libros (String nombre,String autor,String editorial, int pag, int isbn) {
		
		setnombre(nombre);
		setisbn(isbn);
		seteditorial(editorial);
		setautor(autor);
		setn_pag(pag);
		
		
		
	}

	private void setnombre(String nombre2) {
		this.nombre=nombre2;
		
	}

	private void setisbn(int isbn2) {
		this.isbn=isbn2;
		
	}

	private void seteditorial(String editorial2) {
		this.editorial=editorial2;
		
		
	}

	private void setautor(String autor2) {
		this.autor=autor2;
		
		
	}

	private void setn_pag(int pag2) {
		this.pag=pag2;
		
		
	}
	
	 void datos (String nombre,String autor,String editorial, int pag, int isbn) {
		
		JOptionPane.showMessageDialog(null, "El titulo del libro es: "+ nombre+ '\n' 
				+"El autor del libro del "+ nombre + " es "+ autor + '\n' +"La editorial del libro es: "+ editorial +'\n' +
				"El numero de paginas es "+ pag+'\n' + "El ISBN es: "+ isbn);
		
	}
	
	public void leer (String nombre) {
		
		JOptionPane.showMessageDialog(null,"Estas leyendo el libro de "+ nombre);
			
		}
	public void comprar (String nombre) {
		
		JOptionPane.showMessageDialog(null,"Estas comprando el libro de  "+ nombre);
			
		}
	public void regalar  (String nombre) {
		
		JOptionPane.showMessageDialog(null,"Estas regalando el libro de "+ nombre);
			
		}
	public void prestar (String nombre) {
		
		JOptionPane.showMessageDialog(null,"Le estas prestando el libro de "+ nombre +" a otra persona");
			
		}
	}
	

