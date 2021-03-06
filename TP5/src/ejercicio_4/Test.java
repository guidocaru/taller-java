package ejercicio_4;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		CircuitoATP circuito = new CircuitoATP();
		
		ArrayList<Jugador> jugadores = circuito.procesarInfo();
		
		for(Jugador jug : jugadores) {
			System.out.println(jug.toString());
			
		}
		
		System.out.println(circuito.procesarTorneosJugador("Delbonis"));
		
		System.out.println(circuito.obtenerResultadoJugador("Schwartzman", "Roland Garros"));
		
		System.out.println("Peor resultado de Pella en el a?o: " + circuito.procesarPeorPosTorneoJugador("Pella"));
		
	}
}
