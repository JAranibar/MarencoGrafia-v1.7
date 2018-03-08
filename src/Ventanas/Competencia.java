package Ventanas;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;

public class Competencia {

	private static JFrame frame;
	private static ArrayList<String> Oraciones;
	private static ArrayList<JLabel> NombrePosicion;
	private static ArrayList<JLabel> RankingPosicion;
	private static JLabel OracionAsignada;
	private static JLabel OracionIntroducida;
	private static JLabel LabelNotificacion;
	private static JTextField NombreGamer;
	
	
	public Competencia(int x,int y) {
		initialize(x,y);
		frame.setVisible(true);
	}

	private void initialize(int x, int y) {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.RED);
		frame.setBounds(x, y, 699, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Image icono = new ImageIcon(getClass().getResource("/Imag_Menu/Icono.png")).getImage();
	    frame.setIconImage(icono);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setTitle("MarencoGrafia v1.7");
		frame.setResizable(false); 
		
		JLabel Monitor = new JLabel();
		ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/Imag_Competencia/Monitor.png"));
		Monitor.setBounds(181,255,icon1.getIconWidth(),icon1.getIconHeight());
		Monitor.setIcon(icon1);
		frame.getContentPane().add(Monitor);
		
		JLabel Ranking = new JLabel();
		ImageIcon icon2 = new ImageIcon(this.getClass().getResource("/Imag_Competencia/Ranking.png"));
		Ranking.setBounds(68,10,icon2.getIconWidth(),icon2.getIconHeight());
		Ranking.setIcon(icon2);
		frame.getContentPane().add(Ranking);

		NombrePosicion = new ArrayList<JLabel>();
		RankingPosicion = new ArrayList<JLabel>();

		PosicionJSON leidas = PosicionJSON.leerJSON("RankingPretty.JSON");
		
		JLabel UnoNombre = new JLabel(leidas.dame(0).Nombre);
		UnoNombre.setForeground(Color.GREEN);
		UnoNombre.setHorizontalAlignment(SwingConstants.CENTER);
		UnoNombre.setBounds(305, 140, 80, 15);
		NombrePosicion.add(UnoNombre);
		
		JLabel DosNombre = new JLabel(leidas.dame(1).Nombre);
		DosNombre.setForeground(Color.GREEN);
		DosNombre.setHorizontalAlignment(SwingConstants.CENTER);
		DosNombre.setBounds(78, 202, 80, 15);
		NombrePosicion.add(DosNombre);
		
		JLabel TresNombre = new JLabel(leidas.dame(2).Nombre);
		TresNombre.setForeground(Color.GREEN);
		TresNombre.setHorizontalAlignment(SwingConstants.CENTER);
		TresNombre.setBounds(536, 202, 80, 15);
		NombrePosicion.add(TresNombre);

		JLabel UnoPosicion = new JLabel("#"+leidas.dame(0).Ranking);
		UnoPosicion.setForeground(Color.CYAN);
		UnoPosicion.setHorizontalAlignment(SwingConstants.CENTER);
		UnoPosicion.setBounds(304, 154, 80, 15);
		RankingPosicion.add(UnoPosicion);
		
		JLabel DosPosicion = new JLabel("#"+leidas.dame(1).Ranking);
		DosPosicion.setForeground(Color.CYAN);
		DosPosicion.setHorizontalAlignment(SwingConstants.CENTER);
		DosPosicion.setBounds(78, 216, 80, 15);
		RankingPosicion.add(DosPosicion);
		
		JLabel TresPosicion = new JLabel("#"+leidas.dame(2).Ranking);
		TresPosicion.setForeground(Color.CYAN);
		TresPosicion.setHorizontalAlignment(SwingConstants.CENTER);
		TresPosicion.setBounds(536, 216, 80, 15);
		RankingPosicion.add(TresPosicion);
		
		MostrarRanking();
		
		
		JLabel lblIntroduzcaElSiguente = new JLabel("Introduzca el siguente  texto seguido de Enter,");
		lblIntroduzcaElSiguente.setForeground(new Color(204, 0, 0));
		lblIntroduzcaElSiguente.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntroduzcaElSiguente.setBounds(215, 175, 254, 21);
		frame.getContentPane().add(lblIntroduzcaElSiguente);
		
		JLabel lblCosidereseInhumanoSi = new JLabel("e ingrese al ranking de los mas veloces.");
		lblCosidereseInhumanoSi.setHorizontalAlignment(SwingConstants.CENTER);
		lblCosidereseInhumanoSi.setForeground(new Color(204, 0, 0));
		lblCosidereseInhumanoSi.setBounds(215, 196, 254, 14);
		frame.getContentPane().add(lblCosidereseInhumanoSi);
		
		NombreGamer = new JTextField();
		NombreGamer.setForeground(Color.CYAN);
		NombreGamer.setBackground(Color.BLACK);
		NombreGamer.setBounds(318, 355, 58, 20);
		NombreGamer.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(NombreGamer);
		
		OracionAsignada = new JLabel("");
		OracionAsignada.setFont(new Font("Sylfaen", Font.ITALIC, 15));
		OracionAsignada.setHorizontalAlignment(SwingConstants.CENTER);
		OracionAsignada.setForeground(Color.CYAN);
		OracionAsignada.setBounds(181, 210, 329, 29);
		frame.getContentPane().add(OracionAsignada);
		
		OracionIntroducida = new JLabel("");
		OracionIntroducida.setFont(new Font("Tahoma", Font.PLAIN, 11));
		OracionIntroducida.setHorizontalAlignment(SwingConstants.CENTER);
		OracionIntroducida.setForeground(new Color(204, 255, 0));
		OracionIntroducida.setBounds(238, 295, 215, 21);
		frame.getContentPane().add(OracionIntroducida);
		
		KeyBoard_Competencia Teclado = new KeyBoard_Competencia();
		frame.getContentPane().add(Teclado);
		
		LabelNotificacion = new JLabel("Introduzca su Nick");
		LabelNotificacion.setHorizontalAlignment(SwingConstants.CENTER);
		LabelNotificacion.setForeground(Color.ORANGE);
		LabelNotificacion.setBounds(238, 325, 215, 21);
		frame.getContentPane().add(LabelNotificacion);
		
		@SuppressWarnings("unused")
		Cronometro Crono = new Cronometro(frame);
		
		Oraciones = new ArrayList<String>();
		LLenarOraciones();
		SetearOracion(Oraciones);
	}

	private void LLenarOraciones() {
		String M1 = "Un hombre jamas se traiciona";
		String M2 = "Imagina un mundo con software libre";
		String M3 = "Si se puede imaginar se puede programar";
		String M4 = "La física es el SO del universo";
		String M5 = "Predecir el futuro es implementarlo";
		String M6 = "El problema de los virus es pasajero";
		String M7 = "La programación es bueno para el alma";
		String M8 = "Lo importante es la imaginacion";
		String M9 = "La simplicidad se convierte en elegancia";
		String M10 = "Creeme que me cortaron las piernas";
		Oraciones.add(M1);
		Oraciones.add(M2);
		Oraciones.add(M3);
		Oraciones.add(M4);
		Oraciones.add(M5);
		Oraciones.add(M6);
		Oraciones.add(M7);
		Oraciones.add(M8);
		Oraciones.add(M9);
		Oraciones.add(M10);
	}

	private static void SetearRanking() {
		PosicionJSON leidas = PosicionJSON.leerJSON("RankingPretty.JSON");
		NombrePosicion.get(0).setText(leidas.dame(0).Nombre);
		NombrePosicion.get(1).setText(leidas.dame(1).Nombre);
		NombrePosicion.get(2).setText(leidas.dame(2).Nombre);
		RankingPosicion.get(0).setText("#"+leidas.dame(0).Ranking);
		RankingPosicion.get(1).setText("#"+leidas.dame(1).Ranking);
		RankingPosicion.get(2).setText("#"+leidas.dame(2).Ranking);
	}

	private static void MostrarRanking(){
		for(int i=0;i<NombrePosicion.size();i++){
			frame.getContentPane().add(NombrePosicion.get(i));
		}
		for(int i=0;i<RankingPosicion.size();i++){
			frame.getContentPane().add(RankingPosicion.get(i));
		}
	}
	
	private static void EliminarLabelRanking(){
		for(int i=0;i<NombrePosicion.size();i++){
			frame.getContentPane().remove(NombrePosicion.get(i));
		}
		for(int i=0;i<RankingPosicion.size();i++){
			frame.getContentPane().remove(RankingPosicion.get(i));
		}
	}
	
	public static boolean EvaluarTextIntro(){
		String Asig = OracionAsignada.getText();
		String Intro = OracionIntroducida.getText();
		if(Asig.equals(Intro)){
			return true;
		}else{
			return false;
		}
	}
	
	public static void VolverAtras(){
		@SuppressWarnings("unused")
		Menu_Principal Menu = new Menu_Principal(frame.getX(),frame.getY());
		frame.dispose();
	}
	
	private static String OracionAleatorio(ArrayList<String> Oraciones){
		int hasta = Oraciones.size();
		return Oraciones.get((int) (Math.random()*hasta));
	}
	
	private static void SetearOracion(ArrayList<String> Oraciones){
		OracionAsignada.setText(OracionAleatorio(Oraciones));
	}
	
	public static void SumarCaracter(String Caracter){
		String CopyOracion = OracionIntroducida.getText();
		OracionIntroducida.setText(CopyOracion+Caracter);
	}
	
	public static void SetearOracionIntroducida(){
		OracionIntroducida.setText("");
	}
	
	public static void SetearOracionAsignada(){
		SetearOracion(Oraciones);
	}
	
	public static boolean EntroAlPodio(int pos){
		PosicionJSON leidas = PosicionJSON.leerJSON("RankingPretty.JSON");
		if(leidas.dame(0).Ranking>=pos||leidas.dame(1).Ranking>=pos||leidas.dame(2).Ranking>=pos){
			return true;
		}
		return false;
	}
	
	public static void ReemplazarPosicion(int pos){
		String Nom = NombreGamer.getText();
		if(Nom.equals("")){
			Nom="Anonymous";
		}
		PosicionJSON leidas = PosicionJSON.leerJSON("RankingPretty.JSON");
		if(leidas.dame(0).Ranking==pos||leidas.dame(1).Ranking==pos||leidas.dame(2).Ranking==pos){
			if(leidas.dame(0).Ranking==pos){
				Posicion NewPosicion = new Posicion(Nom,pos);
				leidas.ReemplazarPuesto(0, NewPosicion);
				LabelNotificacion.setText("¡Sos el mejor, no lo olvides!");
			}
			if(leidas.dame(1).Ranking==pos){
				Posicion NewPosicion = new Posicion(Nom,pos);
				leidas.ReemplazarPuesto(1, NewPosicion);
				LabelNotificacion.setText("¡Eres el 2º mejor veloz!");
			}
			if(leidas.dame(2).Ranking==pos){
				Posicion NewPosicion = new Posicion(Nom,pos);
				leidas.ReemplazarPuesto(3, NewPosicion);
				LabelNotificacion.setText("¡Eres el 3º mejor veloz!");
			}
		}else{
			if(leidas.dame(0).Ranking>pos){
				Posicion NewPosicion0 = new Posicion(Nom,pos);
				Posicion NewPosicion1 = new Posicion(leidas.dame(0).Nombre,leidas.dame(0).Ranking);
				Posicion NewPosicion2 = new Posicion(leidas.dame(1).Nombre,leidas.dame(1).Ranking);
				leidas.ReemplazarPuesto(0, NewPosicion0);
				leidas.ReemplazarPuesto(1, NewPosicion1);
				leidas.ReemplazarPuesto(2, NewPosicion2);
				LabelNotificacion.setText("¡Sos el mejor, no lo olvides!");
			}else{
				if(leidas.dame(1).Ranking>pos){
					Posicion NewPosicion = new Posicion(Nom,pos);
					Posicion NewPosicion2 = new Posicion(leidas.dame(1).Nombre,leidas.dame(1).Ranking);
					leidas.ReemplazarPuesto(1, NewPosicion);
					leidas.ReemplazarPuesto(2, NewPosicion2);
					LabelNotificacion.setText("¡Eres el 2º mejor veloz!");
				}else{
					Posicion NewPosicion = new Posicion(Nom,pos);
					leidas.ReemplazarPuesto(2, NewPosicion);
					LabelNotificacion.setText("¡Eres el 3º mejor veloz!");
				}
			}
		}
		String jsonPretty = leidas.generarJSONPretty();
		leidas.generarJSON(jsonPretty, "RankingPretty.JSON");
	}
	
	private static void RefrescarPantalla(){
		frame.repaint();
		frame.validate();
	}
	
	public static void SetearLabelRanking(){
		EliminarLabelRanking();
		SetearRanking();
		MostrarRanking();
		RefrescarPantalla();
	}
	
}
