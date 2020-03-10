
public class Triangulo extends FiguraGeometrica {

	public double altura;
	public double base;
	
	public Triangulo(double altura, double base, String color) {
		
		super(color);
		this.altura = altura;
		this.base = base;
			
	} 
	
	public double calcularArea() {
		return (altura * base) / 2; 
	}
	public String toString() {
		
		return super.toString() + "mi altura es: " + this.altura + "mi base es: " + this.base;
	}
}	
