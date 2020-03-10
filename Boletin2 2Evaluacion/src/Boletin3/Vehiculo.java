/*Apartado 5: Uso de super en constructores.
1. Realizar un constructor de Vehiculo que reciba matricula, tipo y velocidadMaxima y se asocien
esos valores en los campos de la clase.
Al crear este constructor deber�is crear el constructor por defecto de Vehiculo.
2. Realizar un nuevo constructor de Camion que reciba como par�metros matricula, tipo,
velocidadMaxima y altura.
Implementar este nuevo constructor de Camion de forma que en este costructor se asignen los
campos propios de Camion que son recibidos en la llamada al constructor.
3. Crear un Camion en el m�todo main de Ejercicio1 mediante este nuevo constructor y ver qu�
datos contiene mediante una impresi�n por pantalla.
4. Modificar el c�digo del constructor creado para Camion para que realice una llamada al
constructor de Vehiculo mediante la palabra reservada super.
Volver a ejecutar la creaci�n del cami�n mediante este constructor y mostrando los datos que
contiene por pantalla.*/
package Boletin3;

public class Vehiculo {

	protected String matricula;
	protected String tipo;
	protected int vmaxima;
	protected Conductor conductor;
	
	public void mostrarDatos(){
		System.out.println("Matricula " + matricula);
		System.out.println("vMaxima " + vmaxima);
		System.out.println("Tipo " + tipo);
		System.out.println("Conductor " + conductor);
	
	
		
	}
	public String getMatricula() {
		return matricula;
	}
    public void setMatricula(String matricula) {
    	this.matricula=matricula;
    }
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	public int getvMaxima() {
		return vmaxima;
	}
	public void setvMaxima(int vmaxima) {
		this.vmaxima=vmaxima;
	}
	public Conductor getConductor() {
		return conductor;
	}
	public void setConductor(Conductor conductor) {
		this.conductor=conductor;
	}
}
