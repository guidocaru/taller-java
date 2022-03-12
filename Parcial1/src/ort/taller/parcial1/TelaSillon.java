package ort.taller.parcial1;

public enum TelaSillon {

	CHENILLE(20f), PANA(15f), GOBELINO(17);

	private float porcentaje;

	private TelaSillon(float porcentaje) {
		this.porcentaje = porcentaje;
	}

	public float getPorcentaje() {
		return porcentaje;
	}
	
}
