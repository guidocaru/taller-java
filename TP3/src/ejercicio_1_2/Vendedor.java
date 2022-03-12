package ejercicio_1_2;

public class Vendedor extends Subcontratado{

	private float comision;
	
	public Vendedor(String nombre, int edad, float cantHoras, float sueldo, float comision) {
		super(nombre, edad, cantHoras, sueldo);
		this.setComision(comision);
	}
	
	public void setComision(float comision) {
		this.comision = comision;
	}
	
	public float getComision() {
		return this.comision;
	}
	
	@Override
	public float calcularPago() {
		return super.calcularPago() * (100 + this.getComision()) / 100;
	}
	
	@Override
	public String toString() {
		return "Vendedor " + super.getNombre() + " gana: " + this.calcularPago();
	}

}
