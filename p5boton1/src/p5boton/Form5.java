package p5boton;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Form5 extends JFrame implements ActionListener{

	
	//CREAR FORMULARIO
	JPanel base = (JPanel) this.getContentPane();


			//CREANDO ETIQUETAS
	JLabel lblmes = new JLabel ("MES");
	JLabel lblyear = new JLabel ("AÑO");
	
	
	
			//CREANDO CAMPOS DE TEXTO
	JTextField txtmes = new JTextField();
	JTextField txtyear = new JTextField();
	JTextField txtresultado = new JTextField();
	
	
			//CREANDO BOTONES
	JButton btnresultado = new JButton ("RESULTADO");
	
	
	public Form5() {
		
		
			//PROPIEDADES AL FORMULARIO
		base.setLayout(null);
			 setSize(350, 500);
			 setTitle("MES BISIESTO");
			 setVisible(true);
			 setDefaultCloseOperation(EXIT_ON_CLOSE);
			 
			 
			//PROPIEDADES A ETIQUETAS
		lblmes.setBounds(25, 35, 150, 30);
		lblmes.setFont(new Font("TAHOMA",Font.BOLD,25));
		add(lblmes);
						 
		lblyear.setBounds(25, 170, 150, 30);
		lblyear.setFont(new Font ("TAHOMA", Font.BOLD,25));
		add(lblyear);
		
		
		
			//PROPIEDADES DE CAMPOS DE TEXTO
		txtmes.setBounds(165, 35, 120, 30);
		txtmes.setFont(new Font ("TAHOMA",Font.BOLD,25));
		add(txtmes);
		
		txtyear.setBounds(165, 170, 120, 30);
		txtyear.setFont(new Font ("TAHOMA",Font.BOLD,25));
		add(txtyear);
		
		txtresultado.setBounds(15, 370, 300, 25);
		txtresultado.setFont(new Font ("TAHOMA",Font.BOLD,10));
		add(txtresultado);
		
		
		
		
			//PROPIEDADES DE BOTONES
		btnresultado.setBounds (80 ,290, 200, 30);
		btnresultado.setFont(new Font ("TAHOMA", Font.BOLD, 25));
		btnresultado.addActionListener(this);
		add(btnresultado);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
				//DE QUE BOTON VINO EL CLICK
			if(e.getSource() == btnresultado );
			
				//CAMBIANDO A DOUBLE
			String mes = txtmes.getText();
			
			double year = Double.parseDouble(txtyear.getText());
			
			String resultado;
			
			
			   //CONDICIONES
			
			if (mes == "ENERO") {
				resultado = ("El mes es enero y tiene 31 dias, del año "+year);
			}
			else if ((mes) == ("FEBRERO")) {
				if((year%4==0 && year%100!=0)||(year%400==0)){
			    resultado = ("El mes es Febrero y tiene 29 dias del año "+year);
				 }
			    else {
			     resultado = ("El mes es Febrero y tiene 28 dias del año "+year);
			       }
			}
			else if ((mes) == ("MARZO")) {
				resultado = ("El mes es Marzo y tiene 31 dias, del año "+year);
			}
			else if ((mes) == ("ABRIL")) {
				resultado = ("El mes es Abril y tiene 30 días, del año "+year);
			}
			else if ((mes) == ("MAYO")) {
				resultado = ("El mes es Mayo y tiene 31 dias, del año "+year);
			}
			else if ((mes) == ("JUNIO")) {
				resultado = ("El mes es Junio y tiene 30 dias, del año "+year);
			}
			else if ((mes) == ("JULIO")) {
				resultado = ("El mes es Julio y tiene 31 dias, del año "+year);
			}
			else if ((mes) == ("AGOSTO")) {
				resultado = ("El mes es Agosto y tiene 30 dias, del año "+year);
			}
			else if ((mes) == ("SEPTIEMBRE")) {
				resultado = ("El mes es Septiembre y tiene 30 dias, del año "+year);
			}
			else if ((mes) == ("OCTUBRE")) {
				resultado = ("El mes es Octubre y tiene 31 dias, del año "+year);
			}
			else if ((mes) == ("NOVIEMBRE")) {
				resultado = ("El mes es Noviembre y tiene 30 dias, del año "+year);
			}
			else if ((mes) == ("DICIEMBRE")); {
				resultado = ("El mes es Diciembre y tiene 30 dias, del año "+year);
			} 
		
	}
	
	

}
