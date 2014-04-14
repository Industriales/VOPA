package clases;

import java.awt.event.KeyEvent;
import java.awt.event.KeyEvent.*;

import edu.cmu.sphinx.decoder.search.ActiveList;
import edu.cmu.sphinx.frontend.util.Microphone;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.util.props.ConfigurationManager;

import java.io.FileReader;
import java.util.Locale;

import javax.swing.KeyStroke;

public class reconocerVoz implements Runnable {
	
	String palabra;
	Thread t;
	
	
	public void Hilo2(){
		
		t = new Thread(this,"hilo2");
		t.start();
	}
	 @Override
	 public void run() {
	      this.reconocerVozz();
	    }


public void reconocerVozz(){
	
	
	 ConfigurationManager cm = new ConfigurationManager(mainVentana.class.getResource("SpeechToText.config.xml"));

        Recognizer recognizer = (Recognizer) cm.lookup("recognizer");
        recognizer.allocate();

        Microphone microphone = (Microphone) cm.lookup("microphone");
        if (!microphone.startRecording()) {
          
        	System.out.println("Error, microfono no encontrado");
            recognizer.deallocate();
        }

        System.out.println("A la espera de comandos de voz:");
        
        // Bucle para reconocimiento voz
        while (true) {

            Result result = recognizer.recognize();

            if (result != null) {
                String resultText = result.getBestFinalResultNoFiller();
                String e = resultText;//declara la variable que vas a pasar
				
                
                if(!resultText.equalsIgnoreCase("Open Note Pad") && !resultText.equalsIgnoreCase("")){
                	System.out.println("Comando: " + resultText);
                	opciones(e);
                }
                else{
                	Runtime r=Runtime.getRuntime();
                	
                	System.out.println("error pronunciacion");
                }
            } 
            if (result == null) {
            	System.out.println("Comando no reconocido");
            }
        }
	}

	
	public void opciones (String re){
		
		//System.out.println("dentro de opciones");
		panelPaint con = new panelPaint();
                	con.keyPressed(re);
                
	}



}