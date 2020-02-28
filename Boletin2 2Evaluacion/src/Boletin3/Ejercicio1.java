package Boletin3;

public class Ejercicio1 {

	public static void main(String[] args) {
		
	Coche c1=new Coche("1234AAA", "COCHE", 300, 2);
	
	Conductor matias = new Conductor("22233344m","Mathaias");
	
	c1.conductor = matias;
	
	Remolque r1= new Remolque();
	r1.matricula="1234VVV";
	r1.longitud=3;
	
	c1.mostrarDatos();
	
	}//main

}//class
