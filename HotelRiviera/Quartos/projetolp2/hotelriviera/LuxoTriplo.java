package projetolp2.hotelriviera;

public class LuxoTriplo extends Luxo {
	private final static double VALOR_DIARIA_LTRIPLO = 620;
	private final static boolean CAMA_EXTRA_NAO_DISPONIVEL = false;
	
	public LuxoTriplo(int numeroDePessoas, int codigoQuarto) throws Exception {
		super(numeroDePessoas, CAMA_EXTRA_NAO_DISPONIVEL, VALOR_DIARIA_LTRIPLO, codigoQuarto);
		tipoQuarto = "LUXO_TRIPLO";
	}
	
	@Override
	public String toString () {
		return super.toString() + "\nTipo de quarto: Luxo Triplo";
	}

}
