package ejercicio_5;

public class Torneo5 extends Torneo{
	
	public Torneo5() {
	}

	@Override
	public String getTipo() {
		return "Torneo de futbol 5";
	}

	@Override
	public int puntajePartidoGanado() {
		return 3;
	}

	@Override
	public int puntajePartidoPerdido() {
		return 0;
	}

	@Override
	public int puntajeVallaInvicta() {
		return 0;
	}

	@Override
	public int puntajeGanador4Goles() {
		return 1;
	}

	@Override
	public int puntajeEmpateMas3Goles() {
		return 2;
	}

	@Override
	public void agregarEquipo(Equipo equipo) {
		if(equipo.getJugadores() == 5 && !(this.equipos.contains(equipo))) {
			this.equipos.add(equipo);
			System.out.println("Equipo agregado correctamente");
		}
		else {
			System.out.println("No se puede agregar el equipo");
		}
		
	}

}
