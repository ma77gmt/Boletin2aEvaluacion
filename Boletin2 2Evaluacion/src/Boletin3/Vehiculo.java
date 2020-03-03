package Boletin3;

public class Vehiculo {

	protected String matricula;
	protected String tipo;
	protected int vMaxima;
	protected Conductor conductor;
	
	public void mostrarDatos(){
		System.out.println("Matricula " + matricula);
		System.out.println("vMaxima " + vMaxima);
		System.out.println("Tipo " + tipo);
		System.out.println("Conductor " + conductor);
		

	}
	
	
}
