package ejercicio_3;

public class Rubro {
	
	final static int TOTAL_MESES = 12;
	private String nombre;
	private double[] gastoPorMes; 
	
	public Rubro(String nombre) {
		setNombre(nombre);
		inicializarGastos();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private void inicializarGastos() {
		gastoPorMes = new double[TOTAL_MESES];
	}
	
	public void agregarGasto(int mes, double importe) {
		if(mes - 1 <=TOTAL_MESES && mes > 0) { //VERIFICA QUE EL MES INGRESADO ESTE EN EL ARRAY
			this.gastoPorMes[mes-1] += importe;
		}
	}
	
	public double getTotalGastos(int mes) {
		double total = 0;
		
		if(mes - 1 <=TOTAL_MESES && mes > 0) {
			total = this.gastoPorMes[mes-1];
		}
		
		return total;
	}
	
	public double getGastos() {
		double gastos = 0;
		
		for(double gasto : gastoPorMes) {
			gastos += gasto;
		}
		
		return gastos;
	}
	
	public double getPromedio() {
		return this.getGastos() / TOTAL_MESES;
	}
	

}
