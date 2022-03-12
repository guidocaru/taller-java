package ejercicio_2;

public class Anio {
	
	private int[] cantidadDiasMes;

	public Anio() {
		this.cantidadDiasMes = new int[]{0,31,59,90,120,151,181,212,243,273,304,334}; 
	}
	
	public String[] getMeses() {
		String[] meses = new String [Mes.values().length];
		for (int i=0; i<meses.length; i++) {
			meses[i] = Mes.values()[i].name();
		}		
		return meses;
	}
	
	public String getNombreMes(int numeroMes) {
		return Mes.values()[numeroMes-1].name();
	}
	
	public int diasTranscurridos(int numeroMes){
		int result = 0;
		result = cantidadDiasMes[numeroMes-1];
		return result;
	}


}
