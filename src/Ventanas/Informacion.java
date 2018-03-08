package Ventanas;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Informacion {

	private static JFrame frame;
	private static ArrayList<JLabel> Pizarras;
	private int PosicionPizarra;

	public Informacion(int x,int y) {
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

		Pizarras = new ArrayList<JLabel>();
		
		JLabel pizarra1 = new JLabel();
		ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/Imag_Informacion/Pizarra1.png"));
		pizarra1.setBounds(116,30,icon1.getIconWidth(),icon1.getIconHeight());
		pizarra1.setIcon(icon1);
		Pizarras.add(pizarra1);

		JLabel pizarra2 = new JLabel();
		ImageIcon icon2 = new ImageIcon(this.getClass().getResource("/Imag_Informacion/Pizarra2.png"));
		pizarra2.setBounds(116,30,icon2.getIconWidth(),icon2.getIconHeight());
		pizarra2.setIcon(icon2);
		Pizarras.add(pizarra2);

		JLabel pizarra3 = new JLabel();
		ImageIcon icon3 = new ImageIcon(this.getClass().getResource("/Imag_Informacion/Pizarra3.png"));
		pizarra3.setBounds(116,30,icon3.getIconWidth(),icon3.getIconHeight());
		pizarra3.setIcon(icon3);
		Pizarras.add(pizarra3);

		JLabel pizarra4 = new JLabel();
		ImageIcon icon4 = new ImageIcon(this.getClass().getResource("/Imag_Informacion/Pizarra4.png"));
		pizarra4.setBounds(116,30,icon4.getIconWidth(),icon4.getIconHeight());
		pizarra4.setIcon(icon4);
		Pizarras.add(pizarra4);

		JLabel pizarra5 = new JLabel();
		ImageIcon icon5 = new ImageIcon(this.getClass().getResource("/Imag_Informacion/Pizarra5.png"));
		pizarra5.setBounds(116,30,icon5.getIconWidth(),icon5.getIconHeight());
		pizarra5.setIcon(icon5);
		Pizarras.add(pizarra5);
		
		frame.getContentPane().add(Pizarras.get(0));
		PosicionPizarra=0;
		
		JButton btnMenu = new JButton();
		ImageIcon iconMenu = new ImageIcon(this.getClass().getResource("/Imag_Informacion/Menu.png"));
		btnMenu.setBounds(317, 425,iconMenu.getIconWidth(),iconMenu.getIconHeight());
		btnMenu.setIcon(iconMenu);
		frame.getContentPane().add(btnMenu);
		
		JButton btnSiguiente = new JButton();
		ImageIcon iconSig = new ImageIcon(this.getClass().getResource("/Imag_Informacion/Siguiente.png"));
		btnSiguiente.setBounds(396, 425,iconSig.getIconWidth(),iconSig.getIconHeight());
		btnSiguiente.setIcon(iconSig);
		frame.getContentPane().add(btnSiguiente);
		
		JButton btnAnterior = new JButton();
		ImageIcon iconAnt = new ImageIcon(this.getClass().getResource("/Imag_Informacion/Anterior.png"));
		btnAnterior.setBounds(220, 425,iconAnt.getIconWidth(),iconAnt.getIconHeight());
		btnAnterior.setIcon(iconAnt);
		frame.getContentPane().add(btnAnterior);
		
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				Menu_Principal Menu = new Menu_Principal(frame.getX(),frame.getY());
				frame.dispose();
			}
		});
		
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(PosicionPizarra+1<Pizarras.size()){
					EliminarPizarra(PosicionPizarra);
					PosicionPizarra++;
					DibujarPizarra(PosicionPizarra);
					RefrescarPantalla();
				}
			}
		});
		
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(PosicionPizarra>0){
					EliminarPizarra(PosicionPizarra);
					PosicionPizarra--;
					DibujarPizarra(PosicionPizarra);
					RefrescarPantalla();
				}
			}
		});
	}
	
	private static void EliminarPizarra(int Posicion){
		frame.getContentPane().remove(Pizarras.get(Posicion));
	}
	
	private static void DibujarPizarra(int Posicion){
		frame.getContentPane().add(Pizarras.get(Posicion));
	}
	
	private static void RefrescarPantalla(){
		frame.repaint();
		frame.validate();
	}
	
}
