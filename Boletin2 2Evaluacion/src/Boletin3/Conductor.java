package Boletin3;

public class Conductor {

	public String dni;
	public String nombre;
	
	public Conductor(String dni, String nombre) {
		this.dni=dni;
		this.nombre=nombre;
	}
	@Override
	public String toString(){
		
		String valor="DNI:" + this.dni + "\nNombre:"+ this.nombre;
		return valor;
		
	}
	
}
