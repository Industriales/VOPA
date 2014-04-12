package clases;


import java.awt.*;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;




public class panelOpciones extends JPanel{
	
	
	private static JLabel ordenador, usuario, textord, textusu, colores, A,D,red,green,blue, H, J, K, L,N, yellow, orange,P,C,M,V,rose,cyan,magenta,brown;
	public static JPanel areaord, areausu, areablack, areagrey, areagrey1, areagrey2, areagrey3, areagrey4, areawhite,areared,areaorange,areayellow,areablue,areagreen,arearose,areacyan,areamagenta,areabrown;
	
	Color colorGris15=new Color(38, 38, 38); // Color (R,G,B)
	Color colorGris30=new Color(77, 77, 77);
	Color colorGris45=new Color(115, 115, 115);
	Color colorGris60=new Color(153, 153, 153);
	Color colorGris75=new Color(191, 191, 191);
	Color colorRosaos=new Color(255, 20, 147);
	Color colorMarron=new Color(153, 76, 0);
	
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
				 A.setBounds(10, 520, 150, 10);
				 A.setBackground(Color.black);
				 
				 areablack = new JPanel();
				 areablack.setBounds(50, 520, 135, 10);
				 areablack.setBackground(Color.black);
				 
				 H = new JLabel("H");
				 H.setBounds(10, 535, 150, 10);
				 H.setBackground(Color.black);
				 
				 areagrey = new JPanel();
				 areagrey.setBounds(50, 535, 135, 10);
				 areagrey.setBackground(colorGris15);
				 
				 J = new JLabel("J");
				 J.setBounds(10, 550, 150, 10);
				 J.setBackground(Color.black);
				 
				 areagrey1 = new JPanel();
				 areagrey1.setBounds(50, 550, 135, 10);
				 areagrey1.setBackground(colorGris30);
				 
				 K = new JLabel("K");
				 K.setBounds(10, 565, 150, 10);
				 K.setBackground(Color.black);
				 
				 areagrey2 = new JPanel();
				 areagrey2.setBounds(50, 565, 135, 10);
				 areagrey2.setBackground(colorGris45);
				 
				 L = new JLabel("L");
				 L.setBounds(10, 580, 150, 10);
				 L.setBackground(Color.black);
				 
				 areagrey3 = new JPanel();
				 areagrey3.setBounds(50, 580, 135, 10);
				 areagrey3.setBackground(colorGris60);
				 
				 M = new JLabel("M");
				 M.setBounds(10, 595, 150, 10);
				 M.setBackground(Color.black);
				 
				 areagrey4 = new JPanel();
				 areagrey4.setBounds(50, 595, 135, 10);
				 areagrey4.setBackground(colorGris75);
				 
				 D = new JLabel("D");
				 D.setBounds(10, 610, 150, 10);
				 D.setBackground(Color.black);
				 
				 areawhite = new JPanel();
				 areawhite.setBounds(50, 610, 135, 10);
				 areawhite.setBackground(Color.white);
				 
				 red = new JLabel("red");
				 red.setBounds(10, 625, 150, 10);
				 red.setBackground(Color.black);
				 
				 areared = new JPanel();
				 areared.setBounds(50, 625, 135, 10);
				 areared.setBackground(Color.red);
				 
				 blue = new JLabel("blue");
				 blue.setBounds(10, 640, 150, 10);
				 blue.setBackground(Color.black);
				 
				 areablue = new JPanel();
				 areablue.setBounds(50, 640, 135, 10);
				 areablue.setBackground(Color.blue);
				 
				 green = new JLabel("green");
				 green.setBounds(10, 655, 150, 10);
				 green.setBackground(Color.black);
				 
				 areagreen = new JPanel();
				 areagreen.setBounds(50, 655, 135, 10);
				 areagreen.setBackground(Color.green);
				 
				 yellow = new JLabel("yellow");
				 yellow.setBounds(10, 670, 150, 10);
				 yellow.setBackground(Color.black);
				 
				 areayellow = new JPanel();
				 areayellow.setBounds(50, 670, 135, 10);
				 areayellow.setBackground(Color.yellow);
				
				 orange = new JLabel("orange");
				 orange.setBounds(10, 685, 150, 10);
				 orange.setBackground(Color.black);
				 
				 areaorange = new JPanel();
				 areaorange.setBounds(50, 685, 135, 10);
				 areaorange.setBackground(Color.orange);
				 
				 rose = new JLabel("rose");
				 rose.setBounds(10, 700, 150, 10);
				 rose.setBackground(Color.black);
				 
				 arearose = new JPanel();
				 arearose.setBounds(50, 700, 135, 10);
				 arearose.setBackground(colorRosaos);
				 
				 cyan = new JLabel("cyan");
				 cyan.setBounds(10, 715, 150, 10);
				 cyan.setBackground(Color.black);
				 
				 areacyan = new JPanel();
				 areacyan.setBounds(50, 715, 135, 10);
				 areacyan.setBackground(Color.cyan);
				 
				 magenta = new JLabel("magenta");
				 magenta.setBounds(10, 730, 150, 10);
				 magenta.setBackground(Color.black);
				 
				 areamagenta = new JPanel();
				 areamagenta.setBounds(50, 730, 135, 10);
				 areamagenta.setBackground(Color.magenta);
				 
				 brown = new JLabel("brown");
				 brown.setBounds(10, 745, 150, 10);
				 brown.setBackground(Color.black);
				 
				 areabrown = new JPanel();
				 areabrown.setBounds(50, 745, 135, 10);
				 areabrown.setBackground(colorMarron);
				 
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
			     add(red);
			     add(blue);
			     add(green);
			     add(yellow);
			     add(orange);
			     add(rose);
			     add(cyan);
			     add(magenta);
			     add(brown);
			     add(areablack);
			     add(areagrey);
			     add(areagrey1);
			     add(areagrey2);
			     add(areagrey3);
			     add(areagrey4);
			     add(areawhite);
			     add(areared);
			     add(areablue);
				 add(areagreen);
				 add(areayellow);
				 add(areaorange);
				 add(arearose);
				 add(areacyan);
				 add(areamagenta);
				 add(areabrown);
	}

}
