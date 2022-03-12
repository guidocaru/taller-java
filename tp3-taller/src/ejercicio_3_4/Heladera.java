package ejercicio_3_4;

public class Heladera extends Electrodomestico{

	private int capacidad;
	private boolean frost;
	
	public Heladera(String marca, String modelo, int nroSerie, int voltaje, Estado estado, float precio, int capacidad, boolean frost) {
		super(marca, modelo, nroSerie, voltaje, estado, precio);
		this.setCapacidad(capacidad);
		this.setFrost(frost);
	}
	
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public boolean isFrost() {
		return frost;
	}
	public void setFrost(boolean frost) {
		this.frost = frost;
	}
	
	
}
