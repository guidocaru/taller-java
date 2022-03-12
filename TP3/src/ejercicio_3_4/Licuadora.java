package ejercicio_3_4;

public class Licuadora extends Electrodomestico{

	protected int potencia;
	protected int cantVelocidades;
	
	public Licuadora(String marca, String modelo, int nroSerie, int voltaje, Estado estado, float precio, int potencia, int cantVelocidades) {
		super(marca, modelo, nroSerie, voltaje, estado, precio);
		this.setPotencia(potencia);
		this.setCantVelocidades(cantVelocidades);
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getCantVelocidades() {
		return cantVelocidades;
	}
	public void setCantVelocidades(int cantVelocidades) {
		this.cantVelocidades = cantVelocidades;
	}
	
}
