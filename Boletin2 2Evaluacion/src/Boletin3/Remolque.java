package Boletin3;

public class Remolque {

	public String matricula;
	public int longitud; 
	
	@Override 
	public String toString() {
		
		String valor="matricula:" + this.matricula +  "\nLongitud " + this.longitud;
		return valor;
	}
	
}
