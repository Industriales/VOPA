package ventanaVOPA;


import javax.swing.JFrame;



public class mainVentana extends JFrame {
		
	
	
	public mainVentana(){
		
		
		
		setLayout(null);
		//tamaño ventana
		setSize(1600, 800);
		//titulo de la ventana
		setTitle("VOPA");
		//centrar ventana
		setLocationRelativeTo(null);
		
			 
		panelOpciones panel = new panelOpciones();
		panelPaint panel2 = new panelPaint();
		 
		 //agregamos el panel a la ventana		 
		add(panel2);
		add(panel);
			 
		
		//visualizar ventana
		setVisible(true);
		setResizable(false);
		 
		// x de la ventana se cierre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		 
		 }
	
	public static void main (String[] args){
		
		mainVentana windows = new mainVentana();
	}
		
}
	