package Ventanas;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class KeyBoard_Entrenamiento extends JPanel{
	
	public KeyBoard_Entrenamiento() {
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
		    	  if(Entrenamiento.EtiquetaExistente("a")==false){
			    	  Entrenamiento.MostrarEtiqueta("a",105,173,"Menique",101,176);
		    	  }
		    	  break;  
		      case 'b':
		    	  if(Entrenamiento.EtiquetaExistente("b")==false){
		    		  Entrenamiento.MostrarEtiqueta("b",219,199,"IndiceIzq",215,201);
				  }
		          break;
		      case 'c':
		    	  if(Entrenamiento.EtiquetaExistente("c")==false){
		    		  Entrenamiento.MostrarEtiqueta("c",168,198,"Mayor",164,201);
		    	  }
		    	  break;
		      case 'd':
		    	  if(Entrenamiento.EtiquetaExistente("d")==false){
		    		  Entrenamiento.MostrarEtiqueta("d",156,174,"Mayor",152,176);
		    	  }
		    	  break;
		      case 'e':
		    	  if(Entrenamiento.EtiquetaExistente("e")==false){
			    	  Entrenamiento.MostrarEtiqueta("e",149,147,"Mayor",145,150);  
		    	  }
		          break;
		      case 'f':
		    	  if(Entrenamiento.EtiquetaExistente("f")==false){
			    	  Entrenamiento.MostrarEtiqueta("f",183,174,"IndiceIzq",177,176);
		    	  }
  		          break;
		      case 'g':
		    	  if(Entrenamiento.EtiquetaExistente("g")==false){
			    	  Entrenamiento.MostrarEtiqueta("g",207,172,"IndiceIzq",203,176);  
		    	  }
		          break;
		      case 'h':
		    	  if(Entrenamiento.EtiquetaExistente("h")==false){
			    	  Entrenamiento.MostrarEtiqueta("h",232,174,"IndiceDer",228,176);
		    	  }
		          break;
		      case 'i':
		    	  if(Entrenamiento.EtiquetaExistente("i")==false){
			    	  Entrenamiento.MostrarEtiqueta("i",279,148,"Mayor",273,150);
		    	  }
		          break;
		      case 'j':
		    	  if(Entrenamiento.EtiquetaExistente("j")==false){
			    	  Entrenamiento.MostrarEtiqueta("j",260,172,"IndiceDer",254,176);
		    	  }
		          break;
		      case 'k':
		    	  if(Entrenamiento.EtiquetaExistente("k")==false){
			    	  Entrenamiento.MostrarEtiqueta("k",284,174,"Mayor",279,176);
		    	  }
		          break;
		      case 'l':
		    	  if(Entrenamiento.EtiquetaExistente("l")==false){
			    	  Entrenamiento.MostrarEtiqueta("l",311,174,"Anular",305,176);
		    	  }
		          break;
		      case 'm':
		    	  if(Entrenamiento.EtiquetaExistente("m")==false){
			    	  Entrenamiento.MostrarEtiqueta("m",268,198,"IndiceDer",266,201);
		    	  }
		          break;
		      case 'n':
		    	  if(Entrenamiento.EtiquetaExistente("n")==false){
			    	  Entrenamiento.MostrarEtiqueta("n",245,198,"IndiceDer",241,201);
		    	  }
		          break;
		      case 'ñ':
		    	  if(Entrenamiento.EtiquetaExistente("ñ")==false){
			    	  Entrenamiento.MostrarEtiqueta("ñ",334,174,"Menique",330,176);
		    	  }
		          break;
		      case 'o':
		    	  if(Entrenamiento.EtiquetaExistente("o")==false){
			    	  Entrenamiento.MostrarEtiqueta("o",302,147,"Anular",298,150);
		    	  }
		          break;
		      case 'p':
		    	  if(Entrenamiento.EtiquetaExistente("p")==false){
			    	  Entrenamiento.MostrarEtiqueta("p",327,146,"Menique",323,150);
		    	  }
		          break;
		      case 'q':
		    	  if(Entrenamiento.EtiquetaExistente("q")==false){
			    	  Entrenamiento.MostrarEtiqueta("q",98,146,"Menique",94,150);
		    	  }
		          break;
		      case 'r':
		    	  if(Entrenamiento.EtiquetaExistente("r")==false){
			    	  Entrenamiento.MostrarEtiqueta("r",176,147,"IndiceIzq",171,150);
		    	  }
		          break;
		      case 's':
		    	  if(Entrenamiento.EtiquetaExistente("s")==false){
			    	  Entrenamiento.MostrarEtiqueta("s",132,173,"Anular",127,176);
		    	  }
		    	  break;
		      case 't':
		    	  if(Entrenamiento.EtiquetaExistente("t")==false){
			    	  Entrenamiento.MostrarEtiqueta("t",202,147,"IndiceIzq",196,150);
		    	  }
		    	  break;
		      case 'u':
		    	  if(Entrenamiento.EtiquetaExistente("u")==false){
			    	  Entrenamiento.MostrarEtiqueta("u",251,147,"IndiceDer",247,150);
		    	  }
		    	  break;
		      case 'v':
		    	  if(Entrenamiento.EtiquetaExistente("v")==false){
			    	  Entrenamiento.MostrarEtiqueta("v",194,198,"IndiceIzq",190,201);
		    	  }
		    	  break;
		      case 'w':
		    	  if(Entrenamiento.EtiquetaExistente("w")==false){
			    	  Entrenamiento.MostrarEtiqueta("w",123,147,"Anular",120,150);
		    	  }
		    	  break;
		      case 'x':
		    	  if(Entrenamiento.EtiquetaExistente("x")==false){
			    	  Entrenamiento.MostrarEtiqueta("x",143,198,"Anular",139,201);
		    	  }
		    	  break;
		      case 'y':
		    	  if(Entrenamiento.EtiquetaExistente("y")==false){
			    	  Entrenamiento.MostrarEtiqueta("y",226,146,"IndiceDer",222,150);
		    	  }
		    	  break;
		      case 'z':
		    	  if(Entrenamiento.EtiquetaExistente("z")==false){
		    		  Entrenamiento.MostrarEtiqueta("z",117,198,"Menique",113,201);
		    	  }
		    	  break;
	    	  case 'A':
		    	  if(Entrenamiento.EtiquetaExistente("A")==false){
			    	  Entrenamiento.MostrarEtiqueta("A",105,174,"Menique",101,176);
		    	  }
		    	  break;  
		      case 'B':
		    	  if(Entrenamiento.EtiquetaExistente("B")==false){
		    		  Entrenamiento.MostrarEtiqueta("B",219,199,"IndiceIzq",215,201);
				  }
		          break;
		      case 'C':
		    	  if(Entrenamiento.EtiquetaExistente("C")==false){
		    		  Entrenamiento.MostrarEtiqueta("C",168,199,"Mayor",164,201);
		    	  }
		    	  break;
		      case 'D':
		    	  if(Entrenamiento.EtiquetaExistente("D")==false){
		    		  Entrenamiento.MostrarEtiqueta("D",156,174,"Mayor",152,176);
		    	  }
		    	  break;
		      case 'E':
		    	  if(Entrenamiento.EtiquetaExistente("E")==false){
			    	  Entrenamiento.MostrarEtiqueta("E",149,148,"Mayor",145,150);  
		    	  }
		          break;
		      case 'F':
		    	  if(Entrenamiento.EtiquetaExistente("F")==false){
			    	  Entrenamiento.MostrarEtiqueta("F",181,174,"IndiceIzq",177,176);
		    	  }
  		          break;
		      case 'G':
		    	  if(Entrenamiento.EtiquetaExistente("G")==false){
			    	  Entrenamiento.MostrarEtiqueta("G",206,174,"IndiceIzq",203,176);  
		    	  }
		          break;
		      case 'H':
		    	  if(Entrenamiento.EtiquetaExistente("H")==false){
			    	  Entrenamiento.MostrarEtiqueta("H",232,174,"IndiceDer",228,176);
		    	  }
		          break;
		      case 'I':
		    	  if(Entrenamiento.EtiquetaExistente("I")==false){
			    	  Entrenamiento.MostrarEtiqueta("I",279,148,"Mayor",273,150);
		    	  }
		          break;
		      case 'J':
		    	  if(Entrenamiento.EtiquetaExistente("J")==false){
			    	  Entrenamiento.MostrarEtiqueta("J",258,174,"IndiceDer",254,176);
		    	  }
		          break;
		      case 'K':
		    	  if(Entrenamiento.EtiquetaExistente("K")==false){
			    	  Entrenamiento.MostrarEtiqueta("K",283,174,"Mayor",279,176);
		    	  }
		          break;
		      case 'L':
		    	  if(Entrenamiento.EtiquetaExistente("L")==false){
			    	  Entrenamiento.MostrarEtiqueta("L",309,174,"Anular",305,176);
		    	  }
		          break;
		      case 'M':
		    	  if(Entrenamiento.EtiquetaExistente("M")==false){
			    	  Entrenamiento.MostrarEtiqueta("M",268,199,"IndiceDer",266,201);
		    	  }
		          break;
		      case 'N':
		    	  if(Entrenamiento.EtiquetaExistente("N")==false){
			    	  Entrenamiento.MostrarEtiqueta("N",245,199,"IndiceDer",241,201);
		    	  }
		          break;
		      case 'Ñ':
		    	  if(Entrenamiento.EtiquetaExistente("Ñ")==false){
			    	  Entrenamiento.MostrarEtiqueta("Ñ",333,175,"Menique",330,176);
		    	  }
		          break;
		      case 'O':
		    	  if(Entrenamiento.EtiquetaExistente("O")==false){
			    	  Entrenamiento.MostrarEtiqueta("O",301,148,"Anular",298,150);
		    	  }
		          break;
		      case 'P':
		    	  if(Entrenamiento.EtiquetaExistente("P")==false){
			    	  Entrenamiento.MostrarEtiqueta("P",327,148,"Menique",323,150);
		    	  }
		          break;
		      case 'Q':
		    	  if(Entrenamiento.EtiquetaExistente("Q")==false){
			    	  Entrenamiento.MostrarEtiqueta("Q",97,147,"Menique",94,150);
		    	  }
		          break;
		      case 'R':
		    	  if(Entrenamiento.EtiquetaExistente("R")==false){
			    	  Entrenamiento.MostrarEtiqueta("R",174,148,"IndiceIzq",171,150);
		    	  }
		          break;
		      case 'S':
		    	  if(Entrenamiento.EtiquetaExistente("S")==false){
			    	  Entrenamiento.MostrarEtiqueta("S",130,174,"Anular",127,176);
		    	  }
		    	  break;
		      case 'T':
		    	  if(Entrenamiento.EtiquetaExistente("T")==false){
			    	  Entrenamiento.MostrarEtiqueta("T",200,148,"IndiceIzq",196,150);
		    	  }
		    	  break;
		      case 'U':
		    	  if(Entrenamiento.EtiquetaExistente("U")==false){
			    	  Entrenamiento.MostrarEtiqueta("U",251,148,"IndiceDer",247,150);
		    	  }
		    	  break;
		      case 'V':
		    	  if(Entrenamiento.EtiquetaExistente("V")==false){
			    	  Entrenamiento.MostrarEtiqueta("V",194,199,"IndiceIzq",190,201);
		    	  }
		    	  break;
		      case 'W':
		    	  if(Entrenamiento.EtiquetaExistente("W")==false){
			    	  Entrenamiento.MostrarEtiqueta("W",122,148,"Anular",120,150);
		    	  }
		    	  break;
		      case 'X':
		    	  if(Entrenamiento.EtiquetaExistente("X")==false){
			    	  Entrenamiento.MostrarEtiqueta("X",143,199,"Anular",139,201);
		    	  }
		    	  break;
		      case 'Y':
		    	  if(Entrenamiento.EtiquetaExistente("Y")==false){
			    	  Entrenamiento.MostrarEtiqueta("Y",226,148,"IndiceDer",222,150);
		    	  }
		    	  break;
		      case 'Z':
		    	  if(Entrenamiento.EtiquetaExistente("Z")==false){
		    		  Entrenamiento.MostrarEtiqueta("Z",117,199,"Menique",113,201);
		    	  }
		    	  break;
		      default:
		           break;
			}
			
			if(e.getKeyCode()==KeyEvent.VK_SPACE){
		    	if(Entrenamiento.EtiquetaExistente("Space")==false){
		    		Entrenamiento.MostrarEtiqueta("Space",222,223,"Pulgar",158,226);
				}
			}
			
			if(e.getKeyCode()==KeyEvent.VK_ENTER){
		    	if(Entrenamiento.EtiquetaExistente("Intro")==false){
		    		Entrenamiento.MostrarEtiqueta("Intro",401,148,"Enter",400,150);
				}
			}

			if(e.getKeyCode()==KeyEvent.VK_ESCAPE){
		    	Entrenamiento.VolverAtras();
			}
			
			if(e.getKeyChar()=='+'){
				Entrenamiento.HabilitarTipeo();
			}
			
			if(e.getKeyChar()=='-'){
				Entrenamiento.DesabilitarTipeo();
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {

			String CharString = String.valueOf(e.getKeyChar());
			if (Entrenamiento.EtiquetaExistente(CharString)){
				Entrenamiento.EliminarEtiqueta(CharString);
			}
			
			if(e.getKeyCode()==KeyEvent.VK_SPACE){
				Entrenamiento.EliminarEtiqueta("Space");
			}
			
			if(e.getKeyCode()==KeyEvent.VK_ENTER){
				Entrenamiento.EliminarEtiqueta("Intro");
			}
			
		}
		
	}
	
	
}
