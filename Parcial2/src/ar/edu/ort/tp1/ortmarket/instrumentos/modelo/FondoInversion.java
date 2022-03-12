package ar.edu.ort.tp1.ortmarket.instrumentos.modelo;

import ar.edu.ort.tp1.ortmarket.modelo.ListaInstrumentosPorCodigo;

public class FondoInversion extends InstrumentoFinanciero {

	private int nroCuotaPartes;
	private ListaInstrumentosPorCodigo instrumentos;

	public FondoInversion(String codigo, String nombre, String emisor, int nroCuotaPartes) {
		super(codigo, nombre, emisor);
		this.nroCuotaPartes = nroCuotaPartes;
		this.instrumentos = new ListaInstrumentosPorCodigo();
	}

	public void agregarInstrumento(InstrumentoFinanciero instrumentoFinanciero) {
		instrumentos.add(instrumentoFinanciero);
	}

	@Override
	public double obtenerCotizacion() {
		
		if(this.nroCuotaPartes == 0) {
			throw new RuntimeException("El número de cuotas partes es 0, no se puede dividir por 0, no se puede calcular la cotización.");
		}
		return this.getPrecioComponentes() / this.nroCuotaPartes;
		
	}

	private double getPrecioComponentes() {
		double total = 0;
		for(InstrumentoFinanciero instrumento : this.instrumentos) {
			total += instrumento.obtenerCotizacion();
		}
		return total;
	}

}
