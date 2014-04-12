package clases;


import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;



public class panelPaint extends JPanel implements KeyListener, Runnable {

	//declaracion de las variables
	public static JButton boton;
	public static int n=0,n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0,n10=0,n11=0,n12=0,n13=0,n14=0,m1=0,m2=0;
	public static int buffer=0,buffer1=0,buffer2=0,buffer3=0,buffer4=0,buffer5=0,buffer6=0,buffer7=0,buffer8=0,buffer9=0,buffer10=0,buffer11=0,buffer12=0,buffer13=0, buffer14=0,u=0,contador=0,arriba=0,abajo=0,izquierda=0,derecha=0;
	public static int x=1, y=1, xx=0, yy=0, ab=0, ar=0, izq=0, der=0;//era int
	public static Graphics2D g;
	public String l;
	boolean dibuja = false, zoom = false;
	public static int[][] matriz = new int[3000][2];//declaramos las matrices para almacenar nuestro dibujo
	public static int[][] matriz1 = new int[3000][2];
	public static int[][] matriz2 = new int[3000][2];
	public static int[][] matriz3 = new int[3000][2];
	public static int[][] matriz4 = new int[3000][2];
	public static int[][] matriz5 = new int[3000][2];
	public static int[][] matriz6 = new int[3000][2];
	public static int[][] matriz7 = new int[3000][2];
	public static int[][] matriz8 = new int[3000][2];
	public static int[][] matriz9 = new int[3000][2];
	public static int[][] matriz10 = new int[3000][2];
	public static int[][] matriz11 = new int[3000][2];
	public static int[][] matriz12 = new int[3000][2];
	public static int[][] matriz13 = new int[3000][2];
	public static int[][] matriz14 = new int[3000][2];
	int v[]=new int[2];
	public static int ancho=20, largo=20, mover=20, zo=0, variable =0;//era int
	public static int rojo=0, verde=0, azul=0, amarillo=0, naranja=0, rosa=0, magenta=0, cyan=0, marron=0, negro=0;
	int grgb=0, grgb1=0, grgb2=0, grgb3=0, grgb4=0;
	public static float q=1;
	
////////////////Escala de gris /////////////////////
Color colorGris15=new Color(38, 38, 38); // Color (R,G,B)
Color colorGris30=new Color(77, 77, 77);
Color colorGris45=new Color(115, 115, 115);
Color colorGris60=new Color(153, 153, 153);
Color colorGris75=new Color(191, 191, 191);
Color colorNaranja=new Color(255, 128, 0);
Color colorRosaos=new Color(255, 20, 147);
Color colorMarron=new Color(153, 76, 0);


Thread t;


public void Hilo1(){
	
	t = new Thread(this,"hilo1");
	t.start();
}
 @Override
 public void run() {
      this.panelPaint();
    }	

	
	public void panelPaint(){
		
		n=buffer;
		n1=buffer1;
		n2=buffer2;
		n3=buffer3;
		n4=buffer4;
		n5=buffer5;
		n6=buffer6;
		n7=buffer7;
		n8=buffer8;
		n9=buffer9;
		n10=buffer10;
		n11=buffer11;
		n12=buffer12;
		n13=buffer13;
		n14=buffer14;
		
		boton = new JButton();//llamamos al boton
		boton.setBounds(m1, m2, ancho, largo);
		setLayout(null);
		setBounds(201,0,1400,800);
		setBackground(Color.white);//he cambiado el color
		add(boton);
		boton.addKeyListener(this);
		
	}
	
///////////////////////////////////////////////////////////////////
	public void zoom(){	
		
		if(zoom){
			
		ancho = (int) (ancho*q);// se multiplica para darle proporcion a las dimensiones y el movimiento del puntero
		largo = (int) (largo*q);
		mover = (int) (mover*q);
		
		y = (int) (y*q); // calibrar el puntero
		x = (int) (x*q);
		
		int j;
		
		for(j=0;j<buffer;j++){
			
			matriz[j][0] = (int) (matriz[j][0]*q);
			matriz[j][1] = (int) (matriz[j][1]*q);
			//repaint();
			negro=1;
			zo=1;
			}
		////////////////////////////////demas colores////////////////////
		for(j=0;j<buffer1;j++){
			
			matriz1[j][0] = (int) (matriz1[j][0]*q);
			matriz1[j][1] = (int) (matriz1[j][1]*q);
			repaint();
			rojo=1;
			}
		
		for(j=0;j<buffer2;j++){
			
			matriz2[j][0] = (int) (matriz2[j][0]*q);
			matriz2[j][1] = (int) (matriz2[j][1]*q);
			repaint();
			verde=1;
			}
		
		for(j=0;j<buffer3;j++){
			
			matriz3[j][0] = (int) (matriz3[j][0]*q);
			matriz3[j][1] = (int) (matriz3[j][1]*q);
			repaint();
			azul=1;
			}
		
		for(j=0;j<buffer4;j++){
			
			matriz4[j][0] = (int) (matriz4[j][0]*q);
			matriz4[j][1] = (int) (matriz4[j][1]*q);
			repaint();
			grgb=1;
			}
		
		for(j=0;j<buffer5;j++){
			
			matriz5[j][0] = (int) (matriz5[j][0]*q);
			matriz5[j][1] = (int) (matriz5[j][1]*q);
			repaint();
			grgb1=1;
			}
		
		for(j=0;j<buffer6;j++){
			
			matriz6[j][0] = (int) (matriz6[j][0]*q);
			matriz6[j][1] = (int) (matriz6[j][1]*q);
			repaint();
			grgb2=1;
			}
		
		for(j=0;j<buffer7;j++){
			
			matriz7[j][0] = (int) (matriz7[j][0]*q);
			matriz7[j][1] = (int) (matriz7[j][1]*q);
			repaint();
			grgb3=1;
			}
		
		for(j=0;j<buffer8;j++){
			
			matriz8[j][0] = (int) (matriz8[j][0]*q);
			matriz8[j][1] = (int) (matriz8[j][1]*q);
			repaint();
			grgb4=1;
			}
		
		for(j=0;j<buffer9;j++){
			
			matriz9[j][0] = (int) (matriz9[j][0]*q);
			matriz9[j][1] = (int) (matriz9[j][1]*q);
			repaint();
			amarillo=1;
			}
		
		for(j=0;j<buffer10;j++){
			
			matriz10[j][0] = (int) (matriz10[j][0]*q);
			matriz10[j][1] = (int) (matriz10[j][1]*q);
			repaint();
			naranja=1;
			}
		
		for(j=0;j<buffer11;j++){
			
			matriz11[j][0] = (int) (matriz11[j][0]*q);
			matriz11[j][1] = (int) (matriz11[j][1]*q);
			repaint();
			rosa=1;
			}
		
		for(j=0;j<buffer12;j++){
			
			matriz12[j][0] = (int) (matriz12[j][0]*q);
			matriz12[j][1] = (int) (matriz12[j][1]*q);
			repaint();
			cyan=1;
			}
		
		for(j=0;j<buffer13;j++){
			
			matriz13[j][0] = (int) (matriz13[j][0]*q);
			matriz13[j][1] = (int) (matriz13[j][1]*q);
			repaint();
			magenta=1;
			}
		
		for(j=0;j<buffer14;j++){
			
			matriz14[j][0] = (int) (matriz14[j][0]*q);
			matriz14[j][1] = (int) (matriz14[j][1]*q);
			repaint();
			marron=1;
			}
		/////////////////////////////////////
		}
		zoom=false;
		x=0;
		y=0;
		boton.setBounds(x, y, ancho, largo);
		
	}
	

/////////////////metodos con el teclado////////////////////////////
	@Override
	public void keyPressed(KeyEvent e) {
				
		l = e.getKeyText(e.getKeyCode());

			if(l.equals("Arriba")){

			v[0]=boton.getX();
			v[1]=boton.getY();
			xx=v[0];
			yy=v[1];
			buffer();
			buffer1();
			buffer2();
			buffer3();
			buffer4();
			buffer5();
			buffer6();
			buffer7();
			buffer8();
			buffer9();
			buffer10();
			buffer11();
			buffer12();
			buffer13();
			buffer14();
			
			
				if(boton.getY()==largo*0.5){////restriccion de movimiento
					ar=0;
				}
				else if(boton.getY()>largo*0.5){
				
					yy-=mover;
					m1=xx;
					m2=yy;
					ar=1;
				}
			
			}

			else if(l.equals("Abajo")){

			v[0]=boton.getX();
			v[1]=boton.getY();
			xx=v[0];
			yy=v[1];
			buffer();
			buffer1();
			buffer2();
			buffer3();
			buffer4();
			buffer5();
			buffer6();
			buffer7();
			buffer8();
			buffer9();
			buffer10();
			buffer11();
			buffer12();
			buffer13();
			buffer14();
			
			
				if(boton.getY()== 750-ancho*0.5){
					ab=0;
				}
				else if(boton.getY()<750-ancho*0.5){
				
					yy=yy+mover;
					m1=xx;
					m2=yy;
					System.out.println("HE PULSADO ABAJO \n");
					System.out.println("M1 Y M2 ("+m1+","+m2+")" );
					ab=1;
				}
			
			
			
			}

			else if(l.equals("Derecha")){

			v[0]=boton.getX();
			v[1]=boton.getY();
			xx=v[0];
			yy=v[1];
			buffer();
			buffer1();
			buffer2();
			buffer3();
			buffer4();
			buffer5();
			buffer6();
			buffer7();
			buffer8();
			buffer9();
			buffer10();
			buffer11();
			buffer12();
			buffer13();
			buffer14();
			
			
				if(boton.getX()== 1370-ancho*0.5){
					der=0;
				}
				else if(boton.getX()<1370-ancho*0.5){
					xx=xx+mover;
					m1=xx;
					m2=yy;
					der=1;
				}
			

			}

			else if(l.equals("Izquierda")){

			v[0]=boton.getX();
			v[1]=boton.getY();
			xx=v[0];
			yy=v[1];
			buffer();
			buffer1();
			buffer2();
			buffer3();
			buffer4();
			buffer5();
			buffer6();
			buffer7();
			buffer8();
			buffer9();
			buffer10();
			buffer11();
			buffer12();
			buffer13();
			buffer14();
			
			
				if(boton.getX()==ancho*0.5){
					izq=0;
				}
				else if(boton.getX()>ancho*0.5){
					
					xx=xx-mover;
					m1=xx;
					m2=yy;
					izq=1;
				}
			
			}
			
			else if(l.equals("A")){
				System.out.println("HE PULSADO A \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz[buffer][0]=xx;
				matriz[buffer][1]=yy;
				m1=xx;
				m2=yy;
				n=1+n;
				buffer=n;
				negro=1;
				dibuja=true;
			}
			
			else if(l.equals("S")){
				System.out.println("HE PULSADO S \n");
				xx = boton.getX();
				yy = boton.getY();
				v[0]=xx;
				v[1]=yy;
				
				for(int k=1;k<=buffer;k++)
				{
					if(matriz[k][0]==(v[0]))
					{
						if(matriz[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz[k][0]=matriz[k-1][0];
							matriz[k][1]=matriz[k-1][1];
							
						}
					}
				}
				for(int k=1;k<=buffer1;k++)
				{
					if(matriz1[k][0]==(v[0]))
					{
						if(matriz1[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz1[k][0]=matriz1[k-1][0];
							matriz1[k][1]=matriz1[k-1][1];
							
						}
					}
				}
				for(int k=1;k<=buffer2;k++)
				{
					if(matriz2[k][0]==(v[0]))
					{
						if(matriz2[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz2[k][0]=matriz2[k-1][0];
							matriz2[k][1]=matriz2[k-1][1];
							
						}
					}
				}
				for(int k=1;k<=buffer3;k++)
				{
					if(matriz3[k][0]==(v[0]))
					{
						if(matriz3[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz3[k][0]=matriz3[k-1][0];
							matriz3[k][1]=matriz3[k-1][1];
							
						}
					}
				}
				for(int k=1;k<=buffer4;k++)
				{
					if(matriz4[k][0]==(v[0]))
					{
						if(matriz4[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz4[k][0]=matriz4[k-1][0];
							matriz4[k][1]=matriz4[k-1][1];
							
						}
					}
				}
				for(int k=1;k<=buffer5;k++)
				{
					if(matriz5[k][0]==(v[0]))
					{
						if(matriz5[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz5[k][0]=matriz5[k-1][0];
							matriz5[k][1]=matriz5[k-1][1];
							
						}
					}
				}
				for(int k=1;k<=buffer6;k++)
				{
					if(matriz6[k][0]==(v[0]))
					{
						if(matriz6[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz6[k][0]=matriz6[k-1][0];
							matriz6[k][1]=matriz6[k-1][1];
							
						}
					}
				}
				for(int k=1;k<=buffer7;k++)
				{
					if(matriz7[k][0]==(v[0]))
					{
						if(matriz7[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz7[k][0]=matriz7[k-1][0];
							matriz7[k][1]=matriz7[k-1][1];
							
						}
					}
				}
				for(int k=1;k<=buffer8;k++)
				{
					if(matriz8[k][0]==(v[0]))
					{
						if(matriz8[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz8[k][0]=matriz8[k-1][0];
							matriz8[k][1]=matriz8[k-1][1];
							
						}
					}
				}
				
				for(int k=1;k<=buffer9;k++)
				{
					if(matriz9[k][0]==(v[0]))
					{
						if(matriz9[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz9[k][0]=matriz9[k-1][0];
							matriz9[k][1]=matriz9[k-1][1];
							
						}
					}
				}
				
				for(int k=1;k<=buffer10;k++)
				{
					if(matriz10[k][0]==(v[0]))
					{
						if(matriz10[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz10[k][0]=matriz10[k-1][0];
							matriz10[k][1]=matriz10[k-1][1];
							
						}
					}
				}
				
				for(int k=1;k<=buffer11;k++)
				{
					if(matriz11[k][0]==(v[0]))
					{
						if(matriz11[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz11[k][0]=matriz11[k-1][0];
							matriz11[k][1]=matriz11[k-1][1];
							
						}
					}
				}
				
				for(int k=1;k<=buffer12;k++)
				{
					if(matriz12[k][0]==(v[0]))
					{
						if(matriz12[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz12[k][0]=matriz12[k-1][0];
							matriz12[k][1]=matriz12[k-1][1];
							
						}
					}
				}
				
				for(int k=1;k<=buffer13;k++)
				{
					if(matriz13[k][0]==(v[0]))
					{
						if(matriz13[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz13[k][0]=matriz13[k-1][0];
							matriz13[k][1]=matriz13[k-1][1];
							
						}
					}
				}
				
				for(int k=1;k<=buffer14;k++)
				{
					if(matriz14[k][0]==(v[0]))
					{
						if(matriz14[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz14[k][0]=matriz14[k-1][0];
							matriz14[k][1]=matriz14[k-1][1];
							
						}
					}
				}
			}
			
			else if(l.equals("Q")){
				// Llama al metodo zoom y multiplica la constante q
				
				if(u!=2){
					if(u<2 && u>=0){
						u++;
						q=(float) 0.5;
						zoom=true;
						zoom();
					}
				}
			}
			
			else if(l.equals("W")){
				
				if(u!=0){
					if(u<3){
						u--;
						q=2;
						zoom=true;
						zoom();
						}
					}
			}
			
			else if(l.equals("R")){
				System.out.println("HE PULSADO R \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz1[buffer1][0]=xx;
				matriz1[buffer1][1]=yy;
				n1=1+n1;
				buffer1=n1; 
				rojo=1;
				System.out.println("ROJO ES"+rojo);
			}
			
			else if(l.equals("G")){
				System.out.println("HE PULSADO G \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz2[buffer2][0]=xx;
				matriz2[buffer2][1]=yy;
				n2=1+n2;
				buffer2=n2; 
				verde=1;
			}
			
			else if(l.equals("B")){
				System.out.println("HE PULSADO B \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz3[buffer3][0]=xx;
				matriz3[buffer3][1]=yy;
				n3=1+n3;
				buffer3=n3; 
				azul=1;
			}
			
			else if(l.equals("H")){
				System.out.println("HE PULSADO H \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz4[buffer4][0]=xx;
				matriz4[buffer4][1]=yy;
				n4=1+n4;
				buffer4=n4;
				grgb=1;
			}
			
			else if(l.equals("J")){
				System.out.println("HE PULSADO J \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz5[buffer5][0]=xx;
				matriz5[buffer5][1]=yy;
				n5=1+n5;
				buffer5=n5;
				grgb1=1;
			}
			else if(l.equals("K")){
				System.out.println("HE PULSADO K \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz6[buffer6][0]=xx;
				matriz6[buffer6][1]=yy;
				n6=1+n6;
				buffer6=n6;
				grgb2=1;
			}
			
			else if(l.equals("L")){
				System.out.println("HE PULSADO L \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz7[buffer7][0]=xx;
				matriz7[buffer7][1]=yy;
				n7=1+n7;
				buffer7=n7;
				grgb3=1;
			}
			
			else if(l.equals("N")){
				System.out.println("HE PULSADO N \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz8[buffer8][0]=xx;
				matriz8[buffer8][1]=yy;
				n8=1+n8;
				buffer8=n8;
				grgb4=1;
			}
			
			else if(l.equals("Y")){
				System.out.println("HE PULSADO Y \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz9[buffer9][0]=xx;
				matriz9[buffer9][1]=yy;
				n9=1+n9;
				buffer9=n9;
				amarillo=1;
			}
			
			else if(l.equals("O")){
				System.out.println("HE PULSADO O \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz10[buffer10][0]=xx;
				matriz10[buffer10][1]=yy;
				n10=1+n10;
				buffer10=n10;
				naranja=1;
			}
			
			else if(l.equals("P")){
				System.out.println("HE PULSADO P \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz11[buffer11][0]=xx;
				matriz11[buffer11][1]=yy;
				n11=1+n11;
				buffer11=n11;
				rosa=1;
			}
			
			else if(l.equals("C")){
				System.out.println("HE PULSADO C \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz12[buffer12][0]=xx;
				matriz12[buffer12][1]=yy;
				n12=1+n12;
				buffer12=n12;
				cyan=1;
			}
			
			else if(l.equals("M")){
				System.out.println("HE PULSADO M \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz8[buffer8][0]=xx;
				matriz8[buffer8][1]=yy;
				n8=1+n8;
				buffer8=n8;
				grgb4=1;
			}
			
			else if(l.equals("V")){
				System.out.println("HE PULSADO V \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz14[buffer14][0]=xx;
				matriz14[buffer14][1]=yy;
				n14=1+n14;
				buffer14=n14;
				marron=1;
			}
			
			
			/////////////////visualizar el puntero///////////////////////
		
			if(ar==1)
			{
				boton.setBounds(m1, m2, ancho, largo);
				ar=0;
			}
			if(ab==1)
			{
				boton.setBounds(m1, m2, ancho, largo);
				ab=0;
			}
			if(izq==1)
			{
				boton.setBounds(m1, m2, ancho, largo);
				izq=0;
			}
			if(der==1)
			{
				boton.setBounds(m1, m2, ancho, largo);
				der=0;
			}

		/////////////////////////////////////////////////////////////////////////
		
	}
		
	
	/////////////metodos para repintar las posiciones y que no se borren
	public void buffer (){//comprobamos en la matriz las posiciones pintadas
		int j;
		for(j=0;j<=buffer;j++)
		{
			if(matriz[j][0]==(m1))
			{
				if(matriz[j][1]==(m2))
				{
					xx = boton.getX();
					yy = boton.getY();
					dibuja=true;//pasa por las direcciones y pinta el cuadrado en la posicion de la guardada en la matriz
					negro=1;
				}
			}
		}
	}
	
	public void buffer1 (){//comprobamos en la matriz las posiciones pintadas
		int j;
		for(j=0;j<=buffer1;j++)
		{
			if(matriz1[j][0]==(m1))
			{
				if(matriz1[j][1]==(m2))
				{
					xx = boton.getX();
					yy = boton.getY();
					rojo=1;//pasa por las direcciones y pinta el cuadrado en la posicion de la guardada en la matriz
				}
			}
		}	
	}
	
	public void buffer2 (){//comprobamos en la matriz las posiciones pintadas
		int j;
		for(j=0;j<=buffer2;j++)
		{
			if(matriz2[j][0]==(m1))
			{
				if(matriz2[j][1]==(m2))
				{
					xx = boton.getX();
					yy = boton.getY();
					verde=1;//pasa por las direcciones y pinta el cuadrado en la posicion de la guardada en la matriz
				}
			}
		}
	}
	
	public void buffer3 (){//comprobamos en la matriz las posiciones pintadas
		int j;
		for(j=0;j<=buffer3;j++)
		{
			if(matriz3[j][0]==(m1))
			{
				if(matriz3[j][1]==(m2))
				{
					xx = boton.getX();
					yy = boton.getY();
					azul=1;//pasa por las direcciones y pinta el cuadrado en la posicion de la guardada en la matriz
				}
			}
		}
	}
	
	public void buffer4 (){//comprobamos en la matriz las posiciones pintadas
		int j;
		for(j=0;j<=buffer4;j++)
		{
			if(matriz4[j][0]==(m1))
			{
				if(matriz4[j][1]==(m2))
				{
					xx = boton.getX();
					yy = boton.getY();
					grgb=1;//pasa por las direcciones y pinta el cuadrado en la posicion de la guardada en la matriz
				}
			}
		}
	}
	
	public void buffer5 (){//comprobamos en la matriz las posiciones pintadas
		int j;
		for(j=0;j<=buffer5;j++)
		{
			if(matriz5[j][0]==(m1))
			{
				if(matriz5[j][1]==(m2))
				{
					xx = boton.getX();
					yy = boton.getY();
					grgb1=1;//pasa por las direcciones y pinta el cuadrado en la posicion de la guardada en la matriz
				}
			}
		}
	}
	
	public void buffer6 (){//comprobamos en la matriz las posiciones pintadas
		int j;
		for(j=0;j<=buffer6;j++)
		{
			if(matriz6[j][0]==(m1))
			{
				if(matriz6[j][1]==(m2))
				{
					xx = boton.getX();
					yy = boton.getY();
					grgb2=1;//pasa por las direcciones y pinta el cuadrado en la posicion de la guardada en la matriz
				}
			}
		}
	}
	
	public void buffer7 (){//comprobamos en la matriz las posiciones pintadas
		int j;
		for(j=0;j<=buffer7;j++)
		{
			if(matriz7[j][0]==(m1))
			{
				if(matriz7[j][1]==(m2))
				{
					xx = boton.getX();
					yy = boton.getY();
					grgb3=1;//pasa por las direcciones y pinta el cuadrado en la posicion de la guardada en la matriz
				}
			}
		}
	}
	
	public void buffer8 (){//comprobamos en la matriz las posiciones pintadas
		int j;
		for(j=0;j<=buffer8;j++)
		{
			if(matriz8[j][0]==(m1))
			{
				if(matriz8[j][1]==(m2))
				{
					xx = boton.getX();
					yy = boton.getY();
					grgb4=1;//pasa por las direcciones y pinta el cuadrado en la posicion de la guardada en la matriz
				}
			}
		}
	}
	
	public void buffer9 (){//comprobamos en la matriz las posiciones pintadas
		int j;
		for(j=0;j<=buffer9;j++)
		{
			if(matriz9[j][0]==(m1))
			{
				if(matriz9[j][1]==(m2))
				{
					xx = boton.getX();
					yy = boton.getY();
					amarillo=1;//pasa por las direcciones y pinta el cuadrado en la posicion de la guardada en la matriz
				}
			}
		}
	}
	
	public void buffer10 (){//comprobamos en la matriz las posiciones pintadas
		int j;
		for(j=0;j<=buffer10;j++)
		{
			if(matriz10[j][0]==(m1))
			{
				if(matriz10[j][1]==(m2))
				{
					xx = boton.getX();
					yy = boton.getY();
					naranja=1;//pasa por las direcciones y pinta el cuadrado en la posicion de la guardada en la matriz
				}
			}
		}
	}
	
	public void buffer11 (){//comprobamos en la matriz las posiciones pintadas
		int j;
		for(j=0;j<=buffer11;j++)
		{
			if(matriz11[j][0]==(m1))
			{
				if(matriz11[j][1]==(m2))
				{
					xx = boton.getX();
					yy = boton.getY();
					rosa=1;//pasa por las direcciones y pinta el cuadrado en la posicion de la guardada en la matriz
				}
			}
		}
	}
	
	public void buffer12 (){//comprobamos en la matriz las posiciones pintadas
		int j;
		for(j=0;j<=buffer12;j++)
		{
			if(matriz12[j][0]==(m1))
			{
				if(matriz12[j][1]==(m2))
				{
					xx = boton.getX();
					yy = boton.getY();
					cyan=1;//pasa por las direcciones y pinta el cuadrado en la posicion de la guardada en la matriz
				}
			}
		}
	}
	
	//ALGO DIFERENTE A LO DE ABAJOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO, MIRAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAR
	public void buffer13 (){//comprobamos en la matriz las posiciones pintadas
		int j;
		for(j=0;j<=buffer13;j++)
		{
			if(matriz13[j][0]==(m1))
			{
				if(matriz13[j][1]==(m2))
				{
					xx = boton.getX();
					yy = boton.getY();
					magenta=1;//pasa por las direcciones y pinta el cuadrado en la posicion de la guardada en la matriz
				}
			}
		}
	}
	
	public void buffer14 (){//comprobamos en la matriz las posiciones pintadas
		int j;
		for(j=0;j<=buffer14;j++)
		{
			if(matriz14[j][0]==(m1))
			{
				if(matriz14[j][1]==(m2))
				{
					xx = boton.getX();
					yy = boton.getY();
					marron=1;//pasa por las direcciones y pinta el cuadrado en la posicion de la guardada en la matriz
				}
			}
		}
	}
	
	/////////////////////////////////////////////////////
	public void paintComponent(Graphics g){
			System.out.println("ha entrado a paintComponent");
			System.out.println("EL VALOR DE VERDE ES_ "+verde);
			g.setColor(Color.black);
				super.paintComponent(g);
				g = (Graphics2D) g;
				
				if(zo==1){//pintar el zoom//////////////////////
					//repaint();
					if(negro==1)
					{
						
						for(int j=0;j<buffer;j++)
						{
						g.setColor(Color.black);
						xx = matriz[j][0];
						yy = matriz[j][1];				
						g.fillRect(xx,yy, ancho, largo);
						}	
				zo=0;
					}
					if(rojo==1)
					{
						
						for(int j=0;j<buffer1;j++)
						{
						g.setColor(Color.red);
						xx = matriz1[j][0];
						yy = matriz1[j][1];				
						g.fillRect(xx,yy, ancho, largo);
						}	
				zo=0;
					}
					if(verde==1)
					{
						
						for(int j=0;j<buffer2;j++)
						{
						g.setColor(Color.green);
						xx = matriz2[j][0];
						yy = matriz2[j][1];				
						g.fillRect(xx,yy, ancho, largo);
						}	
				zo=0;
					}
					if(azul==1)
					{
						
						for(int j=0;j<buffer3;j++)
						{
						g.setColor(Color.blue);
						xx = matriz3[j][0];
						yy = matriz3[j][1];				
						g.fillRect(xx,yy, ancho, largo);
						}	
				zo=0;
					}
					if(grgb==1)
					{
						
						for(int j=0;j<buffer4;j++)
						{
							g.setColor(colorGris15);
						xx = matriz4[j][0];
						yy = matriz4[j][1];				
						g.fillRect(xx,yy, ancho, largo);
						}	
				zo=0;
					}
					if(grgb1==1)
					{
						
						for(int j=0;j<buffer5;j++)
						{
							g.setColor(colorGris30);
						xx = matriz5[j][0];
						yy = matriz5[j][1];				
						g.fillRect(xx,yy, ancho, largo);
						}	
				zo=0;
					}
					if(grgb2==1)
					{
						
						for(int j=0;j<buffer6;j++)
						{
							g.setColor(colorGris45);
						xx = matriz6[j][0];
						yy = matriz6[j][1];				
						g.fillRect(xx,yy, ancho, largo);
						}	
				zo=0;
					}
					if(grgb3==1)
					{
						
						for(int j=0;j<buffer7;j++)
						{
							g.setColor(colorGris60);
						xx = matriz7[j][0];
						yy = matriz7[j][1];
						g.fillRect(xx,yy, ancho, largo);
						}	
				zo=0;
					}
					if(grgb4==1)
					{
						
						for(int j=0;j<buffer8;j++)
						{
							g.setColor(colorGris75);
						xx = matriz8[j][0];
						yy = matriz8[j][1];				
						g.fillRect(xx,yy, ancho, largo);
						}	
				zo=0;
					}
					if(amarillo==1)
					{
						
						for(int j=0;j<buffer9;j++)
						{
							g.setColor(Color.yellow);
						xx = matriz9[j][0];
						yy = matriz9[j][1];				
						g.fillRect(xx,yy, ancho, largo);
						}	
				zo=0;
					}
					if(naranja==1)
					{
						
						for(int j=0;j<buffer10;j++)
						{
							g.setColor(colorNaranja);
						xx = matriz10[j][0];
						yy = matriz10[j][1];				
						g.fillRect(xx,yy, ancho, largo);
						}	
				zo=0;
					}
					if(rosa==1)
					{
						
						for(int j=0;j<buffer11;j++)
						{
							g.setColor(colorRosaos);
						xx = matriz11[j][0];
						yy = matriz11[j][1];				
						g.fillRect(xx,yy, ancho, largo);
						}	
				zo=0;
					}
					if(cyan==1)
					{
						
						for(int j=0;j<buffer12;j++)
						{
							g.setColor(Color.cyan);
						xx = matriz12[j][0];
						yy = matriz12[j][1];				
						g.fillRect(xx,yy, ancho, largo);
						}	
				zo=0;
					}
					if(magenta==1)
					{
						
						for(int j=0;j<buffer13;j++)
						{
							g.setColor(Color.magenta);
						xx = matriz13[j][0];
						yy = matriz13[j][1];				
						g.fillRect(xx,yy, ancho, largo);
						}	
				zo=0;
					}
					if(marron==1)
					{
						
						for(int j=0;j<buffer14;j++)
						{
							g.setColor(colorMarron);
						xx = matriz14[j][0];
						yy = matriz14[j][1];				
						g.fillRect(xx,yy, ancho, largo);
						}	
				zo=0;
					}
				}////////////////////////////////////////////////

				if (m1 > -1 && m2 > -1){
				
					if(dibuja){
						if(negro==1)
						{
							System.out.println("deberia pintar");
							g.setColor(Color.black);
							xx=matriz[buffer][0];
							yy=matriz[buffer][1];
							g.fillRect(xx,yy, ancho, largo);
							//dibuja=false;
							//NUEVOOOOOOOOO
						for(int j=0;j<buffer;j++)
							{
							g.setColor(Color.black);
							xx = matriz[j][0];
							yy = matriz[j][1];		
							g.fillRect(xx,yy, ancho, largo);
							}	
							negro=0;
						}
						//NUEVOOOOOOOOO
						
				
					
					
				if(rojo==1){
					g.setColor(Color.red);
					xx=matriz1[buffer1][0];
					yy=matriz1[buffer1][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer1;j++)
					{
					g.setColor(Color.red);
					xx = matriz1[j][0];
					yy = matriz1[j][1];		
					g.fillRect(xx,yy, ancho, largo);
					}	
					rojo=0;
				}
					
				if(verde==1){
					System.out.println("deberia pintar");
					g.setColor(Color.green);
					xx=matriz2[buffer2][0];
					yy=matriz2[buffer2][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer2;j++)
					{
					System.out.println("Buffer es dentro"+buffer2);
					g.setColor(Color.green);
					xx = matriz2[j][0];
					yy = matriz2[j][1];		
					System.out.println("("+xx+","+yy+")");
					g.fillRect(xx,yy, ancho, largo);
					}	
					verde=0;
				}
					
				if(azul==1){
					g.setColor(Color.blue);
					xx=matriz3[buffer3][0];
					yy=matriz3[buffer3][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer3;j++)
					{
					g.setColor(Color.blue);
					xx = matriz3[j][0];
					yy = matriz3[j][1];		
					System.out.println("("+xx+","+yy+")");
					g.fillRect(xx,yy, ancho, largo);
					}	
					azul=0;
				}
										
				if(grgb==1){
					g.setColor(colorGris15);
					xx=matriz4[buffer4][0];
					yy=matriz4[buffer4][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer4;j++)
					{
					g.setColor(colorGris15);
					xx = matriz4[j][0];
					yy = matriz4[j][1];		
					g.fillRect(xx,yy, ancho, largo);
					}	
					grgb=0;
				}
				
				if(grgb1==1){
					
					g.setColor(colorGris30);
					xx=matriz5[buffer5][0];
					yy=matriz5[buffer5][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer5;j++)
					{
					g.setColor(colorGris30);
					xx = matriz5[j][0];
					yy = matriz5[j][1];		
					g.fillRect(xx,yy, ancho, largo);
					}	
					grgb1=0;
				}
				
				if(grgb2==1){
					g.setColor(colorGris45);
					xx=matriz6[buffer6][0];
					yy=matriz6[buffer6][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer6;j++)
					{
					g.setColor(colorGris45);
					xx = matriz6[j][0];
					yy = matriz6[j][1];		
					g.fillRect(xx,yy, ancho, largo);
					}	
					grgb2=0;
				}
				
				if(grgb3==1){
					g.setColor(colorGris60);
					xx=matriz7[buffer7][0];
					yy=matriz7[buffer7][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer7;j++)
					{
					g.setColor(colorGris60);
					xx = matriz7[j][0];
					yy = matriz7[j][1];		
					g.fillRect(xx,yy, ancho, largo);
					}	
					grgb3=0;
				}
				
				if(grgb4==1){
					g.setColor(colorGris75);
					xx=matriz8[buffer8][0];
					yy=matriz8[buffer8][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer8;j++)
					{
					g.setColor(colorGris75);
					xx = matriz8[j][0];
					yy = matriz8[j][1];		
					g.fillRect(xx,yy, ancho, largo);
					}	
					grgb4=0;
				}
				
				if(amarillo==1){
					g.setColor(Color.yellow);
					xx=matriz9[buffer9][0];
					yy=matriz9[buffer9][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer9;j++)
					{
					g.setColor(Color.yellow);
					xx = matriz9[j][0];
					yy = matriz9[j][1];		
					g.fillRect(xx,yy, ancho, largo);
					}	
					amarillo=0;
				}
				
				if(naranja==1){
					g.setColor(Color.orange);
					xx=matriz10[buffer10][0];
					yy=matriz10[buffer10][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer10;j++)
					{
					g.setColor(Color.orange);
					xx = matriz10[j][0];
					yy = matriz10[j][1];		
					g.fillRect(xx,yy, ancho, largo);
					}	
					naranja=0;
				}
				
				if(rosa==1){
					
					g.setColor(colorRosaos);
					xx=matriz11[buffer11][0];
					yy=matriz11[buffer11][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer11;j++)
					{
					g.setColor(colorRosaos);
					xx = matriz11[j][0];
					yy = matriz11[j][1];		
					g.fillRect(xx,yy, ancho, largo);
					}	
					rosa=0;
				}
				
				if(cyan==1){
					g.setColor(Color.cyan);
					xx=matriz12[buffer12][0];
					yy=matriz12[buffer12][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer12;j++)
					{
					g.setColor(Color.cyan);
					xx = matriz12[j][0];
					yy = matriz12[j][1];		
					g.fillRect(xx,yy, ancho, largo);
					}	
					cyan=0;
				}
				
				if(magenta==1){
					g.setColor(Color.magenta);
					xx=matriz13[buffer13][0];
					yy=matriz13[buffer13][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer13;j++)
					{
					g.setColor(Color.magenta);
					xx = matriz13[j][0];
					yy = matriz13[j][1];		
					g.fillRect(xx,yy, ancho, largo);
					}	
					magenta=0;
				}
				
				if(marron==1){
					g.setColor(colorMarron);
					xx=matriz11[buffer14][0];
					yy=matriz11[buffer14][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer14;j++)
					{
					g.setColor(colorMarron);
					xx = matriz14[j][0];
					yy = matriz14[j][1];		
					g.fillRect(xx,yy, ancho, largo);
					}	
					marron=0;
				}
				}
					
				}
			/*	if (contador!=0){
					
					if(dibuja){
						if(negro==1)
						{
							System.out.println("deberia pintar");
							g.setColor(Color.black);
							for(int i=0;i<contador;i++)
							{	
								xx=matriz[buffer][0];
								yy=matriz[buffer][1];
								g.fillRect(xx,yy, ancho, largo);
								n=n+1;
								buffer=n;
							}
							//dibuja=false;
							//NUEVOOOOOOOOO
						for(int j=0;j<buffer;j++)
							{
							System.out.println("Buffer es dentro"+buffer);
							g.setColor(Color.black);
							xx = matriz[j][0];
							yy = matriz[j][1];		
							System.out.println("("+xx+","+yy+")");
							g.fillRect(xx,yy, ancho, largo);
							}	
							//negro=0;
						}
						//NUEVOOOOOOOOO
						
				
					
					
				if(rojo==1){
					g.setColor(Color.red);
					xx=matriz1[buffer1][0];
					yy=matriz1[buffer1][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer1;j++)
					{
					g.setColor(Color.red);
					xx = matriz1[j][0];
					yy = matriz1[j][1];		
					g.fillRect(xx,yy, ancho, largo);
					}	
					rojo=0;
				}
					
				if(verde==1){
					System.out.println("deberia pintar");
					g.setColor(Color.green);
					xx=matriz2[buffer2][0];
					yy=matriz2[buffer2][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer2;j++)
					{
					System.out.println("Buffer es dentro"+buffer2);
					g.setColor(Color.green);
					xx = matriz2[j][0];
					yy = matriz2[j][1];		
					System.out.println("("+xx+","+yy+")");
					g.fillRect(xx,yy, ancho, largo);
					}	
					verde=0;
				}
					
				if(azul==1){
					g.setColor(Color.blue);
					xx=matriz3[buffer3][0];
					yy=matriz3[buffer3][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer3;j++)
					{
					g.setColor(Color.blue);
					xx = matriz3[j][0];
					yy = matriz3[j][1];		
					System.out.println("("+xx+","+yy+")");
					g.fillRect(xx,yy, ancho, largo);
					}	
					azul=0;
				}
										
				if(grgb==1){
					g.setColor(colorGris15);
					xx=matriz4[buffer4][0];
					yy=matriz4[buffer4][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer4;j++)
					{
					g.setColor(colorGris15);
					xx = matriz4[j][0];
					yy = matriz4[j][1];		
					g.fillRect(xx,yy, ancho, largo);
					}	
					grgb=0;
				}
				
				if(grgb1==1){
					
					g.setColor(colorGris30);
					xx=matriz5[buffer5][0];
					yy=matriz5[buffer5][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer5;j++)
					{
					g.setColor(colorGris30);
					xx = matriz5[j][0];
					yy = matriz5[j][1];		
					g.fillRect(xx,yy, ancho, largo);
					}	
					grgb1=0;
				}
				
				if(grgb2==1){
					g.setColor(colorGris45);
					xx=matriz6[buffer6][0];
					yy=matriz6[buffer6][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer6;j++)
					{
					g.setColor(colorGris45);
					xx = matriz6[j][0];
					yy = matriz6[j][1];		
					g.fillRect(xx,yy, ancho, largo);
					}	
					grgb2=0;
				}
				
				if(grgb3==1){
					g.setColor(colorGris60);
					xx=matriz7[buffer7][0];
					yy=matriz7[buffer7][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer7;j++)
					{
					g.setColor(colorGris60);
					xx = matriz7[j][0];
					yy = matriz7[j][1];		
					g.fillRect(xx,yy, ancho, largo);
					}	
					grgb3=0;
				}
				
				if(grgb4==1){
					g.setColor(colorGris75);
					xx=matriz8[buffer8][0];
					yy=matriz8[buffer8][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer8;j++)
					{
					g.setColor(colorGris75);
					xx = matriz8[j][0];
					yy = matriz8[j][1];		
					g.fillRect(xx,yy, ancho, largo);
					}	
					grgb4=0;
				}
				
				if(amarillo==1){
					g.setColor(Color.yellow);
					xx=matriz9[buffer9][0];
					yy=matriz9[buffer9][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer9;j++)
					{
					g.setColor(Color.yellow);
					xx = matriz9[j][0];
					yy = matriz9[j][1];		
					g.fillRect(xx,yy, ancho, largo);
					}	
					amarillo=0;
				}
				
				if(naranja==1){
					g.setColor(Color.orange);
					xx=matriz10[buffer10][0];
					yy=matriz10[buffer10][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer10;j++)
					{
					g.setColor(Color.orange);
					xx = matriz10[j][0];
					yy = matriz10[j][1];		
					g.fillRect(xx,yy, ancho, largo);
					}	
					naranja=0;
				}
				
				if(rosa==1){
					
					g.setColor(colorRosaos);
					xx=matriz11[buffer11][0];
					yy=matriz11[buffer11][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer11;j++)
					{
					g.setColor(colorRosaos);
					xx = matriz11[j][0];
					yy = matriz11[j][1];		
					g.fillRect(xx,yy, ancho, largo);
					}	
					rosa=0;
				}
				
				if(cyan==1){
					g.setColor(Color.cyan);
					xx=matriz12[buffer12][0];
					yy=matriz12[buffer12][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer12;j++)
					{
					g.setColor(Color.cyan);
					xx = matriz12[j][0];
					yy = matriz12[j][1];		
					g.fillRect(xx,yy, ancho, largo);
					}	
					cyan=0;
				}
				
				if(magenta==1){
					g.setColor(Color.magenta);
					xx=matriz13[buffer13][0];
					yy=matriz13[buffer13][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer13;j++)
					{
					g.setColor(Color.magenta);
					xx = matriz13[j][0];
					yy = matriz13[j][1];		
					g.fillRect(xx,yy, ancho, largo);
					}	
					magenta=0;
				}
				
				if(marron==1){
					g.setColor(colorMarron);
					xx=matriz11[buffer14][0];
					yy=matriz11[buffer14][1];
					g.fillRect(xx,yy, ancho, largo);
					//dibuja=false;
					//NUEVOOOOOOOOO
					for(int j=0;j<buffer14;j++)
					{
					g.setColor(colorMarron);
					xx = matriz14[j][0];
					yy = matriz14[j][1];		
					g.fillRect(xx,yy, ancho, largo);
					}	
					marron=0;
				}
				}
					
				}*/
			}
	


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void keyReleased(String e) {
		// TODO Auto-generated method stub
		
	}

	
	public void keyTyped(String e) {
		// TODO Auto-generated method stub
		
	}
	public void keyPressed(String e) {
				
		//l = e.getKeyText(e.getKeyCode());
		l=e;
		System.out.println("estoy en panelpaint");
			
		
		if(l.equals("up")){
				System.out.println("estoy en up");
			v[0]=boton.getX();
			v[1]=boton.getY();
			xx=v[0];
			yy=v[1];
			buffer();
			buffer1();
			buffer2();
			buffer3();
			buffer4();
			buffer5();
			buffer6();
			buffer7();
			buffer8();
			buffer9();
			buffer10();
			buffer11();
			buffer12();
			buffer13();
			buffer14();
			
			
				if(boton.getY()==largo*0.5){////restriccion de movimiento
					ar=0;
				}
				else if(boton.getY()>largo*0.5){
				
					yy-=mover;
					m1=xx;
					m2=yy;
					ar=1;
					arriba=1;
				}
			
			}

			else if(l.equals("down")){
				System.out.println("estoy en down");

			v[0]=boton.getX();
			v[1]=boton.getY();
			xx=v[0];
			yy=v[1];
			buffer();
			buffer1();
			buffer2();
			buffer3();
			buffer4();
			buffer5();
			buffer6();
			buffer7();
			buffer8();
			buffer9();
			buffer10();
			buffer11();
			buffer12();
			buffer13();
			buffer14();
			
			
				if(boton.getY()== 750-ancho*0.5){
					ab=0;
				}
				else if(boton.getY()<750-ancho*0.5){
				
					yy=yy+mover;
					m1=xx;
					m2=yy;
					ab=1;
					abajo=1;
				}
			
			
			
			}
			else if(l.equals("two")){
				System.out.println("estoy en five");

			v[0]=boton.getX();
			v[1]=boton.getY();
			xx=v[0];
			yy=v[1];
			buffer();
			buffer1();
			buffer2();
			buffer3();
			buffer4();
			buffer5();
			buffer6();
			buffer7();
			buffer8();
			buffer9();
			buffer10();
			buffer11();
			buffer12();
			buffer13();
			buffer14();
			
			
				if(boton.getY()== 750-ancho*0.5){
					ab=0;
				}
				else if(boton.getY()<750-ancho*0.5){
				
					contador=2;
				}
			
			
			
			}
			else if(l.equals("three")){
				System.out.println("estoy en five");

			v[0]=boton.getX();
			v[1]=boton.getY();
			xx=v[0];
			yy=v[1];
			buffer();
			buffer1();
			buffer2();
			buffer3();
			buffer4();
			buffer5();
			buffer6();
			buffer7();
			buffer8();
			buffer9();
			buffer10();
			buffer11();
			buffer12();
			buffer13();
			buffer14();
			
			
				if(boton.getY()== 750-ancho*0.5){
					ab=0;
				}
				else if(boton.getY()<750-ancho*0.5){
				
					contador=3;
				}
			
			
			
			}
			else if(l.equals("four")){
				System.out.println("estoy en five");

			v[0]=boton.getX();
			v[1]=boton.getY();
			xx=v[0];
			yy=v[1];
			buffer();
			buffer1();
			buffer2();
			buffer3();
			buffer4();
			buffer5();
			buffer6();
			buffer7();
			buffer8();
			buffer9();
			buffer10();
			buffer11();
			buffer12();
			buffer13();
			buffer14();
			
			
				if(boton.getY()== 750-ancho*0.5){
					ab=0;
				}
				else if(boton.getY()<750-ancho*0.5){
				
					contador=4;
				}
			
			
			
			}
			else if(l.equals("five")){
				System.out.println("estoy en five");

			v[0]=boton.getX();
			v[1]=boton.getY();
			xx=v[0];
			yy=v[1];
			buffer();
			buffer1();
			buffer2();
			buffer3();
			buffer4();
			buffer5();
			buffer6();
			buffer7();
			buffer8();
			buffer9();
			buffer10();
			buffer11();
			buffer12();
			buffer13();
			buffer14();
			
			
				if(boton.getY()== 750-ancho*0.5){
					ab=0;
				}
				else if(boton.getY()<750-ancho*0.5){
				
					contador=5;
				}
			
			
			
			}
			else if(l.equals("six")){
				System.out.println("estoy en five");

			v[0]=boton.getX();
			v[1]=boton.getY();
			xx=v[0];
			yy=v[1];
			buffer();
			buffer1();
			buffer2();
			buffer3();
			buffer4();
			buffer5();
			buffer6();
			buffer7();
			buffer8();
			buffer9();
			buffer10();
			buffer11();
			buffer12();
			buffer13();
			buffer14();
			
			
				if(boton.getY()== 750-ancho*0.5){
					ab=0;
				}
				else if(boton.getY()<750-ancho*0.5){
				
					contador=6;
				}
			
			
			
			}
			else if(l.equals("seven")){
				System.out.println("estoy en five");

			v[0]=boton.getX();
			v[1]=boton.getY();
			xx=v[0];
			yy=v[1];
			buffer();
			buffer1();
			buffer2();
			buffer3();
			buffer4();
			buffer5();
			buffer6();
			buffer7();
			buffer8();
			buffer9();
			buffer10();
			buffer11();
			buffer12();
			buffer13();
			buffer14();
			
			
				if(boton.getY()== 750-ancho*0.5){
					ab=0;
				}
				else if(boton.getY()<750-ancho*0.5){
				
					contador=7;
				}
			
			
			
			}
			else if(l.equals("right")){
			System.out.println("estoy en right");

			v[0]=boton.getX();
			v[1]=boton.getY();
			xx=v[0];
			yy=v[1];
			buffer();
			buffer1();
			buffer2();
			buffer3();
			buffer4();
			buffer5();
			buffer6();
			buffer7();
			buffer8();
			buffer9();
			buffer10();
			buffer11();
			buffer12();
			buffer13();
			buffer14();
			
			
				if(boton.getX()== 1370-ancho*0.5){
					der=0;
				}
				else if(boton.getX()<1370-ancho*0.5){
				
					xx+=mover;
					m1=xx;
					m2=yy;
					der=1;
					derecha=1;
				}
			

			}

			else if(l.equals("left")){
			System.out.println("estoy en left");
			v[0]=boton.getX();
			v[1]=boton.getY();
			xx=v[0];
			yy=v[1];
			buffer();
			buffer1();
			buffer2();
			buffer3();
			buffer4();
			buffer5();
			buffer6();
			buffer7();
			buffer8();
			buffer9();
			buffer10();
			buffer11();
			buffer12();
			buffer13();
			buffer14();
			
			
				if(boton.getX()==ancho*0.5){
					izq=0;
				}
				else if(boton.getX()>ancho*0.5){
					
					xx-=mover;
					m1=xx;
					m2=yy;
					izq=1;
					izquierda=1;
				}
			
			}
			//ponia A
			else if(l.equals("paint")){
				System.out.println("He dicho pintar black \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz[buffer][0]=xx;
				matriz[buffer][1]=yy;
				n=1+n;
				buffer=n;
				negro=1;
				dibuja=true;
				System.out.println("Buffer es fuera"+buffer);
					//NUEVOOOOOOOOO
					
			}
			
			else if(l.equals("S")){
				System.out.println("HE PULSADO S \n");
				xx = boton.getX();
				yy = boton.getY();
				v[0]=xx;
				v[1]=yy;
				
				for(int k=1;k<=buffer;k++)
				{
					if(matriz[k][0]==(v[0]))
					{
						if(matriz[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz[k][0]=matriz[k-1][0];
							matriz[k][1]=matriz[k-1][1];
							
						}
					}
				}
				for(int k=1;k<=buffer1;k++)
				{
					if(matriz1[k][0]==(v[0]))
					{
						if(matriz1[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz1[k][0]=matriz1[k-1][0];
							matriz1[k][1]=matriz1[k-1][1];
							
						}
					}
				}
				for(int k=1;k<=buffer2;k++)
				{
					if(matriz2[k][0]==(v[0]))
					{
						if(matriz2[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz2[k][0]=matriz2[k-1][0];
							matriz2[k][1]=matriz2[k-1][1];
							
						}
					}
				}
				for(int k=1;k<=buffer3;k++)
				{
					if(matriz3[k][0]==(v[0]))
					{
						if(matriz3[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz3[k][0]=matriz3[k-1][0];
							matriz3[k][1]=matriz3[k-1][1];
							
						}
					}
				}
				for(int k=1;k<=buffer4;k++)
				{
					if(matriz4[k][0]==(v[0]))
					{
						if(matriz4[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz4[k][0]=matriz4[k-1][0];
							matriz4[k][1]=matriz4[k-1][1];
							
						}
					}
				}
				for(int k=1;k<=buffer5;k++)
				{
					if(matriz5[k][0]==(v[0]))
					{
						if(matriz5[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz5[k][0]=matriz5[k-1][0];
							matriz5[k][1]=matriz5[k-1][1];
							
						}
					}
				}
				for(int k=1;k<=buffer6;k++)
				{
					if(matriz6[k][0]==(v[0]))
					{
						if(matriz6[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz6[k][0]=matriz6[k-1][0];
							matriz6[k][1]=matriz6[k-1][1];
							
						}
					}
				}
				for(int k=1;k<=buffer7;k++)
				{
					if(matriz7[k][0]==(v[0]))
					{
						if(matriz7[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz7[k][0]=matriz7[k-1][0];
							matriz7[k][1]=matriz7[k-1][1];
							
						}
					}
				}
				for(int k=1;k<=buffer8;k++)
				{
					if(matriz8[k][0]==(v[0]))
					{
						if(matriz8[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz8[k][0]=matriz8[k-1][0];
							matriz8[k][1]=matriz8[k-1][1];
							
						}
					}
				}
				
				for(int k=1;k<=buffer9;k++)
				{
					if(matriz9[k][0]==(v[0]))
					{
						if(matriz9[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz9[k][0]=matriz9[k-1][0];
							matriz9[k][1]=matriz9[k-1][1];
							
						}
					}
				}
				
				for(int k=1;k<=buffer10;k++)
				{
					if(matriz10[k][0]==(v[0]))
					{
						if(matriz10[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz10[k][0]=matriz10[k-1][0];
							matriz10[k][1]=matriz10[k-1][1];
							
						}
					}
				}
				
				for(int k=1;k<=buffer11;k++)
				{
					if(matriz11[k][0]==(v[0]))
					{
						if(matriz11[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz11[k][0]=matriz11[k-1][0];
							matriz11[k][1]=matriz11[k-1][1];
							
						}
					}
				}
				
				for(int k=1;k<=buffer12;k++)
				{
					if(matriz12[k][0]==(v[0]))
					{
						if(matriz12[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz12[k][0]=matriz12[k-1][0];
							matriz12[k][1]=matriz12[k-1][1];
							
						}
					}
				}
				
				for(int k=1;k<=buffer13;k++)
				{
					if(matriz13[k][0]==(v[0]))
					{
						if(matriz13[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz13[k][0]=matriz13[k-1][0];
							matriz13[k][1]=matriz13[k-1][1];
							
						}
					}
				}
				
				for(int k=1;k<=buffer14;k++)
				{
					if(matriz14[k][0]==(v[0]))
					{
						if(matriz14[k][1]==(v[1]))//elimino la posicion de la matriz pintar
						{
							matriz14[k][0]=matriz14[k-1][0];
							matriz14[k][1]=matriz14[k-1][1];
							
						}
					}
				}
			}
			
			else if(l.equals("more")){
				// Llama al metodo zoom y multiplica la constante q
				
				if(u!=2){
					if(u<2 && u>=0){
						u++;
						q=(float) 0.5;
						zoom=true;
						repaint();
						zoom();
					}
				}
			}
			
			else if(l.equals("less")){
				
				if(u!=0){
					if(u<3){
						u--;
						q=2;
						zoom=true;
						repaint();
						zoom();
						}
					}
			}
			
			else if(l.equals("red")){
				System.out.println("HE PULSADO R \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz1[buffer1][0]=xx;
				matriz1[buffer1][1]=yy;
				n1=1+n1;
				buffer1=n1; 
				rojo=1;
				dibuja=true;
			}
			
			else if(l.equals("green")){
				System.out.println("HE PULSADO G \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz2[buffer2][0]=xx;
				matriz2[buffer2][1]=yy;
				n2=1+n2;
				buffer2=n2; 
				verde=1;
				dibuja=true;
			}
			
			else if(l.equals("blue")){
				System.out.println("HE PULSADO B \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz3[buffer3][0]=xx;
				matriz3[buffer3][1]=yy;
				n3=1+n3;
				buffer3=n3; 
				azul=1;
			}
			
			else if(l.equals("H")){
				System.out.println("HE PULSADO H \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz4[buffer4][0]=xx;
				matriz4[buffer4][1]=yy;
				n4=1+n4;
				buffer4=n4;
				grgb=1;
			}
			
			else if(l.equals("J")){
				System.out.println("HE PULSADO J \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz5[buffer5][0]=xx;
				matriz5[buffer5][1]=yy;
				n5=1+n5;
				buffer5=n5;
				grgb1=1;
			}
			else if(l.equals("K")){
				System.out.println("HE PULSADO K \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz6[buffer6][0]=xx;
				matriz6[buffer6][1]=yy;
				n6=1+n6;
				buffer6=n6;
				grgb2=1;
			}
			
			else if(l.equals("L")){
				System.out.println("HE PULSADO L \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz7[buffer7][0]=xx;
				matriz7[buffer7][1]=yy;
				n7=1+n7;
				buffer7=n7;
				grgb3=1;
			}
			
			else if(l.equals("N")){
				System.out.println("HE PULSADO N \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz8[buffer8][0]=xx;
				matriz8[buffer8][1]=yy;
				n8=1+n8;
				buffer8=n8;
				grgb4=1;
			}
			
			else if(l.equals("yellow")){
				System.out.println("HE PULSADO Y \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz9[buffer9][0]=xx;
				matriz9[buffer9][1]=yy;
				n9=1+n9;
				buffer9=n9;
				amarillo=1;
			}
			
			else if(l.equals("orange")){
				System.out.println("HE PULSADO O \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz10[buffer10][0]=xx;
				matriz10[buffer10][1]=yy;
				n10=1+n10;
				buffer10=n10;
				naranja=1;
			}
			
			else if(l.equals("P")){
				System.out.println("HE PULSADO P \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz11[buffer11][0]=xx;
				matriz11[buffer11][1]=yy;
				n11=1+n11;
				buffer11=n11;
				rosa=1;
			}
			
			else if(l.equals("C")){
				System.out.println("HE PULSADO C \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz12[buffer12][0]=xx;
				matriz12[buffer12][1]=yy;
				n12=1+n12;
				buffer12=n12;
				cyan=1;
			}
			
			else if(l.equals("M")){
				System.out.println("HE PULSADO M \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz13[buffer13][0]=xx;
				matriz13[buffer13][1]=yy;
				n13=1+n13;
				buffer13=n13;
				grgb4=1;
			}
			
			else if(l.equals("V")){
				System.out.println("HE PULSADO V \n");
				xx = boton.getX();
				yy = boton.getY();
				matriz14[buffer14][0]=xx;
				matriz14[buffer14][1]=yy;
				n14=1+n14;
				buffer14=n14;
				marron=1;
			}
			
			
			/////////////////visualizar el puntero///////////////////////
		
			if(ar==1)
			{
				if(arriba==1)
				{
					for(int i=0;i<contador;i++)
					{
					m2=m2-mover;	
					boton.setBounds(m1,m2, ancho, largo);
				
					}
				}
				boton.setBounds(m1,m2, ancho, largo);
				ar=0;
			}
			if(ab==1)
			{
				if(abajo==1)
				{
					for(int i=0;i<contador;i++)
					{
						m2=m2+mover;
					boton.setBounds(m1, m2, ancho, largo);
					ab=0;
					}
				}
				boton.setBounds(m1, m2, ancho, largo);
				ab=0;
			}
			if(izq==1)
			{
				if(izquierda==1)
				{
					for(int i=0;i<contador;i++)
					{
					m1=m1-mover;	
					boton.setBounds(m1,m2, ancho, largo);
				
					}
				}
				boton.setBounds(m1,m2, ancho, largo);
				izq=0;
			}
			if(der==1)
			{
				if(derecha==1)
				{
					for(int i=0;i<contador;i++)
					{
					m1=m1+mover;	
					boton.setBounds(m1,m2, ancho, largo);
				
					}
				}
				boton.setBounds(m1,m2, ancho, largo);
				der=0;
			}

		/////////////////////////////////////////////////////////////////////////
		
	}
	
}