 
public class Menu {
	
	public static void imprimirMenu() {
		System.out.println("1.- Calcular el area del triangulo");
		System.out.println("2.- Calcular el area del cuadrado");
		System.out.println("3.- Calcular el area del rectangulo");
		System.out.println("4.- Calcular el area del Rombo");
		System.out.println("5.- Calcular el area del circulo");		
	}
		public static double seleccionYCalcularArea(int opcion) {
			
			  switch (opcion) {
			  	case 1:
			  		Triangulo miTriangulo = new Triangulo(3, 4, "rojo");
			  		return miTriangulo.calcularArea();
		}
			return 0;
	}
}