package Boletin3;

public class Coche extends Vehiculo{

	public int nPlazas;
	
	public Coche(String matricula, String tipo, int vMaxima, int nPlazas) {
		super();
		this.matricula=matricula;
		this.tipo=tipo;
		this.vmaxima=vMaxima;
		this.nPlazas=nPlazas;
		}	
	
	
	public void mostrarDatos(){
		super.mostrarDatos();
		System.out.println("Plazas " + nPlazas);
	
	}
	
}
