package ort.taller.parcial1;

import java.util.ArrayList;

public class FabricaMuebles implements Mostrable{
	
	public static final float PORC_GANANCIA_MIN = 5f;
	public static final int CIEN = 100;
	
	private String nombre;
	private ArrayList<Mueble> mueblesFabricados;
	
	public FabricaMuebles(String nombre) {
		this.setNombre(nombre);
		mueblesFabricados = new ArrayList<>();
	}

	public boolean fabricar(Mueble m) {
		boolean retorno = false;

		if(m.getPorcentajeGanancia() >= PORC_GANANCIA_MIN) {
			System.out.println("Fabricando el mueble:");
			this.mueblesFabricados.add(m);
			retorno = true;
			m.mostrar();
			
		}
		else {
			System.out.println("No se pudo frabricar el mueble " + m.getModelo());
		}
		
		return retorno;
	}
	
	public boolean superoCosto(double monto){ 
		boolean seHaFabricado = false;
		Mueble muebleActual;
		int i = 0;
		
		while(i<this.mueblesFabricados.size() && seHaFabricado == false) {
			muebleActual = this.mueblesFabricados.get(i);
			if(muebleActual.calcularPrecioCosto() > monto) {
				seHaFabricado = true;
			}
			else {
				i++;
			}
		}
		
		return seHaFabricado;
	}
	
	public void mostrar() {
		System.out.println("Fábrica de muebles: " + this.getNombre());
		System.out.println("La cantidad de sillas corresponde al " + this.porcSillas() + "% del total de muebles fabricados");
		System.out.println("La venta total fue de: " + this.ventaTotal());
	}
	
	private float ventaTotal() {
		float total = 0;
		
		for(Mueble m : this.mueblesFabricados) {
			total += m.calcularPrecioVenta();
		}
		
		return total;
	}
	
	private double porcSillas() {
		int cantSillas = 0;
	
		for(Mueble m : this.mueblesFabricados) {
			if(m instanceof Silla) {
				cantSillas++;
			}
		}
		
		return cantSillas * CIEN / this.mueblesFabricados.size();
	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Mueble> getMueblesFabricados() {
		return mueblesFabricados;
	}

}
