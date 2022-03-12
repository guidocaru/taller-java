package ejercicio_5;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		
		Torneo8 torneo = new Torneo8();
		
		Equipo boca = new Equipo("Boca", 0, 8);
		Equipo sanLorenzo = new Equipo("San Lorenzo", 0, 8);
		Equipo river = new Equipo("River", 0, 8);
		Equipo racing = new Equipo("Racing", 0, 8);
		Equipo velez = new Equipo("Velez", 0, 8);
		Equipo independiente = new Equipo("Independiente", 0, 8);
		
		torneo.agregarEquipo(boca);
		torneo.agregarEquipo(sanLorenzo);
		torneo.agregarEquipo(river);
		torneo.agregarEquipo(racing);
		torneo.agregarEquipo(velez);
		torneo.agregarEquipo(independiente);
		
		
		Jornada jornada1 = new Jornada(1);
		Jornada jornada2 = new Jornada(2);
		Jornada jornada3 = new Jornada(3);
		Jornada jornada4 = new Jornada(4);
		Jornada jornada5 = new Jornada(5);
		
		//fecha 1
		Partido partido1 = new Partido(boca, sanLorenzo, 5, 4);
		Partido partido2 = new Partido(river, racing, 1, 2);
		Partido partido3 = new Partido(velez, independiente, 2, 6);
		//fecha 2
		Partido partido4 = new Partido(boca, river, 4, 3);
		Partido partido5 = new Partido(sanLorenzo, independiente, 3, 0);
		Partido partido6 = new Partido(racing, velez, 5, 1);
		//fecha 3
		Partido partido7 = new Partido(boca, velez, 6, 6);
		Partido partido8 = new Partido(sanLorenzo, river, 3, 1);
		Partido partido9 = new Partido(racing, independiente, 2, 4);
		//fecha 4
		Partido partido10 = new Partido(boca, racing, 0, 0);
		Partido partido11 = new Partido(river, independiente, 1, 2);
		Partido partido12 = new Partido(sanLorenzo, velez, 4, 4);
		//fecha 5
		Partido partido13 = new Partido(boca, independiente, 2, 1);
		Partido partido14 = new Partido(river, velez, 2, 5);
		Partido partido15 = new Partido(sanLorenzo, racing, 0, 3);
		
		torneo.agregarJornada(jornada1);
		jornada1.agregarPartido(partido1);
		jornada1.agregarPartido(partido2);
		jornada1.agregarPartido(partido3);
		torneo.finalizarJornada(jornada1);
		
		torneo.agregarJornada(jornada2);
		jornada2.agregarPartido(partido4);
		jornada2.agregarPartido(partido5);
		jornada2.agregarPartido(partido6);
		torneo.finalizarJornada(jornada2);
		
		torneo.agregarJornada(jornada3);
		jornada3.agregarPartido(partido7);
		jornada3.agregarPartido(partido8);
		jornada3.agregarPartido(partido9);
		torneo.finalizarJornada(jornada3);
		
		torneo.agregarJornada(jornada4);
		jornada4.agregarPartido(partido10);
		jornada4.agregarPartido(partido11);
		jornada4.agregarPartido(partido12);
		torneo.finalizarJornada(jornada4);
		
		torneo.agregarJornada(jornada5);
		jornada5.agregarPartido(partido13);
		jornada5.agregarPartido(partido14);
		jornada5.agregarPartido(partido15);
		torneo.finalizarJornada(jornada5);
		
		torneo.mostrarTabla();
	}

}

