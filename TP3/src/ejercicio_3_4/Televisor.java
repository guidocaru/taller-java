package ejercicio_3_4;

public class Televisor extends Electrodomestico {

	private int dimension;
	private boolean smart;
	
	public Televisor(String marca, String modelo, int nroSerie, int voltaje, Estado estado, float precio, int dimension, boolean smart) {
		super(marca, modelo, nroSerie, voltaje, estado, precio);
		this.setDimension(dimension);
		this.setSmart(smart);
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
}
