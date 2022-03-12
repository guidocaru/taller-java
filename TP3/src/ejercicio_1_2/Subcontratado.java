package ejercicio_1_2;

public class Subcontratado extends Empleado {

	public float cantHoras;
	public float precioHora;
	
	public Subcontratado(String nombre, int edad, float cantHoras, float sueldo) {
		super(nombre, edad);
		this.setCantHoras(cantHoras);
		this.setPrecioHora(sueldo);
	}

	public float getCantHoras() {
		return cantHoras;
	}

	public void setCantHoras(float cantHoras) {
		this.cantHoras = cantHoras;
	}

	public float getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(float precioHora) {
		this.precioHora = precioHora;
	}
	
	@Override
	public float calcularPago() {
		return this.getCantHoras() * this.getPrecioHora();
	}
	
	@Override
	public String toString() {
		return "Subcontratado " + this.getNombre() + " gana: " + this.calcularPago();
	}
	
}
