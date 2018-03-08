package Ventanas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PosicionJSON {

	ArrayList<Posicion> Posiciones;
	
	public PosicionJSON() {
		Posiciones = new ArrayList<Posicion>();
	}

	public void AgregarPosicion(Posicion p){
		this.Posiciones.add(p);
	}
	
	public Posicion dame(int indice){
		return Posiciones.get(indice);
		
	}
	
	public void ReemplazarPuesto(int indice, Posicion Pos){
		Posiciones.set(indice, Pos);
	}
	
	public int tamaño(){
		return Posiciones.size();
	}
	
	public String generarJSONPretty(){
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(this);
		
		return json;
	}
	
	public void generarJSON(String json, String archivo){
		try{
			FileWriter writer = new FileWriter(archivo);
			writer.write(json);
			writer.close();
		}catch (IOException e){
			e.printStackTrace();
		}
	}

	public static PosicionJSON leerJSON(String archivo){
		Gson gson = new Gson();
		PosicionJSON ret = null;
		try{
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			ret = gson.fromJson(br, PosicionJSON.class);
		}catch(IOException e){
			e.printStackTrace();
		}
		return ret;
	}
	
}
