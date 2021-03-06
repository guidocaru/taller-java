package ort.taller.parcial1;

public class Sillon extends Mueble {

	private int cantCuerpos;
	private TelaSillon tela;
	
	public Sillon(String modelo, float costoBase, float porcentajeGanancia, int cantCuerpos, TelaSillon tela) {
		super(modelo, costoBase, porcentajeGanancia);
		this.setCantCuerpos(cantCuerpos);
		this.setTela(tela);		
		
	}
	
	@Override
	public float calcularPrecioCosto() {
		
		return this.getCostoBase() * this.cantCuerpos * this.tela.getPorcentaje();
		
	}

	public int getCantCuerpos() {
		return cantCuerpos;
	}

	public void setCantCuerpos(int cantCuerpos) {
		this.cantCuerpos = cantCuerpos;
	}

	public TelaSillon getTela() {
		return tela;
	}

	public void setTela(TelaSillon tela) {
		this.tela = tela;
	}

}