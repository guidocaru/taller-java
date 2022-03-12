package ejercicio_1_2;

public abstract class Empleado {

	protected String nombre;
	protected int edad;

	
	public Empleado(String nombre, int edad) {
		this.setNombre(nombre);
		this.setEdad(edad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String toString() {
		return "Nombre=" + this.getNombre() + ", edad=" + this.getEdad() + "";
	}

	abstract public float calcularPago();
	
}
