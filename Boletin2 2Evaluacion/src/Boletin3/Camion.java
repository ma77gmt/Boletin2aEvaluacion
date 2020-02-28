package Boletin3;

public class Camion extends Vehiculo{

	private int altura;
	private Remolque remolque;
	
	public Camion(String matricula, String tipo, int vMaxima, Remolque remolque) {
		
		this.matricula=matricula;
		this.tipo=tipo;
		this.vMaxima=vMaxima;
		this.remolque=remolque;
	}	
	
	
	
	public void mostrarDatos() {
		super.mostrarDatos();
		
		System.out.println("Remolque " + remolque);
		System.out.println("Altura " + altura);
		
		
	}
}
