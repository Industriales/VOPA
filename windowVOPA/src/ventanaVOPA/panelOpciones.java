package ventanaVOPA;

import java.awt.*;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;




public class panelOpciones extends JPanel{
	
	
	private static JLabel ordenador, usuario, textord, textusu, colores, A, H, J, K, L, M, D;
	public static JPanel areaord, areausu, areablack, areagrey, areagrey1, areagrey2, areagrey3, areagrey4, areawhite;
	
	Color colorGris15=new Color(38, 38, 38); // Color (R,G,B)
	Color colorGris30=new Color(77, 77, 77);
	Color colorGris45=new Color(115, 115, 115);
	Color colorGris60=new Color(153, 153, 153);
	Color colorGris75=new Color(191, 191, 191);
	
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
				 textord = new JLabel("¿Qué deseas hacer?");
				 textord.setBounds(28, 50, 150, 50);
				 
				 textusu = new JLabel("Dibujar!!!");
				 textusu.setBounds(28, 200, 150, 50);
				 
				 
				 //textusu.setText("Hola mundo");
				 //textord.setText("Hola mundo");
				 
				 /////////////Panel Seleccion de Colores/////////////
				 colores = new JLabel("Colores:");
				 colores.setBounds(25, 500, 150, 10);
				 colores.setBackground(Color.black);
				 
				 A = new JLabel("A");
				 A.setBounds(25, 520, 150, 10);
				 A.setBackground(Color.black);
				 
				 areablack = new JPanel();
				 areablack.setBounds(40, 520, 135, 10);
				 areablack.setBackground(Color.black);
				 
				 H = new JLabel("H");
				 H.setBounds(25, 535, 150, 10);
				 H.setBackground(Color.black);
				 
				 areagrey = new JPanel();
				 areagrey.setBounds(40, 535, 135, 10);
				 areagrey.setBackground(colorGris15);
				 
				 J = new JLabel("J");
				 J.setBounds(25, 550, 150, 10);
				 J.setBackground(Color.black);
				 
				 areagrey1 = new JPanel();
				 areagrey1.setBounds(40, 550, 135, 10);
				 areagrey1.setBackground(colorGris30);
				 
				 K = new JLabel("K");
				 K.setBounds(25, 565, 150, 10);
				 K.setBackground(Color.black);
				 
				 areagrey2 = new JPanel();
				 areagrey2.setBounds(40, 565, 135, 10);
				 areagrey2.setBackground(colorGris45);
				 
				 L = new JLabel("L");
				 L.setBounds(25, 580, 150, 10);
				 L.setBackground(Color.black);
				 
				 areagrey3 = new JPanel();
				 areagrey3.setBounds(40, 580, 135, 10);
				 areagrey3.setBackground(colorGris60);
				 
				 M = new JLabel("M");
				 M.setBounds(25, 595, 150, 10);
				 M.setBackground(Color.black);
				 
				 areagrey4 = new JPanel();
				 areagrey4.setBounds(40, 595, 135, 10);
				 areagrey4.setBackground(colorGris75);
				 
				 D = new JLabel("D");
				 D.setBounds(25, 610, 150, 10);
				 D.setBackground(Color.black);
				 
				 areawhite = new JPanel();
				 areawhite.setBounds(40, 610, 135, 10);
				 areawhite.setBackground(Color.white);
				 
				//agregamos elementos al panel
				 add(ordenador);
				 add(usuario);
				 add(textord);
				 add(textusu);	
				 add(areaord);
			     add(areausu);
			     add(A);
			     add(H);
			     add(J);
			     add(K);
			     add(L);
			     add(M);
			     add(D);
			     add(areablack);
			     add(areagrey);
			     add(areagrey1);
			     add(areagrey2);
			     add(areagrey3);
			     add(areagrey4);
			     add(areawhite);
					
	}

}
