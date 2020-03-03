package Boletin3;

public class Ejercicio1 {

	public static void main(String[] args) {
		
	Coche c1=new Coche("1234AAA", "COCHE", 300, 2);
	
	Conductor matias = new Conductor("22233344m","Mathaias");
	
	c1.conductor = matias;// hacemos una instancia donde pasamos los datos del conductor
	
	Remolque r1= new Remolque();
	r1.matricula="1234VVV";
	r1.longitud=3;
	
	//c1.mostrarDatos
	
	Camion Camion1=new Camion("XD 1234 GH", "CAMION", 150, r1, 4);// aqui en camion le pasamos los datos directamente
	
	//Camion1.mostrarDatos();
	
	impresionPolimorfismo(Camion1);
	
	impresionPolimorfismo(c1);
	

	}//main
	
	public static void impresionPolimorfismo(Vehiculo vehiculoX) {
		
		vehiculoX.mostrarDatos();
		
	}
	
	

}//class
