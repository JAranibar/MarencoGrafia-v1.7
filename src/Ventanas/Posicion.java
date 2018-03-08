package Ventanas;

public class Posicion {

	String Nombre;
	int Ranking;
	
	public Posicion(String Nomb, int Rank) {
		this.Nombre=Nomb;
		this.Ranking=Rank;
	}

	public String GetNombre(){
		return this.Nombre;
	}
	
	public int GetRanking(){
		return this.Ranking;
	}

	public void SetNombre(String Nomb){
		this.Nombre=Nomb;
	}
	
	public void SetRanking(int Rank){
		this.Ranking=Rank;
	}
	
	@Override
	public String toString() {
		return "Persona [ Nombre = " + Nombre + ", Record = " + Ranking + " ]";
	}	
	
}
