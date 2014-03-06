package ventanaVOPA;

import java.awt.*;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;




public class panelOpciones extends JPanel{
	
	
	private static JLabel ordenador, usuario;
	public static JTextArea areaord, areausu;
	public static JPanel panel;

	
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
				 
				 areaord = new JTextArea();
				 areaord.setBounds(25, 50, 150, 50);
				 
				 areausu = new JTextArea();
				 areausu.setBounds(25, 200, 150, 50);
			 
				 
				 //visualizar
				 
				 panelPaint p = new panelPaint();
				 
				 areausu.setText("hola");
				 areaord.setText("hola");
				 
				 
				//agregamos elementos al panel
				 add(ordenador);
				 add(usuario);
				 add(areaord);
				 add(areausu);			 
			
	
	}
	
		
	
}
