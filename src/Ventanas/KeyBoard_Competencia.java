package Ventanas;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;


@SuppressWarnings("serial")
public class KeyBoard_Competencia extends JPanel{
	
	public KeyBoard_Competencia() {
		KeyListener listener = new MyKeyListener();
		addKeyListener(listener);
		setFocusable(true);
	}
	
	public class MyKeyListener implements KeyListener {
		
		@Override
		public void keyTyped(KeyEvent e) {
		}

		@Override
		public void keyPressed(KeyEvent e) {
			
			char Caracter = e.getKeyChar();
			switch (Caracter) {
		      case 'a':
		    	  Competencia.SumarCaracter("a");
		    	  Cronometro.TomarTime();
		    	  break;  
		      case 'b':
		    	  Competencia.SumarCaracter("b");
		    	  Cronometro.TomarTime();
		          break;
		      case 'c':
		    	  Competencia.SumarCaracter("c");
		    	  Cronometro.TomarTime();
		    	  break;
		      case 'd':
		    	  Competencia.SumarCaracter("d");
		    	  Cronometro.TomarTime();
		    	  break;
		      case 'e':
		    	  Competencia.SumarCaracter("e");
		    	  Cronometro.TomarTime();
		          break;
		      case 'f':
		    	  Competencia.SumarCaracter("f");
		    	  Cronometro.TomarTime();
  		          break;
		      case 'g':
		    	  Competencia.SumarCaracter("g");
		    	  Cronometro.TomarTime();
		          break;
		      case 'h':
		    	  Competencia.SumarCaracter("h");
		    	  Cronometro.TomarTime();
		          break;
		      case 'i':
		    	  Competencia.SumarCaracter("i");
		    	  Cronometro.TomarTime();
		          break;
		      case 'j':
		    	  Competencia.SumarCaracter("j");
		    	  Cronometro.TomarTime();
		          break;
		      case 'k':
		    	  Competencia.SumarCaracter("k");
		    	  Cronometro.TomarTime();
		          break;
		      case 'l':
		    	  Competencia.SumarCaracter("l");
		    	  Cronometro.TomarTime();
		          break;
		      case 'm':
		    	  Competencia.SumarCaracter("m");
		    	  Cronometro.TomarTime();
		          break;
		      case 'n':
		    	  Competencia.SumarCaracter("n");
		    	  Cronometro.TomarTime();
		          break;
		      case 'ñ':
		    	  Competencia.SumarCaracter("ñ");
		    	  Cronometro.TomarTime();
		          break;
		      case 'o':
		    	  Competencia.SumarCaracter("o");
		    	  Cronometro.TomarTime();
		          break;
		      case 'p':
		    	  Competencia.SumarCaracter("p");
		    	  Cronometro.TomarTime();
		          break;
		      case 'q':
		    	  Competencia.SumarCaracter("q");
		    	  Cronometro.TomarTime();
		          break;
		      case 'r':
		    	  Competencia.SumarCaracter("r");
		    	  Cronometro.TomarTime();
		          break;
		      case 's':
		    	  Competencia.SumarCaracter("s");
		    	  Cronometro.TomarTime();
		    	  break;
		      case 't':
		    	  Competencia.SumarCaracter("t");
		    	  Cronometro.TomarTime();
		    	  break;
		      case 'u':
		    	  Competencia.SumarCaracter("u");
		    	  Cronometro.TomarTime();
		    	  break;
		      case 'v':
		    	  Competencia.SumarCaracter("v");
		    	  Cronometro.TomarTime();
		    	  break;
		      case 'w':
		    	  Competencia.SumarCaracter("w");
		    	  Cronometro.TomarTime();
		    	  break;
		      case 'x':
		    	  Competencia.SumarCaracter("x");
		    	  Cronometro.TomarTime();
		    	  break;
		      case 'y':
		    	  Competencia.SumarCaracter("y");
		    	  Cronometro.TomarTime();
		    	  break;
		      case 'z':
		    	  Competencia.SumarCaracter("z");
		    	  Cronometro.TomarTime();
		    	  break;
	    	  case 'A':
	    		  Competencia.SumarCaracter("A");
		    	  Cronometro.TomarTime();
		    	  break;  
		      case 'B':
		    	  Competencia.SumarCaracter("B");
		    	  Cronometro.TomarTime();
		          break;
		      case 'C':
		    	  Competencia.SumarCaracter("C");
		    	  Cronometro.TomarTime();
		    	  break;
		      case 'D':
		    	  Competencia.SumarCaracter("D");
		    	  Cronometro.TomarTime();
		    	  break;
		      case 'E':
		    	  Competencia.SumarCaracter("E");
		    	  Cronometro.TomarTime();
		          break;
		      case 'F':
		    	  Competencia.SumarCaracter("F");
		    	  Cronometro.TomarTime();
  		          break;
		      case 'G':
		    	  Competencia.SumarCaracter("G");
		    	  Cronometro.TomarTime();
		          break;
		      case 'H':
		    	  Competencia.SumarCaracter("H");
		    	  Cronometro.TomarTime();
		          break;
		      case 'I':
		    	  Competencia.SumarCaracter("I");
		    	  Cronometro.TomarTime();
		          break;
		      case 'J':
		    	  Competencia.SumarCaracter("J");
		    	  Cronometro.TomarTime();
		          break;
		      case 'K':
		    	  Competencia.SumarCaracter("K");
		    	  Cronometro.TomarTime();
		          break;
		      case 'L':
		    	  Competencia.SumarCaracter("L");
		    	  Cronometro.TomarTime();
		          break;
		      case 'M':
		    	  Competencia.SumarCaracter("M");
		    	  Cronometro.TomarTime();
		          break;
		      case 'N':
		    	  Competencia.SumarCaracter("N");
		    	  Cronometro.TomarTime();
		          break;
		      case 'Ñ':
		    	  Competencia.SumarCaracter("Ñ");
		    	  Cronometro.TomarTime();
		          break;
		      case 'O':
		    	  Competencia.SumarCaracter("O");
		    	  Cronometro.TomarTime();
		          break;
		      case 'P':
		    	  Competencia.SumarCaracter("P");
		    	  Cronometro.TomarTime();
		          break;
		      case 'Q':
		    	  Competencia.SumarCaracter("Q");
		    	  Cronometro.TomarTime();
		          break;
		      case 'R':
		    	  Competencia.SumarCaracter("R");
		    	  Cronometro.TomarTime();
		          break;
		      case 'S':
		    	  Competencia.SumarCaracter("S");
		    	  Cronometro.TomarTime();
		    	  break;
		      case 'T':
		    	  Competencia.SumarCaracter("T");
		    	  Cronometro.TomarTime();
		    	  break;
		      case 'U':
		    	  Competencia.SumarCaracter("U");
		    	  Cronometro.TomarTime();
		    	  break;
		      case 'V':
		    	  Competencia.SumarCaracter("V");
		    	  Cronometro.TomarTime();
		    	  break;
		      case 'W':
		    	  Competencia.SumarCaracter("W");
		    	  Cronometro.TomarTime();
		    	  break;
		      case 'X':
		    	  Competencia.SumarCaracter("X");
		    	  Cronometro.TomarTime();
		    	  break;
		      case 'Y':
		    	  Competencia.SumarCaracter("Y");
		    	  Cronometro.TomarTime();
		    	  break;
		      case 'Z':
		    	  Competencia.SumarCaracter("Z");
		    	  Cronometro.TomarTime();
		    	  break;
		      default:
		           break;
			}

			if(e.getKeyCode()==KeyEvent.VK_ENTER){
				if(Competencia.EvaluarTextIntro()){
					Competencia.SetearOracionIntroducida();
					Cronometro.PuestoResultante();
					int Posicion = Cronometro.TiempoPromedio();
					if(Competencia.EntroAlPodio(Posicion)){
						Competencia.ReemplazarPosicion(Posicion);
						Competencia.SetearLabelRanking();
					}
					Cronometro.DetenerCronometro();
					
				}else{
					Competencia.SetearOracionAsignada();
					Competencia.SetearOracionIntroducida();
					Cronometro.SetearPuesto();
					Cronometro.DetenerCronometro();
				}
			}
			
			if(e.getKeyCode()==KeyEvent.VK_SPACE){
				Competencia.SumarCaracter(" ");	
		    	Cronometro.TomarTime();
			}
			
			if(e.getKeyCode()==KeyEvent.VK_ESCAPE){
		    	Competencia.VolverAtras();
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			
		}
		
	}
	
	
}
