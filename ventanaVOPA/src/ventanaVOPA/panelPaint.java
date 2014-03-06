package ventanaVOPA;

import java.awt.*;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.KeyEventDispatcher;
import java.awt.event.*;
import java.awt.geom.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class panelPaint extends JPanel implements KeyListener {
//Se g
	//public static JPanel panel2;
	public static JButton boton;
	public static int n=0;
	public static int buffer=0;//PRUEBO A PONER BUFFER=1 , PRUEBAAAAAAAAAAAAAAAAAA
	int x=0, y=0, xx=-1, yy=-1,ab=0,ar=0,izq=0,der=0;
	public static Graphics2D g;
	public String l;
	boolean dibuja=false;
	int matriz[][]=new int[300][2];//NUEVO
	int v[]=new int[2];//NUEVO
	//int a=-1,b=-1;
	//Graphics gBuffer;//prueba rara
	public panelPaint(){
		n=buffer;
		
		
		//initComponent();
		boton = new JButton();
		boton.setBounds(x, y, 20, 20);
	
		setLayout(null);
		setBounds(201,0,1400,800);
		setBackground(Color.white);//he cambiado el color
		add(boton);
		boton.addKeyListener(this);
		
	}


/////////////////metodos con el teclado////////////////////////////
	@Override
	public void keyPressed(KeyEvent e) {
		int j,k,m;//NUEVO
		//System.out.println(e.getKeyText(e.getKeyCode()));
		System.out.println("POSICION ACTUAL PRIMERO "+xx+"," +yy);//PRUEBA PARA COMPROBAR POSICION
		for(m=0;m<buffer;m++)
		{
			System.out.println("elemento "+m);
			System.out.print(matriz[m][0]+" ,"+matriz[m][1]+"\n");
		}
		//System.out.println("VARIABLES a y b "+a +b);
		
		l = e.getKeyText(e.getKeyCode());
			if(l.equals("Arriba")){

			y-=20;
			//boton.setBounds(x, y, 20, 20);
			v[0]=boton.getX();
			v[1]=boton.getY();
			ar=1;
			//dibuja=true;
			
			for(j=0;j<buffer;j++)
			{
				if(matriz[j][0]==(v[0]))
				{
					if(matriz[j][1]==(v[1]))
					{
						xx = boton.getX();
						yy = boton.getY();
						System.out.println("he pulsado arriba y tiene que redibujar");
						dibuja=true;
					}
				}
			}
			
			
			}

			else if(l.equals("Abajo")){

			y+=20;
			//boton.setBounds(x, y, 20, 20);
			v[0]=boton.getX();
			v[1]=boton.getY();
			ab=1;
			//dibuja=true;
			
			for(j=0;j<buffer;j++)
			{
				if(matriz[j][0]==(v[0]))
				{
					if(matriz[j][1]==(v[1]))
					{
						xx = boton.getX();
						yy = boton.getY();
						System.out.println("he pulsado abajo y tiene que redibujar");
						dibuja=true;
					}
				}
			}
			}

			else if(l.equals("Derecha")){

			x+=20;
			//boton.setBounds(x, y, 20, 20);
			v[0]=boton.getX();
			v[1]=boton.getY();
			der=1;
			//dibuja=true;
			
			for(j=0;j<buffer;j++)
			{
				if(matriz[j][0]==(v[0]))
				{
					if(matriz[j][1]==(v[1]))
					{
						xx = boton.getX();
						yy = boton.getY();
						System.out.println("he pulsado derecha y tiene que redibujar");
						dibuja=true;
					}
				}
			}

			}

			else if(l.equals("Izquierda")){

			x-=20;
			//boton.setBounds(x, y, 20, 20);
			v[0]=boton.getX();
			v[1]=boton.getY();
			izq=1;
			//dibuja=true;
			
			for(j=0;j<buffer;j++)
			{
				if(matriz[j][0]==(v[0]))
				{
					if(matriz[j][1]==(v[1]))
					{
						xx = boton.getX();
						yy = boton.getY();
						System.out.println("he pulsado izquierda y tiene que redibujar");
						dibuja=true;
					}
				}
			}

			}
			
			else if(l.equals("A")){
				System.out.println("HE PULSADO A \n");//NUEVO
				xx = boton.getX();
				yy = boton.getY();
				//a=a*(-1);
				System.out.println("He entrado a A");
				//b=b*(-1);
				//System.out.println("el valor de buffer ANTES es");//NUEVO
				//System.out.println(buffer);//NUEVO
				matriz[buffer][0]=xx;//NUEVO
				matriz[buffer][1]=yy;//NUEVO
				//System.out.println(matriz[buffer][0]);//NUEVO
				//System.out.println(matriz[buffer][1]);//NUEVO
				n=1+n;//NUEVO
				buffer=n;
				//System.out.println("el valor de buffer DESPUES es");//NUEVO
				//System.out.println(buffer);//NUEVO
				dibuja=true;
				//paintComponent(g);

			}
			if(ar==1)
			{
				boton.setBounds(x, y, 20, 20);
				ar=0;
			}
			if(ab==1)
			{
				boton.setBounds(x, y, 20, 20);
				ab=0;
			}
			if(izq==1)
			{
				boton.setBounds(x, y, 20, 20);
				izq=0;
			}
			if(der==1)
			{
				boton.setBounds(x, y, 20, 20);
				der=0;
			}

		
		
	}
	public void paintComponent(Graphics g){
		//pienso que falla porque al coger xx e yy valores, luego siempre entra
		//e intenta pintar de negro
				//gBuffer.setColor(Color.red);//prueba rara
		System.out.println("POSICION ACTUAL SEGUNDA "+xx+"," +yy);
				super.paintComponent(g);
				g = (Graphics2D) g;
				//System.out.println("voy a ver si pinto esta posicion:"+xx);//NUEVO
				//System.out.println("voy a ver si pinto esta otra posicion"+yy);//NUEVO
				if (xx != -1 && yy != -1){
				System.out.println("pinto");
				g.setColor(Color.black);
				if (dibuja)
					{
					//System.out.println("seguro"+xx);//NUEVO
					//System.out.println("seguro segundo"+yy);//NUEVO
					
					g.fillRect(xx,yy,20,20);

					xx=-1;
					yy=-1;
					}
					
				}
				
			}
	


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
}
