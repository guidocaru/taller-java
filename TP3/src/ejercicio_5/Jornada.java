package ejercicio_5;

import java.util.ArrayList;

public class Jornada {
	
	private ArrayList<Partido> partidos;
	private int fecha;

	public Jornada() {
	
	}

	public Jornada(int fecha) {
		partidos = new ArrayList<Partido>();
		this.setFecha(fecha);
	}

	public void agregarPartido(Partido partido) {
		this.partidos.add(partido);
	}

	public void eliminarPartido(Partido partido) {
		this.partidos.remove(partido);
	}

	public ArrayList<Partido> getPartidos() {
		return partidos;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

}
