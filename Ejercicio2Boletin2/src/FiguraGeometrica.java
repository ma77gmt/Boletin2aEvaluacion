
public abstract class FiguraGeometrica {
	
	private String color;
	
	public FiguraGeometrica(String color) {
		this.setColor(color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "mi color es " + this.color;
	}
	
	public abstract double calcularArea();
}
