import javax.swing.JOptionPane;

public class estados {
	
	private int endentidad ,municipios ,poblacion;
	
	private String nombre;
	
	public estados (int endentidad,int municipios,int poblacion,String nombre) {
		
		
		setendentidad(endentidad);
		
		setmunicipios(municipios);
		
		setpoblacion(poblacion);
		
		setnombre(nombre);
		
	
	
	}

	private void setendentidad(int endentidad2) {
		
		this.endentidad=endentidad2;
		
	}

	private void setmunicipios(int municipios2) {
		this.municipios=municipios2;
		
	}

	private void setpoblacion(int poblacion2) {
		this.poblacion=poblacion2;
		
	}

	private void setnombre(String nombre2) {
		this.nombre=nombre2;
		
	}

	
	
	void  mostar (int endentidad,int municipios,int poblacion,String nombre) {
		
		JOptionPane.showMessageDialog(null, "El nombre del estado es: " + nombre +'\n' 
				+"La entidad del estado es " + endentidad +'\n' + "Los municipios del estado son: " + municipios +'\n'
				+ "La poblacion es "+ poblacion + " habitantes ");
		
	}
	

	public void  estudiar  (String nombre) {
		
		JOptionPane.showMessageDialog(null,"Te invitamos a formar parte de la univercidad auntonoma de "+ nombre + '\n'+  "Unas de la mejores universidades del todo el pais ");
				
		
	}
	public void  vacacionar  (String nombre) {
		
		JOptionPane.showMessageDialog(null,"Ven a vacacionar a "+ nombre +" el estado mas hermoso y turistico del pais ");
		
	}
	
}
