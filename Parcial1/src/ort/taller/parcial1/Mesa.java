package ort.taller.parcial1;

public class Mesa extends Mueble {

	
	private static final float COEFICIENTE_SUPERFICIE = 0.2f;
	private long largo;
	private long ancho;
	private TipoMesa tipoMesa;


	public Mesa(String modelo, float costoBase, float porcentajeGanancia, long largo, long ancho, TipoMesa tipoMesa) {
		super(modelo, costoBase, porcentajeGanancia);
		this.setLargo(largo);
		this.setAncho(ancho);
		this.setTipoMesa(tipoMesa);
	}
	
	@Override
	public float calcularPrecioCosto() {
		
		return this.getCostoBase() * this.tipoMesa.getMultiplicadorValor() + COEFICIENTE_SUPERFICIE * this.largo * this.ancho;
	
	}


	public long getLargo() {
		return largo;
	}


	public void setLargo(long largo) {
		this.largo = largo;
	}


	public long getAncho() {
		return ancho;
	}


	public void setAncho(long ancho) {
		this.ancho = ancho;
	}


	public TipoMesa getTipoMesa() {
		return tipoMesa;
	}


	public void setTipoMesa(TipoMesa tipoMesa) {
		this.tipoMesa = tipoMesa;
	}
	
}
