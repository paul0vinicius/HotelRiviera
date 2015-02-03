package projetolp2.hotelriviera;

public class ExecutivoTriplo extends Executivo {
	private final static double VALOR_DIARIA_EXTRIPLO = 440;
	private final static boolean CAMA_EXTRA_NAO_DISPONIVEL = false;
	
	public ExecutivoTriplo(int numeroDePessoas, int codigoQuarto) throws Exception {
		super(numeroDePessoas, CAMA_EXTRA_NAO_DISPONIVEL, VALOR_DIARIA_EXTRIPLO, codigoQuarto);
		tipoQuarto = "EXECUTIVO_TRIPLO";
	}

	@Override
	public String toString () {
		return super.toString() + "\nTipo de quarto: Executivo Triplo";
	}
}
