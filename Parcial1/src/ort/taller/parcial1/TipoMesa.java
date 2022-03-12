package ort.taller.parcial1;

public enum TipoMesa {

	MODERNA(1), ANTIGUA(1.5f), CRISTAL(2.3f);

	private float multiplicadorValor;

	private TipoMesa(float multiplicadorValor) {
		this.multiplicadorValor = multiplicadorValor;
	}

	public float getMultiplicadorValor() {
		return multiplicadorValor;
	}

}
