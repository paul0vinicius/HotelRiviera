package projetolp2.hotelriviera;

public class LuxoSimples extends Luxo {
	private final static double VALOR_DIARIA_LSIMPLES = 520;
	
	public LuxoSimples(int numeroDePessoas, boolean camaExtra, int codigoQuarto) throws Exception {
		super(numeroDePessoas, camaExtra, VALOR_DIARIA_LSIMPLES, codigoQuarto);
		tipoQuarto = "LUXO_SIMPLES";
	}
	
	@Override
	public String toString () {
		return super.toString() + "\nTipo de quarto: Luxo Simples";
	}
}
