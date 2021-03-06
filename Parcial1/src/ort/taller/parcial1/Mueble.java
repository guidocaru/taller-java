package ort.taller.parcial1;

public abstract class Mueble implements Mostrable{
	
	private static final float CIEN = 100;
	private String modelo;
	private float costoBase;
	private float porcentajeGanancia;

	public Mueble(String modelo, float costoBase, float porcentajeGanancia) {
		this.setModelo(modelo);
		this.setCostoBase(costoBase);
		this.setPorcentajeGanancia(porcentajeGanancia);
	}

	public float calcularPrecioVenta() {
		//CALCULA LA GANANCIA EN BASE AL PRECIO DEL COSTO Y DESPU?S SE LA SUMA PARA OBTENER EL PRECIO DE VENTA
		float ganancia = this.porcentajeGanancia * this.calcularPrecioCosto() / CIEN; 
		return this.calcularPrecioCosto() + ganancia;
		
	}
	
	public abstract float calcularPrecioCosto();
	
	public void mostrar() {
		System.out.println("Mueble tipo: " + this.getClass().getSimpleName()
				+ " - " + "Modelo: " + this.getModelo() + " - " + "Precio de venta: " + this.calcularPrecioVenta());
	}

	protected float getCostoBase() {
		return costoBase;
	}

	public boolean modeloCorrecto(String modelo) {
	
		return modelo == this.modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPorcentajeGanancia() {
		return porcentajeGanancia;
	}

	public void setPorcentajeGanancia(float porcentajeGanancia) {
		this.porcentajeGanancia = porcentajeGanancia;
	}

	public void setCostoBase(float costoBase) {
		this.costoBase = costoBase;
	}
	
}
	
