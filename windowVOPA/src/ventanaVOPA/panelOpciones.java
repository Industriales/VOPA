package ventanaVOPA;

import java.awt.*;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;




public class panelOpciones extends JPanel{
	
	
	private static JLabel ordenador, usuario, textord, textusu;
	public static JPanel areaord, areausu;

	
	public panelOpciones(){
		
		setLayout(null);// pone las cosas como tu quieres, anula el orden que pone la maquina
		setBounds(0, 0, 200, 800);
		setBackground(Color.orange);
		
		
	//////declaramos los elementos
				 ordenador = new JLabel("Ordenador");
				 ordenador.setBounds(25, 30, 150, 10);
				 ordenador.setBackground(Color.black);
				 
				 usuario = new JLabel("Usuario");
				 usuario.setBounds(25, 180, 150, 10);
				 usuario.setBackground(Color.black);
				 				 
				// Para pintar el fondo blanco igual que antes
				 areaord = new JPanel();
				 areaord.setBounds(25, 50, 150, 50);
				 
				 areausu = new JPanel();
				 areausu.setBounds(25, 200, 150, 50);
				 
				// Para escribir el texto sin necesidad de usar el cursor (texto fijo)
				 textord = new JLabel("hola mundo");
				 textord.setBounds(28, 50, 150, 50);
				 
				 textusu = new JLabel("hola mundo");
				 textusu.setBounds(28, 200, 150, 50);
				 
				 
				// textusu.setText("Hola mundo");
				 //textord.setText("Hola mundo");
				 
				 
				//agregamos elementos al panel
				 add(ordenador);
				 add(usuario);
				 add(textord);
				 add(textusu);	
				 add(areaord);
			     add(areausu);;
				
			
	
	}
	
		
	
}
