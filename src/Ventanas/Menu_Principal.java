package Ventanas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Menu_Principal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					int X = 100;
					int Y = 100;
					@SuppressWarnings("unused")
					Menu_Principal window = new Menu_Principal(X,Y);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu_Principal(int x,int y) {
		initialize(x,y);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int x, int y) {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Arial", Font.BOLD, 14));
		frame.setBounds(x, y, 699, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Image icono = new ImageIcon(getClass().getResource("/Imag_Menu/Icono.png")).getImage();
	    frame.setIconImage(icono);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setTitle("MarencoGrafia v1.7");
		frame.setResizable(false); 

		JLabel Fondo = new JLabel();
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/Imag_Menu/Fondo.png"));
		Fondo.setBounds(18,30,icon.getIconWidth(),icon.getIconHeight());
		Fondo.setIcon(icon);
		frame.getContentPane().add(Fondo);

		JButton btnCapacitacion = new JButton();
		ImageIcon iconoCap = new ImageIcon(this.getClass().getResource("/Imag_Menu/Informacion.png"));
		btnCapacitacion.setBounds(107, 340, iconoCap.getIconWidth(), iconoCap.getIconHeight());
		btnCapacitacion.setIcon(iconoCap);
		frame.getContentPane().add(btnCapacitacion);
		
		JButton btnEntrenamiento = new JButton();
		ImageIcon iconoEnt = new ImageIcon(this.getClass().getResource("/Imag_Menu/Entrenamiento.png"));
		btnEntrenamiento.setBounds(296, 340, iconoEnt.getIconWidth(), iconoEnt.getIconHeight());
		btnEntrenamiento.setIcon(iconoEnt);
		frame.getContentPane().add(btnEntrenamiento);
		
		JButton btnCompetencia = new JButton();
		ImageIcon iconoCom = new ImageIcon(this.getClass().getResource("/Imag_Menu/Competencia.png"));
		btnCompetencia.setBounds(485, 340, iconoCom.getIconWidth(), iconoCom.getIconHeight());
		btnCompetencia.setIcon(iconoCom);
		frame.getContentPane().add(btnCompetencia);
		
		btnCapacitacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				Informacion ventana = new Informacion(frame.getX(),frame.getY());
				frame.dispose();
			}
		});

		btnEntrenamiento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				Entrenamiento ventana = new Entrenamiento(frame.getX(),frame.getY());
				frame.dispose();
			}
		});

		btnCompetencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				Competencia ventana = new Competencia(frame.getX(),frame.getY());
				frame.dispose();
			}
		});
		
	}
}
