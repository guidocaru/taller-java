package ejercicio_5;

import java.util.ArrayList;

public abstract class Torneo {

	protected ArrayList<Jornada> jornadas;
	protected ArrayList<Equipo> equipos;


	public Torneo() {
		this.jornadas = new ArrayList<>();
		this.equipos = new ArrayList<>();
	}

	public void agregarJornada(Jornada jornada) {
		if (!(jornadas.contains(jornada))) {
			jornadas.add(jornada);
			System.out.println("Jornada agregada");
		}
		else {
			System.out.println("La jornada ya fue agregada al torneo");
		}
	}

	public void eliminarJornada(Jornada jornada) {
		if (jornadas.contains(jornada)) {
			jornadas.remove(jornada);
			System.out.println("Jornada borrada");
		}
		else {
			System.out.println("La jornada no existe, no se puede eliminar");
		}
	}

	public abstract void agregarEquipo(Equipo equipo); 
	

	public void eliminarEquipo(Equipo equipo) {
		if (equipos.contains(equipo)) {
			equipos.remove(equipo);
			System.out.println("Equipo borrado");
		}
		else {
			System.out.println("El equipo no se encuentra en el torneo, no se puede borrar");
		}
	}

	public void finalizarJornada(Jornada jornada) {
		if (jornadas.contains(jornada)) {
		
			for(Partido partido : jornada.getPartidos()) {
				this.calcularPuntos(partido);
			}
			this.mostrarTabla();
		}
	}

	public void mostrarTabla() {
		System.out.println(getTipo());
		System.out.println("Tabla de posiciones al cabo de " + String.valueOf(jornadas.size()) + " fechas:");
		
		for(Equipo equipo : this.equipos) {
			System.out.println(equipo.getNombre() + ": " + equipo.getPuntos() + " puntos");
		}
		System.out.println("\n");
	}

	public abstract String getTipo();

	public void calcularPuntos(Partido partido) { //REFACTOR
		int puntosLocal = 0;
		int puntosVisitante = 0;
		int golesEquipoLocal = partido.getGolesEquipoLocal();
		int golesEquipoVisitante = partido.getGolesEquipoVisitante();
		

		if (golesEquipoLocal > golesEquipoVisitante) // Si gana el local
		{
			puntosLocal = this.puntajePartidoGanado();
			
			if(golesEquipoVisitante == 0) {
				puntosLocal += this.puntajeVallaInvicta();
			}
			if((golesEquipoLocal - golesEquipoVisitante) > 4) {
				puntosLocal += this.puntajeGanador4Goles();
			}
		}

		 else if(golesEquipoLocal < golesEquipoVisitante){ //Gana visitante

			puntosVisitante = this.puntajePartidoGanado();
			
			if(golesEquipoLocal == 0) {
				puntosVisitante += this.puntajeVallaInvicta();
			}
			if((golesEquipoVisitante - golesEquipoLocal) > 4) {
				puntosVisitante += this.puntajeGanador4Goles();
			}
		}
		 else { //EMPATE
			 puntosLocal = this.puntajePartidoEmpatado();
			 puntosVisitante = this.puntajePartidoEmpatado();
			 if(golesEquipoLocal > 3) {
				 puntosLocal += this.puntajeEmpateMas3Goles();
				 puntosVisitante += this.puntajeEmpateMas3Goles();
			 }
		 }
		partido.getEquipoLocal().setPuntos(puntosLocal);
		partido.getEquipoVisitante().setPuntos(puntosVisitante);
	}

	

	public int puntajePartidoEmpatado() {
		return 1;
	}

	public abstract int puntajePartidoGanado();

	public abstract int puntajePartidoPerdido();

	public abstract int puntajeVallaInvicta();

	public abstract int puntajeGanador4Goles();

	public abstract int puntajeEmpateMas3Goles();
	
}
