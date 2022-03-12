package ort.taller.parcial1;

public enum MaterialSilla {
	MADERA(0.7f), METAL(0.3f), PLASTICO(0.2f);

	private float multiplicadorValor;

	private MaterialSilla(float multiplicadorValor) {
		this.multiplicadorValor = multiplicadorValor;
	}

	public float getMultiplicadorValor() {
		return multiplicadorValor;
	}
}