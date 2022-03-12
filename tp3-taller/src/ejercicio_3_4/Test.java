package ejercicio_3_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		Heladera heladera = new Heladera("Whirlpool", "H2745", 5678425, 220, Estado.APAGADO, 14999, 250, false);
		Televisor televisor1 = new Televisor("Philips", "49PGFS", 155564, 220, Estado.APAGADO, 14370, 49, true);
		Lavarropas lavarropas1 = new Lavarropas("Drean", "Concept 5.05", 668574, 220, Estado.APAGADO, 6799, 6, false);
		Licuadora licuadora1 = new Licuadora("LG", "A520", 5547, 220, Estado.APAGADO, 15000, 500, 5);
		Televisor televisor2 = new Televisor("Samsung", "EH4500", 55874, 220, Estado.APAGADO, 20000, 42, true);

		ArrayList<Electrodomestico> productos = new ArrayList<>();
		productos.add(heladera);
		productos.add(televisor1);
		productos.add(lavarropas1);
		productos.add(licuadora1);
		productos.add(televisor2);
		
		int numeroIngresado;
		int posProducto;
		ArrayList<Electrodomestico> carrito = new ArrayList<>();
		
		do {
			mostrarProductos(productos);
			numeroIngresado = pedirNumero(productos.size());
			if (numeroIngresado != 0) {
				posProducto = numeroIngresado - 1;
				carrito.add(productos.get(posProducto));
			}
		} while (numeroIngresado != 0);
		
		mostrarCarrito(carrito);
		
	}
	
	private static void mostrarProductos(ArrayList<Electrodomestico> productos) {
		System.out.println("PRODUCTOS DISPONIBLES");
		System.out.println("Elija lo que desea comprar por número de índice (0 para finalizar)");
		System.out.println("\n");
		//int i = 0;
		//Electrodomestico productoActual;
		for (int i = 0; i < productos.size(); i++) {
			Electrodomestico productoActual = productos.get(i);
			System.out.println(
				i + 1 + ". " + productoActual.getClass().getSimpleName() + " " + productoActual.toString());
		}

	}

	private static int pedirNumero(int limite) {
		System.out.println("Ingrese una opción");
		int numeroIngresado = Integer.parseInt(input.nextLine());
		while (!(numeroIngresado == 0 || numeroIngresado <= limite)) {
			System.out.println("El número ingresado no es correcto, intente de nuevo");
			numeroIngresado = Integer.parseInt(input.nextLine());
		}
		return numeroIngresado;

	}
	
	private static void mostrarCarrito(ArrayList<Electrodomestico> carrito) {
		//boolean confirmar = false;
		System.out.println("Este es su carrito actualmente");
		for(Electrodomestico producto : carrito) {
			System.out.println(producto.toString());
		}
		boolean confirmar = pedirConfirmacion("Desea comprar? (S/N)");
		if(confirmar) {
			mostrarTicket(carrito);
		}
		else {
			System.out.println("Compra no realizada");
		}
	}
	
	private static boolean pedirConfirmacion(String mensaje) {
		boolean eleccion = false;
		
		System.out.println(mensaje);
		String opcion = input.nextLine();
		while(!(opcion.equalsIgnoreCase("s") || opcion.equalsIgnoreCase("n"))) {
			System.out.println("La opción ingresada es incorrecta, intente nuevamente");
			opcion = input.nextLine();
		}			
		if(opcion.equalsIgnoreCase("s")) {
			eleccion = true;
		} 
		return eleccion;
	}
	
	private static void mostrarTicket(ArrayList<Electrodomestico> carrito) {
		System.out.println("TICKET DE VENTA");
		System.out.println("Artículos comprados");
		for(Electrodomestico producto : carrito) {
			System.out.println(producto.imprimirTicket());			
		}
		System.out.println("Total: $" + calcularTotal(carrito));
	}
	
	private static float calcularTotal(ArrayList<Electrodomestico> carrito) {
		float total = 0;
		
		for(Electrodomestico producto : carrito) {
			total += producto.getPrecio();
		}
		
		return total;
	}

}
