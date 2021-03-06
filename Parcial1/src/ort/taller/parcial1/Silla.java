package ort.taller.parcial1;

public class Silla extends Mueble {

	private static final int COEFICIENTE_SILLA = 3;
	private long alto;
	private MaterialSilla material;
	
	public Silla(String modelo, float costoBase, float porcentajeGanancia, long alto, MaterialSilla material) {
		super(modelo, costoBase, porcentajeGanancia);
		this.setAlto(alto);
		this.setMaterial(material);
		
	}
	
	@Override
	public float calcularPrecioCosto() {
		
		return this.getCostoBase() + this.material.getMultiplicadorValor() * this.alto;
		
	}

	public long getAlto() {
		return alto;
	}

	public void setAlto(long alto) {
		this.alto = alto;
	}

	public MaterialSilla getMaterial() {
		return material;
	}

	public void setMaterial(MaterialSilla material) {
		this.material = material;
	}
	
}

