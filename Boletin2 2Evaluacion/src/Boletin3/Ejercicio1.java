/**Apartado 4: Polimorfismo.
Crear un método en Ejercicio1.java (impresionPolimorfismo) que recibiendo un elemento de tipo
Vehiculo realice la llamada a mostrarDatos.
Probar la ejecución de este elemento creando un elemento de tipo Coche y otro elemento de tipo
Camion.
Crear un método en Ejercicio1. Java que, recibiendo un elemento de tipo Vehículo muestre los datos
del remolque asociado a él sólo si es de tipo camión.
Para esto tendréis que comprobar (dentro del método si el tipo del Vehiculo pasado es “CAMION” y, si
es así, realizar un cast dentro para poder acceder a su remolque.

Apartado 5: Uso de super en constructores.
1. Realizar un constructor de Vehiculo que reciba matricula, tipo y velocidadMaxima y se asocien
esos valores en los campos de la clase.
Al crear este constructor deberéis crear el constructor por defecto de Vehiculo.
2. Realizar un nuevo constructor de Camion que reciba como parámetros matricula, tipo,
velocidadMaxima y altura.
Implementar este nuevo constructor de Camion de forma que en este costructor se asignen los
campos propios de Camion que son recibidos en la llamada al constructor.
3. Crear un Camion en el método main de Ejercicio1 mediante este nuevo constructor y ver qué
datos contiene mediante una impresión por pantalla.
4. Modificar el código del constructor creado para Camion para que realice una llamada al
constructor de Vehiculo mediante la palabra reservada super.
Volver a ejecutar la creación del camión mediante este constructor y mostrando los datos que
contiene por pantalla.*/
package Boletin3;

public class Ejercicio1 {

	public static void main(String[] args) {

		Coche c1 = new Coche("1234AAA", "COCHE", 300, 2);

		Conductor matias = new Conductor("22233344m", "Mathaias");

		c1.conductor = matias;// hacemos una instancia donde pasamos los datos del conductor

		Remolque r1 = new Remolque();
		r1.matricula = "1234VVV";
		r1.longitud = 3;

		// c1.mostrarDatos

		Camion Camion1 = new Camion("XD 1234 GH", "CAMION", 150, r1, 4);// aqui en camion le pasamos los datos
																		// directamente

		// Camion1.mostrarDatos();

		impresionPolimorfismo(Camion1);

		impresionPolimorfismo(c1);
		
		
		//Crear un método en Ejercicio1. Java que, recibiendo un elemento de tipo Vehículo muestre los datos
		//del remolque asociado a él sólo si es de tipo camión.
		//Para esto tendréis que comprobar (dentro del método si el tipo del Vehiculo pasado es “CAMION” y, si
		//es así, realizar un cast dentro para poder acceder a su remolque. 
		

	}// main
	

	public static void impresionPolimorfismo(Vehiculo vehiculo1) {

		vehiculo1.mostrarDatos();
		
		if(vehiculo1 instanceof Camion) {
				System.out.println(((Camion)vehiculo1).remolque);
			 
		}
	}
	
}// class
