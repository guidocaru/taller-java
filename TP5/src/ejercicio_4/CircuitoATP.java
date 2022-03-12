package ejercicio_4;

import java.util.ArrayList;

public class CircuitoATP {
	private String[] jugadores;
	private String[] torneos;
	private int[][] resultados;

	public CircuitoATP() {
		this.cargarData();
	}
	public void cargarData() {
		this.jugadores = new String[] {"Pella", "Del Potro", "Schwartzman", "Mayer", "Delbonis"};
		this.torneos = new String[] { "Australia", "US Open", "Roland Garros", "Wimbledon", "Shangai"};
		this.resultados = new int[][] {	{1,3,4,1,3},
										{3,2,3,4,1},
										{2,1,5,5,2},
										{4,5,1,2,5},
										{5,4,2,3,4}};
						
	}
	
	public ArrayList<Jugador> procesarInfo() {
		ArrayList<Jugador> jugadores = new ArrayList<>();
		
		for(int i = 0; i< this.jugadores.length; i++) { //CREA Y AGREGA JUGADORES AL ARRAYLIST
			jugadores.add(new Jugador(this.jugadores[i]));
		}
		
		for(int j = 0; j < jugadores.size(); j++) {
			for(int t = 0; t < this.resultados[j].length; t++) {
				jugadores.get(j).procesarResultado(this.resultados[j][t]);	
			}
			
		}		
		return jugadores;
	}
	
	private int buscoJugador(String jugador) {
		int posJugador = -1;
		int i = 0;
		
		while(posJugador == -1 && i < this.jugadores.length) {
			if(jugadores[i].equalsIgnoreCase(jugador)) {
				posJugador = i;
			}
			else {
				i++;
			}
		}
		
		return posJugador;
	}
	
	private int buscoTorneo(String torneo) {
		int posTorneo = -1;
		int i = 0;
		
		while(posTorneo == -1 && i < this.torneos.length) {
			if(torneos[i].equalsIgnoreCase(torneo)) {
				posTorneo = i;
			}
			else {
				i++;
			}
		}
		
		
		return posTorneo;
	}
	
	public String procesarTorneosJugador(String jugador) {
		String competencias = "";

		int posJugador = buscoJugador(jugador);
		if(posJugador != -1) {
			competencias = jugadores[posJugador] + ": ";
			for(int i = 0; i < torneos.length; i++) {
				competencias += torneos[i] + " " + resultados[posJugador][i] + ", ";
			}	
		}
		
		return competencias;
	}
	public String obtenerResultadoJugador(String jugador, String torneo) {
		String resultado = "";
		
		int posJugador = buscoJugador(jugador);
		int posTorneo = buscoTorneo(torneo);
		if(posJugador != -1 && posTorneo != -1) {
			resultado = "Resultado de " + jugadores[posJugador] + " en " + torneos[posTorneo] + ": " +
					resultados[posJugador][posTorneo];
		}
		
		return resultado;
		
	}
	
	
	public int procesarPeorPosTorneoJugador(String jugador) {
		int peorRes = 0;
		
		int posJugador = buscoJugador(jugador);
		if(posJugador != -1) {
			for(int i = 0; i < resultados.length; i++) {
				if(resultados[posJugador][i] > peorRes) {
					peorRes = resultados[posJugador][i];
				}
			}
		}
				
		return peorRes;
		
	}
	
}
