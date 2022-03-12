package ejercicio_3;

import java.util.ArrayList;

public class GastoAnual {
	
	private ArrayList<Rubro> rubros;

	public GastoAnual() {
		rubros = new ArrayList<>();
	}

	public void agregarGasto(int mes, String nombreRubro, double importe) {
		if (importe > 0) {
			Rubro rubro = obtenerRubro(nombreRubro);
			rubro.agregarGasto(mes, importe);
		}

	}

	private Rubro obtenerRubro(String nombreRubro) {
		Rubro rubro = buscarRubro(nombreRubro);

		if (rubro == null) { // si no existe lo crea y lo agrega
			Rubro nuevoRubro = new Rubro(nombreRubro);
			this.rubros.add(nuevoRubro);
			rubro = nuevoRubro;
		}

		return rubro;
	}

	private Rubro buscarRubro(String nombreRubro) {
		Rubro rubro = null;
		Rubro rubroActual;
		int i = 0;

		while (i < this.rubros.size() && rubro == null) {
			rubroActual = this.rubros.get(i);
			if (rubroActual.getNombre().equalsIgnoreCase(nombreRubro)) {
				rubro = rubroActual;
			} else {
				i++;
			}
		}

		return rubro;
	}
	
	private double[][] consolidadoDeGastos() { 

		double[][] gastosConsolidados = new double[Mes.values().length][rubros.size()];

		for (int i = 0; i < gastosConsolidados.length; i++) {
			for (int j = 0; j < gastosConsolidados[i].length; j++) {
				gastosConsolidados[i][j] = rubros.get(j).getTotalGastos(i + 1); 
			}
		}

		return gastosConsolidados;
	}
	
	public void printConsolidado() {
		double consolidadoGastos[][] = this.consolidadoDeGastos();

		for(int i = 0; i < consolidadoGastos.length; i++) {
			for(int j = 0; j < consolidadoGastos[i].length; j++) {
				System.out.println(consolidadoGastos[i][j]);
			}
			System.out.println();
		}
	}

	public double gastoAcumulado(int mes) { //SE PODRÍA HACER USANDO EL ARRAY DE CONSOLIDADOGASTOS
		double total = 0;

		for (Rubro rubro : rubros) {
			total += rubro.getTotalGastos(mes);
		}

		return total;
	}

	public double gastoAcumulado(String nombreRubro) { //IDEM
		double gasto = -1;

		Rubro rubro = this.buscarRubro(nombreRubro);
		if (rubro != null) {
			gasto = rubro.getGastos();
		}

		return gasto;
	}

	public void informarConsumosPorMes() {
		double consolidadoGastos[][] = this.consolidadoDeGastos();

		for(int i = 0; i < consolidadoGastos.length; i++) {
			System.out.println("\nMES " + (i+1));
			double acumuladoMes = 0;
			for(int j = 0; j < consolidadoGastos[i].length; j++) {
				System.out.println("Rubro " + j + ": $" + consolidadoGastos[i][j]);
				acumuladoMes += consolidadoGastos[i][j];
			}
			System.out.println("Acumulado: $" + acumuladoMes);
		}
		
	}

	public void informarPromedioMensualPorRubro() { //HACER CON MATRIZ
		double total = 0;

		for (Rubro rubro : this.rubros) {
			System.out.println("Promedio rubro " + rubro.getNombre() + ": $" + rubro.getPromedio());

		}

	}

	public void informarMesMayorConsumo() {
		double consolidadoGastos[][] = this.consolidadoDeGastos();
		ArrayList<Integer> mayorMes = new ArrayList<>();
		double mayorConsumo = 0;

		for (int i = 0; i < consolidadoGastos.length; i++) {
			double totalMes = 0;
			for (int j = 0; j < consolidadoGastos[i].length; j++) {
				totalMes += consolidadoGastos[i][j];
			}
			if (totalMes >= mayorConsumo) {
				mayorConsumo = totalMes;
				mayorMes.clear();
				mayorMes.add(i + 1);
			}
		}
		System.out.println("El mes con mayor consumo total es/son:");
		for (Integer mes : mayorMes) {
			System.out.println(mes);
		}
		System.out.println("Con un importe de $ " + mayorConsumo );
	}

}
