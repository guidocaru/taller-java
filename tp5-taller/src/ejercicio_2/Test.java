package ejercicio_2;

public class Test {
	
	public static void main(String[] args) {		
		Anio anio = new Anio();
		
		System.out.println("Obtener nombre de un mes:");
		System.out.println(anio.getNombreMes(12));
		System.out.println(anio.getNombreMes(5));
		System.out.println("------------------");
		System.out.println(Mes.values()[3].name());
		System.out.println("han transcurrido: "+(anio.diasTranscurridos(9)+14)+" dias");
	}

}
