package Ventanas;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Entrenamiento {

	private static JFrame frame;
	private static ArrayList<JLabel> Etiqueta;
	private static ArrayList<JLabel> TeclaLabel;
	private static JTextField ResultadoText;
	private static String Acumulador="";
	private static boolean TipeoEnable; 

	public Entrenamiento(int x,int y) {
		initialize(x,y);
		frame.setVisible(true);
	}

	private void initialize(int x, int y) {
		frame = new JFrame();
		frame.setBounds(x, y, 699, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Image icono = new ImageIcon(getClass().getResource("/Imag_Menu/Icono.png")).getImage();
	    frame.setIconImage(icono);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setTitle("MarencoGrafia v1.7");
		frame.setResizable(false); 
		
		JLabel TecladoLabel = new JLabel();
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/Imag_Entrenamiento/Teclado.png"));
		TecladoLabel.setBounds(32,30,icon.getIconWidth(),icon.getIconHeight());
		TecladoLabel.setIcon(icon);
		frame.getContentPane().add(TecladoLabel);
		
		JLabel ManoDer = new JLabel();
		ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/Imag_Entrenamiento/Mano Derecha.png"));
		ManoDer.setBounds(224,275,icon1.getIconWidth(),icon1.getIconHeight());
		ManoDer.setIcon(icon1);
		frame.getContentPane().add(ManoDer);

		JLabel ManoIzq = new JLabel();
		ImageIcon icon2 = new ImageIcon(this.getClass().getResource("/Imag_Entrenamiento/Mano Izquierda.png"));
		ManoIzq.setBounds(68,275,icon2.getIconWidth(),icon2.getIconHeight());
		ManoIzq.setIcon(icon2);
		frame.getContentPane().add(ManoIzq);
		
		TeclaLabel = new ArrayList<JLabel>();
		Etiqueta = new ArrayList<JLabel>();
		
		KeyBoard_Entrenamiento Teclado = new KeyBoard_Entrenamiento();
		frame.getContentPane().add(Teclado);
		
		ResultadoText = new JTextField();
		ResultadoText.setBackground(Color.LIGHT_GRAY);
		ResultadoText.setEnabled(false);
		ResultadoText.setFont(new Font("Tahoma", Font.BOLD, 15));
		ResultadoText.setHorizontalAlignment(SwingConstants.CENTER);
		ResultadoText.setBounds(376, 421, 270, 29);
		ResultadoText.setColumns(10);
		frame.getContentPane().add(ResultadoText);
		
		JLabel lblLaPresenteSeccion = new JLabel("La presente seccion, mostrara el resultado del tipeo. ");
		lblLaPresenteSeccion.setForeground(Color.GREEN);
		lblLaPresenteSeccion.setBounds(384, 328, 255, 14);
		frame.getContentPane().add(lblLaPresenteSeccion);
		
		JLabel lblElResultadoDel = new JLabel("\u00B7 Para habilitarlo, presione '+'.");
		lblElResultadoDel.setForeground(Color.GREEN);
		lblElResultadoDel.setBounds(384, 349, 151, 14);
		frame.getContentPane().add(lblElResultadoDel);
		
		JLabel lblParaResetearloPresion = new JLabel("\u00B7 Para desabilitarlo, presione '-'.");
		lblParaResetearloPresion.setForeground(Color.GREEN);
		lblParaResetearloPresion.setBounds(384, 370, 163, 14);
		frame.getContentPane().add(lblParaResetearloPresion);
		
		JLabel lblNewLabel = new JLabel("\u00B7 Para resetearlo, presione Enter.");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBounds(384, 391, 163, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSiDesea = new JLabel("- Si desea volver, presione Esc.");
		lblSiDesea.setForeground(Color.CYAN);
		lblSiDesea.setBounds(384, 298, 151, 14);
		frame.getContentPane().add(lblSiDesea);
		
		TipeoEnable = false;
	}

	public static boolean EtiquetaExistente(String letra){
		for (int i=0;i<Etiqueta.size();i++){
			if(Etiqueta.get(i).getText().equals(letra)){
				return true;
			}
		}
		return false;
	}
	
	private static int PosicionDeLetra(String letra){
		for (int i=0;i<Etiqueta.size();i++){
			if(Etiqueta.get(i).getText().equals(letra)){
				return i;
			}
		}
		return -1;
	}
	
	public static void MostrarEtiqueta(String Caracter, int Cx,int Cy, String TipoDeTecla, int TTx, int TTy){
		DibujarCaracter(Caracter, Cx, Cy);
		DibujarTecla(TipoDeTecla, TTx, TTy);
		SumarEtiquetas();
		SumarTecla();
		RefrescarPantalla();
		if(TipeoEnable==true){
			ActualizarJText(Caracter);	
		}
	}

	private static void ActualizarJText(String Caracter) {
		if(Caracter.equals("Space")){
			Acumulador=Acumulador+" ";
			ResultadoText.setText(Acumulador);
		}else{
			if(Caracter.equals("Intro")){
				Acumulador="";
				ResultadoText.setText(Acumulador);
			}else{
				Acumulador=Acumulador+Caracter;
				ResultadoText.setText(Acumulador);
			}	
		}
	}
	
	private static void DibujarCaracter(String Caracter, int x,int y){
		JLabel Caract = new JLabel(Caracter);
		Caract.setForeground(Color.BLACK);
		Caract.setFont(new Font("Arial", Font.BOLD, 13));
		Caract.setBounds(x,y,60,20);
		Etiqueta.add(Caract);
	}
	
	private static void DibujarTecla(String TipoDeTecla, int x, int y){	
		JLabel Tecla = new JLabel();
		ImageIcon icon = new ImageIcon(frame.getClass().getResource("/Imag_Entrenamiento/"+TipoDeTecla+".png"));
		int Ancho = icon.getIconWidth();
		int Alto = icon.getIconHeight();
		Tecla.setBounds(x,y,Ancho,Alto);
		Tecla.setIcon(icon);
		TeclaLabel.add(Tecla);
	}
	
	private static void SumarEtiquetas(){
		int UltAgr = Etiqueta.size()-1;
		frame.getContentPane().add(Etiqueta.get(UltAgr));
	}

	private static void SumarTecla(){
		int UltAgr = TeclaLabel.size()-1;
		frame.getContentPane().add(TeclaLabel.get(UltAgr));
	}
	
	private static void RefrescarPantalla(){
		frame.repaint();
		frame.validate();
	}
	
	public static void EliminarEtiqueta(String letra){
		int Posicion = PosicionDeLetra(letra);
		frame.getContentPane().remove(Etiqueta.get(Posicion));
		frame.getContentPane().remove(TeclaLabel.get(Posicion));
		Etiqueta.remove(Posicion);
		TeclaLabel.remove(Posicion);
		RefrescarPantalla();
	}
	
	public static void HabilitarTipeo(){
		TipeoEnable = true;
	}
	
	public static void DesabilitarTipeo(){
		TipeoEnable = false;
	}
	
	public static void VolverAtras(){
		@SuppressWarnings("unused")
		Menu_Principal Menu = new Menu_Principal(frame.getX(),frame.getY());
		frame.dispose();
	}
}
