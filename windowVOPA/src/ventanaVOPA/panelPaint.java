package ventanaVOPA;

import java.awt.*;

import javax.swing.JPanel;
import javax.swing.JButton;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.KeyEventDispatcher;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class panelPaint extends JPanel implements KeyListener {

	//declaracion de las variables
	public static JButton boton;
	public static int n=0;
	public static int buffer;
	int x=-2, y=-2, xx=-1, yy=-1,ab=0,ar=0,izq=0,der=0;
	public static Graphics2D g;
	public String l;
	boolean dibuja = false, zoom = false;
	int[][] matriz=new int[300][2];//NUEVO//declaramos una matriz para almacenar nuestro dibujo
	int v[]=new int[2];//NUEVO
	int ancho=20, largo=20, mover=20, zo=0, variable =0;
	float q=1;
	//String color = "black";
	
	
	
	
	
	
	
	public panelPaint(){
		n=buffer;
		boton = new JButton();//llamamos al boton
		boton.setBounds(x, y, ancho, largo);
	
		setLayout(null);
		setBounds(201,0,1400,800);
		setBackground(Color.white);//he cambiado el color
		add(boton);
		boton.addKeyListener(this);
		
	}
///////////////////////////////////////////////////////////////////
	public void zoom(){
		
		if(zoom){
		ancho = (int) (ancho*q);	// se multiplica para darle proporcion a las dimensiones y el movimiento del puntero
		largo = (int) (largo*q);
		mover = (int) (mover*q);
		
		y = (int) (y*q); // calibrar el puntero
		x = (int) (y*q);
		
		int j;
		for(j=0;j<300;j++){
			
			matriz[j][0] = (int) (matriz[j][0]*q);
			matriz[j][1] = (int) (matriz[j][1]*q);
			repaint();
			dibuja = true;
			
			zo=1;
			
		}
		
		System.out.println("zoom");
		
		}
	}
	

/////////////////metodos con el teclado////////////////////////////
	@Override
	public void keyPressed(KeyEvent e) {
		int j,k,m;//NUEVO
		
		for(m=0;m<=buffer;m++)
		{
			System.out.println("elemento "+m);
			System.out.print(matriz[m][0]+" ,"+matriz[m][1]+"\n");
		}
		
		
		l = e.getKeyText(e.getKeyCode());

			if(l.equals("Arriba")){

			y-=mover;
			v[0]=boton.getX();
			v[1]=boton.getY();
			ar=1;
			
			
			for(j=0;j<=buffer;j++)
			{
				if(matriz[j][0]==(v[0]))
				{
					if(matriz[j][1]==(v[1]))
					{
						xx = boton.getX();
						yy = boton.getY();//HE AÑADIDO EL 20, VEREMOS A VER
						System.out.println("he pulsado arriba y tiene que redibujar");
						dibuja=true;
						
					}
				}
			}
			
			
			}

			else if(l.equals("Abajo")){

			y+=mover;
			v[0]=boton.getX();
			v[1]=boton.getY();
			ab=1;
						
			for(j=0;j<=buffer;j++)
			{
				if(matriz[j][0]==(v[0]))
				{
					if(matriz[j][1]==(v[1]))
					{
						xx = boton.getX();
						yy = boton.getY();//HE AÑADIDO EL 20, VEREMOS A VER
						System.out.println("he pulsado abajo y tiene que redibujar");
						dibuja=true;
						
					}
				}
			}
			}

			else if(l.equals("Derecha")){

			x+=mover;
			v[0]=boton.getX();
			v[1]=boton.getY();
			der=1;
			
			for(j=0;j<=buffer;j++)
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

			x-=mover;
			v[0]=boton.getX();
			v[1]=boton.getY();
			izq=1;
			
			for(j=0;j<=buffer;j++)
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
				matriz[buffer][0]=xx;//NUEVO
				matriz[buffer][1]=yy;//NUEVO
				n=1+n;//NUEVO
				buffer=n;
				dibuja=true;


			}
			
			else if(l.equals("Q")){
				System.out.println("HE PULSADO Q \n");// Llama al metodo zoom y multiplica la constante q
				q=(float) 0.5;
				zoom=true;
				zoom();			
			}
			
			else if(l.equals("W")){
				System.out.println("HE PULSADO w \n");
				q=2;
				zoom=true;
				zoom();			
			}
			
			else if(l.equals("B")){
				System.out.println("HE PULSADO B \n");
				xx = boton.getX();
				yy = boton.getY();
			/*	matriz[buffer][0]=xx;//NUEVO intento que se conserve el borrado!!!!
				matriz[buffer][1]=yy;//NUEVO
				n=1+n;//NUEVO
				buffer=n; */
				variable=1;
				dibuja=true;
			}
			
		
			if(ar==1)
			{
				boton.setBounds(x, y, ancho, largo);
				ar=0;
			}
			if(ab==1)
			{
				boton.setBounds(x, y, ancho, largo);
				ab=0;
			}
			if(izq==1)
			{
				boton.setBounds(x, y, ancho, largo);
				izq=0;
			}
			if(der==1)
			{
				boton.setBounds(x, y, ancho, largo);
				der=0;
			}

		
		
	}
	public void paintComponent(Graphics g){
		
				super.paintComponent(g);
				g = (Graphics2D) g;
				
				if(zo==1){
					
					g.setColor(Color.black);
					if(dibuja){
					for(int j=0;j<300;j++){
						
						xx = matriz[j][0];
						yy = matriz[j][1];
						boton.setBounds(x, y, ancho, largo);				
						g.fillRect(xx,yy, ancho, largo);
						xx=-1;
						yy=-1;
						}	
					zo=0;
						}	
				}

				if (xx != -1 && yy != -1){
				System.out.println("pinto");
				
				g.setColor(Color.black);
					if (dibuja)
						{
							if(variable==1){
								g.setColor(Color.white);
								g.fillRect(xx,yy, ancho, largo);
								variable=0;
								
							}
						
						g.fillRect(xx,yy, ancho, largo);
						
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
