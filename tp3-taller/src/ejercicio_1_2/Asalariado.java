package ejercicio_1_2;

public class Asalariado extends Empleado {
	
private float sueldo;
	
	public Asalariado(String nombre, int edad, float sueldo) {
		super(nombre, edad);
		this.setSueldo(sueldo);
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public float calcularPago() {
		return this.getSueldo();
	}
	
	@Override
	public String toString() {
		return "Asalariado " + this.getNombre() + " gana: " + this.calcularPago();
	}

}
