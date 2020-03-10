import java.util.Scanner;

public class Principal {

	public static void main(String[] args) { /* el static nos permite instanciar, pueden ser metodos o atributos */
		// TODO Auto-generated method stub
		
		
		//en lugar de esto
	//	Menu miMenu = new Menu();
		
	//	miMenu.imprimirMenu();

		Menu.imprimirMenu();//metodo estatic
	//	System.out.println("el numero pi es " + Math.PI);
		
		Scanner teclado = new Scanner(System.in);
		
		int opcion = teclado.nextInt();
		
		double resultado = Menu.seleccionYCalcularArea(opcion);
		
		System.out.println(resultado);
		
//		Triangulo miTriangulo = new Triangulo(3, 4, "rojo");
	//	
//		Triangulo miSegundoTriangulo = new Triangulo(5, 7, "verde");
		
//		System.out.println("el color es: " + miTriangulo.getColor());
		
	//	System.out.println(miTriangulo);
		
		
	
	}

}
