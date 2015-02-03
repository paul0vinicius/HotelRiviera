package projetolp2.hotelriviera;

public class LuxoDuplo extends Luxo {
	private final static double VALOR_DIARIA_LDUPLO = 570;
	
	public LuxoDuplo(int numeroDePessoas, boolean camaExtra, int codigoQuarto) throws Exception {
		super(numeroDePessoas, camaExtra, VALOR_DIARIA_LDUPLO, codigoQuarto);
		tipoQuarto = "LUXO_DUPLO";
	}
	
	@Override
	public String toString () {
		return super.toString() + "\nTipo de quarto: Luxo Duplo";
	}
}
