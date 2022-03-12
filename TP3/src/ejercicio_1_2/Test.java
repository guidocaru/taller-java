package ejercicio_1_2;

public class Test {

	public static void main(String[] args) {
		
		Asalariado empleado1 = new Asalariado("José", 30, 10000);
		Subcontratado empleado2 = new Subcontratado("Carlos", 23, 50, 100);
		Vendedor vendedor = new Vendedor("Pedro", 25, 100, 200, 5);
		Vendedor vendedora = new Vendedor("María", 30, 100, 200, 10);
		
		System.out.println(empleado1.toString());
		System.out.println(empleado2.toString());
		System.out.println(vendedor.toString());
		System.out.println(vendedora.toString());
		
		
	}

}
