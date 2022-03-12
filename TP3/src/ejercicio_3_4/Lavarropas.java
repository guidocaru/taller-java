package ejercicio_3_4;

public class Lavarropas extends Electrodomestico{

	protected int cargaMax;
	protected boolean automatico;

	public Lavarropas(String marca, String modelo, int nroSerie, int voltaje, Estado estado, float precio, int cargaMax, boolean automatico) {
		super(marca, modelo, nroSerie, voltaje, estado, precio);
		this.setCargaMax(cargaMax);
		this.setAutomatico(automatico);
	}
	
	public int getCargaMax() {
		return cargaMax;
	}
	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}
	public boolean isAutomatico() {
		return automatico;
	}
	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}
	
}
