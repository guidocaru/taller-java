package ejercicio_5;

public class Equipo {

	private String nombre;
	private int puntos;
	private int jugadores;

	public Equipo() {
		nombre = "sin definir";
		puntos = 0;
		jugadores = 0;
	}

	public Equipo(String nombre, int puntos, int jugadores) {
		this.nombre = nombre;
		this.puntos = puntos;
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		return nombre + ": " + puntos + " puntos";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos += puntos;
	}

	public int getJugadores() {
		return jugadores;
	}

	public void setJugadores(int jugadores) {
		this.jugadores = jugadores;
	}
	
}
