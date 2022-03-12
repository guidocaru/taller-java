package ort.taller.parcial1;

public class Test {
	
	public static void main(String[] args) {

		FabricaMuebles fabrica = new FabricaMuebles("Súper Fábrica 2000");

		fabrica.fabricar(new Silla("Silla 2", 800, 12, 22,MaterialSilla.MADERA));
		fabrica.fabricar(new Mesa("La Moderna 1", 1000, 24, 150, 70, TipoMesa.MODERNA));
		fabrica.fabricar(new Silla("Silla 3", 500, 8, 24,MaterialSilla.METAL));
		fabrica.fabricar(new Sillon("Sillon 1", 800, 15, 2, TelaSillon.PANA));
		fabrica.fabricar(new Silla("Silla 1", 200, 10, 20,MaterialSilla.PLASTICO));
		fabrica.fabricar(new Sillon("Sillon 2", 1000, 10, 1, TelaSillon.CHENILLE));
		fabrica.fabricar(new Sillon("Sillon 3", 1050, 20, 3, TelaSillon.GOBELINO));
		fabrica.fabricar(new Mesa("Nueva Moderna", 1200, 23, 150, 80, TipoMesa.MODERNA));
		fabrica.fabricar(new Sillon("Sillon 1.3", 800, 3, 3, TelaSillon.PANA));
		fabrica.fabricar(new Mesa("Gran Mesa Antigua", 2000, 22, 200, 80, TipoMesa.ANTIGUA));
		fabrica.fabricar(new Sillon("Sillon 4", 800, 25, 4, TelaSillon.GOBELINO));
		fabrica.fabricar(new Mesa("Gran Mesa Cristalina", 3000, 20, 100, 80, TipoMesa.CRISTAL));

		System.out.println("Se supero en "+2000+ "$ el costo en algun mueble? " + (fabrica.superoCosto(2000)? "Si" : "No"));
		System.out.println("Se supero en "+5000+ "$ el costo en algun mueble? " + (fabrica.superoCosto(5000)? "Si" : "No"));
	
		fabrica.mostrar();
	}


}
