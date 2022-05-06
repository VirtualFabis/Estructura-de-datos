import javax.swing.JOptionPane;

public class automoviles {

	
		private String marca,color;
		
		private int modelo,hp;
		
		private double km;
	
		
		public automoviles (String marca,int modelo, String color, double km,int hp) {
			
			setmarca(marca);		
			
			setmodelo(modelo);
			
			setcolor(color);
			
			setkm(km);
			
			sethp(hp);		
			
		}

		private void setmarca(String marca2) {
			this.marca=marca2;
			
		}

		private void setmodelo(int modelo2) {
			
			this.modelo=modelo2;
			
		}

		private void setcolor(String color2) {
			
			this.color=color2;
			
		}

		private void setkm(double km2) {
			
			this.km=km2;
				
		}

		private void sethp(int hp2) {
			
			this.hp=hp2;
			
			
		}
	
		public void datos (String marca,int modelo, String color, double km,int hp) {
			
			JOptionPane.showMessageDialog(null,"La marca es "  +marca +  '\n'+
					" El modelo de auto es "+ modelo +  '\n' +
					" El color del carro es " + color +  '\n'+" Los kilometros recoridos son " +km
					+  '\n' +" Los caballos de fuerza son "+ hp );
			
			return;
		}
		
		public void apagar ( String marca) {
			
			JOptionPane.showMessageDialog(null," Offfffffff........ tu auto " + marca + " esta apagado");
			
			return;
		}
		
		public void arrancar  ( String marca) {
			
			JOptionPane.showMessageDialog(null, " Rummmmm rummmmm rummmmmm tu auto "+ marca +  " esta ensendido");
			
			return;
		}
}
