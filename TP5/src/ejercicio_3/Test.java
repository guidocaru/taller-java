package ejercicio_3;

public class Test {
	
public static void main(String[] args) {
		
	GastoAnual gastoAnual = new GastoAnual();
	
	
	for(int i = 1; i <= Mes.values().length; i++) {
		gastoAnual.agregarGasto(i, "Comida", (150+i)*2);
	}
	
	for(int i = 1; i <= Mes.values().length; i++) {
		gastoAnual.agregarGasto(i, "Ropa", (150+i)*4);
	}
	
	for(int i = 1; i <= Mes.values().length; i++) {
		gastoAnual.agregarGasto(i, "Cine", (150+i)/2);
	}
	
	for(int i = 1; i <= Mes.values().length; i++) {
		gastoAnual.agregarGasto(i, "Kiosco", (150+i)/3);
	}

	
	//gastoAnual.printConsolidado();
	
	System.out.println(gastoAnual.gastoAcumulado("Comida"));
	
	gastoAnual.informarConsumosPorMes();
	
	gastoAnual.informarPromedioMensualPorRubro();
	
	gastoAnual.informarMesMayorConsumo();
			
		
	}

}
