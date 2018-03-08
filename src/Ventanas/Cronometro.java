package Ventanas;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Cronometro extends Thread {

    JFrame frame;
    static JLabel tiempo;
    boolean cronometroActivo;
    static Integer segundos;
    static Integer milesimas;
    
    static int AcumuladorDeMinutos;
    static int AcumuladorDeSegundos;
    static int AcumuladorDeMilesimas;
    static int Divisor;
    
    static boolean ActivarVisualizacion;
    
    public Cronometro(JFrame frame){
        super();
        cronometroActivo=true;
        ActivarVisualizacion=false;
        tiempo = new JLabel("---");
        tiempo.setBounds(271, 375, 150, 25);
        tiempo.setFont( new Font( Font.DIALOG_INPUT, Font.CENTER_BASELINE, 25 ) );
        tiempo.setHorizontalAlignment( JLabel.CENTER );
        tiempo.setForeground( Color.green );
        tiempo.setBackground( Color.BLACK );
        tiempo.setOpaque( true );
        frame.getContentPane().add(tiempo); 
    	start();
    }   
    
    public void run() {
    	segundos = 0;
    	milesimas = 0;
	    try{
	    	
        while( cronometroActivo )
        {
            Thread.sleep( 1 );
            //Incrementamos 4 milesimas de segundo
            milesimas += 1;

            //Cuando llega a 1000 osea 1 segundo aumenta 1 segundo
            //y las milesimas de segundo de nuevo a 0
            if( milesimas == 1000 )
            {
                milesimas = 0;
                segundos += 1;
                //Si los segundos llegan a 60 entonces aumenta 1 los minutos
                //y los segundos vuelven a 0
                if( segundos == 60 )
                {
                    segundos = 0;
                }
            }

            //Colocamos en la etiqueta la informacion
            if(ActivarVisualizacion){
                tiempo.setText("#"+TiempoPromedio());
            }
        }     
	    }catch (Exception ex) {
	        System.out.println(ex.getMessage());
	    }                 
    }
  
    public static void TomarTime(){
    	if(ActivarVisualizacion==false){
    		ActivarVisualizacion=true;
        	segundos=0;
        	milesimas=0;
        	AcumuladorDeMinutos=0;
        	AcumuladorDeSegundos=0;
        	AcumuladorDeMilesimas=0;
        	Divisor=0;
        	SetearPuesto();
    	}
    	
    	AcumuladorDeSegundos=AcumuladorDeSegundos+segundos;
    	AcumuladorDeMilesimas=AcumuladorDeMilesimas+milesimas;
    	Divisor++;
    	
    	segundos=0;
    	milesimas=0;
    }
    
    public static void DetenerCronometro(){
    	ActivarVisualizacion=false;
    }
    
	public static int TiempoPromedio(){
		int promSeg = AcumuladorDeSegundos/Divisor;
		int promMil = AcumuladorDeMilesimas/Divisor;
		int resultado = promSeg*1000+promMil;
		return resultado;
	}
	
	public static void SetearPuesto(){
		tiempo.setForeground( Color.green );
		tiempo.setText("---");
	}

	public static void PuestoResultante(){
		tiempo.setForeground( Color.ORANGE );
	}
	
 }