package Boletin3;

public class Camion extends Vehiculo{

	public int altura;
	public Remolque remolque;
	
	public Camion(String matricula, String tipo, int vMaxima, Remolque remolque, int altura) {
		
		this.matricula=matricula;
		this.tipo=tipo;
		this.vmaxima=vMaxima;
		this.remolque=remolque;
		this.altura=altura;
	}	
	
	
	
	public void mostrarDatos() {
		super.mostrarDatos();
		
		System.out.println("Remolque " + remolque);
		System.out.println("Altura " + altura);
		
		
	}
}
