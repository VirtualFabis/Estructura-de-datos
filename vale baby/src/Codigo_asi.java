import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Codigo_asi extends JFrame implements ActionListener{

	//CREAR FORMULARIO
	JPanel base = (JPanel) this.getContentPane();


	
			//CREANDO ETIQUETAS
	
	JLabel lbl1 = new JLabel ("Palabra a convertir");

	
	
	
			//CREANDO CAMPOS DE TEXTO
	JTextField txt1 = new JTextField();
	JTextField txt2 = new JTextField();
	
	
			//CREANDO BOTONES
	JButton btn1 = new JButton ("CONVERTIR");
	
	
	public Codigo_asi() {
		
		
			//PROPIEDADES AL FORMULARIO
		base.setLayout(null);
			 setSize(500, 500);
			 setTitle("Codigo Ascii");
			 setVisible(true);
			 setDefaultCloseOperation(EXIT_ON_CLOSE);
			 
			 
			//PROPIEDADES A ETIQUETAS
		lbl1.setBounds(88, 49, 289, 40);
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		add(lbl1);
						 
	
		
		
		
			//PROPIEDADES DE CAMPOS DE TEXTO
		txt1.setBounds(76, 100, 301, 40);
		txt1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(txt1);
		
		txt2.setBounds(76, 251, 301, 46);
		txt2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(txt2);
		

		
		
		
			//PROPIEDADES DE BOTONES
		btn1.setBounds(135, 172, 187, 41);
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn1.addActionListener(this);
		add(btn1);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	
		

		//DE QUE BOTON VINO EL CLICK
	if(e.getSource() == btn1 );
	
	
	//CAMBIANDO A DOUBLE
	String palabra = txt1.getText();
	String resultado;

	
	   //CONDICIONES
	
	StringBuilder stringBuilder = new StringBuilder(palabra);
	
	String invertida = stringBuilder.reverse().toString();
	
	
	txt2.setText(invertida);
	
	}
}
