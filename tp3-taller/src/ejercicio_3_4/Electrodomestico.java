package ejercicio_3_4;

public abstract class Electrodomestico {

	protected String marca;
	protected String modelo;
	protected int nroSerie;
	protected int voltaje;
	protected Estado estado;
	protected float precio;
	
	public Electrodomestico(String marca, String modelo, int nroSerie, int voltaje, Estado estado, float precio) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setNroSerie(nroSerie);
		this.setVoltaje(voltaje);
		this.setEstado(estado);
		this.setPrecio(precio);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNroSerie() {
		return nroSerie;
	}

	public void setNroSerie(int nroSerie) {
		this.nroSerie = nroSerie;
	}

	public int getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(int voltaje) {
		this.voltaje = voltaje;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + " " + this.getMarca() + " " + this.getModelo();
	}
	
	public String imprimirTicket() {
		return this.getClass().getSimpleName() + " " + this.getMarca() + ", " + this.getModelo() + ": $" + this.getPrecio();
	}
	
}
