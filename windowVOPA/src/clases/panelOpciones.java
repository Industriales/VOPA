package clases;


import java.awt.*;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;




public class panelOpciones extends JPanel{
	
	
	private static JLabel ordenador, usuario,menu,textord,zoomA,zoomB,zoomC,zoomD, textusu, colores, A,S,red,green,blue, H, J,X,Z, K,Y,O, L,N, yellow, orange,P,C,M,V,rose,cyan,magenta,brown,teclado,voz,zoom_in,zoom_in2,zoom_out,zoom_out2,R,G,B,paint,grey,grey1,grey2,grey3,grey4,clean;
	public static JPanel areaord, areausu, areablack, areagrey, areagrey1, areagrey2, areagrey3, areagrey4, areawhite,areared,areaorange,areayellow,areablue,areagreen,arearose,areacyan,areamagenta,areabrown,areaA,areaQ,areaW,areaH,areaJ,areaK,areaL,areaM,areaS,areaR,areaG,areaB,areaC,areaO,areaY,areaMA,areaBR,areaRO,areaclean;
	
	Color colorGris15=new Color(38, 38, 38); // Color (R,G,B)
	Color colorGris30=new Color(77, 77, 77);
	Color colorGris45=new Color(115, 115, 115);
	Color colorGris60=new Color(153, 153, 153);
	Color colorGris75=new Color(191, 191, 191);
	Color colorRosaos=new Color(255, 20, 147);
	Color colorMarron=new Color(153, 76, 0);
	Color colorNaranja=new Color(255,128,0);
	
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
				 textord = new JLabel("¿What do you want?");
				 textord.setBounds(28, 50, 150, 50);
				 
				 textusu = new JLabel("PAINT!!!");
				 textusu.setBounds(28, 200, 150, 50);
				 
				 
				 //textusu.setText("Hola mundo");
				 //textord.setText("Hola mundo");
				 
				 /////////////Panel Seleccion de Colores/////////////
				 colores = new JLabel("Colors:");
				 colores.setBounds(80, 400, 150, 10);
				 colores.setBackground(Color.black);
				 
				 teclado = new JLabel("Keyboard");
				 teclado.setBounds(20, 449, 150, 13);
				 teclado.setBackground(Color.black);
				 
				 voz = new JLabel("Voice");
				 voz.setBounds(120, 450, 150, 10);
				 voz.setBackground(Color.black);
				 
				 zoomA = new JLabel("more");
				 zoomA.setBounds(90, 470, 150, 10);
				 zoomA.setBackground(Color.black);
				 
				 zoomB = new JLabel("zoom +");
				 zoomB.setBounds(140, 470, 150, 10);
				 zoomB.setBackground(Color.black);
				 
				 zoomC = new JLabel("less");
				 zoomC.setBounds(90, 485, 150, 10);
				 zoomC.setBackground(Color.black);
				 
				 zoomD= new JLabel("zoom -");
				 zoomD.setBounds(140, 485, 150, 10);
				 zoomD.setBackground(Color.black);
				 
				 paint = new JLabel("Paint");
				 paint.setBounds(90, 500, 150, 10);
				 paint.setBackground(Color.black);
				 
				 areablack = new JPanel();
				 areablack.setBounds(140, 500, 40, 10);
				 areablack.setBackground(Color.black);
				 
				 menu = new JLabel("GRAY");
				 menu.setBounds(75, 545, 150, 10);
				 menu.setBackground(Color.black);
				 
				 grey = new JLabel("|   8");
				 grey.setBounds(111, 515, 150, 10);
				 grey.setBackground(Color.black);
				 
				 areagrey = new JPanel();
				 areagrey.setBounds(140, 515, 40, 10);
				 areagrey.setBackground(colorGris15);
				 
				 grey1 = new JLabel("|   9");
				 grey1.setBounds(111, 530, 150, 10);
				 grey1.setBackground(Color.black);
				 
				 areagrey1 = new JPanel();
				 areagrey1.setBounds(140, 530, 40, 10);
				 areagrey1.setBackground(colorGris30);
				 
				 grey2 = new JLabel("| 10");
				 grey2.setBounds(110, 545, 150, 10);
				 grey2.setBackground(Color.black);
				 
				 areagrey2 = new JPanel();
				 areagrey2.setBounds(140, 545, 40, 10);
				 areagrey2.setBackground(colorGris45);
				 
				 grey3 = new JLabel("| 11");
				 grey3.setBounds(110, 560, 150, 10);
				 grey3.setBackground(Color.black);
				 
				 areagrey3 = new JPanel();
				 areagrey3.setBounds(140, 560, 40, 10);
				 areagrey3.setBackground(colorGris60);
				 
				 grey4 = new JLabel("| 12");
				 grey4.setBounds(110, 575, 150, 10);
				 grey4.setBackground(Color.black);
				 
				 areagrey4 = new JPanel();
				 areagrey4.setBounds(140, 575, 40, 10);
				 areagrey4.setBackground(colorGris75);
				 
				 clean = new JLabel("Clean");
				 clean.setBounds(90, 590, 150, 10);
				 clean.setBackground(Color.black);
				 
				 areaclean = new JPanel();
				 areaclean.setBounds(140, 590, 40, 10);
				 areaclean.setBackground(Color.white);
				 
				 red = new JLabel("Red");
				 red.setBounds(90, 605, 150, 10);
				 red.setBackground(Color.black);
				 
				 areared = new JPanel();
				 areared.setBounds(140, 605, 40, 10);
				 areared.setBackground(Color.red);
				 
				 blue = new JLabel("Blue");
				 blue.setBounds(90, 620, 150, 10);
				 blue.setBackground(Color.black);
				 
				 areablue = new JPanel();
				 areablue.setBounds(140, 620, 40, 10);
				 areablue.setBackground(Color.blue);
				 
				 green = new JLabel("Green");
				 green.setBounds(90, 635, 150, 10);
				 green.setBackground(Color.black);
				 
				 areagreen = new JPanel();
				 areagreen.setBounds(140, 635, 40, 10);
				 areagreen.setBackground(Color.green);
				 
				 yellow = new JLabel("Yellow");
				 yellow.setBounds(90, 650, 150, 10);
				 yellow.setBackground(Color.black);
				 
				 areayellow = new JPanel();
				 areayellow.setBounds(140, 650, 40, 10);
				 areayellow.setBackground(Color.yellow);
				 
				 orange = new JLabel("Orange");
				 orange.setBounds(90, 664, 150, 13);
				 orange.setBackground(Color.black);
				 
				 areaorange = new JPanel();
				 areaorange.setBounds(140, 665, 40, 10);
				 areaorange.setBackground(colorNaranja);
				 
				 rose = new JLabel("Rose");
				 rose.setBounds(90, 680, 150, 10);
				 rose.setBackground(Color.black);
				 
				 arearose = new JPanel();
				 arearose.setBounds(140, 680, 40, 10);
				 arearose.setBackground(colorRosaos);
				 
				 cyan = new JLabel("Cyan");
				 cyan.setBounds(90, 694, 150, 13);
				 cyan.setBackground(Color.black);
				 
				 areacyan = new JPanel();
				 areacyan.setBounds(140, 695, 40, 10);
				 areacyan.setBackground(Color.cyan);
				 
				 magenta = new JLabel("Magenta");
				 magenta.setBounds(90, 709, 150, 13);
				 magenta.setBackground(Color.black);
				 
				 areamagenta = new JPanel();
				 areamagenta.setBounds(140, 710, 40, 10);
				 areamagenta.setBackground(Color.magenta);
				 
				 brown = new JLabel("Brown");
				 brown.setBounds(90, 725, 150, 10);
				 brown.setBackground(Color.black);
				 
				 areabrown = new JPanel();
				 areabrown.setBounds(140, 725, 40, 10);
				 areabrown.setBackground(colorMarron);
				
				 zoom_in = new JLabel("Q");
				 zoom_in.setBounds(10, 470, 150, 10);
				 zoom_in.setBackground(Color.black);
				 
				 zoom_in2 = new JLabel("zoom +");
				 zoom_in2.setBounds(30, 470, 150, 10);
				 zoom_in2.setBackground(Color.black);
				 
				 zoom_out = new JLabel("W");
				 zoom_out.setBounds(10, 485, 150, 10);
				 zoom_out.setBackground(Color.black);
				 
				 zoom_out2 = new JLabel("zoom -");
				 zoom_out2.setBounds(30, 485, 150, 10);
				 zoom_out2.setBackground(Color.black);
				 
				 A = new JLabel("A");
				 A.setBounds(10, 500, 150, 10);
				 A.setBackground(Color.black);
				 
				 areaA = new JPanel();
				 areaA.setBounds(30, 500, 40, 10);
				 areaA.setBackground(Color.black);
				 
				 H = new JLabel("H");
				 H.setBounds(10, 515, 150, 10);
				 H.setBackground(Color.black);
				 
				 areaH = new JPanel();
				 areaH.setBounds(30, 515, 40, 10);
				 areaH.setBackground(colorGris15);
				 
				 J = new JLabel("J");
				 J.setBounds(10, 530, 150, 10);
				 J.setBackground(Color.black);
				 
				 areaJ = new JPanel();
				 areaJ.setBounds(30, 530, 40, 10);
				 areaJ.setBackground(colorGris30);
				 
				 K = new JLabel("K");
				 K.setBounds(10, 545, 150, 10);
				 K.setBackground(Color.black);
				 
				 areaK = new JPanel();
				 areaK.setBounds(30, 545, 40, 10);
				 areaK.setBackground(colorGris45);
				 
				 L = new JLabel("L");
				 L.setBounds(10, 560, 150, 10);
				 L.setBackground(Color.black);
				 
				 areaL = new JPanel();
				 areaL.setBounds(30, 560, 40, 10);
				 areaL.setBackground(colorGris60);
				 
				 M = new JLabel("M");
				 M.setBounds(10, 575, 150, 10);
				 M.setBackground(Color.black);
				 
				 areaM = new JPanel();
				 areaM.setBounds(30, 575, 40, 10);
				 areaM.setBackground(colorGris75);
				 
				 S = new JLabel("S");
				 S.setBounds(10, 590, 150, 10);
				 S.setBackground(Color.black);
				 
				 areaS = new JPanel();
				 areaS.setBounds(30, 590, 40, 10);
				 areaS.setBackground(Color.white);
				 
				 R = new JLabel("R");
				 R.setBounds(10, 605, 150, 10);
				 R.setBackground(Color.black);
				 
				 areaR = new JPanel();
				 areaR.setBounds(30, 605, 40, 10);
				 areaR.setBackground(Color.red);
				 
				 B = new JLabel("B");
				 B.setBounds(10, 620, 40, 10);
				 B.setBackground(Color.black);
				 
				 areaB = new JPanel();
				 areaB.setBounds(30, 620, 40, 10);
				 areaB.setBackground(Color.blue);
				 
				 G = new JLabel("G");
				 G.setBounds(10, 635, 150, 10);
				 G.setBackground(Color.black);
				 
				 areaG = new JPanel();
				 areaG.setBounds(30, 635, 40, 10);
				 areaG.setBackground(Color.green);
				 
				 Y = new JLabel("Y");
				 Y.setBounds(10, 650, 150, 10);
				 Y.setBackground(Color.black);
				 
				 areaY = new JPanel();
				 areaY.setBounds(30, 650, 40, 10);
				 areaY.setBackground(Color.yellow);
				
				 O = new JLabel("O");
				 O.setBounds(10, 665, 150, 10);
				 O.setBackground(Color.black);
				 
				 areaO = new JPanel();
				 areaO.setBounds(30, 665, 40, 10);
				 areaO.setBackground(colorNaranja);
				 
				 Z = new JLabel("Z");
				 Z.setBounds(10, 680, 150, 10);
				 Z.setBackground(Color.black);
				 
				 areaRO = new JPanel();
				 areaRO.setBounds(30, 680, 40, 10);
				 areaRO.setBackground(colorRosaos);
				 
				 C = new JLabel("C");
				 C.setBounds(10, 695, 150, 10);
				 C.setBackground(Color.black);
				 
				 areaC = new JPanel();
				 areaC.setBounds(30, 695, 40, 10);
				 areaC.setBackground(Color.cyan);
				 
				 X = new JLabel("X");
				 X.setBounds(10, 710, 150, 10);
				 X.setBackground(Color.black);
				 
				 areaMA = new JPanel();
				 areaMA.setBounds(30, 710, 40, 10);
				 areaMA.setBackground(Color.magenta);
				 
				 V = new JLabel("V");
				 V.setBounds(10, 725, 150, 10);
				 V.setBackground(Color.black);
				 
				 areaBR = new JPanel();
				 areaBR.setBounds(30, 725, 40, 10);
				 areaBR.setBackground(colorMarron);
				 
				//agregamos elementos al panel
				 add(ordenador);
				 add(usuario);
				 add(colores);
				 add(teclado);
				 add(voz);
				 add(zoom_in);
				 add(zoom_out);
				 add(zoom_in2);
				 add(zoom_out2);
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
			     add(S);
			     add(V);
			     add(R);
			     add(B);
			     add(G);
			     add(Y);
			     add(O);
			     add(C);
			     add(Z);
			     add(X);
			     add(zoomA);
			     add(zoomB);
			     add(zoomC);
			     add(zoomD);
			     add(paint);
			     add(menu);
			     add(grey);
			     add(grey1);
			     add(grey2);
			     add(grey3);
			     add(grey4);
			     add(clean);
			     add(red);
			     add(blue);
			     add(green);
			     add(yellow);
			     add(orange);
			     add(rose);
			     add(cyan);
			     add(magenta);
			     add(brown);
			     add(areaA);
			     add(areaH);
			     add(areaJ);
			     add(areaK);
			     add(areaL);
			     add(areaM);
			     add(areaS);
			     add(areaBR);
			     add(areaR);
			     add(areaB);
			     add(areaG);
			     add(areaO);
			     add(areaY);
			     add(areaS);
			     add(areaRO);
			     add(areaC);
			     add(areaMA);
			     add(areablack);
			     add(areagrey);
			     add(areagrey1);
			     add(areagrey2);
			     add(areagrey3);
			     add(areagrey4);
			     add(areaclean);
			     add(areared);
			     add(areablue);
			     add(areagreen);
			     add(areayellow);
			     add(areaorange);
			     add(arearose);
			     add(areacyan);
			     add(areamagenta);
			     add(areabrown);
			     
			     
			     
			     /*add(areared);
			     add(areablue);
				 add(areagreen);
				 add(areayellow);
				 add(areaorange);
				 add(arearose);
				 add(areacyan);
				 add(areamagenta);
				 add(areabrown);*/
	}

}
